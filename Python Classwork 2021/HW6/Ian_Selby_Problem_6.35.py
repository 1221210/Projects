# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: Compute probability

# Import the randomCharacterModule
import RandomCharacter

# Create a variable to keep count of the occurence of A's
count = 0

# For loop to iterate 10000 times creating a random letter each iteration
for i in range (10000):
    # invoke the getRandomUpperCaseLetter function
    ch = RandomCharacter.getRandomUpperCaseLetter()

    # if the random character is an A then increment count
    if ch == 'A':
        count += 1

# Display results
print(f"The occurence of A is {count}")