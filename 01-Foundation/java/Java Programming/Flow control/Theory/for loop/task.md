# L'instruction `for`

Les boucles font partie des mécanismes communs à pratiquement tous les 
langages de programmation. Les boucles permettent de répéter un bloc 
d'instructions un certain nombre de fois, selon des critères dépendant du 
type de boucle.

Les boucles `for` permettent de répéter un bloc d'instructions selon la 
syntaxe :

```
for (initialization; condition; conclusion) {
  instructions
}
```

## Points importants
Il est utile de noter les points suivants :

- Les boucles `for` sont particulièrement utiles lorsque le nombre 
  d'itérations est connu ou peut être calculé facilement.
- Chaque partie de l'instruction `for` (c'est-à-dire `initialization`, 
  `condition` et `conclusion`) est optionnelle, mais les `;` sont 
  obligatoires. Il est ainsi possible d'écrire `for (;;)` qui correspond à 
  une boucle infinie (pas de condition de sortie).
- Une ou plusieurs variables d'un **même** type peuvent être déclarées dans la 
  partie `initialization`.
- La partie `conclusion` peut contenir plusieurs instructions séparées par `,
  `. Ces instructions sont exécutées à la fin de chaque itération, après 
  l'exécution des instructions du corps et avant la prochaine évaluation de l'expression `condition`.
- La partie `condition` doit être écrite comme une expression qui peut être 
  évaluée en valeur booléenne. 
- Les boucles peuvent être imbriquées, c'est-à-dire qu'une boucle peut être 
  écrite à l'intérieur d'une autre boucle. On parle dans ce cas souvent de 
  boucle intérieure et de boucle extérieure. Le niveau d'imbrications n'est 
  en soi pas limité.

# Exemple
Ces différentes caractéristiques sont illustrées dans le programme "Main.java".