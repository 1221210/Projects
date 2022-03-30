# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 4.5

day = eval(input("Enter a number (0 thru 6) for what day it is: "))
daysPast = eval(input("Enter the number of days since today: "))
daysPast += day

if daysPast > 6: # checks if future day is above the days in a week
    daysPast = daysPast % 7

if day == 0: # if statements check what day they correspond ti
    weekDay = 'Sunday'
elif day == 1:
    weekDay = 'Monday'
elif day == 2:
    weekDay = 'Tuesday'
elif day == 3:
    weekDay = 'Wednesday'
elif day == 4:
    weekDay = 'Thursday'
elif day == 5:
    weekDay = 'Friday'
elif day == 6:
    weekday = 'Saturday'

if daysPast == 0:
    futureDay = 'Sunday'
elif daysPast == 1:
    futureDay = 'Monday'
elif daysPast == 2:
    futureDay = 'Tuesday'
elif daysPast == 3:
    futureDay = 'Wednesday'
elif daysPast == 4:
    futureDay = 'Thursday'
elif daysPast == 5:
    futureDay = 'Friday'
elif daysPast == 6:
    futureDay = 'Saturday'

# Print results
print(f"Today is {weekDay} and the future day is {futureDay}")

