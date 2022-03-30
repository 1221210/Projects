# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 4.10

# Import statements
import random

# generate two double digit numbers
number1 = random.randint(0, 99)
number2 = random.randint(0, 99)

# # if num1 > num2 swap them
# if number1 > number2:
#     number1, number2 = number2, number1  # Simultaneously assigned num1 and num2

# Real Answer Calculation
realAnswer = number1 * number2

# Prompt user to answer what is number1 * number2?
answer = eval(input(f"What is {number1} x {number2}? : "))

# Check the answer and display the result
if number1 * number2 == answer:
    print("You're correct!!!")
else:
    print(f"You're wrong. \n {number1} x {number2} is {realAnswer}.")

