def get_champion_slices(champions):
    first_return = champions[2:]
    second_return = champions[:-1]
    third_return = champions[::2]
    
    return first_return, second_return, third_return
