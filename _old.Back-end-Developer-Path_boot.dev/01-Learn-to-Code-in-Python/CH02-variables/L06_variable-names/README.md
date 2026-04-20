# **Variable Names**

Variable names *must not* have spaces. They're continuous strings of characters.

The creator of the Python language himself, [Guido van Rossum](https://en.wikipedia.org/wiki/Guido_van_Rossum), [implores us](https://peps.python.org/pep-0008/#function-and-variable-names) to use `snake_case` for variable names. What *is* snake case? It's just a style for writing variable names. Here are some examples of different casing styles:

| Name        | Description                                                     | Code            | Language(s) that recommend it |
| ----------- | --------------------------------------------------------------- | --------------- | ----------------------------- |
| Snake Case  | All words are lowercase and separated by underscores            | `num_new_users` | Python, Ruby, Rust            |
| Camel Case  | Capitalize the first letter of each word *except the first one* | `numNewUsers`   | JavaScript, Java              |
| Pascal Case | Capitalize the first letter of each word                        | `NumNewUsers`   | C#, C++                       |
| No Casing   | All lowercase with no separation                                | `numnewusers`   | ...just don't do this         |

To be clear, your Python code will still *work* with Camel Case or Pascal Case, but can we please just have nice things? We just want some consistency in our craft.

If you won't use snake case for *you*, do it for *me*. I beg you.
