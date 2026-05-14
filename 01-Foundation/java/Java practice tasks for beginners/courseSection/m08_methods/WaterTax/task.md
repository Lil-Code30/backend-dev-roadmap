<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">method with return value and params</i>
</div>

Complete the method called `waterTax()` that will take a `double` `units` argument and returns a `double` bill cost.

Use the given guidelines to calculate the bill cost based on the number of used units.

The more water used, the more it will cost. The method is already called in the main method with arguments.


    - If the units are under 50 (including 50):
        bill = units * 0.60

    - If the units are above 50:
        bill = units * 0.90

    - If the units are above 100:
        the bill is the same as the above 50 units, but with an additional fee of $50

    - If the units are above 150:
        the bill is the same as the above 50 units, but with an additional fee of $100

    Examples:
        waterTax(50) ->  30.0
        waterTax(55) -> 49.5
        waterTax(151) -> 235.9

<div class="hint">
  <i style="padding-left: 40px;">use separate or multi branch if statements</i>
</div>
