# Encapsulation

## Le concept
L'une des techniques essentielles de la programmation orientée objet est
l'**encapsulation**. L'encapsulation consiste à masquer les données au sein
des classes et à ne manipuler leur contenu qu'au moyen de méthodes publiques.

## Comment réaliser l'encapsulation ?
La mise en place de l'encapsulation s'effectue en utilisant judicieusement
les contrôles d'accès aux membres des classes. Les avantages de
l'encapsulation sont les suivants :
- **Masquage** des détails de l'implémentation qui peuvent être changés sans
  conséquences pour les utilisateurs externes.
- **Protection** de la classe contre des utilisations erronées.
- **Simplification** de l'API puisque les attributs et les méthodes internes
  sont cachées.

En général, il faut masquer les champs en les déclarant `private` (ou
`protected`). Parfois, seulement si nécessaire, on définit des méthodes
publiques pour accéder aux champs (appelés _accesseurs_/_mutateurs_ ou
_getters_/_setters_). Ces méthodes sont généralement nommées `get()`, `is()` et
`set()`, accompagnées du nom de l'attribut. Exemple : `getPx()`, `getPy()`,
`setPx()`, `setPy()`.

Comme les attributs publics, l'abus de l'utilisation des _getters_/_setters_
nous éloigne de l'esprit de la programmation orientée objet et ils ne
doivent donc être définis que si cela est strictement nécessaire.

# Exercice
Après avoir étudié les points présentés ci-dessus ainsi que les classes
`Point` et `Main`, identifiez l'affirmation correcte parmi les propositions suivantes.