# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: BMI Computation 4.6 hw revision

# Prompt the user to enter weight in pounds
weight = eval(input("Enter weight in pounds: "))

# Prompt the user to enter their height
feet = eval(input("Enter height in feet: "))
inches = eval(input("Enter height in inches: "))

height = feet * 12 + inches

KGperLB = 0.45359238
MeterPerInch = 0.0254

# Computer BMI
weightKG = weight * KGperLB
heightMeter = MeterPerInch * height
bmi = weightKG / (heightMeter ** 2)

# Display the results
print(f"BMI is: {bmi}")
if bmi < 18.5:
    print("You are Underweight")
elif bmi < 25:
    print("You are normal")
elif bmi < 30:
    print("You are Overweight")
else:
    print("You are Thicc")