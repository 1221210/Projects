# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Area of pentagon

import math

# function definition
def area(s):

    # Calculate area
    area = (5 * s ** 2) / (4 * (math.tan(math.pi/5)))
    return area


# Prompt user for the side
sides = eval(input("Enter the side: "))

# print result
print(f"The area of the pentagon is: {round(area(sides), 2)}")
