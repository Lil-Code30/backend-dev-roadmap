# Paquetages

## Définition

Un paquetage (_package_) est une collection nommée de classes et/ou
d'interfaces. Un paquetage peut comprendre des sous-paquetages.

Les paquetages permettent de grouper des classes apparentées et de définir
un **espace de désignation** pour les classes qu'il contient. Ils servent
également à gérer les droits d'accès (visibilité) des classes les unes par
rapport aux autres.

Les paquetages sont organisés de manière hiérarchique (structure
arborescente). Le point `.` est utilisé comme séparateur entre les
différents niveaux hiérarchiques dans le nom du paquetage. Dans l'exemple
`java.lang.String`, la classe `String` se trouve dans le sous-paquetage
`lang` du paquetage `java`.

## Déclaration d'un paquetage

Le mot clé `package` est utilisé pour indiquer le paquetage auquel
appartiennent la ou les classes de l'unité de compilation.
```
package nom_du_paquetage;
```
Si cette instruction est utilisée, elle doit être la première du fichier ".java"
(hormis les commentaires).

Les noms des paquetages sont habituellement écrits en utilisant uniquement
des minuscules. Pour faciliter l'échange de code Java (bibliothèques publiques),
il est utile d'avoir un espace de désignation univoque (pour éviter les
conflits dans les noms de classes). C'est pour cela qu'il est recommandé de
créer l'arborescence des paquetages en utilisant comme racine, les noms de
domaines internet (en inversant les éléments de l'URL, et en respectant la
syntaxe des identificateurs Java). Par exemple, le nom de domaine _heia-fr.
ch_ devient `ch.heiafr` comme racine de paquetage.

## Exemple : les classes `Engine` et `Car`
Dans cette tâche, les classes `Engine` et `Car` sont définies comme faisant
partie du paquetage `ch.heiafr.tic`. Le nom complet de chaque classe est donc
`ch.heiafr.tic.Engine` et `ch.heiafr.tic.Car`.

## Absence de l'instruction `package`
Si aucune instruction `package` n'apparaît dans un fichier source
(déconseillé), les classes définies dans l'unité de compilation sont
attribuées à un **paquetage par défaut** (qui est anonyme).

## Importation de paquetages
Par défaut, une classe d'un paquetage `p` peut faire référence à toute autre
classe du paquetage `p` par le nom de la classe uniquement. C'est ainsi que la
classe `Car` peut utiliser la classe `Engine`.

Pour référencer une classe d'un paquetage différent de celui dans lequel on
se trouve, il faut utiliser le nom complet, c'est-à-dire le nom du paquetage
suivi du nom de la classe, comme aux lignes 11 et 12 de la classe `Main`.

Afin d'alléger l'écriture, on peut importer les classes d'un paquetage
externe en utilisant l'instruction `import`, comme aux lignes 2 et 3 de la
classe `Main`. Cette instruction rend les classes externes accessibles par
leur nom de classe uniquement, comme aux lignes 14 et 15 de la classe `Main`.

Il existe deux formes :
```
import ch.heiafr.tic.Car; // Importation d'une classe individuelle
import ch.heiafr.tic.*; // Importation de toutes les classes du paquetage
```

L'instruction `import` doit être placée au début de l'unité de compilation,
juste après l'instruction `package` (s'il y en a une). Elle peut être
répétée à volonté pour importer plusieurs classes et/ou paquetages.

L'importation d'un paquetage entier (`... .*`) ne rend pas visible le
contenu des éventuels sous-paquetages et ceux-ci doivent être importés
explicitement.

En cas de conflit (importation de paquetages contenant des classes portant
le même nom), le compilateur impose l'utilisation du nom complet pour
accéder aux classes.

Le paquetage `java.lang` est considéré comme fondamental. Il est
implicitement importé et on peut utiliser ses classes par leurs noms simples
(exemples : String, Math, System, ...).

# Exercice
Après avoir étudié les points présentés ci-dessus, 
identifiez l'affirmation correcte parmi les propositions suivantes.