# Comment généraliser le calcul de séries mathématiques ?

Les séries mathématiques sont des expressions de la forme
$\sum_{i=0}^{n} \frac{i}{2^i} = \frac{0}{2^0} + \frac{1}{2^1} + \frac{2}{2^2} + ...$

Si nous voulons écrire un programme qui évalue une telle série, nous pouvons
bien sûr écrire une méthode telle que

```
double sum(int from, int to) {
    double sum = 0.0;
    for(int i = from; i <= to; i++) {
        sum += i/Math.pow(2.0,  i);
    }
    return sum;
}
```

Cette approche est possible, mais elle nécessite l'écriture d'une nouvelle
méthode pour chaque série. Elle n'est donc pas du tout générique.

Pourtant, chaque série peut être définie par un certain nombre de
caractéristiques :
- la fonction évaluée pour chaque terme de la série, dans le cas ci-dessus
  $\frac{i}{2^i}$.
- la manière de composer les différents termes de la série, dans le cas
  ci-dessus l'addition (pour parvenir à une somme $\sum$).
- la manière d'énumérer les termes de la série, dans le cas ci-dessus les
  valeurs entières de $from$ à $to$.

Des séries similaires à la série présentée ci-dessus sont donc :
- une autre **fonction** : par exemple, $\sum_{i=0}^{n} \frac{i^2}{2^i} = \frac{0^2}{2^0} + \frac{1^2}{2^1} + \frac{2^2}{2^2} + ...$
- une autre **combinaison** : par exemple, le produit $\prod_{i=1}^{n} \frac{i}  {2^i} = \frac{1}{2^1} * \frac{2}{2^2} * ...$
- une autre **énumération** des termes : par exemple, en sommant sur les
  $i$ pairs $\sum_{i=0,2,4,...}^{n} \frac{i}{2^i} = \frac  {0}{2^0} + \frac{2}{2^2} + \frac{4^2}{2^4} + ...$

Dans cet exercice, nous allons réaliser différentes versions de classes et
de méthodes permettant d'évaluer des séries de manière générique.

## Généralisation de la fonction

Dans la classe `PlayWithSeries`, la méthode `sum` réalise l'évaluation de
la série exposée ci-dessus. Nous souhaitons réaliser une évaluation des
sommes plus générique en permettant de modifier la fonction utilisée pour
évaluer chaque terme. Pour ce faire, la classe abstraite `Sum` est
définie comme suit :
- la méthode abstraite `function()` réalise la fonction utilisée pour la série.
  Cette méthode devra être redéfinie pour toute classe concrète héritant de
  `Sum`.
- la méthode `evaluate()` évalue la somme des termes de la série de
  `from` à `to`. C'est une méthode concrète de la classe.

Vous devez réaliser les points suivants :
- Réaliser la méthode `eveluate()` de la classe `Sum`.
- Réaliser une classe `Sum1` pour la fonction $\frac{i}{2^i}$.
- Réaliser une classe `Sum2` pour la fonction $\frac{i^2}{2^i}$.

Après avoir réalisé ces points, vous pouvez exécuter le programme
"PlayWithSeries". L'évaluation de la série $\sum_{i=0}^{n} \frac{i^2}{2^i}$
doit afficher le même résultat pour les appels `series(0, 20)` et `sa.evaluate(0, 20)`.

## Généralisation de la combinaison

Il est également possible de généraliser l'opération utilisée pour combiner
les différents termes, en réalisant par exemple la somme ou le produit des
termes, ou encore en choisissant la valeur maximale parmi les termes. Afin de spécifier
une telle généralisation, il est possible d'utiliser l'interface
```Java
public interface IFoldableOperation {
    double initialValue();
    double combine(double accumulated,
                   double newValue);
}
```
La méthode `initialValue()` retourne la valeur initiale à utiliser pour la
combinaison et la méthode `combine()` retourne la nouvelle valeur résultant
de la combinaison de la valeur précédente avec une nouvelle valeur.
Pour la somme, le produit et la valeur maximale, nous pouvons illustrer les combinaisons pour trois
termes sous la forme :

$sum: ((0 + v_1) + v_2) + v_3$

$product: ((1 * v_1) * v_2) * v_3$

$max: max(max(max(VerySmallConstant, v1), v2), v3))$

Vous devez définir les classes `SumOperation`, `ProductOperation` et
`MaxOperation` qui réalise chacune l'interface `IFoldableOperation` selon la
combinaison désirée.

Après avoir réalisé les classes ci-dessus, vous devez réaliser la classe
abstraite `Combination` de manière similaire à la classe `Sum`, mais en
généralisant l'opération utilisée dans la méthode `evaluate()`.

Vous pouvez tester votre réalisation dans la classe `PlayWithSeries`.
Vous devez réaliser la classe `Combination` à l'aide d'une classe anonyme,
plutôt qu'avec une classe concrète comme dans le cas de `Sum`. Veuillez
noter que cette réalisation n'est pas testée avec le programme de test.

## Généralisation de l'énumération
Dans les exemples vus jusque-là, les termes à combiner dépendent de valeurs
(de i) entières et consécutives. Ce principe peut également être généralisé
en utilisant l'interface `INumberSequence`
```Java
public interface INumberSequence {
    boolean hasMoreNumbers();
    double nextNumber();
}
```
Cette interface généralise l'idée d'une séquence de nombres. La méthode
`hasMoreNumbers()` retourne `true` tant qu'il existe encore un nombre dans
la séquence et la méthode `nextNumber()` retourne le prochain nombre dans
la séquence.

Vous devez réaliser les classes suivantes qui chacune réalise l'interface
`INumberSequence` :
- La classe `EvenIntegerSequence` permet d'énumérer les valeurs entières de
  `from`  à `to`, comme réalisé dans les exemples précédents, mais seulement
  pour les nombres pairs.
- La classe `ArrayNumberSequence` est construite à l'aide d'un tableau de
  valeurs `double` et permet d'énumérer sur tous les éléments du tableau.

Après avoir réalisé ces classes, vous devez réaliser la classe
abstraite `Enumeration` de manière similaire à la classe `Combination`, mais en
généralisant l'énumération utilisée dans la méthode `evaluate()`.

Vous pouvez tester votre réalisation dans la classe `PlayWithEnumerations`.
Vous devez réaliser la classe `Enumeration` à l'aide d'une classe anonyme
comme pour la classe `Combination`. Veuillez noter que cette réalisation
n'est pas testée avec le programme de test.

## Réalisation sans classe abstraite
Finalement, il est possible de réaliser tous les comportements souhaités
sans passer par une classe abstraite. Le concept de fonction peut être
généralisé avec l'interface :
```Java
public interface IFunction {
    double valueAt(double x);
}
```

En utilisant cette interface, réalisez une classe concrète `AnySeries` qui
généralise tous les concepts présentés. Vous pouvez tester votre réalisation
dans la classe `PlayWithSeries`.

#