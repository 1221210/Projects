#include <string>
#include <iostream>
#include "athletes.h"
#include "personType.h"
#include "athletes.h"
using namespace std;


void athletes::print() const
{
	personType::print(); // print First name / last name of band member
	cout << "Sport: " << Sport << " Position: " << Position << endl;
}
void athletes::setSport(string Sport)
{
	Sport = Sport;

}
void athletes::setPosition(string thePosition)
{}
string athletes::getSport() const
{
	return Sport;
}
string athletes::getPosition() const
{
	return Position;
}
athletes::athletes(string first, string last, string Sport, string thePosition) :personType(first, last)
{
	Sport = Sport;
	Position = thePosition;

}
string Sport;
string Position;





