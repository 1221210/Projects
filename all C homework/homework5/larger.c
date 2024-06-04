// Ian Selby 700720666
#include <stdio.h>
void larger_of(double *x, double *y){
// checks if x < y and sets accordingly
    if (*x < *y){
        *x = *y;
    } else {
        *y = *x;
    }
}

int main(void)
{
    double x;
    double y;

    // Ask user for 2 numbers
    printf("Please enter your first number: \n");
    scanf("%lf", &x);

    printf("Please enter your second number: \n");
    scanf("%lf", &y);

    // call the function to choose the larger value
    larger_of(&x, &y);

    //print the results from larger)_of
    printf("Results after larger_of: \n");
    printf("x: %lf \n",x);
    printf("y: %lf \n",y);

    return 0;

}