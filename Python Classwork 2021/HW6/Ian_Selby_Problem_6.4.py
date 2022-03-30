# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Display a reversed integer using def reverse(number):


# Create the main function (class example)
def main():
    # Prompt the user to input a integer
    number = eval(input("Enter an integer: "))

    # invoke the reverse function
    reverse(number)

# Create the reverse function
def reverse(number):

    # extract and remove each digit in a while loop
    while number != 0:
        remainder = number % 10

        # display number
        print(remainder, end = "")

        # remove the digit that was just extracted
        number //= 10

# invoke main
main()

# below is what I wrote: -----------------------------------


# # Reverse the entered number
# number = int(input("Enter a number: "))
#
#
# def reverse(num):  # beginning of reverse function
#
#     # print(1 % 10)
#     reverse = 0
#     while num > 0:  # if the number is greater than zero the following occurs
#         reverse = (10 * reverse) + num % 10  # the reversed number is equal to
#         num //= 10  # divides w/o decimal
#     return reverse  # passes reverse value, end function
#
#
# # print results
# print(f"Reversed number is: {reverse(number)}")
