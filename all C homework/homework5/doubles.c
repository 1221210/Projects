// Ian Selby 700720666
#include <stdio.h>
void double_sort(double *x, double *y, double *z){
// checks if x < y and sets accordingly
    double temp;

// check if value 1 is larger than value 2
    if(*x > *y){
        temp = *x;
        *x = *y;
        *y = temp;
    }
// check if value 2 is greater than 3
    if(*y > *z){
        temp = *y;
        *y = *z;
        *z = temp;
    }
// double check if value 1 is larger than value 2
    if(*x > *y){
        temp = *x;
        *x = *y;
        *y = temp;
    }


}



int main(void)
{
    double x;
    double y;
    double z;

    // Ask user for 2 numbers
    printf("Please enter your first number: \n");
    scanf("%lf", &x);

    printf("Please enter your second number: \n");
    scanf("%lf", &y);

    printf("Please enter your third number: \n");
    scanf("%lf", &z);

    // call the function to choose the larger value
    double_sort(&x, &y, &z);

    //print the results from larger)_of
    printf("Results after double_sort: \n");
    printf("x: %lf \n",x);
    printf("y: %lf \n",y);
    printf("z: %lf \n",z);


    return 0;

}