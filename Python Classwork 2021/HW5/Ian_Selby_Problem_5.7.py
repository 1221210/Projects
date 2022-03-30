# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.7

# Note: I am confused on what the book wants. It says: Print the following table to display the sin value and value
# and cos value of degrees from 0 to 360 with increments of 10 degrees. Round the value to keep four digits after the
# decimal point.
#

# imports
import math

print(f"Degree      Sin         Cos") # print header
# var initialization
degree = 0
sin = 0
cos = 0

while degree < 370:  # loops while below 370 degrees
    # assigns value to math function for easier rounding
    sin = math.sin(degree * math.pi / 180)
    cos = math.cos(degree * math.pi / 180)

    # printing results
    print(f"{degree}        {round(sin, 4)}          {round(cos, 4)}")
    degree += 10  # increment


