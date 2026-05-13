# Exercice 5 de la série 13

Écrire une classe `Complex` permettant de définir et de manipuler des nombres
complexes.

Les nombres complexes constituent une extension de l'espace des nombres réels.
Ils sont composés d'une partie réelle $x$ et d'une partie imaginaire $y$.
On les représente généralement sous la forme : $x + yi$, $i$ étant l'unité des
nombres imaginaires (la racine carrée de -1 ⟶ $i=\sqrt{-1}$).

<div class="hint">

**propriété**: $i^2=-1$

**module**: $|x+yi|=\sqrt{x^2+y^2}$

**addition**: $(x_1+y_1i)+(x_2+y_2i)=(x_1+x_2)+(y_1+y_2)i$

**multiplication**: $(x_1+y_1i)*(x_2+y_2i)=(x_1x_2-y_1y_2)+(x_1y_2+y_1x_2)i$

</div>

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez ajouter les attributs et implémenter les méthodes de la classe
`Complex` permettant à la méthode `main()` de la classe `Main` de s'exécuter
sans lever d'exceptions.

De plus, pour simplifier l'implémentation des tests,
il est demandé d'ajouter à la classe `Complex` les méthodes `double imPart()` et
`double RealPart()`, qui retournent respectivement la partie imaginaire et la partie
réelle d'une instance de la classe `Complex`.

Il n'est possible de passer les tests qu'après avoir réalisé
correctement cette étape.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java" et visualiser l'output.

#
