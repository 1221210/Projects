# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 4.2

# Import random
import random

# Generate three random int
a = random.randint(0, 9)
b = random.randint(0, 9)
c = random.randint(0, 9)

# Calculate sum
answer = a + b + c


# prompt user for answer to random integers
user = eval(input(f"Enter the sum of {a} + {b} + {c}: "))

# Take corresponding action based on of value entered is the answer or not
if user != answer:
    print(f"Incorrect, the sum of {a} {b} {c} is {answer}")
elif user == answer:
    print(f"Correct! the answer is {answer}")