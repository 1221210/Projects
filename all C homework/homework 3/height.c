// Ian Selby 700720666
#include <stdio.h>
int main(void){

// limits char cap to 100 and defines height variable
	char name[100];
    float height;
    float heightFeet;

// ask for name and height and then displays it in correct format *feet*
    printf("Please enter your height in inches: \n");
    scanf("%f", &height);

    printf("Please enter your first name: \n");
    scanf("%s", name );

    heightFeet = height / 12;

    printf("%s, you are %.3f feet tall \n", name, heightFeet);
    return 0;
}