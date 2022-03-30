# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Convert Between Celsius and Fahrenheit w/ 2 functions

# Preset value 40 for C
celsius = 40

# Preset value 120 for F
fahrenheit = 120


# Convert from C to F
def celsiusToFahreneit(celsius):
    # Convert celsius to fahrenheit using the given formula
    fahrenheit = (9 / 5) * celsius + 32
    #
    # # Display the results
    # print(f"The conversion of {celsius} °C to fahrenheit is: {fahrenheit} °F")
    return fahrenheit


# converts from F to C
def fahrenheitToCelsius(fahrenheit):
    # Convert celsius to fahrenheit using the given formula
    celsius = (5 / 9) * (fahrenheit - 32)

    # # Display the results
    # print(f"The conversion of {fahrenheit} °F to celsius is: {celsius} °C")
    return celsius


print(  # Display header
    "Celsius     Fahrenheit     |     Fahrenheit     Celsius\n" +
    "----------------------------------------------------------")

# Display data
while celsius >= 32:
    celsius -= 1
    fahrenheit -= 10
    print(f"{celsius:<13}{round(celsiusToFahreneit(celsius), 2):<14}|{fahrenheit:>10}{round(fahrenheitToCelsius(fahrenheit), 2):>16} ")


