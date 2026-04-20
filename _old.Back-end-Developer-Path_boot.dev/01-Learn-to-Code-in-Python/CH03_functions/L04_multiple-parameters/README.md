# **Multiple Parameters**

Functions can have multiple parameters ("parameter" being a fancy word for "input"). For example, this `subtract` function accepts 2 parameters: `a` and `b`.

```py
def subtract(a, b):
    result = a - b
    return result
```

It's the argument's **position** that determines which parameter receives it (at least, for now). The first argument goes to the first parameter, the second to the second, and so on. In this example, the `subtract` function is called with `a = 5` and `b = 3`:

```py
result = subtract(5, 3)
print(result)

# 2
```

Here's an example with four parameters:

```py
def create_introduction(name, age, height, weight):
    first_part = "Your name is " + name + " and you are " + age + " years old."
    second_part = "You are " + height + " meters tall and weigh " + weight + " kilograms."
    full_intro = first_part + " " + second_part
    return full_intro
```

It can be called like this:

```py
my_name = "John"
my_age = "30"

intro = create_introduction(my_name, my_age, "1.8", "80")
print(intro)

# Your name is John and you are 30 years old. You are 1.8 meters tall and weigh 80 kilograms.
```

- **Assignment**

  _We need to calculate the total damage from a combo of three attacks._
  **Complete the `triple_attack` function** by returning the sum of its parameters, `damage_one`, `damage_two`, and `damage_three`. Remember to *indent* the code inside the function.
  The `pass` statement is a placeholder that does nothing. **Replace it with your code.**

- **Tip**

  The attack damage values (`attack_one` to `attack_six`) are already passed to the two `triple_attack` function calls for you. You only need to reference them by their new *damage* parameter names (`damage_one`, `damage_two`, and `damage_three`).
