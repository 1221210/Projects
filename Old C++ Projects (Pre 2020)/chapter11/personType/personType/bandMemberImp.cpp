#include <string>
#include <iostream>
#include "bandMember.h"
#include "personType.h"
using namespace std;


void bandMember::print() const
{
	personType::print(); // print First name / last name of band member
	cout << "Section: " << section << " Instrument: " << instrument << endl;
}
void bandMember::setSection(string bandSection)
{
	section = bandSection;

}
void bandMember::setInstrument(string theInstrument)
{}
string bandMember::getSection() const
{
	return section;
}
string bandMember::getInstrument() const
{
	return instrument;
}
bandMember::bandMember(string first, string last, string bandSection, string theInstrument, string theSport, string thePosition) :personType(first, last)// :athletes(Sport, Position)
{
	section = bandSection;
	instrument = theInstrument;

}
string section; 
string instrument;





