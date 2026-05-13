import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Person {
   enum Gender { Female, Male};

   final private int age;
   final private Gender gender;

   Person(int age, Gender gender) {
      this.age = age;
      this.gender = gender;
   }

   int age() {
      return this.age;
   }
   Gender gender() {
      return this.gender;
   }

   @Override
   public String toString() {
      return this.gender.toString() + " with age " + this.age;
   }
}

public class Main {
   // processElements is a static method used for processing a list of any
   // type T elements.
   // the Predicate functional interface takes one element of type T as argument
   //  and returns a boolean value
   // the Consumer functional interface takes one element of type T as argument
   //  and returns void
   // In this method, we may use all methods defined by the T class
   public static <T> void processElements(List<T> list,
                                          Predicate<T> check,
                                          Consumer<T> block) {
      for (int i = 0; i < list.size(); i++) {
         // Here item is an untyped item of the list
         // We cannot use any method of the T type that
         // would for instance be Animal or Mammal.
         // However the functional interface method can make use of the type argument,
         // so they can use the method age() when the type argument T is Animal or
         // the method name() when the type argument is Dog
         T item = list.get(i);
         if (check.test(item)) {
            block.accept(item);
         }
      }
   }

   public static void main(String[] args) {
      List<Person> personList = new ArrayList<>(4);
      personList.add(new Person(20, Person.Gender.Male));
      personList.add(new Person(20, Person.Gender.Female));
      personList.add(new Person(40, Person.Gender.Male));
      personList.add(new Person(50, Person.Gender.Female));

      // call processElements for logging all persons with gender female
      /* implement the call to processElements with a lambda expression and a reference to method */

      // call processElements for logging all persons with gender male
      // and age < 30
      /* implement the call to processElements with a lambda expression and a reference to method */

      // do the same by combining two predicates (using the default and()
      // method of the Predicate functional interface)
      /* Define a predicate that checks for gender */
      /* implement the call to processElements with a lambda expression using and() on predicate and a reference to method */
   }
}

