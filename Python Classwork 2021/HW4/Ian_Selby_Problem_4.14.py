# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 4.14

import random

choice = eval(input("A coin will be flipped, pick 0 for heads or 1 for tails: "))

if choice != 1 or 0:
    print("Incorrect input, please run again.")
    quit()

# Coin value generator
coin = random.randint(0, 1)

# Information for output designating what coin face is showing
if coin == 1:
    coinFace = 'tails'
else:
    coinFace = 'heads'

# Prints results if win
if choice == coin:
    print(f"You win! The coin landed on {coinFace}")
else:
    print(f"You lose :( The coin landed on {coinFace}")

