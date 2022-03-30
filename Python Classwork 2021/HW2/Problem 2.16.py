# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: 2.16 Average Acceleration

# Ask user for input
v0, v1, t = eval(input("Please enter Velocity Initial, Velocity Final, and time: "))


# Assign values / calculate

average = (v1 - v0) / t


# Print results (rounds to 4 decimal places)
print(f"The average acceleration is: {round(average, 4)}")
