
#ifndef dateType_H // if dateType not defined it is to be defined 
#define dateType_H
   
class dateType
{
public: 
    void setDate(int, int, int);
	// sets month date and year 
	// postcondition: dyear = year, dmonth = month, dDay = day
   
	void setMonth(int);
	// sets month
	// postcondition: makes dMonth = M

    void setDay(int);
	// sets day
	// postcondition: makes dDay = d

    void setYear(int);
	// sets year
	// postcondition: makes dYear = y
	
    void print() const;
	// prints month day and year with dashes (non word)

    int numberOfDaysPassed();
	// variable for the number of days passed in the month
	// post condition returns sumDays

    int numberOfDaysLeft();
	// variable for number of days left in the month 
	// post condition: returns sum of 365 - numberOfDaysPassed();

    void incrementDate(int nDays);
	// increments the date , d,m,y by one
	// dMonth++, dYear++ , dDay++


    int getMonth() const; // funcion for returning month
    int getDay() const;  // function for returning day
    int getYear() const; // function for returning year

    int getDaysInMonth(); // variable for getting days in a specific month
	// postcondition: for months 1,3,5,7,8,10 noOfdays = 31 months 4,6,9 = 30 noOfDays , 
	// if month =2 and is leapyear it is 29 noOfDays else 28 normally

    bool isLeapYear(); //  function that deterines yeap years
	// post condition: if a leap year it sets the boolean to true

    dateType(int = 1, int = 1, int = 1900); // function passes the month and year

private:
    int dMonth;// variable stores number of month
    int dDay;// variable stores number of day
    int dYear;// variable stores number of year
};

#endif