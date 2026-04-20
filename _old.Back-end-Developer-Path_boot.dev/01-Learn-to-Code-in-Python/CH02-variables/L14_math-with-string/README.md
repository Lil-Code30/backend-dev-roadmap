# **Math With Strings**

When working with strings the `+` operator performs a "[concatenation](https://en.wikipedia.org/wiki/Concatenation)", which is a fancy word that means "joining two strings". *Generally speaking, it's better to use string interpolation with `f-strings` over `+` concatenation*.

```py
first_name = "Lane "
last_name = "Wagner"
full_name = first_name + last_name
print(full_name)

# prints "Lane Wagner"
```

`full_name` now holds the value "Lane Wagner".

Notice the extra space at the end of `"Lane "` in the `first_name` variable. That extra space is there to separate the words in the final result: `"Lane Wagner"`.

- **Assignment**
  _We have a second player in our game_!
  We need to tell each of our players how much health they have left.
  - [ ] Edit line `9` to print Player 1's health: `You have 1200 health` using string concatenation and the variables provided
  - [ ] Edit line `10` to print Player 2's health: `You have 1100 health` in the same way
    > Only print "You have `x` health" once for each player, nothing else.
