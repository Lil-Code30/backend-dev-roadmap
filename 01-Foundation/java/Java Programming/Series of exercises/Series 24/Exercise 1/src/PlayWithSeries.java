public class PlayWithSeries {
  //=================================================
  public static void main(String[] args) {
    // *******************************************
    // ****** Using Combination             ******
    // *******************************************
    // hint: return i/Math.pow(2.0,  i);
/* Declare the Combination instance c */
    System.out.println(c.evaluate(0, 20, new SumOperation()));
    System.out.println(c.evaluate(1, 20, new ProductOperation()));
    System.out.println(c.evaluate(3, 10, new MaxOperation()));
    System.out.println();

    // *******************************************
    // ****** Using Enumeration             ******
    // *******************************************
    // hint: return i/Math.pow(2.0,  i);
/* Declare the Enumeration instance e */
    Double[] t = {1.2, 3.4, 5.6};
    System.out.println(e.evaluate(new ArraySequence<Double>(t), new ProductOperation()));
    System.out.println();

    // *******************************************
    // ****** Using AnySeries               ******
    // *******************************************
    // hint: return i/Math.pow(2.0,  i);
/* Declare the IFunction instance f */
    System.out.println(AnySeries.evaluate(f, new ArraySequence<Double>(t), new ProductOperation()));
    System.out.println();

    // *******************************************
    // ****** Concatenation operation       ******
    // *******************************************
    String[] stringArray = { "Welcome", " to", " the world", " of", " genericity"};
/* Implement the missing instructions as specified */  }
}
