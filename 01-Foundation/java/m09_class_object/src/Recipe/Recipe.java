package Recipe;

public class Recipe {

    //Write your solution here

    public String name;
    public String ingredients;
    public int servingSize;
    public double cost;


    public double costPerPerson(){
        return (this.cost / this.servingSize);
    }

    @Override
    public String toString(){
        return "Recipe for " + this.name + " wil require these ingredients: \n" + ingredients + "\nThis dish will serve " + this.servingSize + " and cost a total of $" + this.cost + " to make.";

    }

}
