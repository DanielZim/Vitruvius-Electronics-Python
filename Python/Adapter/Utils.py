import math

# Rotation
def rotate(point, center, angle_deg):
    
    # degree -> rad
    angle_rad = math.radians(angle_deg)

    # Execute Transformation
    x = math.cos(angle_rad) * (point[0] - center[0]) - math.sin(angle_rad) * (point[1] - center[1]) + center[0]
    y = math.sin(angle_rad) * (point[0] - center[0]) + math.cos(angle_rad) * (point[1] - center[1]) + center[1]
    new_point = [x,y]

    return new_point
     
