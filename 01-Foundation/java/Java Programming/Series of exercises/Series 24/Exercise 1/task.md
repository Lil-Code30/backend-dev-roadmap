# Réalisation de séries mathématiques avec des interfaces génériques

Dans la série 21, nous avons réalisé le calcul de séries mathématiques en 
généralisant certains concepts (fonction, combinaison, ...). Toutefois, 
notre réalisation ne manipulait que des nombres `double`. Il est possible et 
intéressant de généraliser également le type de données manipulées. Pour 
cela, nous allons utiliser les types génériques.

---
**&#9432;**
Afin de tester votre solution et de documenter votre rapport correctement,
suivez attentivement les instructions données ci-dessous.
---

Afin de rendre notre réalisation générique sur le type de données utilisées, 
vous devez réaliser les points suivants :

- Modifier l'interface `IFunction` pour que le paramètre reçu et retourné 
  par la fonction soit générique (du même type).
- Modifier l'interface `IFoldableOperation` pour que le type manipulé soit 
  générique.
- Modifier et renommer l'interface `INumberSequence` en `ISequence` en la 
  rendant générique.
- Modifier et renommer la classe `ArrayNumberSequence` en `ArraySequence` en 
  la rendant générique.
- Modifier la class `EvenIntegerSequence` pour qu'elle réalise l'interface 
  `ISequence<T>` avec comme type `Integer`
- Modifier les classes `SumOperation`, `ProductIteration` et `MaxOperation` 
  pour qu'elles réalisent l'interface `IFoldableOperation<T>` avec comme 
  type `Double`.
- Transformer les classes `Combination` et `Enumeration` en interfaces 
  génériques. 
- Modifier la classe `AnySeries` pour la rendre générique.
- Modifier le code dans la méthode `main()` de la classe `PlayWithSeries` 
  pour qu'il compile et produise le même résultat que celui de la série 21. 
  Soyez attentifs aux éventuels problèmes de compatibilité de type générique.
- Réaliser une classe `StringSequence` permettant de produire une séquence 
  de `String` à partir d'un tableau de `String`. 
- Ajouter une classe `ConcatOperation` qui réalise 
  `IFoldableOperation<String>` afin de concaténer des chaînes de caractères.
- Dans le programme "PlayWithSeries", ajouter le code permettant 
    d'afficher "WELCOME TO THE WORLD OF GENERICITY" :

  - en utilisant une instance de `ConcatOperation`.
  - en créant une instance de `ISequence<String>` à partir d'un tableau de 
    `String`
  - en réalisant l'instance appropriée de `Enumeration<String>` à l'aide d'une 
    expression lambda.

#