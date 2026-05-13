# Classes abstraites et polymorphisme : modélisation d'un jardin

Le code présenté permet de modéliser un jardin composé de pots et de légumes.

Le jardin (classe `Garden`): 
- possède des pots de légumes.
- peut recevoir un légume supplémentaire (`add()`).
- peut être arrosé d'une certaine quantité d'eau (`water(double literOfWater)`).
- peut actualiser l'état des plantes qui grandissent (`grow()`).

Un pot de légumes (classe `Vegetable`) :
- possède une quantité d'eau et une taille.
- peut être arrosé d'une certaine quantité d'eau (`water(double literOfWater`)).
- peut être planté (`plant(Vegetable[][] garden)`) à l'endroit le plus 
  propice (`Tomato` au sud, `Carrot` au nord).
- peut grandir (`grow()`).

Les classes `Carrot` et `Tomato` sont des spécialisations de `Vegetable`.

Complétez le code afin qu'il puisse être compilé et lancé sans erreurs.

#