// Ian Selby 700720666
/*
Write a main() function which has the following printf() statements in it:
printf(“I print if FIRST is defined\n”);
printf(“I print if SECOND is defined\n”);
printf(“I print if FIRST and SECOND are defined\n”);
Use the conditional compilation directives #ifdef and/or #if to make the program only execute
the first printf() if the macro FIRST is defined, and only execute the second printf() if
the macro SECOND is defined, and finally execute the third printf() only if both FIRST and
SECOND are defined
*/

#include <stdio.h>

int main() {
    // Check if the macro exist
#ifdef FIRST
    printf("I print if FIRST is defined\n");
#endif

    // Check the second macro is defined
#ifdef SECOND
    printf("I print if SECOND is defined\n");
#endif

    // Check if both of the prior macros are bound
#if defined(FIRST) && defined(SECOND)
    printf("I print if FIRST and SECOND are defined\n");
#endif

    return 0;
}