# Méthode utilisant des tableaux multi-dimensionnels

La méthode `countChar` reçoit en paramètre un caractère et un tableau 
bidimensionnel de `String`. La méthode retourne le nombre d'instances de 
`String` dans le tableau qui contiennent au moins une fois le caractère `c`.

Pour illustrer la méthode, un appel à `countChar` avec les paramètres `a` et 
`{{"salad", "soup"}, {"water", "coffee"}}` doit retourner le nombre `2`. En 
effet, `"salad"` et `"water"` contiennent au moins une fois le caractère `a`.

Vous devez réaliser la méthode `countChar`. La méthode doit bien sûr 
"traverser" le tableau bidimensionnel.

<div class="hint">
  La méthode <code>indexOf(char)</code> de la classe <code>String</code> 
retourne la position du premier caractère dans la chaîne de caractères, ou 
<code>-1</code> si le caractère n'est pas présent dans la chaîne de 
caractères. 
</div>

#