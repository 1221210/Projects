#ifndef H_personType
#define H_personType

#include <string>

using namespace std;
class personType {

public:
	void print() const;
	// this function will print out the object that consist of the first name and the last name
	
	void setName(string first, string last);
	// this function sets the firstName and the last Name of the object based on what the user passed in
	//PostCondition: firstName = first, lastName = last
	
	string getFirstName() const;
	//Function to retrieve the first name of the object
	//Post Condition: the value of firstName is returned.
	
	string getLastName() const;
	//Function to retrieve the last name of the object
	//Post Condition: the value of lastName is returned.

	personType(string first, string last);
	// this function sets the firstName and the last Name of the object based on what the user passed in when object gets created. CONSTRUCTOR.
	//PostCondition: firstName = first, lastName = last



private:
		
		string firstName; // variable to store firstname

		string lastName; // variable to store last name




};

#endif