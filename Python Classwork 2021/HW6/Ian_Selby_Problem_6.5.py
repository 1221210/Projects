# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Sort 3 numbers

# Makes a list of three user entered numbers
UserInput = [num1, num2, num3] = eval(input("Enter 3 numbers you want sorted least to greatest: "))


# beginning of function def
def displaySortedNumbers():
    # return sorted list
    return sorted(UserInput)  # the use of sorted makes it from least to greatest w/o arguments


# print list
print(displaySortedNumbers())
