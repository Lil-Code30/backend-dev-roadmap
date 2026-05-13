# Surcharge des méthodes

En Java, il est possible d'écrire plusieurs méthodes avec le même nom pour 
autant que la liste des paramètres soit différente. Ce mécanisme s'appelle la 
**surcharge** (overloading) de méthodes

---
> **&#9432;** Comme déjà évoqué, deux listes de paramètres sont différentes 
> si l'une ou l'autre condition est respectée :
> - Le nombre de paramètres est différent.
> - La liste des types (gauche à droite) est différente.
---

Par contre, avoir :
- un type de retour différent
- un nom des paramètres de la signature différent
- des modificateurs différents
- un nom de paramètre différent

ne permet pas de surcharger une méthode.

## Invocation de méthodes surchargées
C'est le compilateur qui choisit la méthode qui doit être appelée sur
la base des paramètres utilisés dans l'appel de la méthode.

# Exemple
La surcharge de méthodes est démontrée dans le programme "Main.java". 
Observez les méthodes commentées pour lesquelles la surcharge n'est pas 
possible.