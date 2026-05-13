# Méthodes des classes `Enum`

Différentes méthodes peuvent être utilisées pour tout type `Enum`. 
Ces méthodes sont présentées ci-dessous.

## `values()`
Pour tous les types énumérés, une méthode statique `values()` est 
implicitement déclarée. Elle retourne un tableau des constantes 
d'énumération dans leur ordre de déclaration. Cela permet de parcourir 
tous les éléments d'un type énuméré.

## `valueOf()`
Pour tous les types énumérés, une méthode statique `valueOf()` est 
implicitement déclarée. Cette méthode convertit la chaîne de caractères 
passée en paramètre en un élément du type énuméré ou lève l'exception 
`IllegalArgumentException` si la conversion n'est pas possible. Attention, 
la méthode est sensible à la casse (minuscule/majuscule).

## `name()`
La méthode d'instance `name()` retourne un `String` correspondant à la 
représentation textuelle d'une variable de type énuméré (elle se comporte de 
la même manière que la méthode `toString()`).

## `ordinal()`
La méthode `ordinal()` retourne un `int` correspondant à la position de 
l'élément dans la déclaration d'une variable de type énuméré (la 
numérotation commence à zéro).

## Autres membres
Il est possible d'ajouter des champs, des constructeurs et des méthodes dans 
une classe de type `enum`. 

## Modification des méthodes afin d'utiliser les types `Enum`
Différentes méthodes sont modifiées pour tenir compte des `enums` et 
utilisent les méthodes présentées ci-dessus.
- Méthode `doAction()` de la classe `Person` : lignes 22 à 26.
- Méthode `castSpell()` de l'interface `SpellCaster` : lignes 14 à 18. 

De plus, la classe `Main` illustre l'utilisation de ces différentes méthodes.

#