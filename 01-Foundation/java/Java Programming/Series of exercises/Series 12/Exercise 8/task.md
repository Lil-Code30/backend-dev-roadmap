# Exercice 8 de la série 12

Écrire une méthode qui affiche toutes les manières possibles d'obtenir `N` 
francs avec des pièces de `ka`, `kb` et `kc` francs. Le nombre de 
possibilités sera également affiché.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez implémenter la méthode `displayPossibleChange()`, en respectant 
les points suivants :
- La méthode prend quatre paramètres, respectivement :
  - `N`: la somme à atteindre
  - `ka`: les pièces de valeur `ka`
  - `kb`: les pièces de valeur `kb`
  - `kc`: les pièces de valeur `kc`
- La méthode doit retourner le nombre de possibilités qu'il y a de faire le 
  change.
- La méthode doit afficher à la console toutes les manières de faire le 
  change, par exemple :
```text
5 Fr = 5 x 1 Fr
5 Fr = 3 x 1 Fr  +  1 x 2 Fr
5 Fr = 1 x 1 Fr  +  2 x 2 Fr
5 Fr = 1 x 5 Fr

There are 4 ways to change 5 Fr
```
- La méthode doit être déclarée `public`.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java".

#