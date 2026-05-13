# Interfaces et classes abstraites

Dans cet exercice, nous reprenons la conception des moldus et sorciers, mais
en améliorant le code d'après ce que nous avons appris sur les classes 
abstraites et les interfaces.

`Person` devient une classe abstraite. Les classes concrètes sont `Muggle` 
et `Wizard`. Pour rappel, la classe `Muggle` possédait une méthode `doAction
()` qui lui permettait de se battre à la manière moldue. `Wizard` avait une 
méthode `castSpell()` pour jeter un sort. Néanmoins, un sorcier est 
également capable de se battre "à la moldue", même si ce n'est pas courant. Dès 
lors, la méthode `doAction` est placée maintenant dans la classe `Person`.

`Wizard` implémente désormais deux interfaces qui sont `Follower` et 
`SpellCaster` :
-  L'interface `Follower` permet d'indiquer que le sorcier suit 
une personne en particulier, par exemple Dumbledore ou Lord Voldemort. Pour 
   ceci, elle comporte deux méthodes : 
   * `follows()` qui permet d'indiquer la personne suivie
   * ainsi que `isFollowing()` qui retourne le nom de la personne suivie. 
- L'interface `SpellCaster` permet de jeter des sorts grâce à la méthode 
  `castSpell()` (qui choisit aléatoirement un sort dans la liste fournie).

## Utilisation des interfaces
Il est avantageux d'utiliser les interfaces afin que de nouvelles classes 
telles que les centaures ou loup-garou puissent aussi bénéficier de ces 
comportements sans pour autant dériver de la classe `Person`.

## Exercice
Complétez le code afin que la classe `Main` puisse compiler 
sans erreurs.

#