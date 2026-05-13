# Exercice 4 de la série 16

On souhaite manipuler des objets de la classe `Rectangle`,
avec les fonctionnalités suivantes : 
 - Créer un rectangle en donnant sa hauteur et largeur (nombres à virgules)
 - Consulter la hauteur, la largeur, ou la surface d'un rectangle.
 - Appliquer un facteur d'échelle sur les dimensions d'un rectangle.
 - Tester si un rectangle est plus grand qu'un autre rectangle en comparant 
   leur surface.


---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
- Ecrire deux versions de la classe `Rectangle`.
- Les paramètres du constructeur représentent dans l'ordre la largeur et la 
  hauteur du rectangle.
- La première version doit être écrite selon les principes orientées objet, 
  sans méthode statique. Cette classe doit être placée dans le package `s16.
  vobject`.
- La deuxième version doit être écrite en utilisant 6 méthodes statiques. 
  Cette classe doit être placée dans le package `s16.vstatic`.
- Pour chaque version, vous devez écrire un programme de test 
  `TestRectangle` doit être également créé.

Un exemple d'utilisation des deux versions est donné ci-dessous : 
```Java
// Utilisation de la classe Rectangle - version (a)
Rectangle x;
x = new Rectangle(2.1, 3.9);
double a = x.area();
```
```Java
// Utilisation de la classe Rectangle - version (b)
Rectangle x;
x = Rectangle.create(2.1, 3.9);
double a = Rectangle.area(x);
```

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java" et visualiser l'output.

#