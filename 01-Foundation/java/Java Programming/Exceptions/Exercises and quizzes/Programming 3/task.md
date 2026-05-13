# Utilisation de classes d'exception créées par le programmeur

Dans le programme "Main.java", deux classes représentant des exceptions 
créées par le programmeur sont déclarées, à savoir `NoNumberException` et 
`BadNumberException`. Ces exceptions sont des exceptions contrôlées et 
doivent donc être déclarées et traitées ou propagées.

La classe `Main` définit trois méthodes :

- `findNumber` : cette méthode recherche un nombre entier (par ex. `1234`), ou 
  à virgule flottante (par ex. `12.34`) dans un `String`, et retourne le 
  `String` correspondant. La méthode lance une exception si aucun nombre 
  n'est trouvé.
- `convertInteger` : cette méthode convertit un `String` en un `int` et 
  retourne la valeur entière. La méthode lance une exception si le `String` 
  ne peut pas être converti en `int`.
- `embedNumber` : la méthode insère une valeur entière entre deux `String` 
  pré-définis et retourne le `String` ainsi créé.

Dans la méthode `main`, un tableau de `String` est créé. 

Vous devez compléter le programme afin qu'il compile, qu'il s'exécute sans 
erreur et qu'il produise le résultat suivant sur la console :

```
example1234
abcd1234efgh
examplenonumber
No number
example12.34
Bad number
```

#