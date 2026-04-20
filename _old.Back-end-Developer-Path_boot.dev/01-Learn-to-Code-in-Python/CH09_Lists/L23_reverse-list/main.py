def reverse_list(items):
    reverse_items = []
    position = -1
    
    for i in range(len(items)):
        reverse_items.insert(position,items[i])
        position -= 1
    
    return reverse_items

        
