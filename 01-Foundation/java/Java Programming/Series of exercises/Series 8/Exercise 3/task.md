# Exercice 3 de la série 8

Écrire une méthode `mergeAlternate` qui reçoit en paramètre deux tableaux de caractères
de **taille identique** et qui retourne un tableau deux fois plus grand comprenant sous
forme **alternée** les caractères des deux tableaux d'origine. Si les tableaux passés en
paramètres ne font pas la même taille, la méthode doit indiquer dans la 
console : `Error: Both arrays must
 have the same length.` et retourner un tableau vide.

Exemple : `{'a','b','c'}` et `{'x','y','z'}` → `{'a','x','b','y','c','z'}`

<div class="hint">
    <b>Cas particuliers</b>  
    <ul>
        <li>Que se passe-t-il si les tableaux sont vides ?</li>
        <li>Comment gérer un tableau avec un seul élément ?</li>
        <li>Que doit-il se produire si les longueurs des tableaux ne sont pas identiques ?</li>
    </ul>
</div>

<div class="hint">
    <b>Si les tests échouent</b>  
    <ul>
        <li>Vérifiez que votre méthode retourne bien un tableau de la bonne longueur.</li>
        <li>Assurez-vous que l'ordre des éléments respecte l'alternance.</li>
        <li>Si une exception est levée, assurez-vous que son message est explicite.</li>
    </ul>
</div>

#
