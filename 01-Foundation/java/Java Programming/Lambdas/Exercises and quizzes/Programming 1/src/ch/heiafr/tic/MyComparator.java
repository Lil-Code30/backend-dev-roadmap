package ch.heiafr.tic;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

   @Override
   public int compare(String o1, String o2) {
      return f(o1).compareTo(f(o2));
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
