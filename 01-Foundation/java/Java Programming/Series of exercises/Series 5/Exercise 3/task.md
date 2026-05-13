# Exercice 3 de la série 5

Calculer la valeur de la constante **e** en utilisant la somme suivante :

```
e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1/n! + ...
```

où **n!** signifie `1 * 2 * 3 * ... * n`.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les instructions données ci-dessous.
---

## Instructions :
Réalisez le programme de la manière suivante :

- Utilisez **uniquement** l'instruction `while` pour itérer sur les termes de la série.
- Arrêtez l'itération lorsque l'incrément (la valeur ajoutée à l'approximation de **e**
  calculée jusque-là) est inférieur à `10^(-12)`.
- À la fin du calcul, affichez :
    - La valeur approchée de `e`.
    - Le nombre total d'itérations réalisées pour atteindre la précision désirée.

Vérifiez sur machine en observant l'évolution des différentes variables.


### Questions
- Combien d'itérations sont nécessaires ?
- Pourrait-on se contenter du type float ? (Peut-on représenter des termes de l'ordre de `10^(-12)` ?
  Peut-on les ajouter à la somme courante ?)

#
