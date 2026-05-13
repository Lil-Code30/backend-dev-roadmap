# Utilisation des exceptions afin de traiter des erreurs attendues

L'objectif de ce programme est de pouvoir aller acheter des snacks à la 
station-service à trois dates différentes et de traiter les éventuelles 
exceptions.

- Le 10.10.2022, l'accès à la station-service est impossible pour cause de
  rénovation de la route attenante. Dès lors, un `IllegalAccessException` doit
  être levée pour ce jour-ci (méthode `goToShop()`).
- Le 11.10.2022, les étudiants se rendent compte qu'en réalité la station 
  service est en rénovation jusqu'au 12.10.2022. La méthode `buySnack` doit 
  lever un `UnsupportedOperationException`.
- Enfin, le 12.10.2022, il est possible d'acheter des snacks !

Dans tous les cas, le retour à l'école est effectué...

Avec ces informations, complétez le code ci-contre.

Pour comparer une date avec une autre, vous pouvez utiliser les méthodes 
`after()`, `before()` ou `equals()` comme illustré ci-dessous :
```
Date date1 = createDate(2022, 10, 10)
Date date2 = createDate(2022, 10, 11)
// True if same date, false otherwise
boolean res = date1.equals(date2);
// True if date1 is before date2, false otherwise
res = date1.before(date2);
// True if date1 is after date2, false otherwise
res = date1.after(date2);
```

#