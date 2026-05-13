# Héritage et redéfinition de méthodes

Nous souhaitons modéliser des formes équilatérales. Ainsi, la classe `Form` 
est la classe parente, tandis que les classes `Square` et `Triangle` sont 
des sous-classes.

`Form` possède un nombre d'arêtes et une taille (longueur d'une arête), 
ainsi qu'une méthode `print ()` qui permet d'afficher sa longueur. `Square` et 
`Triangle` redéfinissent cette méthode afin d'afficher directement un carré 
et un triangle en console.

Un carré de taille 3 est affiché de la manière suivante : 
```
***
***
***
```

Un triangle de taille 5 est affiché de la manière suivante :
```
  *
 ***
*****
```

Les classes doivent être complétées de sorte que la classe `Main` peut être
compilée et lancée.

#
