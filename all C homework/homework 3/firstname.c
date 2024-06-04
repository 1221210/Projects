// Ian Selby 700720666
#include <stdio.h>
// import string.h so I can count the length of strings for the question. 
#include <string.h>
int main(void)
{

// limits char cap to 100
	char name[100];

//ask user for name input 
	printf("Enter your name here: ");
	scanf("%s", name);
	
//print with the user's entered name with "double quotes"
	printf("\"%s\"\n", name);
//print with 20 char wide field whist in quotes and name on right
	printf("\"%20s\"\n", name);
//print with 20 char wide field whist in quotes and name on LEFT
	printf("\"%-20s\"\n", name);
//define var for extra 3 width for last part of question
	int width = strlen(name) + 3;
//print with field 3 spaces wider then the name is
// the %*s tells the program to refer to the extra variable width for the field width
	printf("\"%*s\"\n", width, name);
	return 0;
}
