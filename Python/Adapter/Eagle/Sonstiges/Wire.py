from Adapter.Simulink.Eagle import Wire

class Wire:

    # Init
    def __init__(self, position1, position2, width, layer):

        # Elemente zuweisen
        self.position1 = position1
        self.position2 = position2
        self.width = width
        self.layer = layer

