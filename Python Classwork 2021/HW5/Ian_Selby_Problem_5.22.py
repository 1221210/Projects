# cs1030
# name: Ian Selby
# 700720666
# Assignment / Exercise:  Chapter 5.22 Prime number


NUMBER_OF_PRIMES = 190
NUMBER_OF_PRIMES_PER_LINE = 8
count = 0
number = 2

# Print result
print("The first 50 prime numbers are: ")

# REPEATEDLY FIND prime numbers
while count < NUMBER_OF_PRIMES:
    # ASSUME number to be prime
    isPrime = True

    # Test if num is prime
    divisor = 2
    while divisor <= number / 2:
        if number % divisor == 0:
            # if true, the number is not prime
            isPrime = False # set isPrime to false
            break  # exit loop
        divisor += 1

    # Display the prime number and increase the count
    if isPrime:
        count += 1  # increase the count

        print(f"{number:5d}", end = '')
        if count % NUMBER_OF_PRIMES_PER_LINE == 0:
            # Display the number and advance to the new line
            print()  # Jump to new line
    # Check if the next number is prime
    number += 1




