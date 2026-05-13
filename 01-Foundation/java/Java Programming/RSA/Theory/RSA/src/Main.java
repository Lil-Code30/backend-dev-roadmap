public class Main {
   public static void main(String[] args) {
      // === RSA with small numbers
      long p = 7;
      long q = 19;
      long n = p*q; // n = 133
      long t = (p-1)*(q-1); // t = 108
      long e = 5; // We chose e = 5
      long d = modInverse(e, t); // d = 65
      // Private key = (d, n) = (65, 133)
      // Public key = (e, n) = (5, 133)

      // We can encrypt numbers which are smaller than n = 133.
      long message = 123;
      long encrypted = powerModA(message, e, n);
      long deciphered = powerModA(encrypted, d, n);
      System.out.println("Original message (powerModA) : " + message);
      System.out.println("Encrypted message (powerModA) : " + encrypted);
      System.out.println("Deciphered message (powerModA) : " + deciphered);

      // We can encrypt numbers which are smaller than n = 133.
      message = 123;
      encrypted = powerModB(message, e, n);
      deciphered = powerModB(encrypted, d, n);
      System.out.println("Original message (powerModB) : " + message);
      System.out.println("Encrypted message (powerModB) : " + encrypted);
      System.out.println("Deciphered message (powerModB) : " + deciphered);
   }

   static long powerModA(long x, long y, long z) {
      return (long) Math.pow(x, y) % z;
   }

   static long powerModB(long x, long y, long z) {
      long res = 1;
      while(y-- > 0) {
         res = res * x;
      }
      return res % z;
   }

   // A naive method to find modular multiplicative inverse of 'A' under
   // modulo 'M'. Source : https://www.geeksforgeeks.org/multiplicative-inverse-under-modulo-m/
   static long modInverse(long e, long t) {
      for (long d = 1; d < t; d++) {
         if (((e % t) * (d % t)) % t == 1) {
            return d;
         }
      }
      return -1;
   }
}