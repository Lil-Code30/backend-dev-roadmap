# Stack trace

## Affichage lors d'une erreur non traitée
Lorsque l'exception n'est pas traitée par un bloc `try` / `catch`, elle est
propagée jusqu'à la méthode `main` qui est alors interrompue, faisant stopper
le programme.

Dans la console est affichée en rouge le nom de l'exception avec son message
d'erreur (première ligne), ainsi que l'état de la pile d'appel des méthodes.

La pile d'appels des méthodes consiste à la séquence dans l'ordre inverse des
appels qui ont conduit à l'interruption de l'application. Chaque ligne est
structurée de la manière suivante :
```
at Package.Class.Method(source_file:line_number)
```

Ainsi, en première ligne de la pile d'appels, nous retrouvons la méthode qui a
levé l'exception, et en dernière ligne, la méthode `main`.

## Accès à la pile d'appel depuis l'exception
La pile d'appel est également accessible programmatiquement en appelant la
méthode `getStackTrace` ou `printStackTrace` de la classe `Throwable` (et
qui est donc définie pour tout type d'exception). Il est ainsi possible
d'accéder à la pile d'appels pour l'inscrire dans un fichier diagnostic ou
pour tout autre traitement.

## Exemple
Exécutez le programme "Main.java" et observez l'erreur affichée dans la
console. Remarquez que vous pouvez cliquer sur `source_file:line_number` afin d'ouvrir
le fichier à ledit numéro de ligne.

# Exercice
Après avoir étudié les points présentés ci-dessus et analysé le programme 
"Main.java", répondez à la question ci-dessous.
