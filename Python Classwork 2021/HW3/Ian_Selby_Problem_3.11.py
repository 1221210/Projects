# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 3.11


# check 2.6 hw for non while loop solution



# number = eval(input("Enter a integer: "))
# reverse = number / 10
#
# print(reverse)
# Prompt user for a integer number
number = int(input("Enter a number: "))

print(1 % 10)
# Reverse the entered number
reverse = 0
while number > 0:  # if the number is greater than zero the following occurs
    reverse = (10 * reverse) + number % 10  # the reversed number is equal to
    number //= 10 # divides w/o decimal

# Print result
print("The reversed number is:", reverse)


