# Exercice 5 de la série 11

Écrire un programme qui reçoit en paramètre le nom d'un fichier texte, et
qui affiche le nombre de caractères, de mots et de lignes contenus dans ce
fichier (comme la commande Unix "wc").

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez implémenter les méthodes `main()` et `countLines()`, en
respectant les points suivants :

- La méthode `main()` doit afficher les résultats. Cette présentation n'est
  pas vérifiée dans le programme de test et peut donc être réalisée selon
  votre libre choix.
- La méthode `countLines()` doit retourner un tableau d'entiers contenant
  les valeurs suivantes :
   - [0] = le nombre de lignes
   - [1] = le nombre de mots
   - [2] = le nombre de chars (compter un seul caractère pour les retours à la ligne)
- Les valeurs retournées par la méthode `countLines()` sont vérifiées dans
  le programme de test. La méthode `main()` n'est pas testée, ni pour les
  valeurs affichées, ni pour la possibilité d'entrer le nom du fichier sur
  la ligne de commande.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java".

#