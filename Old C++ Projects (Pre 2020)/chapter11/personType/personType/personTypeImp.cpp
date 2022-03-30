#include<iostream>
#include <string>
#include "personType.h";
#include "bandMember.h";

using namespace std;


void personType::print() const
{
	cout << firstName << "  " << lastName << endl;

}

void personType::setName(string first, string last)
{
	firstName = first;
	lastName = last;

}

string personType::getFirstName() const
{
	return firstName;
}

string personType::getLastName() const
{
	return lastName;
}

personType::personType(string first, string last)
{

	firstName = first;
	lastName = last;

}

