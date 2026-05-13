# Initialisation des tableaux

## Initialisation après une déclaration
Il est possible de déclarer et d'initialiser un tableau en deux étapes
séparées, la déclaration devant précéder l'initialisation. Lors de
l'initialisation, il faut :
- soit connaître la taille du tableau,
- soit connaître tous les éléments le composant (et donc aussi sa taille).

La ligne 6 permet de déclarer le tableau. Les lignes suivantes démontrent
différentes possibilités d'initialiser ce tableau :

- La ligne 9 montre une initialisation avec l'indication manuelle de la
  taille.
- Les lignes 12 et 13 montrent une initialisation avec la taille indiquée
  par une autre variable. Cet exemple démontre qu'il est possible de
  définir la taille d'un tableau durant l'exécution du programme.
- La ligne 17 montre une initialisation avec indication des éléments
  sauvegardés dans le tableau. Le tableau a une taille de 3 et
  contient les éléments `1`, `2`, et `3`, dans cet ordre.

Lorsque qu'une initialisation a lieu sans l'indication de la valeur des
éléments (comme aux lignes 9 ou 12-13), le tableau contient les valeurs par
défaut du type donné (`false` pour `boolean`, `0` pour les autres types
primitifs, `null` pour les objets et les tableaux).

---
> **&#9432;** La taille d'un tableau ne doit pas nécessairement être connue
> au moment de la compilation. Par contre, une fois un tableau
> créé/initialisé, sa taille ne peut **plus** être modifiée.
>
> Pour cette raison, il n'est pas possible d'initialiser un tableau qui est
> déjà déclaré précédemment (ligne 6) sans le mot-clé `new` (ligne 21).
---

## Déclaration et initialisation simultanées
Dès la ligne 26, plusieurs exemples de déclarations et d'initialisations
simultanées sont donnés. Remarquez qu'il est également possible d'indiquer la
taille par un chiffre ou par une variable. Il est aussi possible de déclarer et
d'initialiser un tableau directement avec les valeurs voulues.

Il est également possible de créer un tableau anonyme (sans nom), par exemple
pour le passer en paramètre d'une fonction (ligne 38).

Note : Lorsque la déclaration et l'initialisation sont effectuées en même temps,
le mot-clé `new` n'est pas nécessaire (ligne 43).

# Exemple et exercice
Le programme "Main.java" démontrent les différents concepts présentés
ci-dessus. Après avoir lu attentivement ces exemples, répondez à la question
posée ci-dessous.