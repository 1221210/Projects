// Ian Selby 700720666
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/*
Goal: 

Write a function duplicate() that uses dynamic storage allocation to create a copy of a
string. For example, the call:

p = duplicate(str);

Would allocate space for a string of the same length as str, copy the contents of str into the
new string, and return a pointer to it. Have duplicate() return a null pointer if the
memory allocation fails.

Test the function by writing a main() function which calls the duplicate() function twice,
first with the string “This is a test”, and a second time with a the string “Hello from the
duplicate!”. After each call, print the return value from duplicate(), and then free the
memory associated with the return value

*/



char* duplicate(const char* str){
    int length = strlen(str); // get length of string for memory allowance
    static int i = 0;
    i++;
    printf("Length of string %d is: %d\n" , i , length); // debug length calculatore for strings

    // define the variable for the string to be duped, I added one for the null terminator
    char* dupeString = (char*)malloc((length + 1) * sizeof(char));

    // check if the memory allocation works or not by having a null pointer if the thing fails
    if(dupeString == NULL){
        return NULL;
    }

    // use strcopy to copy string value to dupeString
    strcpy(dupeString, str);

    return dupeString;
}


int main(){

    // statements for testing dupe function
    const char* str1 = "This is a test";
    const char* str2 = "Hello from the duplicate!";

    char* duplicate1 = duplicate(str1);
    printf("The dupe of '%s' is : %s\n", str1, duplicate1);
    free(duplicate1);


    char* duplicate2 = duplicate(str2);
    printf("The dupe of '%s' is : %s\n", str2, duplicate2);
    free(duplicate2);


}


    
