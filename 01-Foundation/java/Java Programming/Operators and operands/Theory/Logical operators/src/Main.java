public class Main {
   public static void main(String[] args) {
      int x = 0;
      boolean status = true && ((++x) == 0);
      System.out.println(/* Complete with the value of status as evaluated from the statement above */);
      System.out.println(/* Complete with the value of x as evaluated from the statement above */);
      status = false && ++x == 0;
      System.out.println(/* Complete with the value of x as evaluated from the statement above */);
      status = true || ++x == 0;
      System.out.println(/* Complete with the value of x as evaluated from the statement above */);
      status = false || ++x == 0;
      System.out.println(/* Complete with the value of x as evaluated from the statement above */);
      status = false & ++x == 0;
      System.out.println(/* Complete with the value of x as evaluated from the statement above */);
      status = false | ++x == 0;
      System.out.println(/* Complete with the value of x as evaluated from the statement above */);
   }
}