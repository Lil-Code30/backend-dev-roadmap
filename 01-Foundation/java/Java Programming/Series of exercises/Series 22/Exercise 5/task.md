# Exercice 5 de la série 22

Les références de méthodes sont très utiles pour différer l'évaluation de 
méthodes coûteuses en temps de calcul. Un exemple est donné dans le 
programme "Main.java". Si vous analysez ce programme attentivement, vous 
pouvez constater que tout un tableau de résultats est calculé alors qu'un 
seul élément du tableau est finalement utilisé. Si le calcul de chaque 
élément du tableau est coûteux, ce programme gaspille des ressources de 
calcul.

Pour corriger ce problème, vous devez modifier la méthode `main` en 
utilisant des références de méthodes, plutôt que des appels de méthodes.

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