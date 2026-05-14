<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">method with return value and params. Method overloading</i>
</div>

Complete the overloaded 'getCharacterSet()' methods.

First is with two 'char' arguments to return a String will all the characters within a given range of characters.

The range will be based on the ASCII table: https://www.asciitable.com. The argument will be the 'start' and 'end' characters of the range

    Ex:
        getCharacterSet('7', 'P') -> "789:;<=>?@ABCDEFGHIJKLMNOP"
        getCharacterSet('X', '}') -> "XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}"

Second is 'getCharacterSet()' method with the String parameter 'group'. Use the following data for possible groups and returns values:

    getCharacterSet("uppercase") -> "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    getCharacterSet("lowercase") -> "abcdefghijklmnopqrstuvwxyz"
    getCharacterSet("digit") -> "0123456789"
    getCharacterSet("special") -> "!"#$%&'()*+,-."

<div class="hint">
  <i style="padding-left: 40px;">for(char eachChar = start; eachChar <= end; eachChar++)...</i>
</div>
