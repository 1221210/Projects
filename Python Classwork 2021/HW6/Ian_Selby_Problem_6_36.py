# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Generate random chars

'''
Note: Using 6.11 RandomCharacter module

Objective:
print 100 uppercase letters
print 100 single digits
print 10 items/line
'''
# Import the RandomCharacter module
import RandomCharacter

# Create a constant variable to keep track of our 100 letters and digits
N = 100

# Create a variable to keep track of how man items per line
count = 1

# FOr loop to iterate thru 100 times
for i in range(N):
    # two way if statement to print 10 times per line
    if count % 10 == 0:
        print(RandomCharacter.getRandomUpperCaseLetter())
    else:
        print(RandomCharacter.getRandomUpperCaseLetter(), end = " ")

    # Increment count by 1
    count += 1

# for loop to iterate thru 100 times
for i in range(N):
    # two way if statement to print 10 times per line
    if count % 10 == 0:
        print(RandomCharacter.getRandomDigitCharacter())
    else:
        print(RandomCharacter.getRandomDigitCharacter(), end = " ")
    count += 1