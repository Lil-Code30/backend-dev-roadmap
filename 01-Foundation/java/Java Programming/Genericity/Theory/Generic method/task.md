# Méthode générique

Dans une classe (générique ou non), il est possible d'écrire une **méthode 
générique** (statique ou non).

## Syntaxe
Syntaxiquement, le ou les types génériques `<..>` se placent dans la 
signature **après** les modificateurs et **avant** le type de retour.
```
modifier <T> type methodName(parameter list) { ... }
```

## Invocation d'une méthode générique
En général, le paramètre générique n'est pas nécessaire lors de l'invocation 
de la méthode, il est inféré par le contexte.

# Exemple
Observez la méthode `contains` de la classe générique `Box` ainsi que les 
appels effectués par la classe `Main`. Notez également les parties de code 
en commentaire, qui démontrent des invocations non valides de la méthode 
générique `contains`. 