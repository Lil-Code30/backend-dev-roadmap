# Le type `boolean`

## Les valeurs possibles
La valeur d'une variable de type `boolean` peut être soit `true`, 
soit `false`.

## Les conversions
Une variable et une expression de type `boolean` ne peuvent être converties de
et vers **aucune** variable ou expression d'un autre type.

# Exemple
En appuyant sur _Run_, vous pouvez constater que le programme produit des 
erreurs. En tenant compte de ces remarques, corrigez le code selon les 
commentaires fournis.

<div class="hint">
  L'opérateur ternaire <code>?</code> est un opérateur 
conditionnel qui prend trois opérandes et agit comme un raccourci à 
<pre><code>if 
else</code></pre>
  Sa syntaxe est <pre><code>(condition) ? expressionTrue : expressionFalse</code></pre>
  Comme exemple, au lieu d'écrire
<pre><code> if (i < 10)
  j = 2;
else
  j = 3;
</code></pre>
  il est possible d'écrire simplement 
<pre><code>j = (i < 10) ? 2 : 3;</code></pre>
</div>
