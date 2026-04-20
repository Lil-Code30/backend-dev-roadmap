# **Default Values**

In Python you can specify a [default](https://docs.python.org/3/glossary.html#term-parameter) value for a function parameter. It's nice for when a function has parameters that are "optional". You as the function definer can specify a specific default value in case the caller doesn't provide one.

A default value is created by using the assignment (`=`) operator in the function signature.

```py
def get_greeting(email, name="there"):
    print("Hello", name, "welcome! You've registered your email:", email)

get_greeting("lane@example.com", "Lane")

# Hello Lane welcome! You've registered your email: lane@example.com

get_greeting("lane@example.com")

# Hello there welcome! You've registered your email: lane@example.com
```

If the second parameter is omitted, the default `"there"` value will be used in its place. As you may have guessed, for this structure to work, optional parameters (the ones with defaults) must come *after* all required parameters.

- **Assignment**
  Complete the `get_punched` and `get_slashed` functions. They both take 2 integers as arguments, `health` and `armor`.
  - [ ] Complete the `get_punched` function:
    - [ ] Change the `armor` parameter to have a `default` value of `0`
    - [ ] Create a `damage` variable equal to `50` minus the armor. (The armor reduces the damage.)
    - [ ] Create a `new_health` variable equal to the input `health` minus `damage` - we apply the damage
    - [ ] Return `new_health`
  - [ ] Complete the `get_slashed` function
    - [ ] Change the `armor` parameter to have a `default` value of `0`
    - [ ] Create a `damage` variable equal to `100` minus the armor
    - [ ] Create a `new_health` variable equal to the input `health` minus `damage`
    - [ ] Return `new_health`
