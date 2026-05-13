# `extends` dans la généricité

Lorsque l'on souhaite indiquer qu'une classe générique doit être d'un certain 
type, on peut déclarer le paramètre générique comme étendant une 
classe donnée. La syntaxe utilisée dans ce cas est `<T extends type>`.

Si on souhaite par exemple définir une classe générique dont le type passé 
en paramètre à la classe doit être un `Polygon` ou une sous-classe de 
`Polygon`, on peut le faire ainsi :

```
public class ShapeBox<T extends Polygon> {
    private T shape;    // T is a Polygon or sub-class of Polygon
}
```

La formulation `<T extends type>` doit être comprise ici dans un sens général 
(`extends` ou `implements`) et doit être interprétée comme :
- La classe `type` ainsi que toutes ses sous-classes OU
- Toute classe qui implémente l'interface `type`.

En d'autres termes, cette syntaxe indique la **borne supérieure** du type 
accepté comme paramètre.

## Exemple
Plusieurs exemples d'utilisation de définition de borne supérieure sont 
donnés dans la classe `Main`. A la ligne 2, la classe `NumberBox` est 
définie : cette classe permet de définir une classe _container_ dont les 
éléments doivent être des instances de `Number` ou de sous-classes de `Number`.

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code du programme de l'exemple, identifiez les affirmations correctes 
ci-dessous.
