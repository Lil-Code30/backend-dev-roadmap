# Utilisation de `BigInteger`

Il est utile dans certains cas de pouvoir manipuler de très grands nombres 
entiers, qui excèdent la taille du type primitif `long`.

Java offre une classe `BigInteger` pour représenter des entiers arbitrairement 
grands avec des méthodes utiles pour RSA. De plus, la classe 
`BigInteger` offre des méthodes également utiles pour RSA.

Voici une partie de la documentation de la classe `BigInteger` :
```
// Constructs a randomly generated positive BigInteger that is probably prime, 
// with the specified bitLength.
BigInteger(int bitLength, int certainty, Random rnd)

// Returns a BigInteger whose value is (thisexponent mod m).
BigInteger modPow(BigInteger exponent, BigInteger m)

// Returns a BigInteger whose value is (this-1 mod m).
BigInteger modInverse(BigInteger m)
```

## Utilisation de `BigInteger` pour réaliser le chiffrement
Lancez le programme, observez l'output et identifiez l'affirmation
correcte ci-dessous.

#