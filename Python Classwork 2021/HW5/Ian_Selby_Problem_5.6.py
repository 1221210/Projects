# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.6

# Variable initialization
miles = 1
kilometers = 1.609
kilometers2 = 20
miles2 = .621


print(f"Miles | Kilometers    |    Kilometers | Miles") # print header
print("-" * 49)

while miles < 11 and kilometers2 < 66:   # prints conversion when miles < 200 and kilometers is < 516
    conversion = miles * kilometers
    conversion2 = kilometers2 * miles2
    print(f"{miles:<7d}{'|':3s}{round(conversion, 3)}{'':5s}{kilometers2:>15d}{'':5s}{round(conversion2, 3)}")  # prints tables
    miles += 1  # increments the values
    kilometers2 += 5