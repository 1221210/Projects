# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 3.2

'''
(Geometry : great circle distance)

Step 1:
Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees.

Step 2:
Calculate the distance between the two points

Given formula:
d = 6371.01 * acos(sim(radians(x1)) * sin(radians(x2)) + cos(radians(x1)) * cos(radian(x2)) * cos(radians(y1 - y2))

Step 3:
Display great circle distance

Sample Run:
enter point 1 ( latitude and longitude) in degrees: 39.55, -116.25
enter point 2 ( latitude and longitude) in degrees: 41.50, 87.37

Expected Output:
The distance between the two points is: 10691.79183231593km .

'''
# Imports:
import math

# Prompts user for inputs:
x1, y1 = eval(input("enter point 1 ( latitude and longitude) in degrees: i.e. 39.55, -116.25: "))
x2, y2 = eval(input("enter point 2 ( latitude and longitude) in degrees: i.e. 41.50, 87.37: "))

# Compute Distance
d = 6371.01 * math.acos(math.sin(math.radians(x1)) \
                        * math.sin(math.radians(x2)) \
                        + math.cos(math.radians(x1)) \
                        * math.cos(math.radians(x2)) \
                        * math.cos(math.radians(y1 - y2)))

# Display Results
print(f"The distance between the two points is: {d} km")



