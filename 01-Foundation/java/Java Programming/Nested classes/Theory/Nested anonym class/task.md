# Classe anonyme

## Définition
Une classe anonyme combine la déclaration et l'instanciation de la 
classe sous la forme d'une expression locale. Cela permet, dans certains cas,
de favoriser la compacité et la lisibilité du code source. 

Une classe anonyme est soit une sous-classe d'une classe parente existante, 
soit une classe qui implémente une interface existante (c'est donc une 
sous-classe d'`Object`).

## Syntaxe
La syntaxe d'une **sous-classe anonyme** est comme suit : 
```
new nom_classe_parente([liste_param]) { corps_sous_classe }
```

La syntaxe d'une **classe anonyme implémentant une interface** est comme suit :
```
new nom_interface() { corps_classe } 
```

## Constructeurs des classes anonymes
Comme les classes anonymes ne possèdent pas de nom, il n'est pas possible de 
définir explicitement des constructeurs. Seul le constructeur par défaut existe.

## Accès aux membres de la classe englobante
Le code d'une classe anonyme peut accéder à tous les membres (y compris aux 
membres privés) de la classe englobante. Il est aussi possible d'accéder aux 
variables locales et aux paramètres de méthodes qui se trouvent dans la 
portée pour autant qu'ils soient déclarés comme `final` ou qu'ils soient 
_implicitement_ `final`.

## Utilisation
Il est envisageable d'utiliser une classe anonyme lorsque :
- La classe possède un corps très court.
- Une seule instance de la classe est nécessaire.
- Le nom de la classe ne facilite pas la compréhension du code.

## Exemple
Dans cette tâche, l'utilisation de l'interface `FilenameFilter` est illustrée. 

Le but du programme est de filtrer les fichiers contenus dans un dossier 
selon un critère donné (dans cet exemple, il s'agit de ne conserver que les 
fichiers dont le nom se termine par ".java"). Ce mécanisme est réalisé grâce 
à la méthode [`list()`](https://docs.oracle.com/javase/7/docs/api/java/io/File.html#list(java.io.FilenameFilter)) 
de la classe `File`.

La méthode `list()` utilisée reçoit en paramètre une réalisation de l'interface 
`FilenameFilter`, qui fait partie du paquetage `java.io` et est définie 
comme suit :
```
public interface FilenameFilter {
/**
* Tests if a specified file should be included in a file list.
*
* @param   dir    the directory in which the file was found.
* @param   name   the name of the file.
* @return  {@code true} if and only if the name should be
* included in the file list; {@code false} otherwise.
*/
boolean accept(File dir, String name);
}
```
Dans cet exemple, l'interface `FilenameFilter` est réalisée sous les deux 
formes différentes :
- comme classe anonyme réalisant une interface (lignes 15-19).
- comme sous-classe anonyme d'une classe abstraite (lignes 31-35).

# Exercice
Après avoir étudié attentivement les informations ci-dessus et compris le
code du programme de l'exemple, identifiez les affirmations correctes ci-dessous.