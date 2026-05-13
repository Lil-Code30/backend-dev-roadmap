# Exercice 5 de la série 9

Vous devez développer une classe qui permet de tester si des tableaux sont rectangulaires
ou si deux tableaux sont semblables. Afin de tester la classe, vous pouvez également utiliser
la méthode `main`.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
--- 

## Instructions :

### Partie a
Ecrire une méthode `checkRectangular()` qui s'assure qu'un tableau à 2 
dimensions de `int` est "rectangulaire" (chaque ligne a la même taille), et 
lève une exception si ce n'est pas le cas. 
  
  - L'exception levée doit être de type `Exception` et contenir le string `"array not rectangular"`
    (en utilisant l'instruction `throw new...`).
  - Dans le cadre de cet exercice, un tableau bi-dimensionnel de dimensions 
    `0x0` est considéré comme rectangulaire.


### Partie b
Ecrire une méthode `checkSimilar()` qui s'assure que deux tableaux à 2
dimensions sont "semblables" (même nombre de lignes, et la ième ligne de
l'un a la même taille que la ième ligne de l'autre), et lève une
exception si ce n'est pas le cas.

  - L'exception levée doit être de type `Exception` (en utilisant l'instruction `throw new...`) et 
contenir un des `String` suivants :
    - `"one of the arrays is null"` si un des tableaux est null.
    - `"arrays have different lengths"` si les longueurs de la première dimension ne sont pas égales.
    - `"row number " + i + " have conflicting lengths"` si les longueurs de la deuxième dimension à la ième
ligne ne sont pas égales.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java". Pour ce faire, vous devez
également compléter la méthode `similarDemo()`, en vous inspirant de la
méthode `rectangularDemo()`.

#