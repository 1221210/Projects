/*Ian, Hannah, Ian
9-21-18
Student Grade Function*/

//This function finds the student grade averages for their classes and outputs that as well as who is the top student by average

#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>
#include <cctype>
#include <fstream>
#include <cstdlib>

using namespace std;

int main()
{
	ifstream File;
	File.open("Q1StudentScores.txt");

	//variables
	string name;
	string topName;
	int topScore = 0;
	int total = 0;
	double average;
	int score = 0;
	int counter = 1;
	int A = (score >= 90 && score <= 100);
	int B = (score >= 80 && score <= 89.99);
	int C = (score >= 70 && score <= 79.99);
	int D = (score >= 60 && score <= 69.99);
	int F = (score <= 59.99);

	File >> name;

	while (counter <= 26) //this reads each record in the file
	{
		while (score != -99)
		{
			File >> score; //reads the first score
			if (score != -99)
			total += score; //accumulator for all the scores per teacher
		}
		average = total / 7;
		total = 0; score = 0;
		cout << name << average << endl;
		counter++;
		if (average > topScore)
		{
			topScore = average;
			topName = name;
		}
		File >> name;
		switch (score)
	{
		case 1: 
			{
			if(score >= 90 && score <= 100);
			cout << "A" << endl;
			}
		case 2: 
			   {
				  if (score >= 80 && score <= 89.99);
				   cout << "B" << endl;
			   }
		case 3: 
			   {
				  if (score >= 70 && score <= 79.99); cout << "C" << endl;
			   }
		case 4: 
			   {
			if (score >= 60 && score <= 69.99); cout << "D" << endl;
			   }
		case 5: 
			   {
				   if (score <= 59.99); cout << "F" << endl;
			   }

		}
	}

	

	
	cout << name << average <<  endl;

	


	File.close();
	system("pause");
	return 0;
}