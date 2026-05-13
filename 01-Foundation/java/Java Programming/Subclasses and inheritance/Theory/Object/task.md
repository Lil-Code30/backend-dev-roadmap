# Classe `Object`

En Java, chaque classe que l'on crée possède une classe parente. Si aucune 
classe n'est déclarée comme classe parente, la super-classe est par défaut 
`Object` (déclarée dans le paquetage `java.lang`). La classe `Object` est 
donc l'ancêtre de toutes les classes Java (c'est la racine unique de l'arbre 
des classes). Par conséquent, c'est la seule classe Java qui ne possède pas 
de classe parente.

La classe `Object` possède des méthodes telles que `toString()`, `equals()`, 
`finalize()`, dont toutes les classes héritent et qui peuvent être invoquées 
sur toute instance de classe. La classe `Object` constitue la généralisation 
ultime : tous les objets sont des `Object` !

# Exemple
Dans le programme "Main.java", des instances de la classe `JustAnObject` sont 
créées. `JustAnObject` est une classe qui ne déclare aucun héritage 
explicite et ne déclare aucun attribut/méthode. Mais les instances 
de `JustAnObject` sont bien des `Object`, comme démontré dans le programme 
`Main`.