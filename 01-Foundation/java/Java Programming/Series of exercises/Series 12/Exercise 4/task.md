# Exercice 4 de la série 12

Écrire une méthode qui retourne la k-ième ligne (1ère dimension) d'un tableau 
à deux dimensions de `boolean`. 

Écrire une autre méthode qui retourne la k-ième colonne (2ème dimension) d'un 
tableau à deux dimensions de `boolean` en s'assurant préalablement que le 
tableau est rectangulaire. Si ce n'est pas le cas, une référence nulle sera 
retournée.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez implémenter la méthode `kthRow()`, en respectant les points 
suivants :
  - La méthode prend en paramètre un tableau 2D de `boolean` et retourne un 
    tableau 1D de `boolean`.
  - La méthode prend comme second argument l'index de la ligne à retourner.
  - La méthode doit être déclarée `public`.

Vous devez implémenter la méthode `kthColumn()`, en respectant les points 
suivants :
  - La méthode prend en paramètre un tableau 2D de `boolean` et retourne un 
    tableau 1D de `boolean`.
  - La méthode prend comme second argument l'index de la colonne à retourner.
  - La méthode doit être déclarée `public`.
  - Si le tableau n'est pas rectangulaire, la méthode retourne `null`.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java".

#