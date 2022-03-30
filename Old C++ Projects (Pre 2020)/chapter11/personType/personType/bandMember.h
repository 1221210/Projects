#ifndef H_bandMember
#define H_bandMember

#include<string>
#include"personType.h";

using namespace std;
class bandMember : public personType {

public:
	void print() const;  // mod to user base class  print name
	// this function will print out the object that consist of the first name and the last name, section and instrument.

	void setSection(string bandSection);
	// this function sets the section of the object based on what the user passed in
	//PostCondition: section = bandsection 

	void setInstrument(string theInstrument);
	// this function sets the instrument the student plays based on what the user passed it
	//PostCondition: instrument = theInstrument

	string getSection() const;
	//Function to retrieve the secction of the band student plays in
	//Post Condition: the value of section is returned.

	string getInstrument() const;
	//Function to retrieve the instrument played
	//Post Condition: the value of instrument is returned.

	bandMember(string first, string last, string bandSection, string theInstrument, string theSport, string thePosition);
	
	// this function sets the section and instrument the student plays on what the user passed in when object gets created. CONSTRUCTOR.
	//PostCondition: section = bandSection, instrument = theInstrument



private:

	string section; // variable to store section name

	string instrument; // variable to store instrument played




};

#endif