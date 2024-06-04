// Ian Selby 700720666

#include <stdio.h>

// Prototypes for calculator
double add(double x, double y);
double sub(double x, double y);
double mul(double x, double y);
double divide(double x, double y);

// Structure for commands
struct cmd
{
    char cmd_name;
    double (*cmd_pointer)(double, double);
};

struct cmd calc_cmds[] =
    {
        {'+', add},
        {'-', sub},
        {'*', mul},
        {'/', divide},
    };
// configurations use .4l for 4 decimal places
// Addition configuration
double add(double x, double y)
{
    double sum = x + y;
    printf("%.4lf + %.4lf = %.4lf\n", x, y, sum);
    return sum;
}

// Subtraction configuration
double sub(double x, double y)
{
    double answer = x - y;
    printf("%.4lf - %.4lf = %.4lf\n", x, y, answer);
    return answer;
}

// Multiplication configuration
double mul(double x, double y)
{
    double answer = x * y;
    printf("%.4lf * %.4lf = %.4lf\n", x, y, answer);
    return answer;
}

// Division configuration
double divide(double x, double y)
{
    if (y == 0)
    {
        printf("Oops!: You divided by zero. Ending program.\n");
        return 0;
    }
    double answer = x / y;
    printf("%.4lf / %.4lf = %.4lf\n", x, y, answer);
    return answer;
}

int main()
{
    double operand1, operand2;
    char operation;
    while (scanf("%lf %c %lf", &operand1, &operation, &operand2) == 3)
    {  // checks 
        for (int counter = 0; counter < sizeof(calc_cmds) / sizeof(calc_cmds[0]); counter++)
        // checks the size of the entire array vs the size of one element to get total amount of elements in array
        {
            if (calc_cmds[counter].cmd_name == operation) 
            {
                double answer = calc_cmds[counter].cmd_pointer(operand1, operand2);
                // printf("%.4lf %c %.4lf = %.4lf \n", operand1, operation, operand2, answer);
                break;
            }
        }
    }
    return 0;
}
