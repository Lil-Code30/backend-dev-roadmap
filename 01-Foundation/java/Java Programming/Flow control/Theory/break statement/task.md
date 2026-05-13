# L'instruction `break`

Pour les boucles `for` et `while`, il est parfois utile de terminer une boucle 
avant de tester la condition de sortie. Cela est possible en ajoutant une 
instruction `break` dans les instructions de la boucle. L'instruction 
`break` est en principe positionnée à l'intérieur d'une instruction de sélection 
`if` ou `switch`, sans quoi la boucle ne sera jamais répétée.

## Imbrication
Lorsque plusieurs boucles sont imbriquées, une instruction `break` termine 
la boucle dans laquelle l'instruction est présente, mais elle ne termine pas 
l'éventuelle boucle extérieure.

# Exemple
Le programme Main.java démontre l'utilisation de l'instruction `break` dans 
une boucle `while` pour reproduire le même comportement que le programme 
utilisé dans le cas de la boucle `do ... while()` de la tâche précédente.