# Exercice 7 de la série 3
Écrire un programme qui, à partir d’un numéro de jour (compris entre 1 et 7, où 1 représente lundi et 7 représente dimanche), affiche :

- "Working day" si le numéro correspond à un jour de semaine (lundi à vendredi).
- "Week-end" si le numéro correspond à un samedi ou un dimanche.
- "Invalid day number" si le numéro n’est pas compris entre 1 et 7.

Réalisez deux variantes du programme :

- (a) en utilisant une structure if.
- (b) en utilisant une structure switch.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
--- 

## Instructions :
- Écrire dans le fichier `MainVarA` la solution correspondante à la variante A.
- Écrire dans le fichier `MainVarB` la solution correspondante à la variante B.
- `n` est reçu comme paramètre à la méthode `main` et est converti en nombre `int`.
- Lorsque `n` reçoit comme valeur un jour de la semaine entre `1` et `5`, le programme doit afficher le résultat sous la forme suivante : `"Working day"` sur la console.
- Lorsque `n` reçoit comme valeur un jour de la semaine entre `6` et `7`, le programme doit afficher le résultat sous la forme suivante : `"Week-end"` sur la console.
- Lorsque `n` reçoit comme valeur un autre nombre que ceux cités ci-dessus, le programme doit afficher le résultat sous la forme suivante : `"Invalid day number [1..7]"` sur la console.

#