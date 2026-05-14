<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">primitive variables, math operators</i>
</div>
 You are given int number variable already declared and with value.

 Write a program to calculate the sum of each digit of a three-digit number.

Declare 3 integer variables **digit1, digit2, digit3**, and extract each digit and assign them.

declare integer **sum** variable and assign **digit1 + digit2 + digit3**

print out sum variable value like below:

        Example:
        Input: number = 123 (1 + 2 + 3)
        Output: Sum of the digits: 6
        
        Input: number = 256 (2 + 5 + 6)
        Output: Sum of the digits: 13
<div class="hint">
  <i style="padding-left: 40px;">	
    1.Hundreds: number / 100<br>
	2.Tens: (number / 10) % 10<br>
	3.Units: number % 10</i>
</div>
