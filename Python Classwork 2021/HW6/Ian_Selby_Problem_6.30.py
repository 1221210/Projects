# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Craps win chance

import random

# variables declaration
lose = 0
win = 0
runs = 0
valPoint = 0

for runs in range(1, 10001):

    die1 = random.randint(0, 6)     # logic for rolling dice
    die2 = random.randint(0, 6)
    roll = die1 + die2
    runs += 1  # run counter

    if runs == 9000:
        print("9000")
    if roll == 2 or roll == 3 or roll == 12:  # losing conditions
        lose += 1
    elif roll == 7 or roll == 11:  # win conditions
        win += 1
    elif roll != 2 or roll != 3 or roll != 12 or roll != 7 or roll != 11:
        # point = True
        valPoint = roll  # track point's value roll
        while roll != 7:  # if not instant lose:
            die1 = random.randint(0, 6)  # reroll dice is not losing 7
            die2 = random.randint(0, 6)
            roll = die1 + die2
            if roll == valPoint: # if equal to value at point you win
                win += 1
                break
            if roll == 7:  # or you lose if 7
               lose += 1
               break

# print win / losses
print(f"Total wins: {win}, Total losses: {lose}")



