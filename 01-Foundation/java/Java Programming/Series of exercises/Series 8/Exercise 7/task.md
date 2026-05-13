# Exercice 7 de la série 8

Écrire une méthode (fonction) qui retourne la valeur minimale parmi un tableau d'entiers.

## Instructions
- **Paramètre :** Un tableau d'entiers contenant au moins un élément.
- **Sortie attendue :** Un entier représentant la **plus petite valeur** du tableau.
- **Contraintes :**
    - Le tableau **n'est pas vide** et **n'est pas `null`**.
    - Le programme doit parcourir **toutes** les valeurs pour identifier le minimum.
    - La fonction doit être **générique** et fonctionner avec tout tableau valide.
- Si le tableau passé en paramètre est vide ou `null`, la méthode doit 
  afficher le message "Array must not be null or empty." et retourner `0`.

<div class="hint">
    Si votre programme ne fonctionne pas correctement, vérifiez bien que :
    <ul>
        <li>Vous passez un <b>tableau d'entiers</b> en paramètre.</li>
        <li>Votre fonction retourne bien un <b>entier</b>.</li>
        <li>Vous comparez correctement chaque élément du tableau pour trouver le plus petit.</li>
    </ul>
</div>

<div class="hint">
    Si votre test échoue sans message explicite, assurez-vous que votre fonction ne retourne pas une valeur
    par défaut (comme <b>0</b>) dans tous les cas.
</div>

#