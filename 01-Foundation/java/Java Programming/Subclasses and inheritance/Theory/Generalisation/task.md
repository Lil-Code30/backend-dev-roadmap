# Généralisation

La relation d'héritage "est un..." permet de traiter les objets des 
sous-classes comme s'ils étaient des objets de leur classe parente (par 
généralisation). Si nécessaire, le système effectue une conversion 
élargissante de la sous-classe vers la classe parente (upcasting). 

De plus, une conversion explicite d'un objet de la classe parente vers un objet 
de la sous-classe (downcasting) est possible si l'instance à convertir référence 
effectivement un objet de la sous-classe au moment de l'exécution. 
Autrement, une exception de type `ClassCastException` est levée.

La classe `Main` illustre l'application du upcasting et du downcasting. La 
ligne 12 montre l'application du upcasting en stockant une variable de type 
`Wizard` dans une variable de type `Person`. La ligne 15 démontre le 
downcasting en assignant une variable de type `Person` vers une variable de 
type `Wizard`. Cela est possible puisque Harry est bien un magicien. Par 
contre, il n'est pas possible de downcaster `p` vers une variable de type 
`Muggle` puisque Harry n'est pas un moldu. Cela lève donc une erreur à 
l'exécution du programme.

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code des classes `Muggle`, `Person` et `Wizard`, identifiez les affirmations
correctes ci-dessous.