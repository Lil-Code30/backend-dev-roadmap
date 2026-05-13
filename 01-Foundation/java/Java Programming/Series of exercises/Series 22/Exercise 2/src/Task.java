import java.util.function.Predicate;

public class Task {
    public static void main(String[] args) {
        Shoes[] shoesArray = new Shoes[] {
                new Shoes("Running", "Red",    41),
                new Shoes("Boots",   "Brown",  38),
                new Shoes("Running", "Brown",  43),
                new Shoes("Running", "Yellow", 40),
                new Shoes("Walking", "Red",    41),
                new Shoes("Boots",   "Red",    45)
        };

        // Print by size [with a separate class]
        System.out.println("---- size=41");
        printShoes(shoesArray, new BySizeSelector(41));

        // Print by color [with an anonymous class]
        System.out.println("---- color=Brown");
        printShoes(shoesArray, /* Implement call with an anonymous class for color == Brown */);

        // Print by type [with a lambda expression]
        System.out.println("---- type=Boots");
        printShoes(shoesArray, /* Implement call to printShoes with a lambda expression for type == "Boots" */);

        // Print by type [with a lambda expression of a "standard library" type]
        System.out.println("---- type=Running");
        printShoesSL(shoesArray, /* Implement call to printShoes with a lambda expression for type == "Running" */);
    }

    public static void printShoes(Shoes[] t, ShoesSelector c) {
        /* Implement method */
    }

    public static void printShoesSL/* Implement method that uses a generic interface from Java */
}