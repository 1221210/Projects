#include "clockType.h"
#include <iostream>
using namespace std;


clockType::clockType(int hours, int minutes, int seconds)
{
	if (0 <= hours && hours < 24) // checks and sets hours
		hr = hours;
	else
		hr = 0;

	if (0 <= minutes && minutes < 60) // checks and sets mins
		min = minutes;
	else
		hr = 0;

	if (0 <= seconds && seconds < 60) // checks and sets secs
		sec = seconds;
	else
		sec = 0;


}

clockType::clockType()
{
	hr = 0;
	min = 0;
	sec = 0;

}
void clockType::setTime(int  hours, int  minutes, int  seconds)
{
	if (0 <= hours && hours < 24) // checks and sets hours
		hr = hours;
	else
		hr = 0;

	if (0 <= minutes && minutes < 60) // checks and sets mins
		min = minutes;
	else
		hr = 0;

	if (0 <= seconds && seconds < 60) // checks and sets secs
		sec = seconds;
	else
		hr = 0;
}

void clockType::printTime() const
{
	if (hr < 10) // add padding if hour < 10
		cout << " ";
	cout << hr << ":";

	if (min < 10) // add padding if hour < 10
		cout << "0";
	cout << min << ":";

	if (sec < 10) // add padding if hour < 10
		cout << "0";
	cout << sec;


}
void clockType::printTime2() const
{
	if (hr < 10) // add padding if hour < 10
		cout << "0";
	cout << hr ;

	if (min < 10) // add padding if hour < 10
		cout << "0";
	cout << min ;

	


}
void clockType::diffTime(clockType setTime)
{
	int hrDif, minDif, secDif;

	if (hr >= setTime.hr) 
	{
		hrDif = hr - setTime.hr;

		if (hrDif < 0) // code for counting difference in time.
		{
			hrDif = 24 + hrDif;
		}

		minDif = min - setTime.min;

		if (minDif < 0) // code for counting difference in time.
		{
			minDif = 60 + minDif;
			hrDif--;
		}

		secDif = sec - setTime.sec;

		if (secDif < 0) // code for counting difference in time.
		{
			secDif = 60 + secDif;
			minDif--;
		}
	}

	if (setTime.hr >= hr)
	{
		hrDif = setTime.hr - hr; // code for counting difference in time.

		if (hrDif < 0)
		{
			hrDif = 24 + hrDif;
		}

		minDif = setTime.min - min;

		if (minDif < 0)
		{
			minDif = 60 + minDif; // code for counting difference in time.
			hrDif--;
		}

		secDif = setTime.sec - sec;

		if (secDif < 0)
		{
			secDif = 60 + secDif; // code for counting difference in time.
			minDif--;
		}
	}

	cout << "The difference in time between the user clock and set clock is: ";
	if (hrDif < 10)
		cout << "0";
	cout << hrDif ;
	if (minDif < 10)
		cout << "0";
	cout << minDif ;
	if (secDif < 10)
		cout << "0";
	cout << secDif;
}


bool clockType::equalTime(const clockType & otherClock) const
{
	return (hr == otherClock.hr &&
		min == otherClock.min &&
		sec == otherClock.sec);

}
void clockType::incrementHours()
{

	hr++;
	if (hr > 23)
	{
		hr = 0;
	}
}

void clockType::incrementMins()
{
	min++;
	if (min > 59)
	{
		min = 0;
		incrementHours();

	}
}
void clockType::getTime(int &hours, int &minutes, int &seconds)
{
	cout << "Enter hours: ";
	cin >> hours;
    hr = hours ;
	cout << "Enter minutes: ";
	cin >> minutes;
	min = minutes;
	cout << "Enter seconds: ";
	cin >> seconds;
	sec = seconds;
}
void clockType::incrementSecs()
{
	sec++;
	if (sec > 59)
	{
		sec = 0;
		incrementMins();
	}
}
void clockType::StandardConversions(clockType& userSetClock)
{


	if (hr < 13) //  (military to standard)
	{
		cout << "Time in Standard form is : ";
			printTime();
		cout << " A.M";
		cout << endl;
	}
	if (hr >= 13) // case hours are greater than 13 subtract 12 from it to get standard variant (military to standard)
	{
		hr = hr - 12;
		cout << "Time in Standard form is : ";
			printTime();
		cout << " P.M";
		cout << endl;
	}

}


void clockType::MilitaryConversions(clockType& userSetClock)
{
	/*
	
	If you want to convert standard time to military time, add 1200 to any time from 1:00pm to 11:00pm. 
	*/


	if (hr > 12 && hr < 12) // case hours are 1 - 11pm then add 12 to it to get military variant (standard to military)
		hr = hr + 12;
	cout << "Time in Military form is : ";
	printTime2();

}




void clockType::elapsedSecondsRemaining(int hours, int minutes, int seconds) // code for remaining time in the day in seconds

{
	int mintoSec = minutes * 60; // calcs for minutes in day in seconds
	int hrtoSec = hours * 3600; // calcs minutes in hours
	int everythingCombined = mintoSec + hrtoSec + seconds;
	// 1 day is 86400 seconds

	cout << "Time in seconds remaining is equal to " << 86400 - everythingCombined << " seconds." << endl; // print statement
	system("pause");


}

void clockType::elapsedSeconds(int hours, int minutes, int seconds) // code for elapsed seconds in the day
{
	int mintoSec = minutes * 60;
	int hrtoSec = hours * 3600;
	int everythingCombined = mintoSec + hrtoSec + seconds;
	cout << "Time in seconds is equal to " << everythingCombined << " seconds." << endl;
	system("pause");


}

