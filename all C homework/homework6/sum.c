// Ian Selby 700720666
/*
Write and test a function called sum_arrays() that sets each element in an array of integers
to the sum of the corresponding elements in two other arrays. That is, if array 1 has the values
2, 4, 5, and 8 and array 2 has the values 1, 0, 4, and 6, the function assigns array 3 the values 3,
4, 9, and 14. The function should take three array names and an array size as arguments.

Test it by writing a main() function which calls sum_arrays() with one array which has
the values 4, -10, 15, 296, and 42, and a second array that has the values 15, 27, 89, -204, and
76. After returning from sum_arrays(), the main()function should print the values
contained in the third result array
*/
#include <stdio.h>

int sum_arrays(int arr1[], int arr2[], int arr3[], int size){
for (int i = 0; i < size; i++){
     arr3[i] = arr1[i] + arr2[i];
    }
}

int main(void){

    // these arrays are to be summed
    int array1[] = {4, -10, 15, 296, 42};
    int array2[] = {5, 27, 89, -204, 76};

    // calculate array's size
    int size = sizeof(array1) / sizeof(array1[0]);

    // make array to hold answer from function
    int result[size];

    // call function
    sum_arrays(array1, array2, result, size);


    // print results by looping through array and printing each one
    printf("values in third resulting array are: ");
    for (int i = 0; i < size; i++){
        printf("%d ", result[i]);
    }

    return 0;

}