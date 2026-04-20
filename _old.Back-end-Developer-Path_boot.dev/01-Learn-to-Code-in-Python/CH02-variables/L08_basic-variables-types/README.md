# **Basic Variable Types**

Python has several basic [data types](https://en.wikipedia.org/wiki/Data_type).

- **Strings**

  In programming, snippets of text are called "[strings](https://docs.python.org/3/library/stdtypes.html#textseq)". They're lists of characters *strung* together. We create strings by wrapping the text in single quotes or double quotes. That said, **double quotes are preferred**.

  ```py
  name_with_single_quotes = 'boot.dev' # not so good
  name_with_double_quotes = "boot.dev" # so good
  ```

- **Numbers**

  Numbers are *not* surrounded by quotes when they're declared.

  **An [integer](https://docs.python.org/3/c-api/long.html) (or "int") is a number without a decimal part**:

  ```py
  x = 5 # positive integer
  y = -5 # negative integer
  ```

**A [float](https://docs.python.org/3/library/functions.html#float) is a number with a decimal part**:

```py
  x = 5.2
  y = -5.2

```

- **Booleans**

  A ["Boolean"](https://docs.python.org/3/c-api/bool.html#boolean-objects) (or "bool") is a type that can only have one of two values: `True` or `False`. As you may have heard, computers really only use 1's and 0's. These 1's and 0's are just `True/False` boolean values.

  ```py
  is_tall = True
  is_short = False
  ```

- **Assignment**

  Fix the bugs in the code. `player_health` should be an integer and `player_has_magic` should be a boolean.
