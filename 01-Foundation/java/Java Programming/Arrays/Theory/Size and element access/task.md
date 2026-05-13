# Taille des tableaux et accès à leurs éléments

## Exemple
Le programme "Main.java" illustre l'accès à la taille et aux éléments d'un
tableau.

## Taille des tableaux

Pour connaître la taille du tableau, la propriété `length` est utilisée
(lignes 6 et 7).

## Accès aux éléments des tableaux

Pour accéder aux éléments du tableau, l'opérateur `[]` est utilisé avec
l'index de l'élément souhaité (lignes 11 à 13).

Les boucles `for` sont fréquemment utilisées pour accéder aux différents
éléments dans l'ordre de manière simple (lignes 17 à 21).

```
for (int i; i < array.length; i++) {
    // ...
}
```

## Accès simplifié aux éléements

Il existe une syntaxe simplifiée sous le nom de `for each`. Cela permet de
parcourir tous les éléments du tableau dans l'ordre avec une syntaxe allégée
(lignes 26 à 28). Remarquez par contre qu'on n'a pas accès à l'index `i` de
l'élément du tableau comme précédemment.

```
for (Type value : array) {
    // ...
}
```

---
> **&#9432;** L'index d'un élément doit être compris entre <code>\[0 ; length -
> 1\]</code>. Si un index négatif ou plus grand que <code>length - 1</code> est
> utilisé, il est considéré comme **out of bounds** et une exception sera
> levée à l'exécution du programme (lignes 31 à 43).
---

# Exercice
Après avoir lu attentivement le programme "Main.java", répondez à la question
posée ci-dessous.
