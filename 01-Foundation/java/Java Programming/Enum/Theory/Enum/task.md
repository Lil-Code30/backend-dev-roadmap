# Énumérations

En Java, le mot-clé `enum` permet de définir un type énuméré. Il s'agit d'une 
classe spéciale qui hérite implicitement de `java.lang.Enum` et 
qui permet de représenter un ensemble fixe de constantes (implicitement 
`static` et `final`) que l'on écrit en majuscules.

Une variable de type énuméré ne peut prendre qu'une des valeurs constantes 
définies ou `null`.

## Exemple
Reprenons notre exemple de sorciers et moldus précédemment définis, 
légèrement simplifiés par la suppression de l'interface `Follower`. Pour 
rappel, la classe `Person` possédaient différentes actions sous la forme 
suivante : 
```
private static final String[] ACTIONS = {
     "run", "fight", "swear"
};
```
De plus, la classe `Wizard` indiquait les quatre maisons de Poudlard ainsi : 
```
public static final String[] HOUSES = {
     "Gryffindor",
     "Hufflepuff",
     "Ravenclaw",
     "Slytherin"
};
```
Finalement, l'interface `SpellCaster` possédait également différents sorts : 
```
String[] SPELLS = {
     "accio", "alohomora", "bombardo", "expelliarmus"
};
```

## Modifications afin d'utiliser les `Enum`
Toutes ces constantes peuvent être transformées en `Enum`.

Les classes sont modifiées en conséquence pour avoir ce nouveau type énuméré :
- `Person` : lignes 5 à 9.
- `SpellCaster` : lignes 4 à 9.
- `Wizard` : lignes 5 à 10.

Note : Dans ce cas, les énumérations sont définies au sein d'une classe, mais 
elles peuvent aussi être déclarées dans leur propre unité de compilation 
(comme toute classe Java). Par contre, une énumération ne peut pas être définie 
dans une méthode.

La classe `Main` illustre l'utilisation de l'énumération `House` pour 
initialiser des sorciers.

Quant aux méthodes qui utilisaient ces constantes, elles sont pour l'instant 
commentées (`Person` lignes 19 à 24 et `SpellCaster` lignes 12 à 16). Elles 
seront modifiées en conséquence dans la **prochaine tâche**. 

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code du programme de l'exemple, identifiez les affirmations correctes ci-dessous.