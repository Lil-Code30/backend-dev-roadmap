import java.util.*;

public class LinkedListC {
    public static void main(String[] args){
        // creating a linkedlist

        LinkedList<String> fruits = new LinkedList<>();

        // adding elements
        // add(), addAll(), addFirst(), addLast()

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits);

        // add(index, element)
        fruits.add(1, "Mango");

        System.out.println(fruits);

        // addFirst()
        fruits.addFirst("Pear");

        System.out.println(fruits);

        // addLast()
        fruits.addLast("kiwi");

        System.out.println(fruits);

        // Accéder aux éléments

        // get(index), getFirst(), getLast()

        // Modify elements
        fruits.set(1, "Peach");

        System.out.println(fruits);

        // removing element: remove(index) OR remove(value)
        // removeFirst(), removeLast()
        // removeFirstOccurence(), removeLastOccurence()
        // clear()
        fruits.remove(1);

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.remove(2);

        numbers.remove(Integer.valueOf(20));


        // Queue operation : FIFO [First IN First Out)
        // poll(), pop() -> retrieve the first element and remove it from the list
        // push() insert an element as the head

        LinkedList<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue);

        // poll()
        String firstelement = queue.poll();

        System.out.println("First element of the queue: " +firstelement);
        System.out.println(queue);

        // peek() -> get the first element of the linkedlist
        System.out.println(queue.peek());

        // Stack : LIFO (Last In First Out)
        // push() -> add at the first index
        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        // pop() -> remove the first

        stack.pop();
        System.out.println(stack);

        // looping
        System.out.println("=========================");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(i + ") " +fruits.get(i));
        }

        System.out.println(fruits.get(2));

        // arraylist to linkedlist

        String[] fruits1 = {"apple", "banana", "cherry", "date"};
        /*
        We can convert this array into a LinkedList by passing it to the Arrays.asList() method
        and then creating a new LinkedList from the resulting List:
        * */
        List<String> list = Arrays.asList(fruits1);
        LinkedList<String> fruitsLinkedList = new LinkedList<>(list);
    }

}
