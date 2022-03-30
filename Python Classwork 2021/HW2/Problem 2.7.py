# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: 2.7 Find Years and day count from given minutes

# Ask user for minute input
minutes = eval(input("Please enter the amount minutes you want converted to days / years: "))

# Assign values / calculate

hour = minutes // 60
day = hour // 24
year = day // 365
yearRemainder = day / 365 - year  # calculates remainder of years taking float - decimal division
daysRem = 365 * yearRemainder  # gets remainder of year and converts it to days

# Print results (uses round function) this function rounds a given number daysRem...
# you can specify the decimal count if you use : round(daysRam, 2) for 10s place
print(f"{minutes} minutes is approx: {year} years and {round(daysRem)} days")
