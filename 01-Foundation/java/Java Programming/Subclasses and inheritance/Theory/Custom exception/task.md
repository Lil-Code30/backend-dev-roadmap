# Exceptions personnalisées

Il est possible de créer ses propres types d'exceptions. Pour ceci, il 
suffit de créer une classe qui étend une classe de type `Throwable`. 
Idéalement, on peut choisir une des classes existantes proche de celle qu'on 
souhaite créer ou sinon dériver la classe générale `Exception`.

Dans la sous-classe, on ne crée généralement que deux constructeurs : un 
constructeur sans paramètre et un constructeur qui prend un message 
(`String`) en paramètre. On crée rarement de nouveaux champs ou de nouvelles 
méthodes.

L'utilisation des exceptions personnalisées est la même que celle des 
exceptions déjà pré-définies.

# Exemple
La classe `Clock` représente une montre avec des heures et des minutes. Son 
constructeur n'accepte que des heures allant de 0 à 24 (non compris) et des 
minutes allant de 0 à 60 (non compris). Si une heure incorrecte est fournie 
lors de l'initialisation, le constructeur lève une `ClockException` qui 
représente une exception personnalisée, dérivée de `IllegalArgumentException`.