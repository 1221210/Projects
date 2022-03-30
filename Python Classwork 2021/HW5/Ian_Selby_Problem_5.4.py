# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.4 Miles to KM

# Variable initialization
km = 1.609
mile = 1

print(f"{'Miles':7s}{'|':3s}{'Kilometers'}")
print("-" * 20)

while mile < 11:
    kilometers = mile * km
    print(f"{mile:<7d}{'|':3s}{kilometers}")
    mile += 1

