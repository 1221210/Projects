class clockType 
{
public:
	void setTime(int, int, int);
	//function to set the time 
	// the time is set according to the parameters 
	// PostCondition: hr = hours , min = minutes, sec = seconds.
	//			      the functions checks weather the value of hours minutes and seconds
	//			      are valid. if a values is invalid the default value of 0 is assigned.
	
	void getTime(int &hours, int &minutes, int &seconds);
		// Functon to get the time
	// Post Condition hours, minutes, seconds set
	
	void printTime() const;
	// Function to print the time
	// Post condition hours , minutes, seconds set
	void printTime2() const;
	// Function to print the time
	// Post condition hours , minutes, seconds set (for military no semicolon.)

	void incrementHours();
	// Function to increment the hours by 1 
	// Post condition: the Mins is incremented by 1 hour
	
	void incrementMins();
	// Function to increment the hours by 1 
	// Post condition: the Mins is incremented by 1 minute. if minute is intitially set to 59,
	// the minute is reset to 00 and increment the hour by 1

	void incrementSecs();
	// Function to increment the minutes by 1 
	// Post condition: the Mins is incremented by 1 hour. if second is intitially set to 59,
	// the second is reset to 00 and increment the minutes by 1
	
	void elapsedSecondsRemaining(int hours, int minutes, int seconds);
	//function to take time and display it as elapsed seconds left in the day 
	//post condition : takes total seconds in a day and subtracts elapsed time
	
	void StandardConversions(clockType& userSetClock);
		// converts military to standard time
		// if hr is > 13 subtract 12 from it to get standard.
	void MilitaryConversions(clockType& userSetClock);
		// converts standard to military time
	// if hr is > 12 add 12 from it to get military.

	
	void diffTime(clockType settime);
	// function to calc difference between the two times.
	// post condition will take the 2 times and get the difference.

	void elapsedSeconds(int hours, int minutes, int seconds);
	//function to take time and display it as elapsed seconds
	//post condition : takes minutes and hours and converts them to minutes

	bool equalTime(const clockType &) const;
	// Function to determine if two clock settings are equal (clocks set to the same time)
	// Post condition: returns a true if they are, otherwise returns false

	clockType(int, int, int); //constructor with parameters
	
	clockType(); 
	// def constructor
	// post condition: sec, min, and hr set all to 0.

private:
	int hr;
	int min;
	int sec;

};