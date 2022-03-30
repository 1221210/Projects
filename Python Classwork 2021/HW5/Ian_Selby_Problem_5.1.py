# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.1

'''
Count positive and negative numbers and compute the average of numbers:
Programme reads x number of integers and determines how many of those are positive or negative in their own counters
programme ends if input is 0
display as floating point
'''

# Variable initialization
countPositive = 0
countNegative = 0
x = 1
total = 0

while x != 0: # End condition of x = 0
    x = eval(input("Enter a integer, the input ends if it is zero. ")) # prompt for input
    total += x # sums entered values
    if x > 0:
        countPositive += 1 # counter increase if pos
    elif x < 0:
        countNegative += 1 # counter if negative

    count = countNegative + countPositive # variable for total count
    average = total / count # average calculation

if x == 0: # when the program x = 0 print the following results
    print(f"The number of positives is : {countPositive}")
    print(f"The number of negatives is : {countNegative}")
    print(f"The total is {total}")
    print(f"The average is {average}")
    exit()



