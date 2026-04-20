def check_ingredient_match(recipe, inventory): 
    missing_ingredients = []
    has_ingredients = []
    
    for ingredients in recipe:
        if ingredients not in inventory:
            missing_ingredients.append(ingredients)
        else:
            has_ingredients.append(ingredients)
    
    percentage = (len(has_ingredients) / len(recipe)) * 100.00
    
    return percentage, missing_ingredients
