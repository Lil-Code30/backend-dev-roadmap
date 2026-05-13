# Interfaces génériques

Les interfaces génériques se basent sur les mêmes principes et conventions que 
les classes génériques.

## Exemple
Dans notre exemple, `Packager` est une interface générique qui reprend les 
mêmes méthodes que notre classe `Box` présentée dans la tâche 
précédente. `IntegerBox` est une classe concrète, non générique, qui implémente 
`Packager<Integer>`. La classe `Box` représente une classe générique qui 
implémente l'interface générique `Packager`.

Notez bien la signature de l'interface et des deux classes, ainsi que leur 
instanciation par la classe `Main`.

## Généricité dans le langage Java
De nombreuses interfaces et classes de la plateforme Java utilisent la 
généricité, notamment les collections. C'est le cas par exemple de 
`java.lang.ArrayList`, qui implémente entre autres les interfaces `List<E>` et
`Collection<E>` qui sont des interfaces génériques. 

## Type générique comme paramètre effectif d'un autre type générique
Souvent, on retrouve des 
formulations telles que :
```
List<Pair<String, Integer>> pList = new ArrayList<>();
pList.add(new Pair<>("Small", 3));
```
Cette formulation permet d'initialiser une liste de paires. Dans cet 
exemple, un type générique (`Pair<String, Integer>`) peut être utilisé comme 
paramètre effectif d'un autre type générique (`List<T>`).

#