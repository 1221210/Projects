# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 4.4

'''
Goal: Write program that can generate two int < 100 and prompt user to enter the sim of them
determine if userinput is true or not
'''

# Import random
import random

# Generate three random int
a = random.randint(0, 99)
b = random.randint(0, 99)

# Calculate sum
answer = a + b


# prompt user for answer to random integers
user = eval(input(f"Enter the sum of {a} + {b}: "))

# Take corresponding action based on of value entered is the answer or not
if user != answer:
    print(f"Incorrect, the sum of {a} {b} is {answer}")
elif user == answer:
    print(f"Correct! the answer is {answer}")