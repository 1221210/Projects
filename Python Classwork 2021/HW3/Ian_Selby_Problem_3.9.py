# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 3.9

# Prompt user for information
name = (input("Enter employee's name: "))
hours = eval(input("Enter number of hours worked in a week: "))
rate = eval(input("Enter hourly pay rate: "))
print("Enter the following tax prompts in percentages. I.E. 20, 10, etc...")
federal = eval(input("Enter federal tax withholding rate: "))
state = eval(input("Enter state tax withholding rate: "))

# Calculate various payroll stuff
gross = rate * hours
federalCalculated = (federal / 100) * gross
stateCalculated = (state / 100) * gross
deductions = federalCalculated + stateCalculated
net = gross - deductions

# Print payroll based on prior information
print(f"Employee Name: {name}")
print(f"Hours Worked: {round(hours,2)}")
print(f"Pay Rate: ${round(rate,2)}")
print(f"Gross Pay: ${round(gross,2)}")
print("Deductions: ")
print(f"  Federal Withholding ({federal}.0%): ${round(federalCalculated,2)}")
print(f"  State Withholding ({state}.0%): ${round(stateCalculated,2)}")
print(f"  Total Deduction: ${round(deductions,2)}")
print(f"Net Pay: ${round(net,2)}")




