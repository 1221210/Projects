# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Area of polygon

# import math
import math

def area(n, side):
    # Calculate the area
    area = sideCount * (sideLength ** 2) / (4 * (math.tan(math.pi / sideCount)))
    return area

# Prompt user for number of sides
sideCount = eval(input("Enter the number of sides: "))
sideLength = eval(input("Enter the side length: "))


# Print results
print(f"The area of the polygon is: {round(area(sideCount, sideLength), 2)}")
