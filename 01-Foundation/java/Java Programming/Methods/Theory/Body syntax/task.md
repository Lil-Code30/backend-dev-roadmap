# Syntaxe du corps de la méthode

Pour rappel, une méthode est définie ainsi :
```
[ Modificateurs ] Type Nom( [ Liste des paramètres ] ) [ throws Exceptions ] {
  corps_de_la_méthode
}
```
Le corps de la méthode est donc constitué d'une séquence d'instructions qui se
trouve entre les accolades.

## Invocation d'une méthode et paramètres
Au moment d'une invocation d'une méthode avec des paramètres, il faut que
chaque paramètre passé à la méthode soit compatible avec le type indiqué
dans la signature de la méthode. Il faut également que le nombre de
paramètres corresponde au nombre de paramètres déclarés.

## Variables locales
Des variables locales peuvent être déclarées dans le corps de la méthode. Leur
portée est limitée au corps de la méthode. C'est-à-dire que ces variables
n'existent plus en mémoire une fois que l'exécution de la méthode
est terminée. Ces variables ne peuvent donc pas être utilisées en dehors
de la méthode.

## Paramètres et variables locales
Au moment de l'invocation de la méthode, une affectation est
effectuée entre les valeurs fournies à la méthode (paramètres effectifs) et
les variables présentes dans la liste des paramètres (paramètres formels).
Les valeurs des paramètres sont donc **copiées** et c'est pourquoi on dit
que les méthodes sont invoquées avec un **passage des paramètres par valeur**).

Les paramètres formels d'une méthode agissent donc comme des variables
locales dont la valeur initiale est celle des paramètres effectifs. Cette
notion sera reprise plus en détails lors du cours sur les tableaux.

## Valeur retournée
Lorsque le type est différent de `void`, le corps de la méthode doit contenir
une instruction `return` qui retourne une valeur compatible avec le type indiqué
dans la signature, comme illustré ci-dessous.
```
// Method without a return statement
void a() {
  System.out.println("Hello");
}

// Method with a return statement
int a() {
  float b = 0.0;
  return (int) b; // Casting to respect return type
}
```

# Exercice
Observez le code dans le programme "Main.java" et répondez à la question
posée. Soyez attentifs à la notion de copie de valeurs des paramètres.