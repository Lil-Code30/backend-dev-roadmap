# Expressions lambda

Dans un chapitre précédent, la notion d'interface a été présentée. La 
réalisation d'une interface par une classe concrète et par une classe anonyme a 
également été expliquée. Dans certains cas, on peut réaliser une 
interface de manière encore plus concise.

Lorsqu'une interface ne comporte qu'une seule méthode d'instance abstraite, 
on dit alors qu'il s'agit d'une **interface fonctionnelle**. Dans ce cas, 
l'interface peut être réalisée de manière très concise à l'aide d'une 
**expression lambda**.  

## Définition
Une expression lambda peut être assimilée à une fonction anonyme qui a 
accès au contexte du code englobant, comme une classe anonyme.
Il s'agit essentiellement d'un bloc de code avec des paramètres et qui est 
destiné à être exécuté ultérieurement (une ou plusieurs fois).

Une expression lambda est utilisée pour implémenter une interface 
fonctionnelle. La syntaxe de base est :
```
(parameters) -> expression
// ou
(parameters) -> { statements; }
```
- S'il y a plusieurs paramètres, ceux-ci sont séparés par des virgules. 
- Le type des paramètres peut être indiqué explicitement ou être inféré par le 
  compilateur en fonction du contexte.
- Le type de retour est toujours inféré en fonction du contexte.
- Les parenthèses autour des paramètres sont obligatoires s'il y a zéro ou 
  plusieurs paramètres, mais optionnelles s'il n'y en a qu'un seul et que le 
  type est inféré.
- Dans la notation ci-dessus, `expression` est équivalent à `{ return 
  expression; }`. Cette notation ne peut être utilisée que si la fonction 
  réalise une seule instruction qui retourne la valeur évaluée par `expression`.

## Exemples d'expression lambda
Voici quelques exemples d'expressions lambda :
```
(int x, int y) —> { return x + y; }	   // Types explicites, valeur de retour
(x, y) —> x + y 	                   // Types inférés, valeur de retour
x —> x * x 	                           // Type inféré, valeur de retour
() —> 123 	                           // Pas de paramètre, valeur de retour
s —> System.out.println(s) 	           // Type inféré, pas de valeur de retour
() —> { for (int i=0; i<10; i++) doIt(); } // Pas de valeur de retour
```

## D'une classe concrète à une expression lambda
Afin de démontrer les différentes réalisations possibles d'une interface 
fonctionnelle, nous illustrons le passage d'une classe concrète à une classe 
anonyme et finalement à une expression lambda.

Soit l'interface générique :
```
@FunctionalInterface
public interface Transform<T> {
  T transform(T obj);
}
```
Une réalisation de cette interface à l'aide d'une classe concrète est 
définie comme suit :
```
public class StringTransformer implements Transform<String> {
  public String transform(String str){
    return str.toUpperCase();
  }
}
```
La réalisation de cette interface à l'aide d'une classe anonyme peut être 
écrite ainsi :
```
Transform<String> stringTransformer = new Transform<>() {
  @Override
  public String transform(String str){
    return str.toUpperCase();
  }
};
```

Et finalement, la réalisation de cette interface à l'aide d'une expression 
lambda s'écrit ainsi :
```
Transform<String> stringTransformer = str -> str.toUpperCase();
```

## Accès aux variables locales
En plus des éventuels paramètres définis, des variables déclarées dans son 
corps et des champs statiques, une expression lambda a accès à toutes les 
variables locales qui sont _effectivement finales_. Il s'agit des variables 
locales déclarée avec le modificateur `final` ou qui ne sont pas modifiées 
après la première affectation (sans être déclarées avec le modificateur 
`final`).

Une expression lambda qui utilise (capture) des variables locales externes 
est parfois désignée par le terme de _capturing lambda_. On utilise 
également le terme _closure_ pour désigner le bloc de code de l'expression 
lambda accompagné de l'ensemble des variables locales capturées.

Dans l'exemple suivant, les variables `s` et `len` ne sont pas propres à 
l'expression lambda. Ce sont des données _effectivement finales_ de la méthode 
englobante capturées par l'expression lambda :
```
static Supplier<String> insistor(String s) {
  int len = s.length();
  return () -> s + " (" + len + ") " + s.toUpperCase();
}
```

## Exemple : Comparateur
Il est possible d'utiliser les expressions lambda pour définir un critère de 
tri. La spécification indique que la valeur de `compare(x, y)` vaut :
- `< 0` si x est inférieur à y
- `== 0` si x est égal à y
- `> 0` si x est supérieur à y

Dans le but de comparer deux objets de type `T`, l'interface fonctionnelle 
générique `Comparator<T>` est définie comme suit :
```
package java.util;
@FunctionalInterface
public interface Comparator<T> {
  int compare(T o1, T o2);
}
```
La classe `Arrays` possède une méthode statique de tri qui prend en 
paramètre une interface `Comparator`, comme suit : 
```
static <T> void sort(T[] arr, Comparator<T> comp);
```

La classe `Main` implémente plusieurs expressions lambda pour trier un 
tableau. Essayez de déterminer comment le tableau est trié puis vérifiez en 
observant l'output du programme.

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code du programme de l'exemple, identifiez les affirmations correctes 
ci-dessous.