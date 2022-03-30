# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Problem 3.1

# Importing Math function
import math

# Prompt user for length of center to a vertex
r = eval(input("Enter length from the center to a vertex: "))

# Calculates side and area
side = (2 * r) * math.sin(math.pi/5)
Area = ((3 * math.sqrt(3)) / 2) * math.pow(side, 2)

# printing the resulting area
print(f"The area of the pentagon is: {Area}")
