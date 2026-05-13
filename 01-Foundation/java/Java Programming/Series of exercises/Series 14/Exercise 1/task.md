# Exercice 1 de la série 14

Écrire une classe `Date` qui respecte le principe d'encapsulation et
qui garantit la cohérence des données (en générant une exception si nécessaire). Supposer une année non bissextile (365 jours). 

Vos réalisations selon les instructions données ci-dessous doivent respecter
la spécification suivante : 
```Java
// Spécification
public class Date {              
  public Date(int day, int month) throws Exception;
  public int dayOfMonth();
  public int month();
}
```

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
- Vous **ne devez pas** utiliser la librairie standard Java pour gérer les dates.
- Vous devez écrire deux implémentations différentes de cette classe `Date`, 
sans rien changer dans la spécification ci-dessus :
- Le constructeur et les deux méthodes `public` doivent être définis selon
cette spécification dans les deux cas.
- Une variante doit définir et utiliser 2 attributs entiers (jour et mois).
- Une variante doit définir et utilser un seul attribut, de type entier (numéro du jour dans l'année [1..365]).
- Les classes doivent être placées dans deux packages distincts `s14.va` et 
  `s14.vb`.
- Dans le package `s14.demo`, créer ensuite deux classes `DateDemoA` et `DateDemoB`.
  Écrire dans chacune d'elles une méthode `main()` (avec un corps strictement 
  identique) qui teste la variante a) respectivement la variante b) de votre 
  classe `Date` en créant quelques dates et en affichant le résultat 
  retourné par les deux méthodes de cette classe.

### Importance de l'encapsulation
C'est un exercice important pour comprendre que la représentation
interne n'est pas forcément calquée sur la spécification. L'utilisateur 
de la classe n'a pas à connaître ce genre de choix d'implémentation; 
le fait que certaines données subissent des conversions n'aura pas d'influence 
sur la manière d'utiliser le composant. 

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Main.java" et visualiser l'output.

#