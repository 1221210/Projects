# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: 2.1
'''
Convert Celsius to Fahrenheit)

Step 1:
Write a program that reads a Celsius degree from the console

Step 2:
convert celsius to fahrenheit

Step 3:
Display the results of

The formula for the conversion is as follows:

fahrenheit = ( 9 / 5 ) * celsius + 32

Sample run:
input: Enter a degree in celsius: 43
output: 43 celsius is 109.4 Fahrenheit
'''

# Prompt the user to enter a value for celsius
celsius = eval(input("Enter a degree in Celsius: "))

# Convert celsius to fahrenheit using the given formula
fahrenheit = (9 / 5) * celsius + 32

# Display the results
print(f"The conversion of {celsius} °C to fahrenheit is: {fahrenheit} °F")
