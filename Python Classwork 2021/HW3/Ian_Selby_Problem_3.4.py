# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 3.4 Geometry (area of a pentagon)
import math

# Prompt user for the side
side = eval(input("Enter the side: "))

# Calculate area
area = (5 * side ** 2) / (4 * (math.tan(math.pi/5)))

# print result
print(f"The area of the pentagon is: {area}")




