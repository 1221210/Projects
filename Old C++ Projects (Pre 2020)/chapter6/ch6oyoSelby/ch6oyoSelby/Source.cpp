/* Ian Selby
9.27.18
This program ask the user their name, age and what type of service they want to purchase and how much it all cost.  */


#include <iostream>
#include <string>
#include <iomanip>
#include <fstream>
#include <cstdlib>
using namespace std;

//prototypes ///////////////////////////////////////////////////////
void printMenu();
void getInfo(string& name, int& nbrMonths, int& nbrTraining, int& age);
void calcPrint(string name, int nbrMonths, int nbrTraining, int age);
//endPrototypes ////////////////////////////////////////////////////

int main()
{
	string yourName;
	int yourMonths;
	int yourTraining;
	int yourAge;


	// call to print thr info banner
	printMenu();

	//call to get info from customer
	getInfo(yourName, yourMonths, yourTraining, yourAge);

	//call to calc print
	calcPrint(yourName, yourMonths, yourTraining, yourAge);

	system("pause");
	return 0;

}
void getInfo(string & name, int& nbrMonths, int& nbrTraining, int& age)
{
	int userInput;

	cout << "Enter First Name Here:";
	cin >> name;


	cout << "Enter Age :";

	cin >> age;
	cout << "Enter 1 for Standard Membership, or 2 for personal trainer." << endl; //ask which type of service they want
	cin >> userInput;
	switch (userInput)
	case 1:
	{
		if (userInput == 1)
		{
			cout << "You have selected the Standard Membership. " << endl; //states service
			cout << "Please enter how many months of member ship you want. Membership is 20$ monthly. " << endl;
			cin >> nbrMonths;
			if (age >= 55)
			{
				cout << "Since you are a senior citizen we are applying a 30% discount to your total." << endl;
			}
			break;

		}

	case 2:
	{
		if (userInput == 2)
		{
			cout << "You have selected the Personal Trainer. " << endl; //states service
			cout << "Please enter how many sessions of personal training you want. Sessions are 25$ each. " << endl;
			cin >> nbrTraining;
			if (age >= 55)
			{
				cout << "Since you are a senior citizen we are applying a 30% discount to your total." << endl;
			}

			break;
		}


	}
	case 3:
	{
		if (userInput != 2 && userInput != 1) // if answer is not what is requested it results in an error
		{
			cout << "Sorry the membership you have tried entering is invalid." << endl;
		}
		break;
	}
	}






}
void calcPrint(string name, int nbrMonths, int nbrTraining, int age)
{
	 
	double totalMembership;
	double totalTrainer;
	
	 if (nbrTraining < 5)
	{
		totalTrainer = (nbrTraining * 25 ) ; // with optional senior discount
		if (age >= 55)
			 
			totalTrainer = totalTrainer * .7;
		cout << "Your total for Personal trainer is : $" << totalTrainer << endl; 
		system("pause");
		exit(0);

	 }
	 else
	 {
		 totalTrainer = (nbrTraining * 25 * .80); // with 20% discount and possible senior discount.
		 if (age >= 55)
			  
			 totalTrainer = totalTrainer * .7;
		 cout << "Your total for Personal training with 20% off is : $" << totalTrainer << endl;
		system("pause");
		exit(0);
	 }


	 if (nbrMonths < 12)
	{
		totalMembership = (nbrMonths * 20 ) ; //total with optional senior discount
		if (age >= 55)
			 
			totalMembership = totalMembership * .7;
	 cout << "Your total for standard membership is : $" << totalMembership << endl; 
	 system("pause");
	 exit(0);
	}	
	 else
	 {
		 totalMembership = (nbrMonths * 20 * .85); // with 15% discount and optional senior discount
		 if (age >= 55)
			  
			 totalMembership = totalMembership * .7;
		 cout << "Your total for standard membership with 15% off is : $" << totalMembership << endl; 
		 system("pause");
		 exit(0);
	 }

	



}
void printMenu()
{
	char ch1 = '-';
	string d44 = string(44, ch1);

	cout << setw(81) << d44 << endl;
	cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
	cout << string(36, ' ') << " | " << "Hello Welcome to Murphy's Fitness Center |" << endl;
	cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
	cout << setw(81) << d44 << endl;

	cout << "We have several memberships avaliable." << endl;
	cout << "Standard membership: 15% off if more than a twelve month membership. The cost of membership is $20 / month." << endl;
	cout << "Personal Trainer : 20 % discount each session if more than 5 are bought. The cost is 25$ a session." << endl;
	cout << "(Can be bought without membership.) " << endl;
	cout << "Senior Citizens : We Offer at 30 % senior citizen discount(55 and over)" << endl;




}




