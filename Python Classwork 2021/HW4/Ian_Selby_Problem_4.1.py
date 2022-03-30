# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 4.1

import math
'''
(Algebra Solve quadratic equation)
Step1:
Write a programme that prompt the user to enter value for abc

Step2:
compute the discriminant of the quadratic equation

Formula given:
discriminant = b * b - 4 * a * c
root1 = (-b + discriminant ** 0.5)



Sample 
'''
# Prompt user for a,b,c
a, b, c = eval(input("Enter a, b, c: "))

# Formula for the discriminant
discriminant = b * b - 4 * a * c

# Multi way if statement to check against the cases
if discriminant < 0:
    print("The equation has no real roots")
elif discriminant == 0:
    root1 = -b / (2 * a)
    print(f"The root is {int(root1)}")
else:
    root1 = (-b + discriminant ** 0.5) / (2 * a)
    root2 = (-b - discriminant ** 0.5) / (2 * a)
    print(f"The roots are {root1:.6f} and {root2:.5f}")



