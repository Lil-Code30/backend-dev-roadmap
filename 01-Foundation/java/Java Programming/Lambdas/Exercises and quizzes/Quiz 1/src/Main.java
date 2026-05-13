import java.util.Arrays;
import java.util.Comparator;

public class Main {
   public static void main(String[] args) {
      String[] array = new String[] {
            "Tintin", "Milou", "Capitaine Haddock", "Dupond et Dupont"
      };
      Arrays.sort(array, (a, b) -> {
         return f(a).compareTo(f(b));
      });
   }

   public static String f(String s) {
      StringBuilder s1 = new StringBuilder();
      StringBuilder s2 = new StringBuilder();
      for(int i = 0; i < s.length(); i++){
         char c = s.charAt(i);
         switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
               s1.append(c);
               break;
            default:
               s2.append(c);
         }
      }
      return (s1.append(s2)).toString();
   }
}