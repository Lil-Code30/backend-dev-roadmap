# Valeurs littérales et conversions pour les nombres à virgule flottante

## Valeurs littérales
Les valeurs littérales pour les types `float` et `double` peuvent être
formulées sous la forme habituelle `xx.yy`ou sous la forme exponentielle
avec `e` ou `E` suivant de l'exposant.
Quelques exemples sont donnés dans le programme "Main.java".

## Conversions
Les conversions entre types à virgule flottante suivent la même règle que
les conversions entre types entiers : une conversion élargissante ne
nécessite pas l'opérateur de transtypage explicite alors qu'une conversion
restrictive nécessite l'opérateur. 

Les conversions d'un type `float` ou `double` vers un type entier nécessite
l'opérateur de transtypage explicite, car cette opération va créer la perte 
de la partie décimale du nombre (valeur tronquée). Bien que la conversion d'un
nombre entier vers un nombre à virgule flottante puisse produire une perte
de précision, l'opérateur de transtypage explicite n'est pas requis dans ce 
cas. 

# Exercice
Vous devez compléter le code du programme "Main.java" selon les commentaires.
Le programme "Main.java" contient également des erreurs de conversion entre 
`float` et `double` que vous devez corriger.