// Ian Selby 700720666
#include<stdio.h>

//declariation for void functions
	void one_three();
	void two();

int main(void)
{
	printf("Starting now: \n");
	one_three();
	printf("Done!\n");
	return 0;

}

void two()
{
	printf("two\n");
}

void one_three()
{
	printf("one\n");
	//call two function
	two();

	printf("three\n");
}
