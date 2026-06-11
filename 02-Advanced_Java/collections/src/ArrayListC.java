import java.util.ArrayList;

public class ArrayListC {

    public static void main(String[] args){
        // creating an array list
        ArrayList<String> names = new ArrayList<>();

        // with initial capacity
        ArrayList<String> names1 = new ArrayList<>(100);

        // Generic Types Ex: Integer, String, Double
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();
        ArrayList<String> names2 = new ArrayList<>();

        // Common methods
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");

        // add(index, element)
        fruits.add(1, "Orange");
        fruits.add("Pizza");
        fruits.add("grapes");

        System.out.print("[");
        for(String fruit: fruits){
            System.out.print(fruit + ", ");
        }
        System.out.print("]");

        // get(index)
        String fruit = fruits.get(2);
        System.out.println("\n" + fruit);

        // remove() that takes index or the element
        fruits.remove(fruits.size() - 2);
        // fruits.removeLast() - if it is the last element
        // Or fruits.remove("Pizza");

        System.out.print("[");
        for(String fruit1: fruits){
            System.out.print(fruit1 + ", ");
        }
        System.out.print("]");

        // clear() - remove all elements
        System.out.println();

        // size()
        int count = fruits.size();
        System.out.println(count);

        // isEmpty()
        if(fruits.isEmpty()){
            System.out.println("The ArrayList is empty");
        }else{
            System.out.println("The ArrayList is not empty");
        }

        // contains()
        // boolean exists = fruits.contains("Apple");
        if(fruits.contains("Apple")){
            System.out.println("The ArrayList contains apples");
        }

        // indexOf()
        int indexApple = fruits.indexOf("Apple");
        System.out.println("The index of Apple is: " + indexApple);

        // Traversing an ArrayList

        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        // foreach()
//        fruits.forEach()

        System.out.println(fruits);
    }
}
