# Exercice 5 de la série 8

Écrire une méthode qui réduit la taille d'une image en niveaux de gris en divisant par 2 
sa largeur et sa hauteur. L’image est représentée sous forme d’une **matrice de valeurs en `byte`**, 
où chaque élément correspond à un niveau de gris compris entre `0` et `127`.

La réduction est effectuée en remplaçant chaque **bloc de 2x2 pixels** par un unique pixel 
dont la valeur est la **moyenne des 4 pixels** d’origine.

---

## Instructions :
- **Paramètre d’entrée :** Un tableau `byte[][] image` représentant une image en niveaux de gris.
- **Sortie attendue :** Un tableau `byte[][]` correspondant à l’image réduite.
- **Transformation appliquée :**
    - L’image est réduite de moitié en largeur et en hauteur.
    - Chaque pixel dans l’image réduite est la moyenne des **4 pixels** correspondants dans l’image d’origine.
    - **Hypothèse** : La largeur et la hauteur de l'image originale sont **toujours des nombres pairs**.

---

## Exemple d'entrée et sortie attendue :

Si l'image originale est représentée par la matrice suivante :
```
{ {10, 20, 30, 40, 50, 60},  
  {15, 25, 35, 45, 55, 65},  
  {70, 80, 90, 100, 110, 120},  
  {75, 85, 95, 105, 115, 125} }
```
L’image réduite sera :
```
{ {17, 37, 57},  
  {77, 97, 117} }
```

---

<div class="hint">
    <b>Quelle signature doit avoir la méthode ?</b><br>
    - Elle doit être capable de traiter une <b>image</b> représentée sous forme de matrice.<br>
    - Elle doit retourner une <b>nouvelle image réduite</b> sous le même format.<br>
    - Le nom de la méthode est imposé, mais vous devez réfléchir au <b>type du paramètre</b> et à <b>ce que la méthode retourne</b>.
</div>

<div class="hint">
    <b>Comment parcourir l'image efficacement ?</b><br>
    Pensez à parcourir l'image en <b>sautant 2 indices à la fois</b> dans les deux dimensions  
    afin de traiter chaque bloc de 2x2 pixels sans en oublier.
</div>

<div class="hint">
    <b>Attention aux types de données !</b><br>
      Si vous effectuez une division sur des valeurs <b>byte</b>, assurez-vous que  
      l'opération ne dépasse pas la plage autorisée (-128 à 127).
</div>

<div class="hint">
    <b>Et si l'image d'entrée est vide ?</b><br>
    Assurez-vous de bien gérer le cas où l'image d'entrée est vide (c'est-à-dire un tableau byte[0][0]).
</div>

---

#