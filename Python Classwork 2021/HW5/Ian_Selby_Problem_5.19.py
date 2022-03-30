# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.19

# lines = eval(input("Enter the number of lines: "))
# end = lines
# counter = 1
#
# while counter < end + 1:
#     print()

lines = int(input("Please enter the number of lines you want to make into a pyramid thing: "))

# variable initialization

j = 1
k = 1

while j < lines + 1:  # continues if counter is less than the line count
    while k < lines-j + 1:  # loop adds space if j is less than the line - 1 + 1
        print(end="  ")  # spacing
        k += 1  # increment j count
    for k in range(j, 0, -1):
        print(k, end="  ")  # effects left side spacing
    for k in range(2, j+1):
        print(k, end="  ")  # right side spacing
    j += 1
    print() #

