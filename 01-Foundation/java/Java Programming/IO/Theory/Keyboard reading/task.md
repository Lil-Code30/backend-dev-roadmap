# Entrées/sorties standard (console)

Les flux suivants sont prédéfinis dans la classe `System` et sont toujours 
ouverts (on ne les ferme donc pas) :
- **System.in** : Lecture depuis le clavier.
- **System.out** : Affichage à l'écran.
- **System.err** : Affichage des erreurs (souvent identique à _out_ par défaut).

# Lecture au clavier
La manière la plus pratique pour lire au clavier est d'utiliser la classe 
`Scanner`. Dès lors, il utilise `System.in` pour être capable de lire au 
clavier.

Ce programme affiche les nombres indiqués par l'utilisateur et quitte 
lorsque 'x' est entré (en mode System.err ; ainsi l'affichage est rouge).

Notez que l'import du package `import java.util.Scanner` est nécessaire pour 
utiliser la classe `Scanner`.