# Syntaxe de la signature d'une méthode

Il est important de comprendre la syntaxe d'une signature dont la forme 
générale est :
```
[ Modificateurs ] Type Nom( [ Liste des paramètres ] ) [ throws Exceptions ]
```

Dans cette syntaxe, les mots indiqués entre crochets sont optionnels. 

Une signature est donc composée de :
- [ Modificateurs ] : Des mots-clés qui définissent certaines propriétés 
  de la méthode (par exemple la visibilité de la méthode) comme 
  `public`, `private`, `protected`, `final`, `static`, `abstract`, etc. Ces 
  mots-clés sont séparés par des espaces.

- Type : Indique le type de l'objet retourné par la méthode. Le mot clé `void` 
  (vide) est utilisé lorsque la méthode ne retourne pas de valeur.

- Nom : Le nom de la méthode, utilisé pour l'invoquer.

- [ Liste des paramètres ] : Il s'agit de valeurs fournies à la méthode lors 
  de son invocation et qui peuvent être utilisées dans son corps. Lorsque 
  aucun paramètre n'est donné, les parenthèses sont laissées vides. Les 
  paramètres sont séparés par des virgules.

- [ Exceptions ] : Listes des types d'exceptions pouvant être lancées par la 
  méthode. Le mot-clé `throws` est utilisé. Si plusieurs types d'exceptions 
  peuvent être lancés, ils sont alors séparés par des virgules.

---
> **&#9432;** Dans une même classe, une méthode avec un **nom** et une 
> **liste de paramètres** donnés ne peut exister qu'une **seule** fois. Cela 
> signifie qu'il n'est pas possible de définir dans une même classe deux 
> méthodes qui portent le même nom avec la même liste de paramètres, même si 
> elles ont des modificateurs, un type de retour ou des exceptions différents.
> 
> Dans ce contexte, une liste de paramètres est définie par le nombre de 
> paramètres et par la liste ordonnée des types des paramètres. Deux listes 
> de paramètres sont donc différentes si elles ne contiennent pas le même 
> nombre de paramètres ou si la liste ordonnée des types des paramètres est 
> différente.
---

# Exemple 
Différents exemples illustrant des signatures possibles sont donnés dans le 
programme "Main.java"