# L'instruction `while`

Un autre type de boucle est la boucle `while`, avec la syntaxe :

```
while (condition) {
  ...
}
```

Ce type de boucle est souvent utilisé lorsque le nombre d'itérations n'est 
pas connu et que la boucle doit être répétée aussi longtemps que certaines 
conditions sont respectées.

## Points importants

Il est utile de noter les points suivants :

- Il n'est pas possible de déclarer des variables dans l'expression 
  `condition`. Les variables utilisées dans l'expression `condition` doivent 
  donc être déclarées à l'extérieur de la boucle. La construction `while 
  (boolean cond = true) {}` n'est par exemple pas autorisée.
- Les instructions à l'intérieur d'une boucle `while` peuvent être exécutées 
  `0` ou plus d'une fois. 
- Afin de réaliser des boucles "infinies" (avec des conditions pour sortir 
  de la boucle), l'expression `while (true) {}` est souvent utilisée. Cette 
  construction est utilisée avec des conditions de sortie réalisées avec 
  l'instruction `break`.

# Exemple
Un exemple de boucle `while` est donné dans le programme "Main.java". 
   