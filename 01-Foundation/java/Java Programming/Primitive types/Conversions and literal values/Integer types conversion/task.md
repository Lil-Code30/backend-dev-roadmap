# Les conversions de et vers les types entiers

## Conversion entre types entiers
Une expression évaluée en un des types d'entiers (`byte`, `short`, `int` ou 
`long`) peut être convertie vers un autre type d'entiers sans transtypage si 
la plage de valeurs du nouveau type est plus grande que le type original. 
Dans le cas contraire (plage plus petite/restrictive), l'opérateur de 
transtypage doit être ajouté par le programmeur.

## Conversion entre entiers et `boolean`
La conversion vers et depuis une expression booléenne n'est pas possible, même 
avec un opérateur de transtypage.

## Conversion entre entiers et `char`
La conversion vers et depuis une expression de type `char` suit les mêmes règles 
que le type `short`.

## Conversion entre entiers et nombres à virgule flottante
La conversion vers un type à virgule flottante (`float` ou `double`) est 
possible sans transtypage, alors que l'opération inverse nécessite 
l'utilisation de l'opérateur de transtypage. La conversion d'un type entier 
vers un type à virgule flottante peut toutefois entraîner des pertes de 
précision dans des cas particuliers. 

# Exercice
Dans l'exercice proposé, suivez les instructions afin de réaliser les 
comportements souhaités.