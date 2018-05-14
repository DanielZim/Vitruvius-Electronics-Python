from Adapter.Simulink.Block import Block
from Adapter.Utils import rotate


class Line:

    # Init
    def __init__(self, srcPort, srcBlock, dstPort, dstBlock, points):

        # Elemente zuweisen
        self.srcPort  = srcPort
        self.srcBlock = srcBlock
        self.dstPort  = dstPort
        self.dstBlock = dstBlock
        self.points   = points


    # Get-Points
    def get_points(self):

        # Point-List initialisieren
        pointsx = []

        # Position Source-Block
        position = self.srcBlock.get_position()
        rotation = self.srcBlock.get_rotation()
        width    = self.srcBlock.get_width()
        #height   = self.srcBlock.get_heigth()
        #print(position)
        

        # Points für Start-Wire
        if self.srcPort == 'LConn1':
            p1 = [position[0]-width/2,    position[1]]
            p2 = [position[0]-width/2-15, position[1]]
        elif self.srcPort == 'RConn1':
            p1 = [position[0]+width/2,    position[1]]
            p2 = [position[0]+width/2+15, position[1]]
 
        # Add Points für Start-Wire
        p1_rot = rotate(point=p1 ,center=position, angle_deg=rotation)
        p2_rot = rotate(point=p2 ,center=position, angle_deg=rotation)
        pointsx.append(p1_rot)
        pointsx.append(p2_rot)
        
        
        # Points für Zwischen-Wires
        last_point = pointsx[ len(pointsx)-1 ]
        i=0
        if self.points != None:
            while i < len(self.points):

                # New Point
                pointsx.append([self.points[i]+last_point[0], self.points[i+1]+last_point[1]])

                # Remember last Point
                last_point = pointsx[ len(pointsx)-1 ]

                # Increment i
                i=i+2


        # Position Destination-Block
        position = self.dstBlock.get_position()
        rotation = self.dstBlock.get_rotation()
        width    = self.dstBlock.get_width()
        #height   = self.dstBlock.get_heigth()
        
        # Points für End-Wire
        if self.dstPort == 'LConn1':
            p1 = [position[0]-width/2-15, position[1]]
            p2 = [position[0]-width/2,    position[1]]
        elif self.dstPort == 'RConn1':
            p1 = [position[0]+width/2+15, position[1]] 
            p2 = [position[0]+width/2,    position[1]]          
            
        # Add Points für End-Wire
        p1_rot = rotate(point=p1 ,center=position, angle_deg=rotation)
        p2_rot = rotate(point=p2 ,center=position, angle_deg=rotation)
        pointsx.append(p1_rot)
        pointsx.append(p2_rot)

        return pointsx


        