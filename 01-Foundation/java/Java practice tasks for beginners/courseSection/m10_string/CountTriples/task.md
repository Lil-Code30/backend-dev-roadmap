<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">String manipulation</i>
</div>

Finish the method called `countTriples()` that has a String argument `str`.

Return the number of triples found in the given String.

A triple is when the same character appears three times in a row.

So if there is a specific character that is repeated three times, that will be counted as one triple.
The triples may overlap.

    Examples:
        countTriples("abcXXXabc") -> 1
        countTriples("xxxabyyyycd") -> 3
        countTriples("java") -> 0

<div class="hint">
  <i style="padding-left: 40px;">if (str.charAt(i + 1) == current && str.charAt(i + 2) == current)</i>
</div>
