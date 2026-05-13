# Unité de compilation

Un programme Java est généralement constitué d'un **ensemble de classes**.

Le code source de chaque classe **publique** doit être enregistré dans un 
fichier séparé portant le nom de la classe avec l'extension `.java`. Un tel 
fichier constitue une **unité de compilation**.

Le résultat de la compilation (_Bytecode_) est enregistré dans un fichier 
portant le nom de la classe avec l'extension `.class`.

## Exemple : la classe `Point`
Pour cette tâche, vous retrouvez la classe `Point` du précédent cours. Elle est 
déclarée dans un fichier `Point.java` et forme donc une unité de compilation.

Si vous lancez le programme, le processus débute par une phase de 
`build` où le fichier `.class` est généré à partir des fichiers `.java`. 
Recherchez ces fichiers `.class` depuis votre explorateur de fichiers. 

Veuillez noter qu'il est possible de "drag-and-drop" les fichiers `.class` 
dans IntelliJ Idea pour être capable de lire le _bytecode_. Le fichier est 
alors _décompilé_ et vous pouvez en principe lire le code source 
correspondant à la classe.

# Exercice
Après avoir étudié les points présentés ci-dessus, exécutez le
programme "Main.java" (clic droit → Run "Main.main()") et répondez à la
question ci-dessous.
