from Adapter.Simulink.Simulink import Simulink
from Adapter.Eagle.Eagle import Eagle
from Adapter.Utils import rotate
import subprocess
import copy

# Skalierungsfaktor für Positionen Simulink <-> Eagle
#scale = 4*2.54/30
#scale = 3*2.54/40
scale = 4*2.54/40

# Execute jar (Xtext-Konvertierung)
subprocess.call(['java', '-jar', 'mdl2xmi.jar'],shell=True)


# Pfade
path_simulink   = "C:\\Users\\Daniel\\Desktop\\Druva_Backup\\Matlab\\test.xmi" 
path_eagle_load = "C:\\Users\\Daniel\\Desktop\\Druva_Backup\\Eagle_SDQ\\Testproject\\test.sch"
path_eagle_save = "C:\\Users\\Daniel\\Desktop\\Druva_Backup\\Eagle_SDQ\\Testproject\\output.sch"


# Objekte erstellen
simulink = Simulink(path_simulink)
eagle = Eagle(path_eagle_load, scale)


# Simulink-Data 
blocks = simulink.get_blocks()
lines  = simulink.get_lines()



# Loop for all Eagle Parts
for part in eagle.xml_parts.findall('part'):
    
    attribute = part.find('attribute')
    vitruv_id = attribute.get('value')
                
    # Entsrechende Eagle Instance heraussuchen
    instance = eagle.find_instace_by_name(part.get('name')) 
    
    n = 0
    
    # Simulink Block mit entsprechender ID heraussuchen
    for i in range( len(blocks) ):
        
        block       = blocks[i]
        name        = block.get_name()
        block_id    = block.get_vitruv_id()
        sourceType  = block.get_sourceType()
        position    = block.get_position()
        
        # Passende ID gefunden
        if (block_id == vitruv_id):
            
            # Inkrementieren 
            n = n+1
            #print(n)
            #print(name)                   
                    
            # ID mehrfach vorhanden
            if n>1:
            
                # Copy
                part       = copy.deepcopy(part)
                instance   = copy.deepcopy(instance)
                
                # Append new Elements
                eagle.xml_instances.append(instance)
                eagle.xml_parts.append(part)
            
                #print('append')
                
                
            # Set Names
            part.set('name', name)
            instance.set('part', name)
            
            if (sourceType == 'Resistor'):
                
                rotation = (360-block.get_rotation())%360
                diff_rot = [0, 0]

            elif (sourceType == 'Capacitor'):
        
                rotation = (360-block.get_rotation()+90)%360
                diff = [0, 0.5*2.54]
                diff_rot = rotate(point=diff ,center=[0,0], angle_deg=rotation)

            else:
                print("Error: Component not found!")
            
            print(rotation)
            print(instance.get('part'))
            print()
            
            # Set Instance
            instance.set('x', str( eagle.scale*position[0]+diff_rot[0]))
            instance.set('y', str(-eagle.scale*position[1]+diff_rot[1]))
            instance.set('rot', 'R'+str(rotation))
         
            
    # Falls kein (Simulink)-Element mit dieser ID gefunden wurde, entsprechendes Element löschen     
    if n==0:
        
        # Remove Elements
        eagle.xml_instances.remove(instance)
        eagle.xml_parts.remove(part)
        
        #print('Remove')
        #print(instance.get('part'))


# Draw Wires
for i in range( len(lines) ):
    line = lines[i]
    
    points = line.get_points()
    #print(points)
    
    p_last = points[0]
    for j in range(1, len(points) ):

        # Get new Point
        p = points[j]

        # Wire hinzufügen
        eagle.add_wire(p_last, p, width='0.1524', layer='91')

        # Save last Point
        p_last = p
        

# Eagle-Datei speichern
eagle.save(path_eagle_save)
