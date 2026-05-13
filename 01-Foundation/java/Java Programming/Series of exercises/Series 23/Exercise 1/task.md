# Cryptographie avec l'algorithme RSA

Cet exercice démontre la réalisation simple et un peu naïve de l'algorithme
de cryptographie RSA. Il est supposé dans cet exercice que les bases de
l'algorithme sont connues.

Les interfaces définies pour réaliser l'algorithme sont les suivantes :

- `ch.heiafr.RSA.CipheringKey`
```Java
public interface ch.heiafr.RSA.CipheringKey {
    String cipher(String msg);
    String decipher(String encoded);
}
```
- `ch.heiafr.RSA.AsymmetricKeys`
```Java
public interface ch.heiafr.RSA.AsymmetricKeys {
    ch.heiafr.RSA.CipheringKey publicKey();
    ch.heiafr.RSA.CipheringKey privateKey();
} 
```

Dans le programme "Task.java", l'utilisation de l'algorithme de chiffrement
est démontrée. Lisez et comprenez ce code.

Vous devez également comprendre le fonctionnement de la classe
`CipherFactory` et la manière dont les instances de `RsaKey` ou `CaesarKey`
sont créées.

---
**&#9432;**
Afin de tester votre solution et de documenter votre rapport correctement,
suivez attentivement les instructions données ci-dessous.
---

Vous devez compléter la réalisation de la classe `RsaKey` :

- Déclarer les attributs requis pour la réalisation correcte.
- Déclarer et réaliser le constructeur.
- Réaliser la méthode `cipher()` qui permet de chiffrer un message.
- Réaliser la méthode `decipher()` qui permet de déchiffrer un message.
- Réaliser la méthode `hackedPrivateKey()` qui permet de retrouver la clé
  privée à partir de la clé publique.
- Pour les 4 versions du calcul $xy mod z$ réalisées dans les méthodes
  `powerModA()`, `powerModB()`, `powerModC()` et `powerModD()` de la classe
  `MathUtils`, en supposant x<1000, estimer la plus grande valeur de
  l'exposant `y` jusqu'à laquelle le résultat est garanti d'être correct,
  en documentant aussi l'éventuelle influence du paramètre `z`.
- Pour la méthode `powerModD()`, trouver la formule qui relie la valeur
  reçue du paramètre `y` et le nombre d'itérations de la boucle.
- (Optionnel) Modifier le code afin de remplacer l'utilisation du type
  `long` par le type `BigInteger`.
- (Optionnel) Expliquer pourquoi même en remplaçant les `long` par des
  `BigInteger` à 500 digits, cette réalisation-là ne serait pas
  satisfaisante du point de vue de la sécurité.
- (Optionnel) Ajouter une classe `CaesarKey` qui implémente le chiffrement de
  César. Le codage de César applique un décalage fixe sur chaque caractère.
- (Optionnel) Estimer combien de fois plus rapide est la méthode `powerModD()`
  par rapport à la méthode `powerModC()`, sur votre machine, pour :

  * y = 108
  * y = 1010
  * y = 1015 (dans ce cas, deviner plutôt que mesurer...).

#