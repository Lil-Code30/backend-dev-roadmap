# Exercice 2 de la série 22

Une classe `Shoes` est fournie pour représenter des chaussures. Dans le 
programme "ch.heiafr.Task.java", nous voulons réaliser certaines fonctionnalités sur 
un stock de chaussures.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

Nous souhaitons gérer un stock de chaussures représenté par le tableau 
`shoesArray` dans la méthode `main()`. Pour gérer le stock, nous devons 
pouvoir sélectionner les chaussures du stock selon différents critères,
par exemple les chaussures de taille 41, ou de couleur brune, ou encore 
seulement les chaussures de course.

Pour sélectionner les chaussures selon différents critères, nous utilisons 
l'interface `ShoesSelector`. En suivant ce principe, vous devez réaliser les 
points suivants :

- Réalisez la méthode `printShoes()` de la classe `ch.heiafr.Task` permettant 
  d'afficher toutes les chaussures sélectionnées selon un critère donné.
- Créez et réalisez la classe `BySizeSelector` qui réalise l'interface 
  `ShoesSelector` afin de pouvoir sélectionner les chaussures d'une certaine 
  taille.
- Dans la méthode `main()`, réalisez l'appel à `printShoes` à l'aide d'une 
  classe anonyme pour sélectionner les chaussures de couleur brune.
- Dans la méthode `main()`, réalisez l'appel à `printShoes` à l'aide d'une
  expression lambda pour sélectionner les chaussures de type `Boots`.
- Réalisez une deuxième version de la méthode `printShoes` qui utilise une 
  interface générique de la librairie standard Java permettant de réaliser 
  la même fonctionnalité. Réalisez l'appel à cette méthode avec une 
  expression lambda afin de sélectionner les chaussures de type `Running`.

#