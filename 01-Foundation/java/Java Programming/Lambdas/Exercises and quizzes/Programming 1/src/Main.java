import ch.heiafr.tic.MyComparator;

import java.util.Arrays;
import java.util.Comparator;

import static ch.heiafr.tic.MyComparator.f;

public class Main {
   public static void main(String[] args) {
      // =======================================================================
      // AIM : sort some strings

      // === With concrete class
      String[] array;
      array = new String[] {"Tintin", "Milou", "Haddock", "Dupond et Dupont"};
      MyComparator myComparator = new MyComparator();
      Arrays.sort(array, myComparator);
      System.out.println(Arrays.toString(array));

      // === With anonymous class
      array = new String[] {"Tintin", "Milou", "Haddock", "Dupond et Dupont"};
/* Sort with an anonymous class */
      System.out.println(Arrays.toString(array));

      // === With lambda
      array = new String[] {"Tintin", "Milou", "Haddock", "Dupond et Dupont"};
/* Sort with a lambda expression */      System.out.println(Arrays.toString(array));

      // === With method reference
      array = new String[] {"Tintin", "Milou", "Haddock", "Dupond et Dupont"};
/* Sort with method reference */      System.out.println(Arrays.toString(array));
   }
}