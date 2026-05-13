# Exercice Hangman de la série 17

Afin de réaliser le jeu du pendu, complétez le code mis à disposition.
Le `main()` de la classe `HangmanDemo` est la méthode qui permet de jouer une
partie. Vous devez lire, étudier et comprendre ce code. Observez le nom des
méthodes utilisées et notez si elles permettent de
comprendre la manière dont le jeu est réalisé, même sans connaître la
réalisation de la classe `Hangman`.

La classe `Hangman` utilisée dans la méthode `main()` réalise le jeu.
Etudiez les attributs et les méthodes déjà réalisées de la classe `Hangman`.
Complétez la classe (méthodes `isHanged()` et `isWinning()`).

Afin de représenter les lettres qui peuvent être jouées, secrètes ou fausses,
la classe `Hangman` utilise des instances des classes `PlayedLetter`,
`SecretLetter` et `WrongLetter`. Ces classes héritent toutes de la classe
`Letter` qui est déjà réalisée. Vous devez réaliser les trois classes. Soyez
attentifs au chaînage des constructeurs et à la redéfinition des méthodes
requises pour chaque classe.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez réaliser les choses suivantes :
- Implémenter la classe `PlayedLetter`.
- Implémenter la classe `SecretLetter`.
- Implémenter la classe `WrongLetter`.
- Implémenter la méthode `isHanged()` de la classe `Hangman`.
- Implémenter la méthode `isWinning()` de la classe `Hangman`.

Les classes `HangmanDemo` et `Letter` **ne doivent pas** être modifiées.

<div class="hint">
Pour les classes <code>PlayedLetter</code>, <code>SecretLetter</code> et 
<code>WrongLetter</code>, pensez à annoter les méthodes redéfinies avec le 
mot clé <code>@override</code> 
</div>

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme `HangmanDemo`.

#