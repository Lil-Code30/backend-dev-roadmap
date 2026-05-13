# Utilisation de constantes dans un programme

L'objet `Compass` permet de représenter une boussole qui est capable 
d'indiquer le Nord, l'Est, le Sud et l'Ouest, à la fois en termes de degré 
(type `int`) et de direction (Nord, Est, Sud, Ouest, type `String`). 

Dans ce cas de figure, considérons que L'Est correspond à toutes les positions 
comprises entre 45° (inclus) et 135° (exclus). Le Sud correspond à 
135° (y compris) à 225° et ainsi de suite. Il n'est pas possible de dépasser 
360°, qui correspond à 0°.

Lorsqu'une direction est indiquée, celle-ci correspond aux degrés marqués en 
rouge. C'est-à-dire qu'une direction Est vaut à 90°, Sud à 180°, etc.

<div>
<img 
    width="400px"
    title="Boussole" 
    alt="Boussole" 
    src="compass.PNG">
</div>

Complétez la classe `Compass` afin de produire le résultat attendu.

#