# Les méthodes de classe

Note : les méthodes ont déjà été étudiées dans un cours précédent.

## Mot clé `static`
Les méthodes ne sont pas forcément déclarées avec le modificateur `static`
(c'est même plutôt l'exception en programmation objet). Un prochain cours sera
consacré à approfondir les notions d'attributs/de méthodes statiques et
non-statiques.

## Accès aux attributs et autres méthodes
Les méthodes ont accès aux attributs de la classe dans laquelle elles sont
déclarées. Ces champs sont accessibles par leurs noms simples ou en
utilisant le préfixe `this`.

Les méthodes peuvent invoquer d'autres méthodes définies dans la même classe
en utilisant leur nom simple ou en utilisant le préfixe `this`.

## Exemple : la classe `Point`
Deux méthodes ont été ajoutées à la classe `Point`. La première méthode
`distanceOrigin()` permet de calculer la distance euclidienne entre
l'origine `(0.0, 0.0)` et le point. La seconde méthode `toString()` permet de
retourner une représentation de l'instance de `Point` sous forme de `String`.

# Exercice
Après avoir étudié les points présentés ci-dessus, identifiez les affirmations
correctes parmi les suivantes.