# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: 2.6

'''
(Sum the digits in an integer)

Step 1:
Write a programme that reads an integer between 0 and 1000

Step 2:
add all the digits in the integer

Step 3:
Display the result

Example: if a integer is 932, the sum of all its digits is 14

Note: Use the % operator to extract digits, and use the // operator to remove the extracted digits.

For instance, 932 % 10 = 2 and 932 // 10 == 93

Sample Run:
input: Enter a number between 0 and 1000: 999
output: The sum of the digits is 27
'''

# Prompt the user to enter a value between 0 and 1000
number = (eval(input("Please enter a input between 0 and 1000.")))

# Extract and remove out first digit
digit1 = number % 10  # extracts the last digit
number //= 10  # Removes the last digit

# Extract and remove the second digit
digit2 = number % 10
number //= 10

# Extract and remove the third digit
digit3 = number % 10
number //= 10

# Extract and remove the forth digit (1000 only really)
digit4 = number % 10
number //= 10

# Sums all 4 digits
combinedDigits = digit1 + digit2 + digit3 + digit4
#  Equal to using: print("The sum of the digits is:", digit1 + digit2 + digit3 + digit4)


# Prints the sum of the digits
print(f"The sum of the digits is: {combinedDigits}")
