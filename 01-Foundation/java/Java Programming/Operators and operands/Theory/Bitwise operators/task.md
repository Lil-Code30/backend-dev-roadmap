# Les opérateurs _bitwise_

Les **opérateurs _bitwise_** sont utilisés pour manipuler les bits d'une 
expression représentant un nombre entier. Ils peuvent être utilisés avec les 
nombres entiers uniquement.

## Opérateurs logiques bit à bit 
- `&`, bitwise AND : retourne le bit à bit AND des opérandes.
- `|`, bitwise OR : retourne le bit à bit OR des opérandes.
- `^`, bitwise XOR : retourne le bit à bit XOR des opérandes.
- `~`, bitwise complément : opérateur unaire qui retourne le complément à un 
  de l'opérande (avec chaque bit inversé).

## Opérateurs de décalage

Ces opérateurs permettent de décaler les bits d'un nombre vers la gauche ou 
vers la droite, ce qui équivaut à une multiplication ou division par deux de 
l'opérande de gauche. La forme générale de l'opérateur de décalage est :

`number shift_operator shift`

Les opérateurs sont :

- `<<`, décalage à gauche : décale les bits de l'opérande vers la gauche et 
  ajoute des zéros à droite (équivaut à multiplier l'opérande par
  2^{shift}$).
- `>>`, décalage signé à droite : décale les bits de l'opérande vers la 
  droite et ajoute à gauche des copies du bit de signe (1 si l'opérande est négatif, 0 sinon). 
  Le bit de signe (leftmost) dépend du
  signe de l'opérande (équivaut à une division entière de l'opérande par 
  2^{shift}$ - pour les opérandes positives).
- `>>>`, décalage non signé à droite : décale les bits de l'opérande 
  vers la droite et ajouter des zéros à gauche. Le bit de signe 
  (leftmost) est mis à `0`

# Exercice
Vous devez compléter les parties manquantes du programme "Main.java" selon
les instructions.