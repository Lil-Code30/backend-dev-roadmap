# Exercice 4 de la série 6

Écrire une méthode `findValidPairs` qui prend un entier `p` en paramètre et
affiche toutes les **paires d'entiers strictement positifs** `(a, b)` respectant
une condition mathématique spécifique.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Le programme devra prendre en entrée une valeur **p** et déterminer **toutes les paires** telles que :

1. `a` et `b` sont **strictement positifs**.
2. `a` et `b` sont **inférieurs à** `p`.
3. `a` est **strictement inférieur à** `b`, afin d’éviter les doublons.
4. L’expression suivante doit être **divisible** par le produit `a × b`.


---

<div class="hint">
Un nombre <b>x</b> est divisible par <b>y</b> si <b>x % y == 0</b><br>
</div>

<div class="hint">
    <b> Vérifiez votre implémentation</b>
    <ul>
        <li>La méthode doit s'appeler <code>findValidPairs()</code>.</li>
        <li>Elle doit prendre un seul paramètre : un entier <code>p</code>.</li>
        <li>Elle ne retourne rien, mais <strong>affiche</strong> toutes les paires trouvées.</li>
    </ul>
</div>

<div class="hint">
    <b>️ Si les tests échouent :</b>
    <ul>
        <li>Assurez-vous que la signature de votre méthode est correcte : <code>public static void findValidPairs(int p)</code>.</li>
        <li>Vérifiez bien que l’expression mathématique est respectée.</li>
    </ul>
</div>

#