import ch.heiafr.tic.AbleToCompare;
import ch.heiafr.tic.Person;

public class Main {
   public static void main(String[] args) {
      // Create some persons and compare them
      Person a = new Person("A", 19);
      Person b = new Person("B", 19);
      Person c = new Person("C", 20);
      System.out.println(a.isSmallerThan(c));
      System.out.println(a.isEquals(b));
      // Create an array of persons as an array of AbleToCompare
      AbleToCompare[] persons = new AbleToCompare[] {
            new Person("A", 19),
            new Person("B", 27),
            new Person("C", 16),
            new Person("D", 22),
            new Person("E", 18)
      };
      // Sort the persons
      sort(persons);
      for(AbleToCompare p: persons) {
         System.out.println(p);
      }
   }

   public static void sort(AbleToCompare[] t) {
      boolean isSorted = false;
      while (!isSorted) {
         isSorted = true;
         for (int i = 0; i < t.length - 1; i += 1) {
            if (t[i + 1].isSmallerThan(t[i])) {
               AbleToCompare temp = t[i];
               t[i] = t[i + 1];
               t[i + 1] = temp;
               isSorted = false;
            }
         }
      }
   }
}