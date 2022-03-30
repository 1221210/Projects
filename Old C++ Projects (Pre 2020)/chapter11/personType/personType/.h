#ifndef H_athletes
#define H_athletes

#include<string>
#include"personType.h";

using namespace std;
class athletes : public personType {
	//sport and position are 2 tingys
public:
	void print() const;  // mod to user base class  print name
						 // this function will print out the object that consist of the first name and the last name, Sport and Position.

	void setSport(string Sport);
	// this function sets the Sport of the object based on what the user passed in
	//PostCondition: Sport = Sport 

	void setPosition(string thePosition);
	// this function sets the Position the student plays based on what the user passed it
	//PostCondition: Position = thePosition

	string getSport() const;
	//Function to retrieve the secction of the band student plays in
	//Post Condition: the value of Sport is returned.

	string getPosition() const;
	//Function to retrieve the Position played
	//Post Condition: the value of Position is returned.

	athletes(string first, string last, string Sport, string thePosition);

	// this function sets the Sport and Position the student plays on what the user passed in when object gets created. CONSTRUCTOR.
	//PostCondition: Sport = Sport, Position = thePosition



private:

	string Sport; // variable to store Sport name

	string Position; // variable to store Position played




};

#endif