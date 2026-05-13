# Tableaux multi-dimensionnels

Il est possible de créer des tableaux de tableaux, c'est-à-dire des tableaux
multi-dimensionnels.
```
// One dimensionnal array
int[] array;

// Two dimensionnal array
int[][] array;

// Three dimensionnal array
int[][][] array:

// Fourth dimensionnal array
int[][][][] array;
...
```

## Exemple
Le programme "Main.java" illustre la déclaration et l'initialisation de
tableaux multi-dimensionnels. Lisez attentivement les commentaires.

Aux lignes 22 à 30, des boucles `for` imbriquées sont utilisées
pour parcourir tous les éléments du tableau bi-dimensionnel. La propriété
`length` est utilisée pour connaître la taille du tableau à chaque
niveau.

Des tableaux de tableaux n'impliquent pas nécessairement une matrice carrée ou
rectangulaire. Au contraire, les sous-tableaux peuvent avoir différentes
tailles, comme démontré aux lignes 34 à 40.

Les dimensions sont définies de gauche à droite. Les dimensions non définies
peuvent l'être durant l'exécution du programme avec une affectation (lignes
50 à 54).

# Exercice
Après avoir lu attentivement le programme "Main.java", répondez à la question
posée ci-dessous.