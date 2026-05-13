public class Main {
   public static void main(String[] args) {
      int a = 1;
      int b = 2;
      int c = ++b;
      int d = a++;

      c++;
      System.out.print("a = " + a);
      System.out.print(" b = " + b);
      System.out.print(" c = " + c);
      System.out.println(" d = " + d);
   }
}