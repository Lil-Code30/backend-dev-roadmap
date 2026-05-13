# Eviter les overflows dans `powerMod`

Lors du calcul de `C = M^e % n` ou de `M = C^d % n`, il est très facile de 
produire un overflow si aucune précaution n'est prise. Afin d'éviter un 
overflow, il est utile de considérer une propriété cruciale du modulo. 

## Propriété du modulo

Il existe une propriété cruciale du modulo :
```
(a*b) mod z = ((a mod z) * b) mod z
```
et une autre propriété importante :
```
(x^2y) mod z = (x^2 mod z)^y mod z
```

## Nouvelle réalisation de `powerMod`
Dans la classe `Main`, la méthode `powerMod()` utilise la première propriété.
Lancez le programme (la deuxième partie prend un certain temps pour calculer,
soyez donc patient), observez l'output et identifiez l'affirmation correcte 
ci-dessous.

#