# Modificateur d'accès `private`

Si, dans une classe `A`, on déclare un attribut `k` de type `A` ou si une
méthode de la classe `A` reçoit en paramètre un objet `k` de type `A`, alors
les membres privés de l'objet `k` sont accessibles à l'intérieur de la
classe `A`.

Autrement dit, dans une classe A, on peut accéder aux membres privés de tous
les objets de type A (pas seulement ceux de `this`).

## Exemple : les classes `Car` et `Engine`
Observez les accès possibles dans les classes `Car` et `Engine`. Leurs
attributs sont désormais à `private`. Découvrez ce qui est possible ou non
et identifiez les affirmations correctes parmi les propositions suivantes.

#