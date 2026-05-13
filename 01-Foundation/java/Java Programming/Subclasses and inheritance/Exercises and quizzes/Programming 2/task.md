# Héritage et relations entre classes

Dans cet exercice, nous modélisons des immeubles, maisons et pièces.

Concernant les pièces :
- `Room` représente une pièce, avec un certain nombre de fenêtres. 
- `Bathroom` et `Bedroom` sont des pièces.
- `Bedroom` a une aire.
- `Bathroom` possède une baignoire (`true`) ou non (`false`)

Concernant les immeubles et les maisons :
- `Building` représente un immeuble.
- `House` représente une maison et est un immeuble.
- `Building` a un prix et une liste de pièces.
- `House` a un prix de location

Les classes doivent être complétées de sorte que la classe `Main` peut être
compilée et lancée.

#