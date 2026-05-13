public class Main {
   public static void main(String[] args) {
      long p, q, n, t, e, d;
      // === RSA with small numbers
      p = 7;
      q = 19;
      n = p*q; // n = 133
      t = (p-1)*(q-1); // t = 108
      e = 5; // We chose e = 5
      d = modInverse(e, t); // d = 65
      // Private key = (d, n) = (65, 133)
      // Public key = (e, n) = (5, 133)

      long message, encrypted, deciphered;
      // We can encrypt ASCII characters which are smaller than n = 133.
      message = 123;
      encrypted = powerMod(message, e, n);
      deciphered = powerMod(encrypted, d, n);
      System.out.println("Original message (small numbers) : " + message);
      System.out.println("Encrypted message (small numbers) : " + encrypted);
      System.out.println("Deciphered message (small numbers) : " + deciphered);

      // === RSA with bigger numbers
      // It can take a bit of time to execute ! Be patient...
      p = 12347;
      q = 98773;
      n = p*q; // n = 1219550231
      t = (p-1)*(q-1); // t = 1219439112
      e = 5; // We chose e = 5
      d = 487775645; // modInverse(e, t): Value given, otherwise it
      // would take too long to compute
      message = 123;
      encrypted = powerMod(message, e, n);
      deciphered = powerMod(encrypted, d, n);
      System.out.println("Original message (big numbers) : " + message);
      System.out.println("Encrypted message (big numbers) : " + encrypted);
      System.out.println("Deciphered message (big numbers) : " + deciphered);
   }

   static long powerMod(long x, long y, long z) {
      long res = 1;
      while(y-- > 0) {
         res = ((res % z) * x) % z;
      }
      return res % z;
   }

   // A naive method to find modular multiplicative inverse of 'A' under
   // modulo 'M'. Source : https://www.geeksforgeeks.org/multiplicative-inverse-under-modulo-m/
   static long modInverse(long e, long t) {
      for (long d = 1; d < t; d++)
         if (((e % t) * (d % t)) % t == 1)
            return d;
      return -1;
   }
}