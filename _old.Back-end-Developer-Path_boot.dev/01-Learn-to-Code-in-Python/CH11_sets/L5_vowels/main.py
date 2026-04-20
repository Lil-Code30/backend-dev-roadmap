def count_vowels(text):
    vowels = {"a", "e", "i", "o", "u", "A","E","I", "O", "U"}

    vowels_found = set()
    vowels_count = 0

    for letter in text:
        if letter in vowels:
            vowels_count += 1
            vowels_found.add(letter)

    return (vowels_count,vowels_found)
