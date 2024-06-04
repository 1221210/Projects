// Ian Selby 700720666
#include <stdio.h>
 
 
 /*
 Goal:

 Write a program named sum.c that adds up its command-line arguments, which are assumed to
 be integers. Running the program by typing: ./sum 8 24 62

 */
 
 
 
 int main(int argc, char *argv[]){

    int i;
    int j = 0;

    for(i = 0; i < argc; i++){
        // debug line: printf("%s ", argv[i]);
        j += atoi(argv[i]);
    }
    printf("\nTotal: %d", j);
    return 0;
    
}