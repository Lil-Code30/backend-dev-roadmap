<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">Custom classes</i>
</div>

Given a class called `Recipe`
declare these instance variables:
`String name`, `String ingredients`, `int servingSize`, `double cost`

create a method called `costPerPerson` that will return a `double`.
    Calculate the amount each person would need to pay to make this recipe - use the serving size and cost values(`cost / servingSize`)

create a toString() that shows the information in the following format:
        
    Recipe for $name will require these ingredients:
                $ingredients
        This dish will serve $servingSize and cost a total of $ $cost to make

Example:

    Recipe recipe = new Recipe();
    recipe.name = "Pizza";
    recipe.ingredients = "Dough, Cheese, Tomatoes";
    recipe.servingSize = 4;
    recipe.cost = 14.99;
    System.out.println(recipe.costPerPerson());
    System.out.println(recipe.toString());

Output:

    3.7475
    Recipe for Pizza will require these ingredients:
    Dough, Cheese, Tomatoes
    This dish will serve 4 people and cost a total of $ 14.99

After completing, uncomment code in `main` method in `Task` class and run

<div class="hint">
  <i style="padding-left: 40px;"> for cost per person calculation -> cost / servingSize</i>
</div>
