# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: 6.18 Matrix of 0 and 1
'''
Display matrix of 0 and 1

Prompt the user to enter n and displau a n by n matrix
Note: Each element is 0 or 1 which is randomly generated

Function header given:
    def printMatrix(n):

Sample run:
input:
        Enter n: 3
output:
        010
        101
        111
'''

# import statements
import random

# Create main function
def main():
    # prompt the user to input a value for n
    n = eval(input("Enter n: "))

    # invoke the printMatrix function
    printMatrix(n)

# Create the printMatrix function as given in the question
def printMatrix(n):
    # Nested for loop to build our rows and columns of the matrix
    for i in range(1, n+1):
        for j in range(1, n+1):
            print(random.randint(0,1), end = " ")

        # jump to the new row
        print()

# invoke the main function
main()


# ask user for n value
n = eval(input("Enter n: "))

# prints matrix
printMatrix(n)
