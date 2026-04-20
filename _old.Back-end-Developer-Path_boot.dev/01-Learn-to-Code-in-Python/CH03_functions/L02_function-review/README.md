# **Function Review**

Functions are tricky! It takes a minute to get used to them, but after that they'll be second nature to you. You might find yourself slowing down a bit in this chapter, and if you do, that's totally normal.

Let's break down this function line by line so you can understand every nook and cranny of it.

```py
def area_of_circle(r):
    pi = 3.14
    result = pi * r * r
    return result

radius = 5
area = area_of_circle(radius)
print(area)

# 78.5
```

Here's a chronological explanation of what happens when the above code is executed:

    1. `def area_of_circle(r):`

The `area_of_circle` function is defined for later use, but *not* called. It accepts a single input, the arbitrarily named `r`. The body of the function (`pi = 3.14`... etc) is ignored for now.

    2. `radius = 5`

A new variable called `radius` is created and set to the value `5`.

    3. `area_of_circle(radius)`

The `area_of_circle` function is called with `radius` (in this case 5) as the input. Finally, we jump back to the function definition.

    4. `def area_of_circle(r):`

We will now start executing the body of the function, and `r` is set to `5`.

    5. `pi = 3.14`

A new variable called `pi` is created with a value of `3.14`.

    6. `result = pi * r * r`

Some simple math is evaluated (`3.14 * 5 * 5`) and stored in the `result` variable.

    7. `return result`

The result variable is returned from the function as output.

    8. `area = area_of_circle(radius)`

The returned value is stored in a new variable called `area` (in this case `78.5`).

    9. `print(area)`

The value of `area` is printed to the console.
