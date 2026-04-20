def calculate_experience_points(level):
    if level == 1:
        return 0
    
    xp = 0
    for i in range(1, level):
        xp += i * 5 
    
    return xp
        
