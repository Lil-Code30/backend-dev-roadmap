# L'instruction `switch`

L'instruction `switch` permet de sélectionner des blocs d'instructions 
devant être exécutés selon différentes valeurs d'une expression.

# Exemple
Un exemple démontrant les caractéristiques du `switch` est donné dans le 
programme de cette tâche. Vous pouvez exécuter ce programme en modifiant les 
valeurs de `x` (parmi les valeurs `2`, `97`, `3`, `4`, `5` ou autre valeur).

## Points importants

Cet exemple illustre les caractéristiques suivantes :

- Les constantes utilisées dans les `case` doivent être du même type que 
  l'expression dans `switch (expression)`. Par exemple, si `expression` est 
  évaluée comme un `byte`, alors les constantes utilisées dans les `case` 
  doivent être des valeurs littérales de type `byte`.
- Il est possible de définir plusieurs `case` pour un même bloc d'instructions.
- Chaque constante utilisée dans un `case` ne peut être utilisée qu'une 
  seule fois dans un même `switch`.
- Il est possible de tester uniquement des égalités avec une instruction 
  `switch`. L'utilisation d'instructions `if (cond)` est en principe 
  nécessaire pour tester des inégalités.
- L'utilisation de l'instruction `break` à la fin de chaque `case` est la 
  règle et seule une raison clairement documentée devrait permettre de ne 
  pas le faire.