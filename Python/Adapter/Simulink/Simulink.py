import xml.etree.ElementTree as etree
from Adapter.Simulink.Block import Block
from Adapter.Simulink.Line import Line

class Simulink:

    # Init
    def __init__(self, path):

        # Variablen
        self.block = []
        self.line  = []

        # Dateien öffnen
        xml_tree = etree.parse(path)

        # Elemente zuweisen Simulink-Datei (.mdl)
        xml_root_simulink = xml_tree.getroot()
        xml_model = xml_root_simulink.find('rootElement')
        xml_system = xml_model.find('.//element[@name="System"]')


        # Get all Blocks
        xml_block = xml_system.findall('.//element[@name="Block"]')

        # Loop for Blocks
        for i in range( len(xml_block) ):

            # Read XML
            xml_name                = xml_block[i].find('.//element[@name="Name"]')
            xml_name_value          = xml_name.find('value')
            xml_sourceType          = xml_block[i].find('.//element[@name="SourceType"]')
            xml_sourceType_value    = xml_sourceType.find('value')
            xml_position            = xml_block[i].find('.//element[@name="Position"]')
            xml_position_value      = xml_position.findall('value')
            xml_rotation            = xml_block[i].find('.//element[@name="BlockRotation"]')
            xml_tag                 = xml_block[i].find('.//element[@name="Tag"]')
            xml_tag_value           = xml_tag.find('value')

            # Get Name
            name = xml_name_value.text
            
            # Get ID
            vitruv_id = xml_tag_value.text

            # Get Source Type
            sourceType = xml_sourceType_value.text

            # Get Position
            position = []
            for j in range(4):
                position.append(float(xml_position_value[j].text))

            # Get Rotation
            if xml_rotation != None:
                rotation = xml_rotation.get('value')
            else:
                rotation = '0'

            # Block-Objekt erstellen und hinzufügen
            self.block.append( Block(name, vitruv_id, sourceType, position, rotation) )
            

        # Get all Lines
        xml_line = xml_system.findall('.//element[@name="Line"]')

        # Loop for Lines
        for i in range( len(xml_line) ):

            # Read XML
            xml_srcPort         = xml_line[i].find('.//element[@name="SrcPort"]')
            xml_srcBlock        = xml_line[i].find('.//element[@name="SrcBlock"]')
            xml_srcBlock_value  = xml_srcBlock.find('value')
            xml_dstPort         = xml_line[i].find('.//element[@name="DstPort"]')
            xml_dstBlock        = xml_line[i].find('.//element[@name="DstBlock"]')
            xml_dstBlock_value  = xml_dstBlock.find('value')
            xml_points          = xml_line[i].find('.//element[@name="Points"]')

            # Get Source and Destination Blocks
            srcBlock = self.__get_block_by_name__(xml_srcBlock_value.text)
            dstBlock = self.__get_block_by_name__(xml_dstBlock_value.text)

            # Points initialisieren
            points = []

            # Point Values auslesen
            if xml_points != None:
                
                xml_points_value = xml_points.findall('value')
                
                for j in range( len(xml_points_value) ):
                    points.append(float(xml_points_value[j].text))

            # Line-Objekt erstellen und hinzufügen
            self.line.append( Line(xml_srcPort.get('value'), srcBlock, xml_dstPort.get('value'), dstBlock, points) )
            

    # Get Blocks
    def get_blocks(self):

        return self.block

    # Get Lines
    def get_lines(self):

        return self.line

    
    # Get Block by Name
    def __get_block_by_name__(self, name):

        # Loop for Blocks
        for i in range( len(self.block) ):

            if (name == self.block[i].name):
                return self.block[i]

        return None
