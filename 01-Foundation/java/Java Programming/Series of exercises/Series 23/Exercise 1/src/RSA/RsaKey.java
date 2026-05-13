package RSA;

import java.security.SecureRandom;
import static RSA.MathUtils.*;

public class RsaKey implements CipheringKey {
/* Declare the class attributes */

/* Declare and implement the constructor */

    // Returns a sequence of space-separated base10 numbers, like "345 772 67"
    @Override
    public String cipher(String msg) {
/* Implement the cipher() method */
    }

    // Receives a sequence of space-separated base10 numbers, like "345 772 67"
    @Override
    public String decipher(String encoded) {
/* Implement the decipher() method */
    }

    public static AsymmetricKeys newKeyPair() {
        SecureRandom rnd = new SecureRandom();
        // chosen so that if m=getKthPrimeNb(minKth), Character.MAX_VALUE < m*m
        final int minKth = 58;
        // chosen arbitrarily (but ensuring maxPrime*maxPrime doesn't overflow)
        final int maxNbOfPrimesChoices = 1000;
        int pIndex = minKth + rnd.nextInt(maxNbOfPrimesChoices);
        int qIndex = minKth + rnd.nextInt(maxNbOfPrimesChoices);
        long p = getKthPrimeNb(pIndex);
        long q = getKthPrimeNb(qIndex);
        long n = p * q;
        long t = (p - 1) * (q - 1);
        long e = aNumberCoPrimeWith(t);
        long d = moduloInverseNaive(e, t);
        // now the public key is (e, n) and the private key is (d, n)
/* Add the missing instructions for returning the instance of AsymmetricKeys */
    }

    public static CipheringKey hackedPrivateKey(CipheringKey publicKey) {
        if (!(publicKey instanceof RsaKey)) {
            throw new IllegalArgumentException("not an Rsa key...");
        }
        RsaKey keyPub = (RsaKey) publicKey;
/* Implement naive hacking of the private key */    }
}

