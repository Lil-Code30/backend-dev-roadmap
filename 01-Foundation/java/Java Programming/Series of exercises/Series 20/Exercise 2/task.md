# Exercice 2 de la série 20 (Moteur de jeux)

Nous souhaitons réaliser divers jeux avec un seul moteur de jeux. Ce moteur de jeux doit être capable de
réaliser par exemple les jeux de la « Bataille Royale » ou du « Chifoumi » sans connaître les détails des
règles de jeux et uniquement en se basant sur les principes suivants :

- Plusieurs joueurs (deux dans notre cas) peuvent tirer un objet du jeu, par exemple une carte.
- Les objets tirés par chaque joueur sont comparés et le vainqueur est désigné.

Le moteur de jeux est réalisé dans la classe `GameEngine` mise à disposition. Lisez et comprenez le code
de la classe. Le code permet de réaliser différentes sortes de jeux à l’aide de la méthode `play()`, sans
modifier cette méthode.

Dans la méthode `play()`, plusieurs interfaces sont utilisées :
- `Playable` : interface qui spécifie que l’on peut jouer avec un objet de ce type, et déterminer s'il est
  plus ou moins "fort" qu'un autre élément de même nature.
- `Provider` : interface permettant de fournir des objets du jeu. L’interface comprend deux méthodes
  `hasMore()` et `getNext()`.

Afin d’illustrer l’utilisation des interfaces ci-dessus, voici leur signification pour le jeu de la Bataille :
- `Playable` : l’objet avec lequel on joue est une carte. Toutes les classes représentant une carte
  devront donc réaliser l’interface `Playable`.
- `Provider` : le jeu de cartes est la classe réalisant l’interface. Un jeu de cartes est constitué d’un
  nombre de cartes qui seront tirées l’une après l’autre à l’aide des méthodes de l’interface.


Le premier jeu à réaliser est le jeu de la Bataille. Pour ce jeu, l’essentiel du code vous est fourni. Vous
devez tout d’abord vous assurer d’avoir compris la signification de chaque interface et le code fourni. Vous
devez ensuite compléter le code conformément aux points suivants :
- Une réalisation de base de l’interface `Provider` est fournie dans la classe `ItemList`. Les deux
  méthodes `hasMore()` et `getNext()` doivent être complétées.
- La classe `CardDeck` réalise le jeu de cartes. Cette classe hérite de la classe `ItemList`. Elle définit
  un constructeur et une méthode permettant de mélanger les cartes.
- Les cartes appartiennent à une ligue donnée (`Suit` : heart, spade, diamond, club) et peuvent être
  habillées (personnage et as) (`FaceCard`) ou représenter un nombre (`NumberCard`).
- Les classes `FaceCard` et `NumberCard` sont réalisées à partir de la classe de base `Card`. La classe
  `Card` est une classe abstraite. Expliquez les raisons de ce choix.
- Veuillez noter que la comparaison des cartes est réalisée à l’aide de la comparaison des types
  enum, dont le résultat est celui de l’ordre d’énumération.

Après avoir complété la classe `ItemList`, vous êtes à même de faire fonctionner le jeu de cartes ! Assurez-vous
de comprendre le fonctionnement avant de réaliser les autres jeux ci-dessous.

Vous devez ensuite réaliser le jeu de Chifoumi (dont vous connaissez les règles !). Il s'agit de :
- Réaliser la méthode `main()` de la classe `RPSGame`.
- Réaliser les classes `Paper`, `Scissor` et `Rock`.
- Réaliser les méthodes `hasMore()` et `getNext()` de la classe `RPSProvider` – les joueurs peuvent
  tirer un nombre illimité de Rock, Paper ou Scissor.
- Tester votre réalisation.
- Expliquez pourquoi la classe `RPSProvider` réalise l’interface `Provider` sans hériter de la classe
  `ItemList`.


Finalement, vous devez réaliser le jeu de billes. Dans le jeu de billes, la couleur de la bille détermine sa
force - les billes rouges l’emportent sur les bleues qui l’emportent sur les jaunes qui l’emportent sur les
vertes. Pour réaliser le jeu, vous devez :
- Réaliser la méthode `main()` de la classe `MarblesGame`.
- Réaliser la classe `MarblesBag`.
- Tester votre réalisation.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :

Vous devez réaliser les choses suivantes pour le jeu de carte :
- Implémenter les méthodes `hasMore()` et `getNext()` de la classe `ItemList`.

Vous devez réaliser les choses suivantes pour le jeu Chifoumi :
- Réaliser la méthode `main()` de la classe `RPSGame`.
- Réaliser les classes `Paper`, `Scissor` et `Rock`. (Ces classes doivent être créées).
- Réaliser les méthodes `hasMore()` et `getNext()` de la classe `RPSProvider`.

Vous devez réaliser les choses suivantes pour le jeu de billes :
- Réaliser la méthode `main()` de la classe `MarblesGame`.
- Réaliser la classe `MarblesBag`.

Les tests avec le bouton "Check" peuvent être exécutés  avec succès uniquement une fois que toutes les étapes de
réalisation ont été faites.

#