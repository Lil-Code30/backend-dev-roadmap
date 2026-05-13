# Interface générique

Nous souhaitons réaliser les bases d'un jeu dans lequel les joueurs sont placés sur 
un plan et peuvent se déplacer sur ce plan.

## Interface `Localisable` 
L'interface `Localisable` permet de localiser un objet sur un plan 2D grâce à 
sa position qui est représentée par un point (`java.awt.Point`). Par 
conséquent, elle possède une unique méthode abstraite appelée `getPosition()`.

## Interface `Movable`
L'interface `Movable` étend `Localisable` et permet de déplacer l'objet dans 
le plan grâce à la méthode abstraite `move()` et les paramètres `x` et `y` 
indiquant le vecteur de déplacement. L'interface `Movable` est générique et 
la méthode `move()` retourne une instance de l'objet du type générique. Une 
classe réalisant l'interface générique réalisera ainsi une méthode qui 
retournera une instance de `T` à chaque mouvement.

## Classe `Player` et `Main`
La classe concrète `Player` implémente `Movable` afin de représenter un 
joueur qui est capable de se déplacer dans le plan. Dans le programme 
principal `Main`, l'utilisation de la classe `Player` qui réalise l'interface 
générique `Movable<Player>` permet de sauvegarder l'historique des positions.

Complétez les différents fichiers afin que ce code puisse être compilé et 
exécuté sans erreurs.

#