# **Variables**

[Variables](https://www.cs.utah.edu/~germain/PPS/Topics/variables.html) are how we *store* data as our program runs. Up 'til now we've been *printing* data by passing it straight into [`print()`](https://docs.python.org/3/library/functions.html#print). Now we're going to *save* the data in variables so we can reuse it and change it *before* printing it.

- **Creating Variables**
  A "variable" is just a name that we give to a value. For example, we can make a new variable named `my_height` and set its value to `100`:
  `my_height = 100`
  Or we can define a variable called `my_name` and set it to the text string `"Lane"`:
  `my_name = "Lane"`
  We have the freedom to choose any name for our variables, but they should be *descriptive* and consist of a single ["token"](https://en.wikipedia.org/wiki/Lexical_analysis#Token), meaning continuous text with underscores separating the words.
- **Using Variables**
  Once we have a variable, we can access its value by using its name. For example, this will print `100`:
  `print(my_height)`
  And this will print `Lane`:
  `print(my_name)`
- **Assignment**
  We need to keep track of our hero's health!
  On the first line of code, create a new variable named `player_health` and set it equal to `1000`.
