/*
Name:  Ian Selby
Date: 9/17/2018 
Project: CH5 On Your Own
Description: This program will let the user buy an item, name it's price, give a total amount of items purchased,
calculate taxes at a constant rate of .0395 , calculates and displays the total amount due, then include a screen HOLD or
system pause input prompt so display can be played on screen.
*/

#include <iostream>
#include <string>
#include <iomanip>
#include <fstream>

using namespace std;

int main()
{
	int creditScore;
	double interest;
	double interestRate;
	int BMW = 1;
	int Dodge = 2;
	int Ford = 3;
	int Prius = 4;
	int Flinstone = 5;
	double BMWcost = 40000.00;
	double DodgeCost = 23500.00;
	double FordCost = 25000.00;
	double PriusCost = 20000.00;
	double FlintstoneCost = 1000.00;
	int vehicleChoice;
	int vehicleChoiceCost;
	double applied;
	double payment;
	int counter = 1;
	ofstream output;

	cout << fixed << showpoint << setprecision(2); //makes numbers 2 decimal places
	output.open("vehiclePayment.txt");

	cout << "The cars we have are the BMW M3, Dodge Ram, Ford f-150, Prius, and Flinstones Cars." << endl;
	cout << "Which vehicle would you like to buy?" << endl;
	cout << "Enter 1 for BMW, 2 for Dodge, 3 for Ford, 4 for Prius, or 5 for Flintstone to choose." << endl;

	cin >> vehicleChoice;

	system("pause");
	
	cout << "Enter your credit score: ";  cin >> creditScore;

	if (creditScore >= 800)
	{
		interestRate = 0.03 / 12;
	}
	if (creditScore >= 700 && creditScore <= 799)
	{
		interestRate = 0.05 / 12;
	}
	if (creditScore >= 600 && creditScore <= 699)
	{
		interestRate = 0.07 / 12;
	}
	if (creditScore < 600)
	{
		interestRate = 0.12 / 12;
	}
	cout << "How much are you able to pay monthly? Please enter that here: $"; cin >> payment; cout << endl;

	switch (vehicleChoice)
	{
	case 1:
	{
		cout << "You have chosen the BMW " "it cost $" << BMWcost << endl;
		system("pause");

		vehicleChoiceCost = BMWcost;



		break;
	}

	case 2:
	{
		cout << "You have chosen the Dodge " "it cost $" << BMWcost << endl;
		system("pause");

		vehicleChoiceCost = DodgeCost;

		break;
	}
	case 3:
	{
		cout << "You have chosen the Ford " "it cost $" << FordCost << endl;
		system("pause");

		vehicleChoiceCost = FordCost;

		break;
	}
	case 4:
	{
		cout << "You have chosen the Prius " "it cost $" << PriusCost << endl;
		system("pause");

		vehicleChoiceCost = PriusCost;

		break;
	}
	case 5:
	{
		cout << "You have chosen the Flintstone Mobile " "it cost $" << FlintstoneCost << endl;
		system("pause");

		vehicleChoiceCost = FlintstoneCost;

		break;
	}
	}
	output << "This is your personal vehicle payment plan for your vehicle" << endl;
	cout << setw(8) << "Month" << setw(12) << "Principal" << setw(10) << "Payment" << setw(14) << "Interest" << setw(13) << "Applied" << endl;
	output << setw(8) << "Month" << setw(12) << "Principal" << setw(10) << "Payment" << setw(14) << "Interest" << setw(13) << "Applied" << endl;

	while (vehicleChoiceCost > payment)
	{
		interest = (vehicleChoiceCost * interestRate);
		applied = payment - interest;
		vehicleChoiceCost = vehicleChoiceCost - applied; 
		int printCounter = counter++;
		cout << setw(8)<< right << printCounter <<setw(12) << vehicleChoiceCost << setw(10)  << payment << setw(14) <<   << interest << setw(13)<<"      $" << applied << "      " << endl;
		output << setw(8) << right << printCounter << setw(12) <<   << vehicleChoiceCost << setw(10) <<   << payment << setw(14) <<  << interest << setw(13) << "      $" << applied << "      " << endl;


	}
	output.close();

	system("pause");
	return 0;
}



