# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise: 2.5 Tip Calculator

# Ask for subtotal, gratuity input
subtotal, gratuity = eval(input("please enter the subtotal and gratuity rate (ex 10, 5): "))

# Calculates gratuity and total values
gratuity = (gratuity / 100) * subtotal
combined = subtotal + gratuity

# prints results
print(f"The gratuity is {gratuity} and the total is {combined}.")
