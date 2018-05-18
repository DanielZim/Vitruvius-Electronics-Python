class Block:

    # Init
    def __init__(self, name, vitruv_id, sourceType, position, rotation):

        # Elemente zuweisen
        self.name       = name
        self.vitruv_id  = vitruv_id
        self.rotation   = int(rotation)
        self.sourceType = sourceType
        
        # Position bestimmen (Mittelpunkt)
        center = [(position[0]+position[2])/2 , (position[1]+position[3])/2]
        self.position = center
        
        # Höhe und Breite bestimmen
        self.width  = position[2] - position[0] 
        self.height = position[3] - position[1] 
        
        # Falls um 90 oder 270 Grad gedreht, Höhe und Breite vertauschen
        if self.rotation == 90 or self.rotation == 270:
            temp = self.width
            self.width = self.height
            self.height = temp


    # Get Name
    def get_name(self):

        return self.name
    
    # Get ID
    def get_vitruv_id(self):

        return self.vitruv_id

    # Get Source Type
    def get_sourceType(self):

        return self.sourceType

    # Get Position
    def get_position(self):

        return self.position

    # Get Width
    def get_width(self):

        return self.width

    # Get Heigth
    def get_height(self):

        return self.height

    # Get Rotation
    def get_rotation(self):

        return self.rotation
