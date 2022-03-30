# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 3.7

import time

cTime = time.time()  # make var equal to time.time()
# print(cTime) # check time.time()
cTime = int(cTime)   # make it a integer value instead of a float

ASCII = (cTime % 26) + 65  # 26 characters plus the first letter of ascii in order to maintain position
# (https://www.asciitable.com/ for codes reference)
print(chr(ASCII))  # print corresponding character

# The following was covered in class and may or may not be redundant.

''' Instructions :
Write a program that displays a random uppercase letter
using the time.time() function
'''
''' Beginning of Covered Content : 
# import the time module
import time

# Convert the time function into a integer
time = int(time.time())

# Find out our values from 65 to 90
letter = time % 26 + 65 
print(f"output is {chr(letter)})






'''

