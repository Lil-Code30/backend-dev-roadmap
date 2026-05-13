# Introduction aux méthodes

Dans l'exemple "Prime.java", les lignes 6 à 15 vérifient si le nombre fourni est 
premier ou non. Ensuite, les lignes 17 à 21 affichent le résultat en console.

Dans le cas où nous voudrions tester plusieurs nombres en une fois, nous 
devrions dupliquer ce code plusieurs fois. Dès lors, le programme peut
devenir très grand et peu clair. C'est là que les méthodes interviennent.

## Utilité des méthodes
Les méthodes permettent de :

- Subdiviser un problème en plusieurs sous-problèmes plus simples. Dans 
  l'exemple, il y a une séparation entre le calcul mathématique et l'affichage.
- Réutiliser des parties de code. Dans l'exemple, il est possible de calculer 
  plusieurs fois si un nombre est premier ou non sans répétition de code
  (lignes 25 à 27).
- Améliorer la lisibilité du code source. Si le nom de la méthode est bien 
  choisi, cela donne déjà des informations quant au traitement effectué.
- Favoriser l'abstraction et l'encapsulation. Cela consiste en la notion de 
  boîte noire. C'est-à-dire qu'un programmeur utilise la méthode sans se soucier 
  comment l'affichage et les calculs sont effectués.

L'objectif est d'avoir un programme concis et clair pour garantir sa fiabilité, 
ainsi que la rapidité de développement.

# Exemple
L'utilité des méthodes est démontrée dans le programme "Prime.java".