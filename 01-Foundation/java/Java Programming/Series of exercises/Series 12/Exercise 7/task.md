# Exercice 7 de la série 12

Soit le pseudo-code suivant :
```
Choisir un entier strictement positif n.
Tant que n != 1
    Si n est impair, n = 3n + 1
    Sinon, n = n/2
```
La conjecture de Syracuse nous apprend que cet algorithme se termine 
toujours après un nombre fini d'itérations.

Écrire une méthode qui calcule, pour un nombre n donné, le nombre d'étapes 
pour arriver à 1 ainsi que la valeur maximale atteinte par n (entier maximal 
par lequel on passe).

Écrire une autre méthode qui comptabilise dans un tableau, le nombre 
d'étapes ainsi que la valeur maximale pour tous les nombres de 1 à p.

Écrire une méthode qui affiche le contenu du tableau sous la forme :
```text
Nb : 1 Nb étapes : 0 Val max : 1
Nb : 2 Nb étapes : 1 Val max : 2
Nb : 3 Nb étapes : 7 Val max : 16
```

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez implémenter la méthode `allSyracuseFlights()`, en respectant les 
points suivants :
- La méthode doit retourner un tableau 2D. La première dimension correspond 
  au nombre testé et la seconde dimension à la valeur retournée par `syracuse()`.
- La méthode doit être déclarée `public`.

Vous devez implémenter la méthode `syracuse()`, en respectant les points 
suivants :
- la méthode doit retourner un tableau 1D contenant les valeurs suivantes :
  - [0] = the flight length (total number of steps)
  - [1] = the maximum value reached during the flight (the highest altitude)
- La méthode doit être déclarée `public`.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java".

### Compléments
La méthode qui permet d'afficher n'est pas testée

#