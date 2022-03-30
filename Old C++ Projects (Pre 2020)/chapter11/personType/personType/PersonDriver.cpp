#include<iostream>
#include <string>
#include "personType.h";
#include "bandMember.h";
using namespace std;

int main()
{
	bandMember band1("DJ", "Roberts" , "brass", "trumpet" , "Sport", "Position");
	personType band2("Cody", "Binder");

	personType athlete1("Brax", "Jordan");
	personType athlete2("Ian", "Devine");

	band1.print();
	band2.print();

	athlete1.print();
	athlete2.print();
	cout << "After band2 gets in trouble at home, his new name is: ";
	band2.setName("Cody", "Thomas");
	band2.print();

	system("pause");
	return 0;
}