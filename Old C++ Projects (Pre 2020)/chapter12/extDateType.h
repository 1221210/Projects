
#ifndef extDateType_H // if extDateType not defined it is to be defined 
#define extDateType_H

#include <string>
  
#include "dateType.h"  // include dateType header

using namespace std;
 
class extDateType: public dateType 
{
public:
  
	void printLongDate();
	// prints month and day
	// post condition: returns month and day
	
	void setDate(int, int, int);
	// sets the date in m,d,y format
    // post condition setdate(m,d,y)
	void setMonth(int m);
	// sets the month 
	// post condition: month = months[m];

   
	void printLongMonthYear();
	// prints  month and year
	// post condition: returns month and year
  
	extDateType(); 
	// sets date type
	// post condition: sets month = January


    extDateType(int, int, int); 
	// calls setdate m,d,y

private:
    string month; // stores the month 
};

#endif