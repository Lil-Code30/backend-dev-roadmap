# Classe abstraite ou interface

Le choix entre une classe abstraite et une interface n'est pas toujours 
facile. Parmi les points à prendre en considération, rappelons que :
- Une classe peut implémenter plusieurs interfaces, mais ne peut hériter que 
  d'une seule classe abstraite.
- Une interface peut être implémentée par une classe sans qu'il y ait de 
  rapports étroits entre les deux. Une sous-classe est liée par une relation 
  plus forte ("est un...").
- Les classes abstraites et les interfaces permettent de définir des 
  implémentations par défaut pour les méthodes.
- Les interfaces fonctionnelles peuvent être implémentées par des 
  expressions lambdas ou des références de méthodes permettant d'alléger le 
  code. Ces points seront présentés dans un prochain cours.

# Exemple
L'exemple de cette tâche illustre le cas d'utilisation où `Shape` est 
une classe abstraite représentant une forme géométrique. Comme un rectangle 
est une forme géométrique, il est considéré que l'**héritage** est bienvenu. 
Ainsi, `Rectangle` étend `Shape`. Pour ajouter le comportement d'affichage, 
`Rectangle` **implémente l'interface** `Printable`. Procéder de cette manière 
permet également d'utiliser `Printable` pour afficher d'autres objets que 
des formes.
