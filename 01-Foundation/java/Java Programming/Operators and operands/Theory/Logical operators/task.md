# Les opérateurs logiques

Les **opérateurs logiques** effectuent des opérations logiques avec des 
opérandes de type `boolean` et retournent des résultats de type `boolean`.

- `&&`, AND logique conditionnel : retourne `true` si tous les opérandes 
  sont évalués à `true`. L'opérande de droite n'est évalué que si 
  l'opérande de gauche est évalué à `true` (_short circuit_)
- `&`, AND logique : retourne `true` si tous les opérandes
    sont évalués à `true`. Les deux opérandes sont évalués.
- `||`, OR logique conditionnel : retourne `true` si au moins un opérande  
  est évalué à `true`. L'opérande de droite n'est évalué que si
  l'opérande de gauche est évalué à `false`.
- `|`, OR logique : retourne `true` si au moins un opérande  
  est évalué à `true`. Les deux opérandes sont évalués.
- `!`, NOT logique : retourne `true` si l'opérande est évalué à `false`.
- `^`, XOR logique : retourne `true` si un et un seul des opérandes est 
  évalué à `true`.

Il est important de comprendre la différence entre 
les opérateurs logiques et logiques conditionnels, en ce qui concerne la 
notion de _short circuit_. 

# Exercice
Vous devez compléter les parties manquantes du programme "Main.java" selon
les instructions. Tenez compte d'éventuels _short circuits_.