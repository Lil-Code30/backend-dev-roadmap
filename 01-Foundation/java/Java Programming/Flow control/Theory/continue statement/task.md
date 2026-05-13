# L'instruction `continue`

Pour les boucles `for` et `while`, il est également utile parfois de terminer 
une itération à un certain point et de poursuivre avec la prochaine itération.
Cela est possible en ajoutant une instruction `continue` dans les 
instructions de la boucle. L'instruction `continue` est en principe 
positionnée à l'intérieur d'une instruction de sélection `if` ou
`switch`, sans quoi l'itération courante sera toujours interrompue au moment du `continue`.

## Imbrication
Lorsque plusieurs boucles sont imbriquées, une instruction `continue` termine
l'itération de la boucle dans laquelle l'instruction est présente, mais elle 
n'influence pas l'exécution de l'éventuelle boucle extérieure.

## `continue` dans une boucle `for`
Lorsque l'instruction `continue` est utilisée dans une boucle `for`, il est 
important de noter que les instructions de la conclusion sont tout de même 
exécutées, avant de poursuivre avec la prochaine itération.

# Exemple
Le programme "Main.java" démontre l'utilisation de l'instruction `continue` 
dans une boucle `for`. Il est important de noter que si l'instruction `++i` 
de la conclusion n'était pas exécutée avant de poursuivre avec la prochaine 
itération, la boucle serait alors une boucle infinie.