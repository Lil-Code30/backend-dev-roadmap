import java.math.BigInteger;

public class Main {
   public static void main(String[] args) {
      BigInteger p, q, n, t, e, d, one;
      p = new BigInteger("12347");
      q = new BigInteger("98773");
      n = p.multiply(q); // n = 1219550231
      one = new BigInteger("1");
      t = p.subtract(one).multiply(q.subtract(one)); // t = 1219439112
      e = new BigInteger("5"); // We chose e = 5
      d = e.modInverse(t); // d = 487775645

      BigInteger message, encrypted, deciphered;
      message = new BigInteger("123");
      encrypted = message.modPow(e, n);
      deciphered = encrypted.modPow(d, n);
      System.out.println("Original message (big numbers) : " + message);
      System.out.println("Encrypted message (big numbers) : " + encrypted);
      System.out.println("Deciphered message (big numbers) : " + deciphered);
   }
}