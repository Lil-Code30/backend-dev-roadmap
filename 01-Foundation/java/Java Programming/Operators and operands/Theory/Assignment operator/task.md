# L'opérateur d'affectation

L'opérateur d'affectation `=` est utilisé pour affecter une valeur à
une variable. C'est un des opérateurs avec associativité droite vers
gauche, ce qui signifie que l'opérande de droite (la valeur à affecter à la
variable) est évalué en premier.

## Combinaison avec un autre opérateur
L'opérateur d'affectation peut également être combiné avec un autre 
opérateur, comme un opérateur arithmétique ou orienté bits. Dans ce cas, la 
notation composée est utilisée, par exemple `a = a + 5` peut être remplacé 
par `a += 5`. 

Il est important de comprendre que la notation composée `var op= expr` est 
équivalente à `var = var op (expr)` - notez la présence des `()` autour de 
`expr` qui est importante.

# Exemple
Observez les résultats obtenus en exécutant le programme "Main.java".