# Exercice 2 de la série 10

Vous devez développer une méthode qui transpose une matrice de nombres réels, ou génère
une RuntimeException si les données ne sont pas raisonnables.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez écrire une méthode `transpose()` qui transpose une matrice de 
nombres réels, ou génère une `RuntimeException` si les données ne sont pas 
raisonnables en respectant les points suivants :
  - La méthode doit être `public`.
  - La méthode doit être `static`.
  - La méthode doit prendre en paramètre un tableau bi-dimensionnel de 
    `double`.
  - La méthode doit retourner un tableau bi-dimensionnel de `double`.
  - La méthode doit lancer une exception de type `RuntimeException` (en 
    utilisant l'instruction `throw new...`) dans les cas ou la matrice n'est 
    pas raisonnable (null, ...), avec le message `"cannot transpose"`. De manière générale, une matrice non 
    raisonnable est une matrice qui ne peut pas être transposée.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java". 

#