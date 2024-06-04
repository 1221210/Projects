// Ian Selby 700720666
/*
15 points – Save as sum.c
Define a parameterized macro called:
SUMSQ(x,y)
Which finds the sum of the squares of the 2 parameters, i.e. x*x+y*y
In the main function of the program, test the Macro with the following invocations, printing out
the value calculated by the macro for each one:
SUMSQ (4,6)
SUMSQ (5+2, 1+8)
*/

#define SUMSQ(x, y) ((x)*(x) + (y)*(y))

int main(){
    // test macro
    int answer1 = SUMSQ(4,6);
    int answer2 = SUMSQ(5+2, 1+8);

    // print answers
    printf("Answer 1: %d\n", answer1);
    printf("Answer 2: %d\n", answer2);

    return 0;
}