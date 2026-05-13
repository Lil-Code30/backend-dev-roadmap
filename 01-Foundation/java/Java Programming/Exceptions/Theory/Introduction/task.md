# Introduction aux exceptions

Lorsque le programme "Main.java" est lancé, un message d'erreur s'affiche
dans la console (lignes rouges) :
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
Index 3 out of bounds for length 3
  at Main.main(Main.java:4)
```
Cela indique qu'une exception a été levée et propagée. Vous pouvez
expérimenter ce comportement en exécutant ("Run") le programme (clic droit
sur le fichier "Main.java" → Run).

Les exceptions sont le sujet de ce cours.

## Définition des exceptions

Les **exceptions** représentent des événements qui peuvent survenir durant
l'exécution du programme et qui rompent le flux normal des exécutions.

Elles sont utilisées pour représenter des erreurs de différents types :
- **Erreurs matérielles** : crash du disque, ...
- **Erreurs de programmation** : indice d'un tableau hors limites, ...
- **Erreurs liées à l'environnement d'exécution** : mémoire insuffisante, ...
- **Erreurs spécifiques à une librairie** : matrice singulière, ...
- **Erreurs spécifiques à une application** : no d'article non-défini, ...

Les exceptions ne servent pas uniquement à représenter des erreurs, mais
aussi des situations exceptionnelles qui sont prévues et qui doivent être
traitées de manière différente du flux normal des opérations, par exemple la
fin d'un fichier, un mot de passe incorrect, etc.

## Avantages des exceptions

Le traitement des erreurs par les exceptions présente un certain nombre
d'avantages :

- **Lisibilité** : Augmentation de la lisibilité du code en séparant les cas
  normaux des traitements des erreurs et des événements exceptionnels.
- **Déclaration explicite** : Les méthodes indiquent dans leur signature les
  exceptions qu'elles peuvent potentiellement lever.
- **Traitement des cas exceptionnels** : Le programmeur doit prévoir un
  traitement des cas exceptionnels lorsqu'il appelle des méthodes pouvant lever
  des exceptions.
- **Hiérarchie** : Il est possible de traiter différentes exceptions de manière
  différente selon s'il s'agit d'une exception très spécifique ou générale.
- **Propagation automatique** : Le programmeur choisit à quel niveau (moment)
  il souhaite traiter l'exception.

# Exercice
Répondez à la question posée ci-dessous.
