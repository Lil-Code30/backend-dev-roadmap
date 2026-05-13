public class PlayWithSeries {
  //=================================================
  // compute the series Sum{ i in [0..20] } ( i/(2^i) )
  static double sum(int from, int to) {
    double sum = 0.0;
    for (int i = from; i <= to; i++) {
      sum += i/Math.pow(2.0,  i);
    }
    return sum;
  }

  //=================================================
  public static void main(String[] args) {
    System.out.println(sum(0, 20));
    System.out.println();
    
    // *******************************************
    // ****** Using Sum                     ******
    // *******************************************
    Sum s1 = new Sum1();
    Sum s2 = new Sum2();
    System.out.println(s1.evaluate(0, 20));
    System.out.println(s2.evaluate(0, 20));
    System.out.println();

    // *******************************************
    // ****** Using Combination             ******
    // *******************************************
    /* Create an instance c of Combination using an anonymous class */
/* Test your implementation by evaluating c with EvenIntegerSequence and ArrayNumberSequence */
    System.out.println();

    // *******************************************
    // ****** Using Enumeration             ******
    // *******************************************
    /* Create an instance e of Enumeration using an anonymous class */
/* Test your implementation by evaluating e with Sum, Product and Max */

    // *******************************************
    // ****** Using AnySeries               ******
    // *******************************************
    /* Implement the function f using an anonymous class */
/* Test your implementation by evaluating e with Sum, Product and Max */
  }
}
