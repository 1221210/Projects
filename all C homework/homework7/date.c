//Ian Selby 700720666
#include <stdio.h>

/*

25 points – Save as date.c
Write a program named date.c that accepts a date from the user in the form mm/dd/yyyy and
then displays it in the form month dd, yyyy, where month is the name of the month. 

Here is a
sample run of the program:
Enter a date (mm/dd/yyyy): 2/17/2011
You entered the date February 17, 2011

Hints: Store the month names in an array that contains pointers to string.
 You can use memchr() to search for the ‘/’ characters that separate the numbers, and
then use atoi() to do the conversions.

*/

// declaration of months array
const char *months[] = {
    "", "January", "February", "March", "April", "May", "June", 
    "July", "August", "September", "October", "November", "December"
};

int main(){
    char date[12]; //var for the date if data starts at 0

    printf("Enter a date as formatted(mm/dd/yyyy): ");
    // ask user for input
    fgets(date, sizeof(date), stdin);

    // define variables for month, day aND YEAR
    int month = atoi(date);
    int day = atoi(date + 3); // Skips the month and the / format
    int year = atoi(date + 6); // Skip the month, and the / as well as the day to get the year


    // print output
    printf("You entered the date %s %d, %d\n", months[month], day, year);
    return 0;


}
// initial attempt, retrying with newer stuff
// #include <stdio.h>
// #include <stdlib.h>

// int main() {
//     char date[12]; // Assumes the input won't go past 11 chars 
//     int month, day, year;

//     printf("Enter a date (mm/dd/yyyy): ");
//     fgets(date, sizeof(date), stdin);

//     month = atoi(date);
//     day = atoi(date + 3); // Skips month and  '/'
//     year = atoi(date + 6); // Skip month, '/' and day


//     printf("You entered the date ");
//     switch (month) {
//         case 1: printf("January"); break;
//         case 2: printf("February"); break;
//         case 3: printf("March"); break;
//         case 4: printf("April"); break;
//         case 5: printf("May"); break;
//         case 6: printf("June"); break;
//         case 7: printf("July"); break;
//         case 8: printf("August"); break;
//         case 9: printf("September"); break;
//         case 10: printf("October"); break;
//         case 11: printf("November"); break;
//         case 12: printf("December"); break;
//         default: printf("Invalid month"); break;
//     }
//     printf(" %d, %d\n", day, year);

//     return 0;
// }
