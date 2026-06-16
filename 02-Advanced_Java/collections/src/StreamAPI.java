import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){

        // Lambda expression
        // parameter -> expression body

        // with type declaration : (int q, int b) -> a + b;
        // without type declaration : (a, b) -> a - b;
        // with return statement : (a, b) -> {return a * b; };
        // without return statement : (a, b) -> a / b;

        // printing

        // (msg) -> System.out.println("Hello World!);
        // msg -> System.out.println("Hello World!);
        System.out.println("=====================================");
        System.out.println("StreamAPI and lambda expression examples");
        // Creating Streams
        // from a collection
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.stream().forEach(System.out::println);

        // From an Array
        int[] arr = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(arr);

        // Using Stream.of()
        Stream<String> stream1 = Stream.of("java", "Python", "C++");

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.stream(numbers).filter(n -> n%2 == 0).map(n -> n *2).forEach(System.out::println);

        //Intermediate Operations -> Intermediate operations return another stream.
        List<Integer> nums = List.of(0,1,30,25,2,3,4,20,5,6,11,7,1,8,5,9,10,0,2);
        System.out.print("Initial list: ");
        for(Integer i: nums){
            System.out.print(i + ", ");
        }

        // filter() : select elements matching a condition
        System.out.println("\nAfter using filter(): ");
        nums.stream().filter(n -> n % 2 == 0).forEach((el) -> System.out.print(el + ", "));

        // String::valueOf

        String result = nums.stream().map(n -> n * n).map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(result);

        // map() : transform each elements
        System.out.println("\nAfter using map(): ");
        nums.stream().map( n -> n * n).forEach((el) -> System.out.print(el + ", "));

        // sorted() : sort elements
        System.out.println("\nAfter using the sorted(): ");
        nums.stream().sorted().forEach((el) -> System.out.print(el + ", "));

        System.out.print("\n sorted in reverse order: ");
        nums.stream().sorted(Comparator.reverseOrder()).forEach((el) -> System.out.print(el + ", "));

        // distinct(): removes duplicates
        System.out.println("\nAfter using the distinct()");
        nums.stream().distinct().forEach((el) -> System.out.print(el + ", "));

        // limit() : Keeps first N elements
        System.out.println("\nAfter using the limit()");
        nums.stream().limit(5).forEach((el) -> System.out.print(el + ", "));

        // skip() : skips first N elements
        System.out.println("\nAfter using the skip()");
        nums.stream().skip(5).forEach((el) -> System.out.print(el + ", "));

        // Terminal Operations -> produce a result or aside effect

        ArrayList<Integer> events = new ArrayList<>(Arrays.asList(10,20,30,40,50,60)); // another method : List.of(10,20,30,40,50,60)

        // foreach()
        // collect() -> convert stream into a collection
        List<Integer> evens = nums.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
        // another way
        List<Integer> evens1 = nums.stream().filter(n -> n % 2 ==0).toList();

        System.out.println(events);

        //count()
        long count = nums.stream().filter(n -> n % 2 == 0).count();
        System.out.println("The number of even numbers is: " + count);

        // findFirst()
        // findAny()

        // boolean return
        // anyMatch(), allMatch(), noneMatch() -> all takes conditions as parameters and return boolean as value

        boolean exists = nums.stream().anyMatch(n -> n > 10);

        // reduce() -> combines all elements into a single value

        int sum = nums.stream().reduce(0, (a, b) -> a + b);
        // int sum = nums.stream().reduce(0, Integer::sum);

        System.out.println("The sum of all the elements in the array list is: " + sum);

        // min() and max()
        // Integer::compareTo
        // (a, b) -> a - b
        Optional<Integer> max = nums.stream().max((a, b) -> a - b );

    }
}
