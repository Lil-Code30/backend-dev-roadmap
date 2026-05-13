public class Main {
   public static void main(String[] args) {
      // String constructor
      Compass c = new Compass(Compass.NORTH);
      System.out.println(c.toString());
      c.setDirection(Compass.EAST);
      System.out.println(c.toString());
      c.setDirection(Compass.WEST);
      System.out.println(c.toString());
      c.setDirection(Compass.SOUTH);
      System.out.println(c.toString());
      // Integer constructor
      c = new Compass(5);
      System.out.println(c.toString());
      c.setDegree(175);
      System.out.println(c.toString());
   }
}