# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Create a mmodule with 5 functions that randomly generate specific types of chars

# Import randint
from random import randint

# Generate a random char between ch1 and ch2
def getRandomCharacter(ch1,ch2):
    return chr(randint(ord(ch1), ord(ch2)))

# Generate a random lowercase letter
def getRandomLowerCaseLetter():
    return getRandomCharacter('a', 'z')

# Generate a random uppercase letter
def getRandomUpperCaseLetter():
    return getRandomCharacter('A', 'Z')

# Generate a random digit character
def getRandomDigitCharacter():
    return getRandomCharacter('0', '9')

# Generate a random char
def getRandomASCIICharacter():
    return chr(randint(0,127))
