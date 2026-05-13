public class Sinusoid {
   private static int nbPoints = 500;
   public static double[] valSin = new double[nbPoints];

   static {
      System.out.print("S");
      double x = 0.0;
      double dx = (Math.PI/2) / (nbPoints-1);

      for(int i = 0; i < nbPoints; i++, x += dx) {
         valSin[i] = Math.sin(x);
      }
   }

   public Sinusoid() {
      System.out.print("C");
   }
}
