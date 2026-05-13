# Initialiseur de classe

Le langage Java permet d'écrire du code d'initialisation de classe qui est 
exécuté lors de l'élaboration de la classe (en même temps que 
l'initialisation des attributs statiques). Ce code, appelé **initialiseur 
statique** est simplement constitué d'un bloc d'instructions (entre accolades) 
précédé du mot-clé `static`. Cela permet notamment d'initialiser des 
attributs statiques plus complexes qui nécessitent plusieurs instructions.
La classe `Sinusoid` illustre l'utilisation d'un initialiseur statique pour 
initialiser un tableau (lignes 5 à 14 de la classe `Sinusoid`).

Une classe peut posséder un nombre quelconque d'initialiseurs statiques qui 
peuvent être placés partout où une déclaration d'attribut ou de méthode est 
permise. Cela implique qu'à la **première initialisation** d'un objet de la 
classe, tous les attributs statiques sont initialisés et mis en mémoire. L'ordre 
d'initialisation s'effectue dans l'ordre d'écriture du fichier. Ensuite, le 
constructeur de l'objet est appelé. Lors d'une seconde initialisation, seul 
le constructeur est appelé puisque les attributs statiques existent déjà en 
mémoire et sont partagés par tous les objets.

# Exercice
Après avoir étudié les classes `Sinusoid` et `Main`, répondez à la question
ci-dessous.
