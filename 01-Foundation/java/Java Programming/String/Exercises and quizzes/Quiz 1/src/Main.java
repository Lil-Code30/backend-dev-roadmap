public class Main {
   public static void main(String[] args) {
      String s = "Acadabra";
      StringBuilder sb = new StringBuilder();
      for(int i = s.length()-1; i >= 0; i--) {
         char c = s.charAt(i);
         if(c > 96) {
            c = (char)(c - 32);
         } else {
            c = (char)(c + 32);
         }
         sb.append(c);
      }
      s = sb.toString();
      s = s.substring(3) + s.substring(0, 3);
   }
}