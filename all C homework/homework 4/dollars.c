// Ian Selby 700720666
#include <stdio.h>

// 

int main(void){
    //initialize the counter
    int i = 0;
    
    while (i <= 5){ // set layer cap
        int j = 1; // define J so I can compare the layers left to make and how many to print

        while (j <= i){
            printf("$");
            j++;
        }
        printf("\n");
        i++;

    }
    return 0;
}