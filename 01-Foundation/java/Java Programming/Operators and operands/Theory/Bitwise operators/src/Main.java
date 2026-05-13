public class Main {
   public static void main(String[] args) {
      // logical operators
      byte x = (byte) 0B01111111;
      byte y = /* Initialize y for printing 110101 to the console below */;
      System.out.println(Integer.toBinaryString(x & y));
      y = (byte) /* Initialize y for printing 100010 to the console below */;
      System.out.println(Integer.toBinaryString(~y));
      y = (byte) /* Initialize y for printing 1010011 to the console below */;
      System.out.println(Integer.toBinaryString(x ^ y));

      // shift operators
      int i = 10 << 2;
      System.out.println("value of i is " + /* Complete with the value of i as evaluated from the statement above */);
      i = 20 >> 2;
      System.out.println("value of i is " + /* Complete with the value of i as evaluated from the statement above */);
      x = (byte) /* Initialize x for printing 11100 to the console below */;
      System.out.println(Integer.toBinaryString(x >>> 2));
   }
}