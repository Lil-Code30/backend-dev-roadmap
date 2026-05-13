import RSA.AsymmetricKeys;
import RSA.CipherFactory;
import RSA.CipheringKey;
import RSA.RsaKey;

public class Task {
    public static void main(String[] args) {
        System.out.println("=== Demo for RSA ===");
        AsymmetricKeys keys = CipherFactory.newKeysForAsymmetricCipher(CipherFactory.Algo.RSA);
        String msg = "Hello crypto world!";
        String encoded = keys.publicKey().cipher(msg);
        String revealed = keys.privateKey().decipher(encoded);
        System.out.println(msg);
        System.out.println(encoded);
        System.out.println(revealed);

        System.out.println("\n=== Demo for RSA hacking ===");
        // Now try to hack the system...
        CipheringKey hackedPrivateKey;
        hackedPrivateKey = RsaKey.hackedPrivateKey(keys.publicKey());
        String hackedMessage = hackedPrivateKey.decipher(encoded);
        System.out.println(hackedMessage);

        System.out.println("\n=== Demo for Caesar ===");
        CipheringKey symKey = CipherFactory.newKeyForSymmetricCipher(CipherFactory.Algo.CAESAR);
        encoded = symKey.cipher(msg);
        revealed = symKey.decipher(encoded);
        System.out.println(encoded);
        System.out.println(revealed);
    }
}