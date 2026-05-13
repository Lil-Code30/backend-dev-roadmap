# Exercice 2 de la série 11

Pour illustrer l'usage du paramètre `args` de la méthode `main()`, 
écrire un programme qui calcule la moyenne des entiers reçus en arguments 
au lancement de l'application et affiche le résultat correspondant. 
Le calcul de la moyenne doit être effectuée dans une méthode nommée
`computeMean`, comme illustré dans le programme "Main.java".

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Le programme doit fonctionner correctement dans tous les cas :
- Lorsque `args` est `null`, la méthode doit lever une exception de type 
  `IllegalArgumentException`.
- Lorsque le tableau est vide, la méthode doit retourner la valeur `0.0`.
- Lorsque le tableau contient un élément qui ne peut pas être converti en 
  `double`, la méthode doit lever une exception de type
  `IllegalArgumentException`.
- Dans les autres cas, la méthode doit retourner la valeur moyenne correcte.

#