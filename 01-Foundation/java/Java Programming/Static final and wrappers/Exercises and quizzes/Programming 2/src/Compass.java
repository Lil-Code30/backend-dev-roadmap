import java.util.Arrays;

public class Compass {
   /* Complete attribute declaration */ = "North";
   /* Complete attribute declaration */ = "East";
   /* Complete attribute declaration */ = "South";
   /* Complete attribute declaration */ = "West";

   public static final String[] COMPASS = new String[]{NORTH, EAST, SOUTH, WEST};

   private int degree;

   public Compass(String direction) {
      if (!Arrays.asList(COMPASS).contains(direction)) {
         throw new IllegalArgumentException("Unknown direction");
      }
      this.degree = stringToDegree(direction);
   }

   public Compass(int degree) {
      this.degree = degree;
   }

   public String getDirection() {
/* Complete getDirection() method */
   }

   public int getDegree() {
      return degree;
   }

   public void setDirection(String direction) {
      if (!Arrays.asList(COMPASS).contains(direction)) {
         throw new IllegalArgumentException("Unknown direction");
      }
      this.degree = stringToDegree(direction);
   }

   public void setDegree(int degree) {
      if (! (0 <= degree & degree < 360)) {
         throw new IllegalArgumentException("Illegal degree value");
      }
      this.degree = degree;
   }

   public String toString() {
      return String.format("%s (%d°)",
            getDirection().toLowerCase(), getDegree());
   }

   private int stringToDegree(String direction) {
      /* Complete stringToDegree() method */
   }
}
