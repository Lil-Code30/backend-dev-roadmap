# Exercice 2 de la série 9

Vous devez développer une classe `SquareRoot` qui permet de calculer les
racines entières de nombres. Votre classe comprend deux méthodes `intSqrt()`
et `intArraySqrt()`. Afin de tester la classe, vous pouvez également utiliser
la méthode `main()`.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
--- 

## Instructions :

### Partie a
Dans la classe `SquareRoot`, et **sans utiliser d'autre méthode**,
écrire une méthode `intSqrt()` qui calcule et retourne la racine carrée
entière d'un nombre entier (par exemple, `intSqrt(14)` retourne `3`,
`intSqrt(18)` retourne `4`).

Cette méthode générera une exception de type `Exception` si nécessaire avec
un message `"NegativeNumber!!"` (en utilisant l'instruction `throw new...`).

### Partie b
Dans la même classe `SquareRoot`, écrire une méthode `intArraySqrt()` qui reçoit
un tableau d'entiers, calcule la racine carrée entière de chaque élément de
ce tableau (en utilisant la méthode `intSqrt()` réalisée dans la partie a) et
affiche le résultat.

Cette méthode devra traiter les exceptions pour afficher le résultat sous
cette forme pour un appel `intArraySqrt(new int[]{28, -6, 4})`:
```
"Index 0, value 28, integer square root 5"
"Index 1, value -6, integer square root undefined"
"Index 2, value 4, integer square root 2"
```

#