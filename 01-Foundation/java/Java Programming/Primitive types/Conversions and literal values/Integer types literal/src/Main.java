public class Main {
   public static void main(String[] args) {
      // Make sure that the literal values used below are within the
      // allowed ranges - depending on the variable types.
      // Fix the literal values that produce an error by choosing
      // a value that is allowed.
      byte b1 = 127; // 2^7 - 1
      short s1 = 32767; // 2^15 - 1
      int i1 = -2147483648; // -2^31
      long l1 = -2147483648; // -2^31
      long l2 = 9223372036854775807L; // 2^63
   }
}