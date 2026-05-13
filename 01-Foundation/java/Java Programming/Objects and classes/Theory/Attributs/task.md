# Attributs de la classe

Les **attributs** (ou champs ou membres données) de la classe définissent 
la valeur (l'état) de l'objet.

La syntaxe de déclaration des champs est proche de la déclaration d'une 
variable locale : 
```
modificateurs Type nom_du_champ [ = expression ];
```

Les **modificateurs** sont constitués de mots-clés qui déterminent diverses 
propriétés, notamment la visibilité (`public`, `protected`, `private`). Ils 
seront étudiés dans un prochain cours.

Le **type** peut être un type primitif, un tableau ou le nom d'une classe.

Une **expression d'initialisation** peut être mentionnée lors de la déclaration 
d'un attribut (`= ...`). En l'absence de cette expression d'initialisation, les 
attributs sont automatiquement initialisés à leurs valeurs par défaut 
(`false` et `0` pour les types primitifs, `null` pour les tableaux et les 
objets).

## Exemple : la classe `Point`
La classe `Point` contient désormais la déclaration d'attributs `px` et `py` 
représentant les coordonnées du point dans l'espace 2D. Si aucune expression 
d'initialisation n'est présente, ceux-ci sont initialisés à 0.0 (étant des 
`double`). Il est également possible d'ajouter une expression 
d'initialisation pour spécifier leur valeur par défaut.

# Exercice
Après avoir étudié les points présentés ci-dessus, identifiez les affirmations
correctes parmi les suivantes.