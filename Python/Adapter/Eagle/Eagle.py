import xml.etree.ElementTree as etree

class Eagle:

    # Init
    def __init__(self, path, scale):

        # Skalierungsfaktor
        self.scale = scale

        # Eagle-Datei (.sch) öffnen
        self.xml_tree = etree.parse(path)

        # Read XML 
        xml_root_eagle     = self.xml_tree.getroot()
        xml_drawing        = xml_root_eagle.find('drawing')
        xml_schematic      = xml_drawing.find('schematic')
        xml_sheets         = xml_schematic.find('sheets')
        xml_sheet          = xml_sheets.find('sheet')
        self.xml_parts     = xml_schematic.find('parts')
        self.xml_instances = xml_sheet.find('instances')
        xml_nets           = xml_sheet.find('nets')
        xml_net            = xml_nets.find('net')
        self.xml_segment   = xml_net.find('segment')


    # Save
    def save(self, path):

        # Datei speichern
        self.xml_tree.write(path)


    # Add Component
    def add_component(self, name, gate, position, diff, rotation, library, deviceset, device):
        
        # Instance
        instance = etree.SubElement(self.xml_instances, 'instance')
        instance.set('part', name)
        instance.set('gate', gate)
        instance.set('x', str( self.scale*position[0]+diff[0]))
        instance.set('y', str(-self.scale*position[1]+diff[1]))
        instance.set('rot', 'R'+str(rotation))

        # Part
        part = etree.SubElement(self.xml_parts, 'part')
        part.set('name', name)
        part.set('library', library)
        part.set('deviceset', deviceset)
        part.set('device', device)
        

    # Add Wire
    def add_wire(self, position1, position2, width, layer):

        # Wire
        wire = etree.SubElement(self.xml_segment, 'wire')
        wire.set('x1', str( self.scale*position1[0]))
        wire.set('y1', str(-self.scale*position1[1]))
        wire.set('x2', str( self.scale*position2[0]))
        wire.set('y2', str(-self.scale*position2[1]))
        wire.set('width', width)
        wire.set('layer', layer)
        
    # Find Instance by Name
    def find_instace_by_name(self, name):
        
        for instance in self.xml_instances.findall('instance'):           
            
            #print(instance.get('part'))
            
            # Passendes Element gefunden
            if (name == instance.get('part')):
            
                #print('True')
                return instance

         
        

