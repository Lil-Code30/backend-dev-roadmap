# Exercice 4 de la série 15

Écrire une classe `Clockwork` permettant de simuler le mécanisme de base
d'une horloge comportant trois aiguilles qui affichent les heures [0..11],
les minutes [0..59] et les secondes [0..59].

La classe implémentera au moins le constructeur et les méthodes suivantes :
```java
class Clockwork {
  public Clockwork(int h, int m, int s);
  public void stepSecond();
  public int getSeconds();
  public int getMinutes();
  public int getHours();
}
```

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

## Instructions :
Vous devez implémenter les méthodes et le constructeur nécessaires au bon
fonctionnement de l'horloge dans le fichier `Clockwork.java` fourni. Ces
méthodes sont listées dans l'extrait de code du dessus.

### Tester votre solution
Afin de tester votre solution (avant de la tester avec le bouton "Check"),
vous pouvez exécuter le programme "Clock.java". La classe Clock crée une
instance de Clockwork (avec l'heure courante) puis invoque, à chaque seconde,
la méthode stepSecond() et affiche le nouvel état de l'horloge.

Il est possible de passer une valeur entière comme paramètre lors
du lancement du programme "Clock.java". Cette valeur sera interprétée
comme un facteur d'accélération de l'horloge (avec 10, l'horloge
tournera dix fois plus vite).

#