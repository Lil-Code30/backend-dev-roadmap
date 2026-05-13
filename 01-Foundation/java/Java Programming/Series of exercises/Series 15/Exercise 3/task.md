# Exercice 3 de la série 15

Écrire le code d'une classe `Measure` qui permet d'enregistrer des résultats de mesures (nombres à
virgule) comportant une marge d'erreur symétrique autour d'une valeur
mesurée. Exemple : 25.4 \[+/- 0.7\] signifie que la valeur mesurée moyenne
est 25.4 avec des valeurs pouvant aller de 24.7 à 26.1.

On souhaite pouvoir :
- créer une mesure avec sa valeur mesurée et sa marge d'erreur.
- connaître la valeur maximale d'une mesure (valeur mesurée + erreur maximale).
- afficher une mesure sous la forme `123.456 [+/‐ 6.789]`.
- modifier la marge d'erreur d'une mesure en la multipliant par un facteur `k`.
- effectuer la somme de deux objets de type `Measure`.
- tester si une valeur réelle v est comprise dans le domaine des valeurs possibles d'une mesure
  (en tenant compte de la marge d'erreur).

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Dans un premier temps, prenez le temps de déterminer les champs de cette
classe, définir un ou plusieurs constructeurs, déterminer ensuite les
en-têtes des méthodes. Il s'agit d'une partie importante qui ne peut pas
être testée avec des tests unitaires.

Puis, implémenter votre solution selon l'interface suivante :
- La classe `Measure` doit comporter un constructeur prenant une valeur et
  une tolérance (`new Measure(v, t)`).
- La valeur minimale doit être accessible avec l'appel `m.min()`.
- La valeur maximale doit être accessible avec l'appel `m.max()`.
- La mesure peut être convertie en String grâce à la surcharge de la méthode
  `m.toString()`.
- La marge d'erreur d'une mesure peut être modifiée avec l'appel `m.
  scaleTolerance(3)`.
- Deux mesures peuvent être additionnées avec l'appel `m.add(other)`.
- Il est possible de vérifier si une valeur réelle `v` est comprise
  dans le domaine des valeurs possibles avec l'appel `m.contains(v)`.

Après avoir réalisé la classe, créez quelques objets de type `Measure` dans
la fonction `main()` de la classe `Main` et appelez les différentes méthodes
disponibles pour en vérifier le fonctionnement.

Finalement, valider le comportement de votre classe `Measure` en lançant les
tests grâce au bouton "Check".

#