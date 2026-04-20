# **Dynamic Typing**

Python is [dynamically typed](https://en.wikipedia.org/wiki/Type_system#Static_and_dynamic_type_checking_in_practice), which means a variable can store any type, and that type can *change*.

For example, if I make a number variable, I can later change that variable to a string:

```py
speed = 5
speed = "five"
```

- **But Like, Maybe Don't**

  In almost all circumstances, it's a *bad idea* to change the type of a variable. The "proper" thing to do is to just create a new one. For example:

  ```py
  speed = 5
  speed_description = "five"
  ```

- **What Is Non-Dynamic Typing?**

  Languages that aren't dynamically typed are [statically typed](https://developer.mozilla.org/en-US/docs/Glossary/Static_typing), such as Go and Typescript (one of which you'll learn in a later course depending on your chosen track). In a statically typed language, if you try to assign a value to a variable of the wrong type, an error would crash the program.
  If Python were statically typed, the first example from before wouldn't allow the second line, `speed = "five"`. The computer would give an error along the lines of `you can't assign a string value ("five") to a number variable (speed)`.

  - Click to hide video
