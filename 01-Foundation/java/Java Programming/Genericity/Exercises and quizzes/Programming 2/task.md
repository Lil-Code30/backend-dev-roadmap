# Les paires génériques

Vous devez réaliser une classe générique `Pair` qui contient une paire 
d'objets de tout type. Les objets peuvent être vus comme une paire 
clé/valeur. La clé et la valeur peuvent être nulles.

Vous devez réaliser la classe pour que le code dans la méthode `main` 
compile et fonctionne correctement :
- la méthode `getKey()` doit retourner la clé.
- la méthode `getValue()` doit retourner la valeur.
- la méthode `equals` retourne `true` si la clé et la valeur des deux 
  paires sont identiques, `false` dans le cas contraire.
- la méthode `of` est une méthode `factory` qui permet de créer des paires. 
  Cette méthode n'est **pas** une méthode générique et elle doit être 
  définie deux fois (surcharges) avec les paramètres appropriés afin que le 
  code compile correctement. 

#