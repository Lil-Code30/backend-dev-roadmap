import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args){
        // comparator
        // https://www.tutorialspoint.com/java/java_using_comparator.htm

        // Takes a list o Dog objects
        List<Dog> list = new ArrayList<>();

        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));

        Collections.sort(list);   // Sorts the array list
        System.out.println("Sorted by name:");
        // printing the sorted list of names
        System.out.print(list);

        // Sorts the array list using comparator
        Collections.sort(list, new Dog());
        System.out.println(" ");

        System.out.println("Sorted by age:");
        // printing the sorted list of ages
        System.out.print(list);
    }
}
