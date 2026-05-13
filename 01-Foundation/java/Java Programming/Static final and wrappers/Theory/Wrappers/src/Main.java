public class Main {
   public static void main(String[] args) {
      String str = "1.23";
      float primF = 3.456F;
      Float  objF;

      primF = Float.MAX_VALUE;	// Plus grande valeur positive de type float
      primF = Float.MIN_VALUE;	// Plus petite valeur positive de type float

      objF  = Float.valueOf(primF); 	// Conversion float  -> Float
      primF = objF.floatValue(); 	   // Conversion Float  -> float
      objF  = Float.valueOf(str);	   // Conversion String -> Float
      str   = objF.toString();	      // Conversion Float  -> String
      str   = Float.toString(primF);	// Conversion float  -> String
      primF = Float.parseFloat(str);	// Conversion String -> float
   }
}