# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: 2.8 Calculate Energy to heat water from pt a to b

# Ask user for input
waterAmt = eval(input("Please enter the amount of water in Kilograms: "))
initial = eval(input("Please enter the initial water temperature: "))
final = eval(input("Please enter the final water temperature: "))

# Assign values / calculate

energy = waterAmt * (final - initial) * 4184


# Print results
print(f"Energy required for the change in temperature is: {energy}")
