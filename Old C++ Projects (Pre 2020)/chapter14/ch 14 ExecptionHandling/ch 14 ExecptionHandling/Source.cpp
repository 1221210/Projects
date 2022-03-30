// Ian Selby 120618 Big Group Shadow - Error Handlingg Examples
#include <iostream>
#include <cassert>
#include <string>
using namespace std;

int main()
{
int n, d; // variables for numerator and denominator
// EXAMPLE NUMBER ONE - SIMPLE ERROR HANDLING DIVIDE  by 0
//EXAMPLE NUMBER TWO - THROW AND INTEGER / VARIABLE AS THE ERROR TYPE
try { // checking for issues with divide by zero}
	cout << "Please enter a numerator: " << endl;
	cin >> n;

	cout << "Please enter a denominator ( it must be positive ) : " << endl;
	cin >> d;
	if (d == 0 || d == -0)
		throw d;
	else if (d < 0)
		throw string ("No negatives allowed!!! ");
	//assert(d != 0);


	cout << n << " divided by " << d << " equals " << n / d << endl;
}// end of try block for divide by zero
catch(int x)
{
	cout << "Division by "<< x <<" is not allowed. " << endl;

}
catch (string s)
{
	cout << s << endl;
}

system("pause");
return 0;

} 