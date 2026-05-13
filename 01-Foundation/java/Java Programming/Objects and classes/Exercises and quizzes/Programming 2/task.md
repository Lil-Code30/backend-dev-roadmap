# Programmation d'une classe représentant une bibliothèque

La classe `Book` est déjà écrite. La classe `Library` doit être complétée de 
sorte qu'elle puisse contenir des livres. La classe `Main` doit pouvoir 
compiler et être exécutée sans erreurs et sans modifications.

La classe `Library` doit être complétée avec les méthodes suivantes : 
- `hasBooks()` qui retourne un `boolean` qui vaut `true` si elle contient 
  des livres, `false` autrement.
- `numberOfBooks()` qui retourne un `int` indiquant le nombre de livres.
- `addBook(String name, String author)` sans type de retour et qui permet 
  d'ajouter un livre.

<div class="hint">
  Dans la méthode addBook(), vous devez créer un nouveau tableau 
  permettant de sauvegarder les livres existants et d'y ajouter le nouveau livre. 
</div>

#