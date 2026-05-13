# Exercice Moon de la série 17

## But
Vous devez développer un programme permettant de simuler le coût d’une
mission de transport de marchandises vers la Lune. Vous aurez à disposition
2 types de fusées… qui peuvent se crasher au décollage !

Le coût total d’une mission consiste à calculer le coût d’envoi d’un nombre
défini de marchandises. Dans le cas où une fusée explose, le coût de la
mission augmente, puisqu’une autre fusée du même type et
avec le même chargement doit être relancée.

## Spécifications
- Chaque marchandise à transporter est représentée par une instance de la
  classe `Item`, avec un nom (`String` name) et un poids (`int` weight).
- Il existe deux types de fusées, les petites (class `SmallRocket`) et les
  grandes (class `BigRocket`) avec les caractéristiques suivantes :

|               | Poids à vides<br>(en tonnes) | Poids max<br>(poids à vide + charge max marchandises)<br>(en tonnes) | Coût de la fusée<br>(en millions de CHF) |
|---------------|------------------------------|----------------------------------------------------------------------|------------------------------------------|
| *SmallRocket* | 10                           | 18                                                                   | 100                                      |
| *BigRocket*   | 18                           | 29                                                                   | 130                                      |

- La probabilité qu'une petite fusée se crashe au décollage augmente de 0.5%
  pour chaque marchandise chargée à bord (toutefois sans dépasser 5%).
- La probabilité qu'une grande fusée se crashe au décollage varie
  linéairement de 0% à 4% relativement au poids des marchandises
  transportées (de 0kg à charge marchandises max).
---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
1. Réalisez la classe `Item`.
2. Réalisez la classe de base `Rocket` qui permet le polymorphisme pour les
   deux types de fusées. Elle déclare les méthodes suivantes :
    - `canCarry(…)` : prend en paramètre une instance de la classe Item et
      retourne `true` si la fusée peut transporter la marchandise et `false` si
      le poids maximal est dépassé.
    - `carry(…)` : ajoute la marchandise passée en paramètre à son
      chargement en mettant à jour le nombre de marchandises transportées et
      le poids total transporté.
3. Réalisez les classes `SmallRocket` et `BigRocket`. Ces classes héritent
   de la classe de base et réalisent deux méthodes supplémentaires :
    - `launch()` : retourne simplement si le décollage est réussi, ou lance
      une exception de type `CrashAtLaunchException` (classe déjà implémentée)
      si un crash se produit. La probabilité d’un crash dépend des
      spécifications de chaque type de fusée, elle est simulée avec le
      générateur de nombres aléatoires.
    - `cost()` : cette méthode retourne le coût du lancement d’une fusée.
    -  **Remarque importante** : les méthodes présentes dans `SmallRocket` et
       `BigRocket` doivent être disponibles directement dans `Rocket` afin de
       permettre le polymorphisme. Le programme de test génère des erreurs si
       ces méthodes ne sont pas disponibles.
4. Complétez les parties de la classe `Simulation` qui est déjà
   partiellement réalisée.
    - Soyez attentifs au point suivant : le polymorphisme se réalise en
      utilisant directement le type de base `Rocket` dans la classe
      Simulation. Pour que cela soit possible, vous devez tenir compte des
      instructions données ci-dessus pour la réalisation des méthodes de la
      classe de base. Vous devez également choisir le comportement adéquat
      pour la réalisation de ces méthodes.

### Résultats du programme de test
Lors de l'utilisation du bouton "Check", il se peut que le programme de test
échoue, mais que votre solution soit tout de même correcte. Cela vient du
fait que le programme utilise des chiffres aléatoires. Vous pouvez donc
réutiliser le bouton "Check" pour vérifier votre solution. Si après 4-5
tentatives le programme de test échoue encore, votre solution est
alors probablement fausse.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter la fonction `main()` de la classe `Simulation`.

L'output attendu est le suivant :
```text
Running simulation 1000 times for SmallRocket:
   mean cost: 807.2
   mean crash probability: 0.007911111111111101
Running simulation 1000 times for BigRocket:
   mean cost: 806.13
   mean crash probability: 0.028130952380952323
```

## Questions
Répondez aux questions suivantes (dans le rapport) en motivant vos réponses :
1. Est-il possible d’instancier des objets de la classe de base Rocket ? Si
   oui, est-ce souhaitable ?
2. Quel sera le résultat de la simulation si l’on utilise des objets de la
   classe de base ?
3. Sur la base des connaissances acquises jusque-là, existe-t-il un autre
   moyen de réaliser le polymorphisme souhaité ?
4. Comment réaliser le comportement souhaité sans héritage ? Quels seraient
   les avantages et désavantages d'une telle approche ?

#