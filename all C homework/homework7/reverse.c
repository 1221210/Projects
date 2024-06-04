// Ian Selby 700720666
#include <stdio.h>

/*
Goal: 

Write a program named reverse.c that echoes it’s command-line arguments in reverse order.
Running the program by typing
./reverse void and null
Should produce the following output:
null and void

*/

int main(int argc, char *argv[]){

    int i;

 // logic for reading normally and then printing command line arguments

    // for(i = 0; i < argc; i++){
    //     printf("%s ", argv[i]);
    // }
    // return 0;

// -1 added to offset null starting position, then iterates through arguments backwards.
 for(i = argc - 1; i>0; i--){
        printf("%s ", argv[i]);
    }
    return 0;


}