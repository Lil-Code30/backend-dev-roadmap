# Modificateur `final`

Le modificateur `final` peut être utilisé lors de la déclaration de
variables locales, de paramètres de méthodes et d'attributs. Pour les
classes et les méthodes, l'utilisation du mot-clé `final` est aussi
possible et sera présentée durant le cours sur l'héritage.

De manière générale, le modificateur `final` indique que la valeur de la
donnée ne peut plus être modifiée après l'affectation initiale. Il sert donc à
déclarer des :
- constantes utiles au programme.
- attributs immuables (qui ne changent plus durant la vie d'un objet).

## Définitions de constantes

Il est très fréquent de déclarer les constantes générales comme champs
statiques au niveau de la classe et de les déclarer `public`.

Les champs déclarés `static final` sont habituellement écrits en majuscules
et utilisent le caractère souligné `_` comme séparateur. Exemple :
```
private static final double FREQUENCY_MAX = 3.5E9;
```

### Exemple : la classe `Circle`
Observez la classe `Circle` qui possède l'attribut `static final double PI`
et l'utilisation de cet attribut dans la classe  `Main`.

## Classes immuables

Lorsque que l'on souhaite créer une classe immuable, c'est-à-dire dont
l'état ne plus être modifié après la création de l'objet, il est nécessaire
de déclarer les attributs de la classe comme `final`.

### Exemple : la classe `Circle`
Dans la classe `Circle`, l'attribut `radius` n'est pas déclaré `final` et
peut donc être modifié dans la méthode `setRadius()`. Modifiez la
déclaration de l'attribut en le déclarant `final` et observez l'erreur
détectée par le compilateur.

## Variables immuables

Dans la classe `Main`, une autre utilisation du modificateur `final` est
démontrée. À la ligne 11, la variable `finalCircle` est déclarée `final`.
La variable ne peut donc pas être réaffectée, comme commenté à la ligne 13.

# Exercice
Après avoir étudié les points présentés ci-dessus, identifiez les affirmations
correctes parmi les propositions ci-dessous.