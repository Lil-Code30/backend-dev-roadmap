def countdown_to_start():
    for i in range(1, 11):
        # if i == 1:
        #     print(f"{i}...Fight!")
        # else:
        #     print(f"{i}...")
            
        if i == 1:
            print(f"{i}...Fight!")
            continue
        print(f"{i}...")

# Don't edit below this line


def test():
    print("Counting down to match start:")
    countdown_to_start()
    print("=====================================")


def main():
    test()


main()
