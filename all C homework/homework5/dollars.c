// Ian Selby 700720666
#include <stdio.h>

void pay_amount(int dollars, int *twenties, int *tens, int *fives, int*ones){
    *twenties = dollars / 20;
    dollars = dollars - (*twenties * 20);
    *tens = dollars / 10;
    dollars = dollars - (*tens * 10);
    *fives = dollars / 5;
    dollars = dollars - (*fives * 5);
    *ones = dollars / 1;
    dollars = dollars - (*ones * 1);
}

int main(void)
{
    int dollars; 
    int twenties; 
    int tens;
    int fives;
    int ones;

    // Ask user numbers
    printf("Please enter your number to be calculated (in whole dollars): \n");
    scanf("%d", &dollars);


    // call the function to calculate payment in bills
    pay_amount(dollars, &twenties, &tens, &fives, &ones);

    //print the results from pay amount
    printf("Results after pay_amount: \n");
    printf("Twenties: %d \n",twenties);
    printf("Tens: %d \n",tens);
    printf("Fives: %d \n",fives);
    printf("Ones: %d \n",ones);


    return 0;

}