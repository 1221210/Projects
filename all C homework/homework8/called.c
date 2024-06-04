// Ian Selby 700720666
#include <stdio.h>

/*
Goal:

Write a function called times_called() that returns the number of times it has been called
(Hint: you need to use a Block scope Static variable).

Test it by writing a main function that calls times_called() in a loop 10 times, printing the
value returned from times_called() each time through the loop.

*/
static int counter;

int times_called(){
   static int i = 0;
   i++;
   printf("function has been called %d times \n", i);
   }

int main(void){

 for(int i = 0; i < 10; i++){
    times_called();   
    }
}