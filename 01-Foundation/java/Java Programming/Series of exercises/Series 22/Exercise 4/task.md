# Exercice 4 de la série 22

Dans la librairie Java.io, Java définit l'interface `FilenameFilter` afin de 
pouvoir filtrer les fichiers d'un répertoire qui portent un nom donné : 

```Java
package java.io;
@FunctionalInterface
public interface FilenameFilter {
    /* Parameters:
       dir - the directory in which the file was found.
       name - the name of the file.
       Returns:
       true if and only if the name should be included in the file list. */
    boolean accept(File dir, String name);
}
```
Cette interface est utilisée dans la classe `File` de la façon suivante :
```Java
package java.io;
public class File {
...
   public File(String pathname);
   /* Returns an array of strings naming the
      files and directories in the directory
      denoted by this abstract pathname. */
   public String[] list();
   /* The behavior of this method is the same
      as that of the list() method, except that
      the strings in the returned array must
      satisfy the filter. */
   public String[] list(FilenameFilter filter);
```

Dans ce programme, nous souhaitons démontrer l'utilisation de ces concepts.

---
**&#9432;**
Afin de tester votre solution correctement, suivez attentivement les
instructions données ci-dessous.
---

Dans la méthode `main()` de la classe `ch.heiafr.Task`, illustrez l'utilisation de ces 
composants, en affichant tous les fichiers images (fichiers avec l'extension 
.jpg, .gif ou .png) trouvés dans le répertoire courant de l'exercice. Pour 
le filtre, vous êtes libres de coder une classe anonyme, une expression 
lambda, ou une classe concrète. 

#