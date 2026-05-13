# Calcul de salaire net revisité

Le programme "Main.java" a l'objectif de pouvoir calculer le salaire net à 
partir de différents taux (20%, 40%, 60%, 80%, 100%).

Par rapport au code de la tâche précédente, une boucle `for` est 
rajoutée dans la méthode `main`, ainsi que trois méthodes afin de subdiviser 
le problème :
- la méthode `roundTo5cents` permet d'arrondir une valeur aux 5 
centimes.
- La méthode `computeDeductions` calcule le total des déductions d'après 
le salaire brut fourni. 
- Enfin, la méthode `displaySalaryInfo` permet d'afficher 
les résultats obtenus.

Néanmoins, certaines parties du code sont manquantes et doivent être complétées.

Pour rappel, le programme doit respecter les contraintes suivantes :
- Le salaire brut au taux de travail choisi arrondi aux 5 centimes.
- Toutes les déductions arrondies aux 5 centimes. Dès lors, la somme des 
  déductions est de facto arrondie aux 5 centimes.
- Le salaire net est le salaire brut - les déductions.

Voici quelques informations additionnelles :
- Lorsque le nom et les paramètres des méthodes utilisent des noms clairs, il 
  n'est pas nécessaire d'ajouter des commentaires. Néanmoins, parfois il y a un 
  besoin de précision. Par exemple, les commentaires permettent de savoir si la 
  valeur de retour est déjà arrondie aux 5 centimes, ou si le paramètre attendu 
  doit être arrondi. Dans IntelliJ, il est facile d'ajouter des commentaires. 
  Il suffit d'avoir le curseur de la souris au-dessus de la signature et 
  d'écrire "/**" puis "enter" pour générer le template du commentaire. Ces 
  commentaires accompagnés de la signature forment **la spécification** de la 
  méthode. Un programmeur n'a besoin que de la spécification pour utiliser à 
  bon escient la méthode qui devient dès lors une boîte noire.
- Pour la méthode `roundTo5Cents`, il est possible d'utiliser la méthode 
  `Math.round()` native à Java. On retrouve [sa spécification](https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#round(double))
  sur le site d'Oracle. Remarquez qu'aucune information n'est donnée quant à 
  l'implémentation.

<div class="hint">
Il est possible d'arrondir aux 5 centimes avec un simple calcul qui consiste à 
<br>
1) Multiplier x par 20 pour avoir le nombre de pièces de 5 centimes.
<br>
2) Arrondir le résultat à l'entier le plus proche.
<br>
3) Diviser le résultat par 20 pour retourner une valeur en frs.
</div>

#