# Déclaration et création d'objets

Jusqu'à maintenant, nous avons complété la classe `Point` avec des attributs, 
constructeurs et méthodes. Néanmoins, nous n'avons ni déclaré ni créé 
d'objets comme instances de cette classe.

Les objets, comme les tableaux, sont des types référence. Cela signifie 
qu'une variable contient une référence vers l'objet et non l'objet lui-même.

## Déclaration
Une **déclaration** `Point p` ne crée pas un objet, mais uniquement une 
référence vers un objet du type mentionné (comme pour les tableaux).

## Création
Pour la **création** d'un objet, on utilise l'opérateur `new` suivi du nom 
de la classe et d'une liste facultative d'arguments entre parenthèses.
```
new nom_de_la_classe(expr1, expr2, ...)
```

L'opérateur `new` fait appel à l'un des constructeurs de la classe en 
fonction du profil des paramètres transmis (constructeur par défaut ou l'un 
des constructeurs explicitement définis dans la classe).

# Exemple : les classes `Point` et `Main`
La classe `Main` comprend des déclarations et créations d'objets de type 
`Point`. Comme les objets sont des types référence, `p1`, `p2` et `p3` ne 
contiennent donc pas les objets, mais sont des références vers les zones 
mémoires contenant les objets.

