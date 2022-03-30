# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 4.17

# Import random
import random

# initialize values of rps
rock = 1
paper = 2
scissor = 0

# Whatever you end up using
computer = random.randint(0, 2)

# Prompt the user to enter a value from 0 to 2
user = eval(input("Enter a number: Rock = 1, Paper = 2, Scissor = 0  "))

# SOlve this multiways
# Multi - way if statement to check the cases
if computer == 0 and user == 1:
    print("The computer is Scissor. You are Rock. You WIN!")
elif computer == 0 and user == 2:
    print("The computer is Scissor. You are paper. You Lose!")
elif computer == 1 and user == 0:
    print("The computer is Rock. You are Scissor. You Lose!")
elif computer == 1 and user == 2:
    print("The computer is rock. You are paper. You win!")
elif computer == 2 and user == 0:
    print("The computer is paper. You are Scissor. You Win!")
elif computer == 2 and user == 1:
    print("The computer is PAper. yOU are rock. You lose!")
else:
    print(f"Computer threw {computer} and you threw {user}, you Tied!")


