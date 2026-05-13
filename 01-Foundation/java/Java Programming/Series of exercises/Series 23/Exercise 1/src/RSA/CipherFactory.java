package RSA;

public class CipherFactory {
    public enum Algo { RSA, CAESAR };

    public static AsymmetricKeys newKeysForAsymmetricCipher(Algo algorithm) {
        switch(algorithm) {
            case RSA: return RsaKey.newKeyPair();
            default:
                throw new IllegalStateException("Unexpected value: " + algorithm);
        }
    }

    public static CipheringKey newKeyForSymmetricCipher(Algo algorithm) {
        switch(algorithm) {
            case CAESAR: return CaesarKey.newKey();
            default:
                throw new IllegalStateException("Unexpected value: " + algorithm);
        }
    }
}
