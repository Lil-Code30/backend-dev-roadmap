# Programmation orientée objet et encapsulation

Durant le cours précédent, nous avons utilisé une classe `Car` et `Engine` 
avec des attributs publics. Nous avions également une méthode `changeMotor` 
qui était écrite ainsi :
```
public void changeEngine(Engine e) {
    this.engine = e;
}
```
Est-ce que cela vous rappelle quelque chose ? 
- Est-il similaire à un getter ?
- Est-il similaire à un setter ?
- Est-il similaire à un constructeur ?
- Aucune des réponses ci-dessus est correcte, il s'agit d'une méthode à part
  entière.

Est-ce que cette méthode est nécessaire ?

De plus, nous avions une méthode `newCarFromFactory` qui était écrite ainsi :
```
public Car newCarFromFactory(int y) {
  return new Car(y, new Engine(engine.type, engine.power));
}
```
Est-ce que cela vous rappelle quelque chose ?
- Il est similaire à un getter ?
- Il est similaire à un setter ?
- Il est similaire à un constructeur ?
- Aucune des réponses ci-dessus est correcte, il s'agit d'une méthode à part 
  entière.

Est-ce que cette méthode est nécessaire ?

En fonction des réponses précédentes, réécrivez les classes `Car` et `Engine` de 
sorte à ce qu'elles respectent au mieux l'esprit orienté objet.

#