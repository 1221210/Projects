# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.8
import math # imports
# initialization
number = 0

# print header
print(f"Number      Square Root")

# prints number and sqrt if num is < 21
while number < 21:
    print(f"{number}           {math.sqrt(number)}")
    number += 1
