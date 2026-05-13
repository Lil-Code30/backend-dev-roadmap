# Constructeurs de la classe

Un constructeur est une sorte de méthode qui sera invoquée lors de la
création d'un objet de cette classe, à l'aide de l'opérateur `new`.

Un constructeur doit porter le nom de la classe et ne doit pas comporter de
type de retour dans sa déclaration (même pas `void`). Un constructeur
retourne implicitement une _référence_ à l'objet comme instance de la
classe.

Le but du constructeur est d'initialiser l'objet, en particulier la valeur
de ses attributs. Si aucun constructeur n'est défini dans une classe, Java
fournit un constructeur par défaut, sans argument, qui se charge uniquement
d'initialiser les attributs avec leur valeur initiale (valeur par défaut ou
valeur de l'expression d'initialisation).

## Surcharge des constructeurs
Comme les méthodes, les constructeurs peuvent être surchargés (en suivant
les mêmes règles).

Lorsqu'une classe possède des constructeurs multiples, il est possible, dans
le corps d'un constructeur, d'invoquer un autre constructeur en utilisant la
syntaxe spéciale :
```
this(expr1, expr2, ...)
```
---
**Important** : L'appel à `this`, s'il est présent, doit être la première
instruction dans un constructeur. Ainsi, il n'est pas possible d'écrire :
```
public Point() {
  System.out.println(); // or any other meaningful statement
  this(0.0, 0.0);
}
```
--- 

## Exemple : la classe `Point`
La classe `Point` comprend deux constructeurs et démontre le principe de la
surcharge de constructeurs. Le premier est un constructeur sans
paramètre et initialise le point à `(0.0, 0.0)` en appelant le second
constructeur via l'appel à `this`. Le second constructeur initialise le
point d'après les arguments reçus. Notez que le premier constructeur est
similaire au constructeur par défaut puisque celui-ci aurait la même
signature et initialiserait aussi les attributs à `(0.0, 0.0)`.

# Exercice
Après avoir étudié les points présentés ci-dessus, identifiez les affirmations
correctes parmi les suivantes.