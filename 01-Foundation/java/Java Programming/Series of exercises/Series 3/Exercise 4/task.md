# Exercice 4 de la série 3

Écrire un programme de résolution de l'équation du 2ème degré $ax² + bx + c
= 0$ qui affiche ou calcule les solutions en tenant compte des cas
particuliers suivants :
- si $a = 0$, l'équation est ramenée à une équation du 1er degré.
- si $a = 0$ et $b = 0$, il y a une infinité de solutions, pour autant que $c
  = 0$. Si $c$ n'est pas égal à $0$, il y a impossibilité (aucune solution).
- si le discriminant est plus grand que $0$, l'équation a deux solutions
  réelles :
  * $x_1=\frac{(–b+\sqrt{discriminant})}{2a}$
  * $x_2=\frac{(–b–\sqrt{discriminant})}{2a}$
- si le discriminant est égal à $0$, l'équation a une solution double :
  * $x_{1,2} = \frac{-b}{2a}$
- si le discriminant est plus petit que $0$, l'équation a deux solutions en
  nombres complexes :
  * $x_1 = \frac{–b}{2a} + i \frac{\sqrt{–discriminant}}{2a}$
  * $x_2 = \frac{–b}{2a} - i \frac{\sqrt{–discriminant}}{2a}$

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
--- 
## Instructions :
Réalisez le programme pour le calcul de la solution de l'équation du
deuxième degré de la manière suivante :
- `a`, `b`, et `c` sont reçus comme paramètres à la méthode `main` et
  convertis en nombre `double`
- S'il y a une infinité de solutions, vous devez afficher sur la console
  `"Infinitely many solutions"`.
- S'il n'y a pas de solution, vous devez afficher sur la console `"No 
  solution, as: " + c +" != 0"`.
- S'il y a une seule solution, vous devez afficher sur la console `"Single 
  solution: x = " + x1`.
- S'il y a deux solutions réelles, vous devez afficher sur la console `"Two 
  real solutions: x1 = " + x1 +", x2 = " + x2`.
- S'il y a deux solutions complexes, vous devez afficher sur la console
  `"Two complex solutions: "`, suivi à la ligne de `"x1 = (" + x1 + ") + (" + xj  + ")i"`, suivi à la ligne de `"x2 = (" + x1 + ") - (" + xj +")i"`.
- Veuillez noter que la vérification de votre programme est basée sur les
  messages affichés, qui doivent contenir les informations indiquées
  ci-dessus pour que votre solution soit considérée comme correcte.

<div class="hint">
Dans cet exercice, vous pouvez utiliser la librairie `Math` de Java. `Math.sqrt(x)` retourne la racine carrée d'un nombre à virgule `x`.
</div>

#