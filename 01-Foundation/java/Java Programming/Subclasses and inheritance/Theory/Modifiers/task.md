# Modificateurs `final`, `protected`, `private`

Les modificateurs prennent un sens différent selon le contexte d'utilisation 
et sont expliqués plus en détail dans cette leçon.

## Modificateur `final`

L'utilisation du modificateur `final` a les significations suivantes : 

- Dans la déclaration d'une **classe**, le modificateur `final` indique 
qu'on ne peut pas créer de classes dérivées à partir de celle-ci. 
C'est-à-dire que si la classe `A` est déclarée `final`, alors on ne peut pas 
créer une sous-classe `B` qui a `A` comme parent.

- Dans la déclaration d'un **attribut**, le modificateur `final` indique que la 
valeur du champ ne peut pas être modifiée après l'affectation initiale (dans 
la déclaration ou dans le constructeur). Cela permet également de définir des 
valeurs constantes.

- Dans la déclaration d'une **méthode**, le modificateur `final` indique que 
ladite méthode ne peut pas être redéfinie dans une sous-classe. 

- Dans la déclaration des **paramètres d'une méthode**, le modificateur 
`final` indique que la valeur de ces paramètres ne peut pas être modifiée.

## Modificateur `protected`

Dans la déclaration d'un **attribut** ou d'une **méthode**, le modificateur 
`protected` indique que ce membre n'est accessible que dans la classe 
de définition, dans les classes du même paquetage et dans les sous-classes de 
cette classe (indépendamment du paquetage). Le modificateur `protected` devrait 
être utilisé pour les attributs et les méthodes qui ne sont pas requis par les 
utilisateurs de la classe, mais qui pourraient s'avérer utiles à la création de 
sous-classes dans d'autres paquetages.

## Modificateur `private`

Dans la déclaration d'un **attribut** ou d'une **méthode**, le modificateur 
`private` indique que ce champ n'est accessible que dans la classe de 
définition. Néanmoins, les attributs sont hérités dans les sous-classes (une 
zone mémoire est allouée), même s'ils ne sont pas accessibles. Ce 
modificateur devrait être utilisé avec les attributs et les méthodes qui ne 
sont utilisés qu'au sein de la classe de définition et doivent être cachés 
partout ailleurs.  

## Exemple
Dans l'exemple fourni, nous avons une classe parent (`Parent`), une classe 
dérivée (`Child`). `GrandChild` hérite de `Child`. `Dummy` est une classe 
d'un autre paquetage appelé `abc`. 

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code des différentes classes, identifiez les affirmations
correctes ci-dessous.