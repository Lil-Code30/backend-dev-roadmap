# Conventions de codage

Les fichiers sources d'un programme sont destinés à deux types de lecteurs :
l'humain et la machine. Pour la machine, les deux lignes suivantes sont
équivalentes (dans le sens que le nom des identificateurs n'a pas 
d'importance pour la machine) :
```
a.b(c)
myFile.println(currentTime)
```
Ainsi, les conventions de codage ont pour but d'améliorer la lisibilité des
fichiers sources pour les humains, en respectant certaines règles qui ne
sont pas imposées par le langage.

Il existe des conventions plus ou moins contraignantes. Un certain nombre
de conventions générales (proposées par Sun) sont adoptées par la majorité
des développeurs Java. D'autres conventions (généralement plus
contraignantes) sont imposées dans le cadre de certains projets afin de
garantir une certaine homogénéité des codes sources indépendamment de leur
auteur.

Le respect des conventions permet de :
- Reconnaître plus rapidement la structure du code (on se retrouve en
  terrain connu).
- Identifier rapidement certaines entités par leur convention d'écriture
  (constantes, classes, méthodes, etc.).
- Écrire du code source qui peut être lu à plusieurs reprises et même parfois
  longtemps après son écriture.
#