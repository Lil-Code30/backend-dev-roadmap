<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">Scanner class</i>
</div>


Create a program that will build a custom laptop by allowing the user to select each part and computing the total price. 

_Scanner code is already included, please fill out conditions for the price._

 Use the following requirements for each section:

    First ask the user about the screen size
        Select screen size:
        - For a screen size of `13.3`, add `$200` to the total price
        - For a screen size of `15.0`, add `300` to the total price
        - For screen size of `17.3`, add `$400` to the total price

    Then ask the user about the CPU
        Select CPU type:
        - For a CPU of `i5`, add `$250` to the total price
        - For a CPU of `i7`, add `$350` to the total price
        - For a CPU of `i3`, add `$150` to the total price

    Then ask the user about the RAM size
        Select RAM size:
        - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

    Then ask the user about the storage type and amount
        Select storage type:
        - For `HDD`, add `$50` to the total price for every 500GB
        - For `SSD`, add `$100` to the total price for every 500GB

    Then ask the user about the screen resolution
        Select screen resolution:
        - For `FULLHD`, add `$100` to the total price
        - For `4K`, add `$200` to the total price

    At the end display the total price of the custom computer
        Final price is: $amount

    Example Flow:
      Select screen size:
        13.3
      Select CPU type:
        i7
      Select RAM size:
        8
      Select storage type:
        SSD
      Select storage size:
        1000
      Select screen resolution:
        4K
      Final price is: $1050.0

<div class="hint">
  <i style="padding-left: 40px;"> Use if statements or switch</i>
</div>
