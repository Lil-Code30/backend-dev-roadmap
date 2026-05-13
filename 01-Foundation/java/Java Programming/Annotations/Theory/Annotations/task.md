# Annotations
En Java, une annotation constitue une métadonnée que l'on peut appliquer à 
différents éléments du code source. Elle est indiquée via le symbole `@`. Par 
exemple :
```
@Override
public String toString() {
    return "Circle: Radius=" + radius;
}
```


Les annotations n'ont pas d'effet direct sur le fonctionnement des instructions 
annotées. C'est-à-dire que le code fonctionne parfaitement sans annotation. 
Par contre, elles permettent par exemple d'effectuer des vérifications au 
niveau de la compilation ou de documenter le code. Dans le cas ci-dessus, 
`@Override` indique que la méthode redéfinit une méthode héritée. Le 
compilateur génère une erreur si l'en-tête de la méthode n'est pas correcte.

Une annotation peut inclure un ou plusieurs paramètres :
```
// Metadata about the class
@Author (name = "Tryphon Tournesol",
         date = "06.06.2016")           
public class MyClass {

}
```
Si l'annotation ne comporte qu'un seul paramètre dont le nom est `value`, le 
nom peut être omis :
```
@SuppressWarnings("unchecked")
public class MyClass {
    // Warnings about unchecked generic operations are suppressed
}
```
Des annotations multiples peuvent être attribuées à une même déclaration 
(une même annotation peut également être répétée).
```
@Author (name = "Tryphon Tournesol")  // Repeating annotations
@Author (name = "Archibald Haddock")  // Repeating annotations
@EBook
public class MyClass {

}
```
Des annotations peuvent être appliquées à des déclarations (classes, 
attributs, méthodes, etc.) mais également lors de l'utilisation des types. 
Toutefois, certaines annotations requièrent l'installation d'un _Checker 
Framework_.
```
public void check(String name) {
    @NonNull String loginName = name;  // Exception thrown if null
}  
```

# Annotations utilisées dans le cours

Les annotations qui sont utilisées dans ce cours sont :
- `@Override` : La méthode redéfinit une méthode héritée. L'annotation est 
  placée au-dessus de la signature de la méthode.
- `@FunctionalInterface` : L'interface comprend exactement une méthode 
  abstraite. L'annotation est placée au-dessus de la déclaration d'interface.