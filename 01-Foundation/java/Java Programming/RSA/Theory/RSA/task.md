# L'algorithme RSA
RSA est un algorithme de chiffrement asymétrique (vu plus en détail dans 
d'autres cours). Avec RSA, les données à chiffrer sont ramenées à une suite de 
nombres naturels et une paire de clés est utilisée pour le chiffrement. 

Pour rappel, voici la démarche pour créer une paire de clés :
- Choisir deux grands nombres premiers `p` et `q`
- Calculer `n = p*q` et `t = (p-1)*(q-1)`
- Choisir un exposant public `e > 0` tel que `gcd(e,t) = 1`
- Calculer l'exposant privé `d` tel que `(d*e)%t = 1`
- Clé publique = `(e, n)` et clé privée = `(d, n)`

Ce qui est chiffré avec l'une des clés se déchiffre avec l'autre clé.
- Envoi d'un message confidentiel : `C = M^e % n`
- Déchiffrement du message : `M = C^d % n`

## Réalisation de l'algorithme: `powerMod`

Pour réaliser RSA, il est nécessaire de pouvoir calculer la puissance `e` d'un 
nombre `m` modulo `n` (<code>(m^e) mod n</code>). Il existe différentes 
solutions pour effectuer ce calcul. La classe `Main` implémente deux méthodes 
`powerModA` et `powerModB` afin de pouvoir calculer la puissance suivie du modulo.
Lancez le programme, observez l'output et identifiez l'affirmation
correcte ci-dessous.

<div class="hint">

[WolframAlpha](https://www.wolframalpha.com/) calcule les valeurs 
correctement, par exemple en écrivant <code>(16^65) mod 133</code>. Cela 
peut vous aider à déterminer où se situent le(s) éventuel(s) problèmes.

</div>

#