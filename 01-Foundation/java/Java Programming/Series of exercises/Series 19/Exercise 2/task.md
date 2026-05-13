# Exercice 2 de la série 19

On souhaite réaliser une classe `Circle` avec ces fonctionnalités :
- un constructeur recevant en argument les coordonnées
  du centre du cercle et son rayon.
- `moveCenter()` pour déplacer les coordonnées du centre
  du cercle (incréments dx et dy).
- `changeRadius()` pour modifier le rayon du cercle.
- `center()` qui fournit en résultat un objet de type Point
  correspondant au centre du cercle.
- redéfinir la méthode `toString() afin qu'elle retourne
  une chaîne de caractères contenant les coordonnées du
  centre du cercle ainsi que son rayon.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :

Vous devez réaliser les choses suivantes :
- Implémenter la classe `CircleA` comme une classe dérivée (sous-classe) de `Point`.
- Implémenter la classe `CircleB` avec un attribut de type `Point`.

Attention, pour que le test passe, il ne doit pas être possible de modifier le centre d'un cercle d'une quelconque
autre manière que de passer par la méthode `moveCenter()`.


### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme `CirclesDemo`.

#