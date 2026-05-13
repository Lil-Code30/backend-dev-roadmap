# Interface

## Définition

L'**interface** définit une sorte de **contrat** que les classes qui 
l'implémentent doivent respecter. Elle constitue essentiellement une 
spécification qui laisse de côté les détails de l'implémentation. 

## Déclaration

La définition d'une interface est proche de celle d'une classe abstraite 
puisqu'il suffit de remplacer `abstract class` par `interface` (cf. 
l'interface `AbleToCompare`).

Le corps d'une interface peut contenir : 
- Des constantes. Les modificateurs `public`, `static` et `final` ne sont 
  pas nécessaires, car ils sont implicites.
- Des méthodes abstraites qui sont obligatoirement publiques. Les 
  modificateurs `abstract` et `public`ne sont pas nécessaires, car ils sont 
  implicites.
- Des méthodes avec une implémentation par défaut. Le modificateur `default` 
  doit être utilisé.
- Des méthodes statiques.

Par contre, une interface ne contient pas :
- D'attributs d'instance.
- De constructeur.

## Utilisation

Une fois l'interface déclarée, il est possible de déclarer des variables de 
ce type (cf. la classe `Main`, ligne 13). Il n'est bien sûr pas possible de 
créer des instances d'interface avec un `new`, mais seulement de classes qui 
réalisent l'interface.

En Java, une classe ne peut hériter que d'une seule classe parente (héritage 
simple). Par contre, une classe peut implémenter une ou plusieurs interfaces 
en utilisant la syntaxe suivante :
```
implements interface1, interface2, ...
```
L'implémentation d'une ou plusieurs interfaces peut être combinée avec 
l'héritage simple. La clause `implements` doit suivre la clause `extends`.
Voici quelques exemples :
```
public class Report implements Printable { ... }
public class Book implements Printable, Zoomable { ... }
public class Circle extends Shape implements Printable { ... }
public class Square extends Rectangle implements Printable, Zoomable { ... }
```

Lorsqu'une classe implémente une interface, elle indique qu'elle s'engage à 
fournir une implémentation pour chacune des méthodes abstraites de cette 
interface. Dans le cas contraire, elle doit être elle-même déclarée 
`abstract`. Les méthodes qui sont déclarées avec une implémentation par 
défaut `default` peuvent être redéfinies ou non dans les classes qui 
implémentent l'interface.

## Exemple

L'exemple fourni comprend une interface `AbleToCompare` qui possède deux 
méthodes abstraites appelées `isSmallerThan()` and `isBiggerThan()`. Elle 
possède également une méthode par défaut `isEquals()`. La classe `Person` 
implémente `AbleToCompare` et redéfinit ainsi les méthodes abstraites pour 
comparer les instances de `Person` par rapport à leur âge. Ainsi, dans notre 
cas, deux personnes sont considérées égales si leur âge est le même. Bien 
entendu, cette méthode pourrait être redéfinie si nécessaire.

À noter que dans un cas plus pratique, une telle interface n'est pas 
nécessaire, car il existe déjà l'interface générique `java.lang.
Comparable<T>`. De plus, la méthode de tri peut être remplacée par celle 
prédéfinie `java.util.Arrays.sort()`.

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code de l'interface `AbleToCompare` et de la classe `Person`, identifiez 
les affirmations correctes ci-dessous.
