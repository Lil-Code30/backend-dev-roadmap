# Exercice 3 de la série 10

## Objectif
Implémenter une simulation simplifiée du jeu **Puissance 4** en utilisant une grille de jeu et
une énumération pour représenter l'état des cases.

## Consignes
### **1. Représentation de la grille**
- La grille du jeu est un **tableau à deux dimensions**.
- Chaque cellule peut contenir :
    - un jeton du joueur **rouge**.
    - un jeton du joueur **jaune**.
    - une case vide.
- Les colonnes sont numérotées de `0` à `6`.

### **2. Implémentation de la méthode de jeu `play()`**
- Une méthode doit permettre à un joueur d'ajouter un jeton dans une colonne donnée.
- Le jeton doit tomber dans la **première case libre** de la colonne.
- Si la colonne est pleine ou le numéro de colonne est invalide, une **erreur** doit être signalée.
    - Le message d'erreur doit inclure le numéro de colonne incorrect.

### **3. Fonctionnement attendu**
- La grille doit être mise à jour après chaque coup.
- Aucun test de victoire ne doit être effectué dans cette méthode.

## Contraintes
- **Respectez les paramètres attendus** pour que votre solution puisse être testée correctement.
- **Gérez les erreurs** en suivant les indications fournies.
- **N’ajoutez pas d'autres fonctionnalités** que celles demandées.

<div class="hint">
    Assurez-vous que votre méthode prend bien en compte :
    <ul>
        <li>Un paramètre représentant le joueur qui joue.</li>
        <li>Un paramètre représentant la colonne choisie.</li>
        <li>Un paramètre représentant l'état actuel de la grille.</li>
    </ul>
</div>

<div class="hint">
    Si vos tests échouent sans message explicite, vérifiez que :
    <ul>
        <li>Vous utilisez bien le bon type de données pour représenter la grille.</li>
        <li>Votre fonction ne retourne pas une valeur inattendue.</li>
        <li>Vous respectez la numérotation des colonnes (de 0 à 6).</li>
    </ul>
</div>

---

#