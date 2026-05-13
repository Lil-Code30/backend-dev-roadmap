# Programmer avec des objets

Pour la programmation orientée objet, il est important que les notions
suivantes soient bien comprises :
- **Objet** : Entité typée et nommée qui possède des attributs et des méthodes.
- **Attribut** : Case mémoire typée et nommée.
- **Méthode** : Procédure ou fonction nommée qui a accès aux attributs de 
  l'objet.

Pour accéder aux composants (membres) d'un objet, il faut :
- Détenir une variable qui référence cet objet.
- Connaître le nom de l'attribut ou de la méthode.
- Utiliser l'opérateur `.`.

## Exemple : les classes `Engine` et `Car`
Observez les deux classes `Engine` et `Car` qui représentent un moteur et 
une voiture. La classe `Car` possède une instance de `Engine` et est capable 
de l'utiliser dans ses méthodes. Il est également possible d'utiliser un 
objet en paramètre ou retour de méthode (comme pour la méthode 
`newCarFromFactory()` de la classe `Car`).

# Exercice
Après avoir étudié les points présentés ci-dessus, identifiez les affirmations
correctes parmi les suivantes.