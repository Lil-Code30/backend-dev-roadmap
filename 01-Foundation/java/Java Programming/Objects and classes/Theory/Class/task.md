# Classe

Une **classe** est une collection nommée :
- d'attributs (ou champs) contenant des valeurs. Ce sont les _membres
  données_ de la classe.
- de constructeurs servant à créer les objets.
- de méthodes définissant des actions (opérations). Ce sont les _membres
  fonctions/méthodes_ de la classe.

La classe est l'élément structurel fondamental de tout programme Java. On
n'écrit pas de programme sans créer au moins une classe, d'où la classe `Main`.

Chaque classe définit un nouveau type de données qui permettra de créer
(d'instancier) des objets de ce type.

## Syntaxe
La syntaxe pour déclarer une classe est la suivante :
```
modificateurs class nom_de_la_classe {
  déclaration_d_attributs
  déclaration_de_constructeurs
  déclaration_de_methodes
}
```

Les _modificateurs_ seront vus ultérieurement. Pour l'instant, nous
utilisons `public`.

Les noms de classes sont habituellement écrits avec la
première lettre en majuscule et en utilisant la notation _Mixed-Case_.
Exemple : `Random`, `StringReader`, `FileOutputStream`.

Les déclarations d'attributs, de constructeurs et de méthodes sont étudiées
dans les prochains trois chapitres.

# Objet
Les objets créés sont appelés **instances de la classe**.

Un **objet** est principalement caractérisé par :
- une identité (son nom) qui doit être univoque dans le contexte
  d'utilisation. L'identité de l'objet est donc le nom de la variable qui
  référence l'objet.
- un type (la classe dont il provient).
- un état qui est défini par la valeur actuelle de ses champs. Il peut
  évoluer dans le temps (chaque objet possède son propre état).
- un comportement qui est défini par l'ensemble de ses méthodes publiques,
  c'est-à-dire l'ensemble des actions et des opérations possibles.

# Exemple : la classe `Point`
Dans le fichier "Point.java", la classe `Point` est définie, afin de
représenter un point dans l'espace 2D. Pour l'instant, la classe est
uniquement déclarée, sans attribut. La classe sera complétée au fur et à
mesure des prochaines tâches.

# Exercice
Après avoir étudié les points présentés ci-dessus, identifiez les affirmations
correctes parmi les suivantes.