//Ian Selby 102918 Example to create and use clock class.

#include<iostream>

using namespace std;

class clockType
{
public:
	void setTime(int , int , int );
	void getTime(int, int, int);
	void printTime() const;
	void incrementHours();
	void incrementMins();
	void incrementSecs();
	bool equalTime(const clockType &) const;
	clockType(int, int, int); //constructor with parameters
	clockType(); // def constructor
private:
	int hr;
	int min;
	int sec;

};
int main()
{
	int hours, minutes, seconds;
	
	cout << "We created two clocks: myClock and yourClock" << endl;

	clockType myClock;
	clockType yourClock;
	
	cout << "We set the time in myClock to bee 01:16:50 - thats 1:16:50 AM" << endl;
	myClock.setTime(1, 16, 50);

	cout << "Then it will print myClock out: " << endl;
	myClock.printTime();
	cout << endl << endl;

	cout << "We set the time in myClock to bee 13:55:00 - thats 1:55 PM" << endl;
	//yourClock.setTime(1, 16, 50);
	yourClock.setTime(13, 50, 00);
	cout << "Then it will print yourClock out: " << endl;
	yourClock.printTime();
	cout << endl << endl;

	
	if (myClock.equalTime(yourClock))
	{
		cout << "The clock displays the same time of ";
		yourClock.printTime();
	
	}
	else
	{
		cout << "The clocks are NOT the same.";
		cout << "myClock is set to: ";
		myClock.printTime();
		cout << endl;

		cout << "yourClock is set to: ";
		yourClock.printTime();
		cout << endl;
	}
	
	// set the time on my clock to be 17:59:59
	myClock.setTime(17, 59, 59);
	cout << "myClock is set to: ";
	myClock.printTime();
	cout << endl;
			
	myClock.incrementSecs();

	cout << "myClock with 1 additional second" << endl;
	myClock.printTime();
	cout << endl;
	system("pause");

	return 0;
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
		cout << "0";	
	cout << hr << ":";

	if (min < 10) // add padding if hour < 10
		cout << "0";
	cout << min << ":";
	
	if (sec < 10) // add padding if hour < 10
		cout << "0";
	cout << sec ;
	
	
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
void clockType::getTime(int hours, int minutes, int seconds)
{
	hours = hr;
	minutes = min;
	seconds = sec;
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