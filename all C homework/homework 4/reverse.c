// Ian Selby 700720666
#include <stdio.h>

// purpose: to enter 8 integers into an array and print them in reverse. 

int main(void){
    int limit = 7;
    //to print 8 correctly I guess use reallimit)
    int realLimit = 8;
    int array[limit];

    printf("Enter in %d numbers for the array: \n", realLimit);
    for(int i = 0; i <= limit; i++){
        scanf("%d", &array[i]); // read the things from array
    }
    printf("Printing entered numbers: ");

    for(int i = limit; i >= 0; i--){
        printf("%d  " , array[i]); //print array

    }

        return 0;

}