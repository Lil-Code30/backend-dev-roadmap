import java.util.Locale;

public class P {
   private double a; // An attribute
   private double b; // A second attribute

   public P() {
      this(0.0, 0.0);
   }

   public P(double a, double b) {
      this.a = a; this.b = b;
   }

   /**
    * Get a.
    *
    * @return A.
    */
   public double f() { return this.a; }

   public double g() { return this.b; }

   /**
    * Compute the square root of b*b + a*a.
    *
    * @return The square root of b*b + a*a.
    */
   public double h() {
      return Math.sqrt(a*a + b*b);
   }

   public String toString() {
       return String.format(Locale.US, "(%.2f, %.2f)", a, b);
   }
}
