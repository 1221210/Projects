# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.3 KG to LBS

# Variable initialization
kg = 1
lbs = 2.2


print(f"KiloGm | Pounds")
print("-" * 20)

while kg < 200:
    conversion = kg * lbs
    print(f"{kg:<7d}{'|':3s}{round(conversion, 2)}")
    kg += 2

