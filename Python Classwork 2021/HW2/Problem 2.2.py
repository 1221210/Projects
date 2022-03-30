# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: 2.2 Cylindrical Volume Calculator

# Sets radius and length equal to user input
radius, length = eval(input("Please enter a radius and a length separated by a comma : "))

# Calculations for area and volume
area = radius * radius * 3.1415
volume = area * length

# Print results
print(f"The area is {area}")
print(f"The volume is {volume}")

