# Interfaces fonctionnelles génériques et expressions lambdas

Comme présenté dans une tâche précédente, le langage Java définit un grand
nombre d'interfaces fonctionnelles génériques. Ces interfaces permettent aux
développeurs d'utiliser des interfaces définies dans le langage pour des
tâches assez courantes, comme 

- définir et appliquer un test sur un ensemble d'objets avec l'interface
  générique `Predicate<T>`.
- représenter une opération qui accepte un seul argument et produit un 
  résultat sans retourner de valeur, avec l'interface générique `Consumer<T>`.
  
Les interfaces définies dans le langage réalisent souvent des méthodes
`default`, qui peuvent par exemple être utilisées pour combiner
l'utilisation de plusieurs réalisations d'interface. Il est utile de
démontrer ce principe avec l'interface `Predicate<T>` et sa méthode `default
Predicate<T> and(...)`. Cette méthode permet de combiner deux tests en
appliquant un `and` logique des deux tests.

Vous devez lire l'exemple de code dans le programme `Main` et le compléter 
selon les consignes.

#