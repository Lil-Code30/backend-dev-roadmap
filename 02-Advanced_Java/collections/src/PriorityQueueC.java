import java.util.*;

public class PriorityQueueC {
    public static void main(String[] args){
        // PriorityQueue
        // https://www.tutorialspoint.com/java/util/java_util_priorityqueue.htm

        // creating a priorityQueue

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        // adding elements
        pq.add(20);
        pq.add(20);
        pq.add(10);
        pq.add(50);
        pq.offer(5);

        System.out.println("PriorityQueue Elements: " +pq);

        // poll(), remove()
        // peek() element()

        System.out.println("The head of the queue+: " + pq.element());

        // size()

        // iterating
        pq.forEach(s -> {
            System.out.println(s);
        });

        // create an empty priority queue
        PriorityQueue<Student> queue = new PriorityQueue<>(10, (a, b) -> a.age - b.age);

        // use add() method to add elements in the queue
        queue.add(new Student(3, "Adam", 100));
        queue.add(new Student(1, "Julie", 20));
        queue.add(new Student(5, "Jul", 10));
        queue.add(new Student(2, "Robert", 30));
        queue.add(new Student(4, "John", 15));

        System.out.println(queue);

        // Java PriorityQueue removeIf() Method
        System.out.println("After removing all students with age less than 18");
        queue.removeIf(student -> student.age < 18);

        System.out.println(queue);

        // Java PriorityQueue toArray() Method
        System.out.println("Java PriorityQueue toArray() Method");

        Object[] queueToArray = pq.toArray();

        for(Object obj: queueToArray){
            System.out.println(obj);
        }

        System.out.println("Another example with a Class.");
        Student[] students = queue.toArray(new Student[queue.size()]);

        for(Student st: students){
            System.out.println(st);
        }

    }
}
