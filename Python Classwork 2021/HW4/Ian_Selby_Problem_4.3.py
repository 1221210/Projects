# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 4.3

a, b, c, d, e, f = eval(input("Enter a, b, c, d, e, f: "))

if a*d - b*c == 0:
    print("There is no solution for this equation.")
    exit() # ends program

# Logic for calculating variables if the above is not true
x = (e*d - b*f) / (a*d - b*c)
y = (a*f - e*c) / (a*d - b*c)
e = (a * x + b * y)
f = (c * x + d * y)

# Will print x and y if does not end earlier
print(f"x is {x} and y is {y}")
