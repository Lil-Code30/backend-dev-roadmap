# **Printing vs. Returning**

Some new developers get hung up on the difference between `print()` and `return`.

It can be particularly confusing when the test suite we provide simply prints the output of your functions to the console. It makes it *seem* like `print()` and `return` are interchangeable, *but they are not*!

    - `print()` is a function that:
        1. Prints a value to the console
        2. Does *not* return a value
    - `return` is a keyword that:
        1. Ends the current function's execution
        2. Provides a value (or values) back to the caller of the function
        3. Does *not* print anything to the console (unless the return value is later `print()`ed)

**Printing to Debug Your Code**
Printing values and running your code is a great way to debug your code. You can see what values are stored in various variables, find your mistakes, and fix them. Add print statements and run your code as you go! It's a great habit to get into to make sure that each line you write is doing what you expect it to do.
In the real world it's rare to leave `print()` statements in your code when you're done debugging. Similarly, you need to remember to remove any `print()` statements from your code before submitting your work here on Boot.dev because it will interfere with the tests!

**Assignment**

There's a problem in the `get_title` function! It's supposed to construct the `title` value and `return` it to the caller. Instead, it's barbarically printing the value to the console.
Fix the `get_title` function.

- [ ] Return the `title`
- [ ] Do *not* print it to the console
