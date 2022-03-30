/*
	Name:  Ian Selby
	Date: 9/2/2018 
	Project: CH3 Input-Output OYO Extra Extra Credit
	Description: This program will ask the user for their name, favorite movie, favorite restaurant, 
	and favorite song and then outputs it to a text document called favorites.txt which gets appended to each program run.
	*/


#include <iostream>
#include <fstream>
#include <string>
#include <iomanip>


using namespace std;

int main() 

{
	string name; //name string
	string movie; 
	string restaurant;
	string song;
	ofstream output;
	output.open("favorites.txt", ios::app); //tells it to append to previous results

	
	cout << "-------------------------" << endl; 
	cout << "|||||||||||||||||||||||||" << endl;
	cout << "Use Underscores as spaces" << endl;//a reminder to the used to use underscores as spaces
	cout << "|||||||||||||||||||||||||" << endl;
	cout << "-------------------------" << endl;

	cout << endl; 
	
	system("COLOR 2"); //makes program text color greem

//here are the user prompts for name, movie, restaurant, and songs.
	
	cout << "Enter your first name here: " << endl;
	output << "Enter your first name here: " << endl;
	cin >> name;
	output << name << endl;

	cout << "What is your favorite movie? " << endl;
	output << "What is your favorite movie? " << endl;
	cin >> movie ;
	output << movie << endl;

	cout << "What is your favorite restaurant? " << endl;
	output << "What is your favorite restaurant? " << endl;
	cin >> restaurant;
	output << restaurant << endl;

	cout << "What is your favorite song? " << endl;
	output << "What is your favorite song? " << endl;
	cin >> song;
	output << song << endl;
	output << endl;
	output << endl;

	output.close(); //closes text doc

	
	system("pause");









}