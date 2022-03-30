# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.2 Generate 10 random addition questions for ints between 1 and 15

# Import random and time modules
import random
import time

# Count the number of correct answers
correctCount = 0

# Count the number of questions
count = 0

# Constant for the max number of questions
max_Questions = 10

# Get the start time
startTime = time.time()

# While loop to iterate through each questions
while count < max_Questions:

    # Generate two random double digit integers
    number1 = random.randint(1, 15)
    number2 = random.randint(1, 15)

    answer = eval(input(f"What is {number1} + {number2}? "))

    # Grade the answer and display the correct / wrong
    if number1 + number2 == answer:
        print("\nYou are correct!")
        correctCount += 1
    else:
        print(f"Wrong answer!\n {number1} + {number2} should be {number1 + number2}")

    # Increment the count
    count += 1

# Stop the timer
endTime = time.time()

# Figure out the total test time
testTime = int(endTime - startTime) # gets seconds

# Display the correct answers and the time it took to take the test
print(f"Correct count it {correctCount} / {max_Questions} \nTest time is {testTime:.2f} seconds!")


