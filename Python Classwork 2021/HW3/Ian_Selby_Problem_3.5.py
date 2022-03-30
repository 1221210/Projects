# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 3.5

# import math
import math

# Prompt user for number of sides
sideCount = eval(input("Enter the number of sides: "))
sideLength = eval(input("Enter the side: "))

# Calculate the area
area = sideCount * (sideLength ** 2) / (4 * (math.tan(math.pi/sideCount)))

# Print results
print(f"The area of the polygon is: {area}")

# Note the book's answer is 73.69 and you get 72.69? Is this a error in the book?
# The same goes for the prior question which is about off by one.



