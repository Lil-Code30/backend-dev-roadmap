# Exercice 6 de la série 22

Les classes de la librairie standard `PrintStream` et `StringWriter` offrent 
toutes les deux une méthode `write(int)`, mais sans que cela ne provienne 
d'une classe/interface commune.

Dans le programme "Task.java", une manière assez inélégante d'écrire une 
seule méthode capable d'exécuter une série de `write()` successifs sur l'une 
ou l'autre sorte d'objets est proposée. Cette solution vérifie le type 
d'objet, convertit l'objet dans le type adéquat puis appelle la méthode 
correspondante.

Proposer une autre manière de coder ce comportement, à l'aide des références 
de méthodes et d'une interface fonctionnelle (à créer ou à trouver dans la 
libraire standard).  

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---
- Dans la méthode `performHardComputation()` de la classe `Task`, remplacer le
  tableau de `double` par un tableau de réferences de méthodes, en utilisant
  l'interface `HardComputation` définie dans le fichier "Task.java".
- Effectuez les autres changements requis de sorte qu'un seul appel à
  une des méthodes `hardComputationX()` soit effectué.

#