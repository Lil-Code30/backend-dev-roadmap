# Les valeurs littérales pour les entiers

Les valeurs littérales pour les types entiers doivent être comprises dans la
plage de valeurs du type de l'expression évaluée, par exemple [-128, 127] pour
une expression évaluée en `byte`.

Une valeur littérale de type `long` contient le suffixe `L`, 
par exemple `1234L` plutôt que `1234`. Si une valeur littérale de type `int` 
(sans le suffixe `L`) est affectée à une variable de type `long`, alors une 
conversion implicite sera utilisée, par exemple l'expression `long l = 1234` 
devient effectivement `long l = (long) 1234`.

# Exemple
Dans le code donné en exemple, modifiez une valeur littérale de sorte
qu'elle ne soit plus dans la plage autorisée pour le type donné (par exemple,
modifiez `32767` en `32768` et observez l'erreur produite par le compilateur).