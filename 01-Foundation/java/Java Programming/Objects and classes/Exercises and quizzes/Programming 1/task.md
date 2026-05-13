# Programmation d'une classe représentant un étudiant

La classe `Student` doit être complétée. La classe `Main` doit pouvoir 
compiler et être exécutée sans erreurs, ni modifications.

La classe `Student` doit être réalisée selon les points suivants :
- Elle possède comme attribut un prénom (`first_name` de type `String`), un 
  nom (`last_name` de type `String`) et un âge (`age` de type `int`).

- Elle possède un constructeur sans paramètre qui initialise une instance de 
  `Student` avec les valeurs `"Jean"` (`first_name`), `"Dupond"` 
  (`last_name`) et `18` (`age`).

- Elle possède un deuxième constructeur avec paramètres le nom, le prénom et 
l'âge et qui initialise l'instance de `Student` avec les valeurs des 
  paramètres donnés.

- Elle possède une méthode publique `isMajor()` qui retourne un `boolean`, 
`true` lorsque l'âge est supérieur ou égal à 18 ans, `false` autrement.

- Elle possède une méthode publique `getName()` qui retourne un `String` qui 
  est la concaténation de `first_name` et `last_name` avec un espace au milieu.

#