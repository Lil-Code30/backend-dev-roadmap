# Extension des interfaces

Les interfaces peuvent avoir des sous-interfaces (tout comme les classes 
peuvent avoir des sous-classes). Comme pour les classes, le mot-clé 
`extends` est utilisé pour créer une sous-interface. Par contre, contrairement 
aux classes, une interface peut posséder plusieurs interfaces parentes.

Une sous-interface hérite de toutes les méthodes et de toutes les constantes 
de son interface parente et peut définir de nouvelles méthodes et de 
nouvelles constantes. Cela signifie qu'une classe qui implémente une 
sous-interface doit implémenter les méthodes abstraites de ladite 
sous-interface, mais aussi les méthodes abstraites héritées de toutes les 
interfaces parentes.

## Exemple
Dans cet exemple, la sous-interface `Transformable` étend les interfaces 
`Rotatable`, `Scalable` et `Translatable`. Aucune méthode abstraite 
supplémentaire n'est définie, mais il est possible d'en rajouter. La classe 
`Form` implémente l'interface `Transformable` et redéfinit ainsi toutes les 
méthodes.

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code des interfaces et classes de l'exemple, identifiez les affirmations
correctes ci-dessous.