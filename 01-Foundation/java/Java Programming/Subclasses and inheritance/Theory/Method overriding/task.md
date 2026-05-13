# Redéfinition des méthodes

Lorsqu'une classe définit une méthode d'instance en utilisant la même 
signature qu'une méthode de sa classe parente, cette méthode redéfinit 
(overrides) la méthode de la classe parente. Cela permet de 
modifier / spécialiser le comportement de la sous-classe.

Attention à ne pas confondre la **surcharge** de méthodes (**overloading**,
vue au cours sur les méthodes) avec la **redéfinition** de méthodes 
(**overriding**). Pour rappel, l'overloading consiste à écrire plusieurs 
méthodes avec le même nom, mais une liste de paramètres différente. 
L'overriding reprend la même signature de la classe parente dans la 
sous-classe (même nom, même type de retour et même liste de paramètres).

## `@Override`
L'annotation `@Override` peut être utilisée pour indiquer explicitement 
l'intention de redéfinir une méthode. Elle est facultative, mais apporte deux 
avantages : le compilateur nous informe si la signature est incorrecte et 
cela rend le code plus clair.

## Exemple
Dans l'exemple fourni, `Parent` est la classe parente tandis que `Child` est 
la classe dérivée. Observez le code et répondez à la question ci-dessous.

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code des différentes classes, identifiez les affirmations correctes ci-dessous.