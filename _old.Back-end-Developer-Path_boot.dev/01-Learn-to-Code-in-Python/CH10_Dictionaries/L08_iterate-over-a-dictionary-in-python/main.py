def get_most_common_enemy(enemies_dict):
    
    if len(enemies_dict) == 0:
        return None
    
    max_enemie_count = float("-inf")
    highest_enemie_count = "";
    
    
    
    for enemie in enemies_dict:
        if enemies_dict[enemie] > max_enemie_count:
            max_enemie_count = enemies_dict[enemie] 
            highest_enemie_count = enemie
    
    return highest_enemie_count
    