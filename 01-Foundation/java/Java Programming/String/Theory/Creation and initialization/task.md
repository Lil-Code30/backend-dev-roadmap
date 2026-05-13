# Les chaînes de caractères

En Java, `String` est une classe de base qui fait partie intégrante du
langage. Il est donc possible de créer des instances de cette classe qui sont
des objets. Les variables représentant ces objets sont alors de type
référence.

Pour rappel, cela signifie qu'à l'initialisation, une référence est associée
à la variable, qui elle pointe vers l'objet représentant la chaîne de
caractères.

## Comparaison de `String`
L'opérateur `==` sur des objets compare les références et non le contenu de
l'objet lui-même. Nous avons créé deux instances de `String` différentes,
donc leurs références sont également différentes (ligne 11).

Cependant, si deux variables contiennent une même référence, l'opérateur `==`
retourne `true` (ligne 13).

Afin de comparer le contenu de chaînes de caractères, l'opérateur `==` n'est alors
pas utile et il est nécessaire d'utiliser :
- `equals()` qui retourne true si les chaînes sont équivalentes, false
  autrement.
- `compareTo()` qui retourne une valeur (int) négative, 0 ou positive pour
  indiquer s'il est plus petit, égal ou plus grand (en utilisant l'ordre
  lexicographique).

## Immuabilité

Les `Strings` sont des objets immuables. Une fois créés, ils ne peuvent plus
être modifiés. Naturellement, une variable de type `String` peut changer de
référence vers une nouvelle chaîne de caractères.

L'avantage de l'immuabilité est de pouvoir partager sans risque une instance de
`String`, car on sait que la chaîne de caractères ne pourra pas être
modifiée. Cependant, cela peut devenir coûteux si on manipule souvent des
`Strings` notamment dans une boucle `for` car cela crée des objets temporaires
avec un certain coût. Dans ce cas, il est préférable d'utiliser des
`StringBuffer` ou des `StringBuilder`.

## Exemple
Le programme "Main.java" illustre les concepts présentés ci-dessus. Notez
aux lignes 4 et 5 l'initialisation de variables de type `String` en utilisant
une valeur littérale avec les symboles `""`.

# Exercice
Après avoir étudié les points présentés ci-dessus, répondez à la question 
ci-dessous. 
