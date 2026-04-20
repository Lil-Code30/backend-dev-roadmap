def merge(dict1, dict2):
    merge_dict = {}
    
    for key in dict1:
        merge_dict[key] = dict1[key]
    
    for key in dict2:
        merge_dict[key] = dict2[key]
        
    return merge_dict
