
#include <iostream>
#include "dateType.h" // includes header dataType;
#include "extDateType.h" // includes header extDateType;

using namespace std; 

int main()
{
	int day, month, year; // variables for storing month day and year

	cout << "What Month is it? (ex 11): "; // ask for month  / user input
	cin >> month;
	
	
	cout << "What Day is it? (ex 4): "; // ask for day / user input
	cin >> day;
	
	
	cout << "What Year is it? (ex 2013): "; // ask for year  / user input
	cin >> year;
	
	dateType date1;
	date1.setDate(month, day, year); //passes user inputs for month day and year
	date1.print(); cout << endl; // prints month day and year


	extDateType writtenDate; 
	writtenDate.setDate(month, day, year); // sets the date of dataType
	writtenDate.printLongDate(); // prints the date long wise
	cout << endl; 
	writtenDate.printLongMonthYear(); // prints the date's month and year 
	cout << endl;
	
	system("PAUSE"); // pause and end 

    return 0;
}