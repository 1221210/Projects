// Ian Selby 700720666
/*
Write a function array_largest() that returns the largest value stored in an array-of-int.
It should take as parameters the name of the array and the size of the array

Then make the main by writing a main() function which calls the array_largest() function
twice, first with an array that contains the values 14,-27,19,56, and 104, and a second time
with an array that contains the values 78, 12, 1015, 738, -14, 12, and 49. After each call, print
the return value from array_largest().
*/
#include <stdio.h>

int array_largest(int array[], int size) {
    

// initialize the value tracking the largest int in the array
    int largest = array[0];

// looop the array to find the larger value. if found set largest to equal it
    for (int i = 1; i < size; i++){
        if(array[i] > largest){
            largest = array[i];
        }
    }
     //return largest
    return largest;
}

int main(void){
    // make two arrays as specified for reference, then calculate their sizes by dividing
    int array1[] = {14,-27,19,56,104};
    int array1size = sizeof(array1) / sizeof(array1[0]);
    int array2[] = {78,12,1015,738,-14,12,49};
    int array2size = sizeof(array2) / sizeof(array2[0]);

    
    // set a int to equal the return value of the array_largest function
    int answer1 = array_largest(array1, array1size);
    int answer2 = array_largest(array2, array2size);

// output results/
    printf("The largest value from array 1 is: %d\n", answer1);
    printf("The largest value from array 2 is: %d\n", answer2);

}
