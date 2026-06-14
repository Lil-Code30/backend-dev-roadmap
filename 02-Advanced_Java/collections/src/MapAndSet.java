import java.util.*;

public class MapAndSet {
    public static void main(String[] args){

        // HashMap() : key-value pair O(1)
        // Doc: https://www.tutorialspoint.com/java/util/java_util_hashmap.htm
        System.out.println("==== HashMap() ====\n");
        HashMap<Integer, Student> students = new HashMap<>();

        // constructor :
        // HashMap()
        // HashMap(int initialCapacity) // default (16 buckets)
        // HashMap(int initialCapacity, float loadFactor)


        // Methods
        // putAll()
        // put()
        students.put(101, new Student(1, "John Doe", 20));
        students.put(102, new Student(2, "Emma Stone", 40));

        System.out.println(students);

        // students1.containsKey();
        // students1.containsValue();

        // get(key)
        System.out.println(students.get(102));

        // size()

        // Iterating
        // students1.keySet() :: to get the keys
        // student.values() :: to get the values
        // student.entrySet() :: to get the key-value pair

        System.out.println("Iterating through the values of the student hashMap");
        for(Student st: students.values()){
            System.out.println(st);
        }

        System.out.println("Iterating through the keys-values of the student hashMap");
        System.out.println("#ID  => Student (rollNum)");
        for(Map.Entry<Integer, Student> entry: students.entrySet()){
            System.out.println(entry.getKey() + " :: " + entry.getValue().name + "(" + entry.getValue().rollNo +")");
        }

        // =================================
        System.out.println("\n==== TreeMap() ====");
        // TreeMap
        // https://www.tutorialspoint.com/java/util/java_util_treemap.htm
        // Note: is like HashMap but ordered

        // 1. TreeMap() — Natural Ordering
        TreeMap<Integer, String> students1 = new TreeMap<>();

        students1.put(103, "Tom");
        students1.put(101, "John");
        students1.put(102, "Emma");

        System.out.println(students1);

        // 2. TreeMap(Comparator)
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        map.put(1, "A");
        map.put(3, "B");
        map.put(5, "C");

        System.out.println(map);

        // custom comparator
        // A TreeMap comparator must return an int, not a boolean.

        /*
        * < 0	a comes before b
          0	a and b are considered equal
          > 0	a comes after b
        */

        TreeMap<String, Integer> map1 = new TreeMap<>((el1, el2) -> el1.length() - el2.length());

        TreeMap<Student, String> students2 = new TreeMap<>((st1, st2) -> st1.age - st2.age);

        students2.put( new Student(1, "John Doe", 20), "I am John Doe");
        students2.put(new Student(2, "Emma Stone", 40), "Hello world!");
        students2.put(new Student(3, "Jack Ryan", 25), "Hello world!");
        students2.put(new Student(4, "Petter Pan", 10), "Hello world!");

        System.out.println(students2);

        // =================================
        System.out.println("\n==== HashSet() ====");
        // HashSet
        // https://www.tutorialspoint.com/java/util/java_util_hashset.htm

        // constructor
        // HashSet()
        // HashSet(int initialCapacity (default - 16), float loadFactor (default - 0.75))

        // HashSet with default constructor
        HashSet<Integer> hashset1 = new HashSet<>();
        hashset1.add(1);
        hashset1.add(2);
        hashset1.add(3);
        System.out.println("HashSet1: " + hashset1);

        // HashSet with initial capacity and loadfactor
        HashSet<Integer> hashset2 = new HashSet<>(20, 0.75f);
        hashset2.add(4);
        hashset2.add(5);
        hashset2.add(6);
        System.out.println("HashSet2 with capacity and loadfactor: " + hashset2);


        // Methods
        // Add(E e)

        // create hash set
        HashSet<Integer> set = new HashSet<>();

        // populate hash set using the add()
        set.add(100);
        set.add(200);
        set.add(300);

        System.out.println("Hash set values: " + set);

        HashSet<Integer> newSet = new HashSet<>();

        newSet.addAll(set);
        newSet.add(400);

        // Accessing Elements from a HashSet

        /*
        for(Integer el: newSet){
            System.out.println(el);
        }
        */

        // using the iterator for accessing the elements
        Iterator<Integer> iterate = newSet.iterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next());
        }


        // =================================
        System.out.println("\n==== TreeSet() ====");
        // TreeSet
        // https://www.tutorialspoint.com/java/util/java_util_treeset.htm
    }
}


