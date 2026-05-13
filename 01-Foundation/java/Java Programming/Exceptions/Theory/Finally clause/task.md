# La clause `finally`

Une clause `finally` peut être ajoutée à une instruction `try`/`catch`.

Cette clause définit un bloc d'instruction qui est exécuté à la fin du 
`try`/`catch`, dans **tous les cas**, indépendamment du fait que des 
exceptions soient levées ou non.

- Si aucune exception n'est levée, le bloc `finally` est exécuté après le bloc
  `try`.
- Si une exception est levée et traitée par un `catch`, le bloc `finally` est 
  exécuté après ledit bloc `catch`.
- Si une exception est levée, mais non traitée par un `catch`, le bloc `finally`
  est exécuté avant la propagation de l'exception au niveau supérieur.

## Utilité du bloc `finally`
En général, un bloc `finally` est utilisé pour effectuer des opérations de 
conclusion qui doivent être effectuées dans tous les cas de figure : 
fermeture de fichiers, de connexion réseau, de base de données, etc. Ce bloc 
permet donc d'éviter de devoir placer ces instructions de conclusion dans le 
bloc `try` et dans tous les blocs `catch`. Ce bloc permet également de 
s'assurer que certaines instructions seront exécutées, même dans le cas où 
une exception n'est pas traitée.

## Présence d'un bloc `catch` ou `finally`
Un bloc `try` doit obligatoirement être accompagné d'au moins un bloc `catch`,
d'un bloc `finally`, ou des deux.

# Exemple
Lancez le programme ci-contre, une fois avec -1 comme paramètre de la 
méthode `factorial()` et une fois avec un nombre positif. Examinez les 
résultats obtenus.
