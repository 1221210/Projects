# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.5

# Variable initialization
kg = 1
lbs = 2.2
lbs2 = 20
kg2 = .45


print(f"KiloGm | Pounds    |     Pounds | Kilos") # print header
print("-" * 40)

while kg < 200 and lbs2 < 516:   # prints conversion when kg < 200 and lbs is < 516
    conversion = kg * lbs
    conversion2 = lbs2 * kg2
    print(f"{kg:<7d}{'|':3s}{round(conversion, 2)}{lbs2:>15d}{'':5s}{round(conversion2, 2)}")  # prints tables
    kg += 2  # increments the values
    lbs2 += 5









