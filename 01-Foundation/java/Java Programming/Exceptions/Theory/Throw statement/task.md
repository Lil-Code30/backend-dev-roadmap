# Lever une exception

Les exceptions peuvent être générées par :
1. **Le système**, lors de l'exécution de certaines instructions (lignes 18 à
   26 que vous pouvez décommenter pour tester).
2. **L'instruction `throw`** (ligne 4) qui permet de générer explicitement une
   exception. Il est possible de donner en paramètre un message (`String`) qui
   décrit l'événement et qu'on retrouve en ligne de console lorsque
   l'exception est lancée et non traitée, comme illustré ci-dessous :
   ```
   Exception in thread "main" java.lang.IllegalArgumentException: x must be >= 0
      at Main.factorial(Main.java:6)
      at Main.main(Main.java:32)
   ```

## Annotation des méthodes
Les méthodes qui peuvent lancer une exception peuvent contenir le
mot-clé `throws` dans la signature, avec le type d'exception lancée :
```
public static long factorial(int x) throws IllegalArgumentException
```
Cette annonce est obligatoire pour les exceptions contrôlées, également
lorsque de telles exceptions peuvent "remonter" par propagation.

Une méthode peut également lancer plusieurs exceptions différentes et dans
ce cas les exceptions sont séparées dans la signature par une virgule :
```
public int f(int x) throws IllegalArgumentException, IllegalFormatException
```

## Annotation pour les exceptions non contrôlées
Comme vu dans la tâche précédente, il existe plusieurs familles d'exceptions,
qui se distinguent principalement entre les exceptions **contrôlées** et
**non-contrôlées**. L'annonce et le traitement des exceptions
non-contrôlées n'est pas obligatoire. Dans les exemples ci-dessus,
`IllegalArgumentException` et `IllegalFormatException` sont des exceptions
non-contrôlées et l'annotation ou le traitement des exceptions ne sont donc pas
obligatoires. 

## Exemple
Lancez le programme "Main.java" et observez le résultat.

# Exercice
Après avoir étudié les points présentés ci-dessus, répondez à la question
ci-dessous.
