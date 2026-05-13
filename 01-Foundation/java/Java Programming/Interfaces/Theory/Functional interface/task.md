# Interface fonctionnelle

Une **interface fonctionnelle** est une interface comprenant exactement une 
méthode abstraite. Elle peut malgré tout contenir :
- des constantes
- des méthodes avec une implémentation par défaut
- des méthodes redéclarant certaines méthodes de la classe `Object`
- des méthodes statiques

## Annotation `@FunctionalInterface` 
L'annotation `@FunctionalInterface` peut précéder la déclaration des 
interfaces fonctionnelles pour que le compilateur vérifie que les règles 
énoncées soient respectées.

Les interfaces fonctionnelles sont couramment utilisées en lien avec les 
expressions lambdas. Ceci sera présenté plus en détail dans un prochain cours.

# Exemple
L'interface `DummyInterface` illustre un exemple d'interface fonctionnelle. La
classe `Main` démontre un exemple d'utilisation de cette interface qui est
réalisée avec la classe concrète `Dummy`.

