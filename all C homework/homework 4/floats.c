// Ian Selby 700720666
#include <stdio.h>
#include <ctype.h>

int main(void){
    //initialize vars
    float num1 = 1;
    float num2 = 1;
    float answer; 

    while (1){ // if a float / number
        printf("Enter any nonmumeric input to exit.\n");
        printf("Please enter the first float: \n");
        if (scanf("%f", &num1) !=1){
            break;
        }

        printf("Please enter the second float number: \n");
        if (scanf("%f", &num2) !=1){
            break;
        }
        
        // computer answer
        answer = (num1 - num2) / (num1 * num2); 
        printf("Your answer is %f \n \n", answer);
    }

    return 0;



}