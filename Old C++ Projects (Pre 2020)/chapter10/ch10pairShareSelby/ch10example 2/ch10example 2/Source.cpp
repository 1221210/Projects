//Ian Selby 
// Date :: 102918 
//Description : This project enhances a prior example and  returns the elapsed time in seconds as well as the time remaining in seconds.
// it also determines how far apart the two clocks are. It converts the two times (military and standard time) and it is based off the class example.

#include<iostream>
#include "clockType.h"
using namespace std;


int main()
{
	int hours, minutes, seconds;
	cout << "We created two clocks: userSetClock and setClock" << endl;

	clockType userSetClock;
	clockType setClock;

	cout << "Enter time information below: ";
	userSetClock.getTime(hours, minutes, seconds); // gets user inputted time
	cout << endl;
	cout << "Then it will print userSetClock out: " << endl;
	userSetClock.printTime2(); // prints time out
	cout << endl << endl;

	cout << "We set the time in setClock to be 13:55:01 - thats 1:55 PM" << endl;
	setClock.setTime(13, 55, 01);
	cout << "Then it will print setClock out: " << endl;
	setClock.printTime2(); // prints time out
	cout << endl << endl;


	if (userSetClock.equalTime(setClock))
	{
		cout << "The clocks both display the same time of ";
		setClock.printTime2(); cout << endl; // prints time out

	}
	else
	{
		cout << "The clocks are NOT the same." << endl << endl;
		cout << "userSetClock is set to: ";
		userSetClock.printTime2(); // prints time out
		cout << endl;

		cout << "setClock is set to: ";
		setClock.printTime2(); cout << endl; // prints time out
		cout << endl;

		userSetClock.diffTime(setClock);
	}

	cout << endl;

	userSetClock.incrementSecs(); // increments a second

	cout << "userSetClock with 1 additional second" << endl;
	userSetClock.printTime2(); cout << endl; // prints time out
	cout << endl << endl;

	system("pause");
	
	cout << "userSetClock with military time" << endl;

	userSetClock.MilitaryConversions(userSetClock); // prints time out in military
	cout << endl << endl;
	
	cout << "userSetClock with standard time" << endl;

	userSetClock.StandardConversions(userSetClock); // prints time out in standard
	cout << endl << endl;
	
	cout << "userSetClock with elapsed seconds" << endl;

	userSetClock.elapsedSeconds(hours, minutes, seconds); // prints time out in elapsed seconds
	cout << endl << endl;

	cout << "userSetClock with elapsed seconds remaining" << endl;

	userSetClock.elapsedSecondsRemaining(hours, minutes, seconds); // prints time out in seconds remaining in the day
	cout << endl << endl;

	cout << "End of programme." << endl;
	system("pause");
	
	return 0;
}
