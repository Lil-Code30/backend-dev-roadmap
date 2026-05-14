<div class="hint" title="Practice topics">
  <i style="padding-left: 40px;">String manipulation</i>
</div>

Finish the method called `coverMe()` that will take two `String` arguments `main` and `coverMe` and returns a `String`. 

    public static String coverMe(String main, String coverMe){}

Find each occurrence of the String `coverMe` in `main`. Wrap each occurrence of `coverMe` in square brackets. 

In the case that `main` does not have any occurrence of `coverMe` return a String with the whole `main` String wrapped in square brackets
The `coverMe()` method is already called in the main method with an argument.

    Example:
        coverMe("java methods", "me")) ->  java [me]thods
        coverMe("Certified Wooden Spoon", "o")) -> Certified W[o][o]den Sp[o][o]n
        coverMe("hello hello", "ello")) ->  h[ello] h[ello]
        coverMe("apples", "pears")) ->  [apples]

<div class="hint">
  <i style="padding-left: 40px;">replace method is one of the ways to solve this task</i>
</div>
