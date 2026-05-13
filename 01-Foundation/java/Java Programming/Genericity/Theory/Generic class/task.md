# Classes génériques

Imaginons une classe (non-générique) qui permet de stocker et restituer un 
objet de type `Integer` :
```
public class IntegerBox {
  private Integer anInt;
   
  public Integer get() {
    return anInt;
  }

  public void set(Integer value) {
    anInt = value;
  }
}
```
Imaginons dès lors que nous souhaitons avoir une classe similaire pour gérer 
d'autres types tels que `Float`, `String`, `Point` ou `Rectangle`. Une 
possibilité est la création de classes `FloatBox`, `StringBox`, etc. 
Cependant, une telle approche implique la duplication de code. Une 
autre possibilité est de créer une classe contenant un attribut de type 
`Object`. Cela pose un problème dans les cas où le type doit être défini, par 
exemple avoir une classe de type `Number` lorsqu'on veut pouvoir faire des 
opérations mathématiques.

## Création d'une classe générique
La solution est de créer une **classe générique**. La syntaxe 
`className<type>` permet de passer un type en paramètre à la classe. Dans 
la notation `className<type>`, `type` peut être considéré comme un paramètre 
formel qui représente un type (non-primitif) quelconque. La classe `Box` 
utilisée dans le programme `Main` est un exemple de classe générique.

## Convention de notation
Par convention, on utilise une seule lettre majuscule pour nommer les 
paramètres formels de type (`T`, `U`, `V`, etc). 

Il est également possible de passer plus d'un type générique à une classe ou 
à une interface en les séparant par une virgule :
```
public class TwoBox<T, U> {
}
```

## Instantiation d'une classe générique
Lorsqu'on utilise la classe générique, on passe entre `<` et`>` le type 
effectif souhaité. La classe `Main` illustre plusieurs instantiations 
possibles de la classe `Box`.

Il est important de noter que le type passé en paramètre lors de 
l'instantiation d'une classe générique ne peut **pas** être un type primitif.
Le type doit impérativement être un type référence.

## Raw type
Pour assurer la compatibilité du code écrit avant le JDK 5.0, il est 
possible d'omettre le paramètre effectif et de déclarer ce qu'on nomme un 
`raw type` (sans les `< >`, cf. `Main` ligne 21). Dans ce cas, le type du 
paramètre est implicitement `Object`. Certaines limitations s'appliquent et 
des mises en garde peuvent apparaître à la compilation. L'utilisation des 
`raw type` est à éviter !

## Exemple
L'utilisation de la classe générique `Box<T>` est démontrée dans la classe 
`Main`. La classe `Box<T>` est un simple _container_ pour des éléments de type 
`T`.

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code du programme de l'exemple, identifiez les affirmations correctes 
ci-dessous.