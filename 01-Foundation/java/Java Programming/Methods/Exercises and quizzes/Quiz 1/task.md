# Calcul de salaire net

Le programme "Main.java" permet de calculer le salaire d'un employé ayant un
salaire brut de 6000 CHF.

Différentes cotisations sont calculées à partir du salaire brut (gross salary) :
- La cotisation AVS/AI/APG
- La cotisation AC (assurance accident)
- Les cotisations RP-épargne et RP-risque qui correspondent au 2ème pilier,
  calculées sur le 70% du salaire.
- La cotisation LAA non professionnel (assurance accident non professionnel)

Le taux des cotisations est défini par la loi et par la caisse d'épargne
affiliée (2ème pilier). C'est pourquoi le mot-clé `final` est utilisé, puisque
ce sont des valeurs qui ne changent pas (constantes).

Le salaire net (net salary) correspond au salaire brut ajusté selon le taux
de travail défini, après déduction de l'ensemble des cotisations.

À la fin, seul le salaire brut, le total des déductions et le salaire net
sont affichés.

Bien que ce programme effectue les calculs correctement, il comporte
quelques défauts :
- Ni les résultats, ni les calculs ne sont arrondis aux 5 centimes, alors
  que tout montant en CHF doit être arrondi.
- Il n'est pas possible de lancer le calcul pour différents taux horaires en
  même temps afin de comparer les valeurs obtenues, par exemple 20%, 40%, 60%,
  80%, 100%.

#