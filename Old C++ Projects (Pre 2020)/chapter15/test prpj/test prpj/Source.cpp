/*
Desciption: This program will have an hanoi tower, a fibonacci sequence , and a 

*/

#include<iostream>
using namespace std;
int factorial(int num); // prototype for factorial
void hanoi(int count, int pos1, int pos3, int pos2); // prototype for hanoi tower
int rFibNum(int a, int b, int n); // prototype for fibonnaci sequence
#include <iostream>

using namespace std;


int main()
{
	cout << "Now entering factorial " << endl; 
	int number; // number that is made into factorial

	cout << "Please enter a number: "; // ask user for the number to find the factorial for
	cin >> number; // ask user for number

	cout << "The factorial (total number) of " << number << " equals " << factorial(number) << endl; // prints factorial of number

	system("pause");
	system("cls");  // clears for neatness
	
	int firstFibNum, secondFibNum, nth, disks;
	cout << "Now entering fibonacci sequence..." << endl;
	cout << "Enter term for first: "; // ask for first fibonnaci term
	cin >> firstFibNum;
	cout << "Enter term for second: "; // ask for second fibonnaci term
	cin >> secondFibNum;

	cout << "Enter the position Fibonacci series you want" << endl; // ask for term position in fibonacci sequence
	cin >> nth;
	cout << "The Fibonacci number at position " << nth << " is: " << rFibNum(firstFibNum, secondFibNum, nth) << endl; // prints position of fibonacci number

	system("pause");
	system("cls"); // clears for neatness
	cout << " Now Entering Hanoi Tower " << endl;

	cout << "Please enter the number of disk you would like in the tower: "; // user prompt for number of disk in hanoi tower
	cin >> disks;
	hanoi(disks, 1, 3, 2);
	system("pause");
	return 0;
}
void hanoi(int count, int pos1, int pos3, int pos2) // initialization of hanoi variable
{
	static int potato = 0;
	
	if (count > 0)
	{
		hanoi(count - 1, pos1, pos2, pos3);

		cout << "Moving disk " << count << " from " << pos1
			<< " to " << pos3 << "." << endl;
		potato++;
		cout << "Step: " << potato << " ";
		hanoi(count- 1, pos2, pos3, pos1);
	}
}

int rFibNum(int a, int b, int n) // initialization of fibonacci var
{
	if (n == 1)
		return a;
	else if (n == 2)
		return b;
	else
		return rFibNum(a, b, n - 1) + rFibNum(a, b, n - 2); 
}
int factorial(int num) // initialization of factorial 
{
	// base case here
	if (num == 0)
		return 1;
	else
		return num * factorial(num - 1); // recursively returns the number multiplied by the factorial times the number minus 1


}