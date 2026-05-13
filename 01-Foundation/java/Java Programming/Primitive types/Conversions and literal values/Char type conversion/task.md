# Les conversions de et vers `char`

Une expression de type `char` peut être convertie sans transtypage explicite en
une expression de type entier (`byte`, `short`, `int` ou `long`). Par contre, la
conversion d'une valeur de type entier en `char` exige du programme
l'utilisation du transtypage explicite.

Un transtypage s'effectue selon la
syntaxe `(type_de_destination) valeur_à_convertir`, par exemple dans
l'instruction `char c = (char) 17`;

# Exercice

Soyez attentifs au fait que comme `c1` et `c3` sont convertis en `int` 
dans l'instruction `println`, c'est bien la valeur entière `65` qui sera 
affichée à l'écran et non le caractère _ASCII_ correspondant à la valeur `65`.

Veuillez aussi noter que l'utilisation d'un transtypage n'est pas nécessaire si 
la valeur littérale entière peut être convertie en `char` (par 
exemple `65`). Si vous remplacez `65` par une valeur qui ne peut pas être 
représentée par une variable de type `char`, alors le transtypage est 
obligatoire. 

Essayez par exemple avec la valeur `123456` et expliquez pourquoi cette valeur 
ne peut pas être représentée par une variable de type `char`.

