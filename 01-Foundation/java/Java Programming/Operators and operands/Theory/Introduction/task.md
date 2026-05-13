# Les opérateurs et opérandes en Java

En Java, comme dans tout langage de programmation, les opérateurs 
constituent le bloc de base permettant de construire des instructions et des
programmes. Un opérateur reçoit en entrée des opérandes et produit un 
résultat. Le type du résultat dépend à la fois du type des opérandes et de 
la fonctionnalité de l'opérateur lui-même.

## Les différentes familles d'opérateurs
Les opérateurs peuvent être classifiés selon la fonctionnalité fournie :

- Opérateurs arithmétiques
- Opérateurs logiques
- Opérateurs relationnels
- Opérateurs bit à bit
- Autres opérateurs

Les opérateurs se distinguent également par le nombre d'opérandes qu'ils 
reçoivent. Ils peuvent être **unaires** (un opérande), **binaire** (deux) 
ou **ternaires** (trois).

Les opérateurs les plus importants sont présentés dans les tâches suivantes.

## Précédence et associativé
La **précédence** des opérateurs définit l'ordre dans lequel une expression est
évaluée. Lorsqu'une expression comprend plusieurs opérateurs, chaque partie
de l'expression est alors évaluée dans une certain ordre. Cet ordre dépend
de la précédence des opérateurs utilisés : les opérateurs avec plus forte
précédence sont évalués en premier.

L'associativé d'un opérateur peut être de gauche ou de droite. Elle définit 
quel opérande est évalué en premier. La majorité des opérateurs ont une 
associativité gauche, ce qui signifie que l'opérande de gauche est évalué en 
premier.  

---
> **&#9432;** Il est important de distinguer les notions d'**expression** 
> et d'**instruction**. Un programme est constitué d'une suite 
> d'instructions et une instruction peut contenir une ou plusieurs 
> expressions. Une expression seule ne constitue pas une instruction, par ex.
> `a + 5` n'est pas une instruction, alors que `b = a + 5` est une instruction.
---

#