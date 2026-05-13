# Passage des paramètres lors de l'invocation d'une méthode

Dans la tâche précédente, nous avons clarifié la manière dont les
types primitifs et les objets sont représentés en mémoire. Dans ce
chapitre, nous étudions l'impact que cela a sur les valeurs fournies comme
paramètres lors de l'appel d'une méthode.

## Passage par valeur
Java n'utilise que le **passage par valeur** (alors que d'autres langages
comme C et C++ utilisent aussi le passage par référence). Le passage par
valeur implique une copie locale de la valeur du paramètre.

Ainsi :
- **Type primitif** : la **valeur** est copiée dans une autre case mémoire
  lorsque la variable est fournie en paramètre de la méthode. La modification de
  la valeur dans la méthode ne modifie pas la valeur de la variable externe.
- **Tableau/Objet** : la **référence** est copiée dans une autre case mémoire
  lorsque le tableau/l'objet est fourni en paramètre de la méthode. Dès lors,
  une modification des éléments du tableau peut être visible à l'extérieur.
  Cela peut amener des **effets de bord** indésirables.

## Exemple
Dans le programme "Main.java", observez les différentes modifications
apportées aux tableaux dans chaque méthode :
- La méthode `max` ne modifie pas le tableau fourni en paramètre puisqu'il
  parcourt uniquement les éléments pour rechercher le nombre maximum (lignes
  39-43).
- La méthode `modify` modifie le tableau fourni en paramètre puisqu'il
  décrémente chaque valeur par 1 (lignes 49 à 50).
- La méthode `allocate` modifie le tableau fourni en paramètre puisqu'il assigne
  un sous-tableau de taille 2 (initialisé à la valeur par défaut de 0) pour chaque
  ligne (lignes 57 à 58).

## Éviter les effets de bord
Pour éviter ces effets de bord, il est parfois bienvenu de faire une copie du
tableau, c'est-à-dire construire un nouveau tableau et y copier les valeurs.
Ainsi les références aux tableaux sont différentes.

- La méthode `Arrays.copyOf()` permet de copier les éléments du tableau et en
  plus de tronquer ou ajouter des cases pour que la copie ait la longueur
  indiquée en paramètre (la valeur du deuxième paramètre indique la taille
  du tableau copié) (cf. lignes 25 à 32).
- La méthode `clone()` de la classe `Object` peut aussi être utilisée pour
  copier le contenu d'un tableau.

De plus, la classe `java.util.Arrays` fournit des méthodes utilitaires comme
`fill()`, `equals()`, `sort()`, `toString` ...

Dans tous les cas, il est important que la spécification de la méthode soit
claire quant aux éventuelles modifications apportées aux paramètres durant
l'exécution de la méthode.

# Exercice
Après avoir étudié attentivement le programme "Main.java", identifiez les affirmations
correctes parmi les suivantes.