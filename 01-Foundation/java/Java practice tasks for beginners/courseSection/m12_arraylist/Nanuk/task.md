
<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">ArrayList</i>
</div>

In the Eskimo language `nanuk` means polar bear. When the tribe goes hunting they need to select a leader,
each person boasts how much they can hunt. Then they vote who will lead them.
A successful hunt for the leader is when they managed to hunt as much as was boasted and the hunting party managed to avoid a polar bear (nanuk)
which can ruin a whole hunt. Experienced hunters know ways to avoid polar bears using way stones to mark these areas.

Finish the method called `hunt()` that will take three arguments: an `ArrayList<String>` `result`, `int` `wayStones` and `int` `boast`.
The method returns a boolean, about if the hunt was successful or not.

Use the guidelines below to determine if a hunt was successful or not.
The `hunt()` method is already called in the main method with an argument.

The `results` will show either the number of catches on that path or nanuk
The `wayStones` is the number of safe paths the leader knows to avoid nanuks.
Each wayStone will help to avoid one nanuk and cannot be used for future ones
The `boast` is how much food the leader said they would be able to hunt.

Return `true` when the hunt was successful: if hunters had enough `wayStones` to avoid all nanuks they returned from the hunt with a hunt number more or equal to the `boast` number for the leader
Return `false` if hunters encountered nanuk but did not have a wayStone to avoid it, or if the total catches on the hunt was less than the `boast` amount

    Examples
        nanuk(["1","2","3","5"],0,5) -> true
            (no nanuks, and catches are 11 which is more than 5 that leader boasted)

        nanuk(["1","nanuk","3","5"],0,5) -> false
            (They encountered nanuk but had 0 way stones)

        nanuk(["1","3"],0,5) -> false
        nanuk(["1","10","3","nanuk"],2,7) -> true
        nanuk(["1","10","3","nanuk","nanuk"],2,7) -> true
        nanuk(["1","10","3","nanuk","nanuk","nanuk"],2,7) -> false

<div class="hint">
  <i style="padding-left: 40px;"></i>
</div>

