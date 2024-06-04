// Ian Selby 700720666
#include <stdio.h>

/*purpose: to reads integers till 0 is entered. 
When it terminates via int 0 report the total quantity of integers entered and the average
of the even ones and the total quantity and average of the odd ones.*/

int main(void){
// define counters
    int counterEven = 0;
    int counterOdd = 0;
    int quantityOdd = 0;
    int quantityEven = 0;
    int num = 9;

    // prompt user to enter numbers
    printf("Enter integers (enter 0 to terminate): ");
    while (num != 0){ // checks if 0 
        scanf("%d", &num);
        if (num %2 == 0){
            counterEven++;
            quantityEven += num;
        }
        else if (num %2 != 0){
            counterOdd++;
            quantityOdd += num;
        }
    }
    //calculate the averages 
    int averageEven = quantityEven / counterEven;
    int averageOdd = quantityOdd / counterOdd;
    printf("Total quantity of integers entered: %d\n", counterEven + counterOdd);
    printf("Total quantity of even numbers: %d, Average: %d\n", counterEven, averageEven);
    printf("Total quantity of odd numbers: %d, Average: %d\n", counterOdd, averageOdd);
    return 0;
    



}