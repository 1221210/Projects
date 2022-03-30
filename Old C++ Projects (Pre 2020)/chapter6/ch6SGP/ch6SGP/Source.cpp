#include <iostream>
#include <fstream> 
#include <string>
using namespace std;

void classAvg(string&  hardestSubject,string& hardestTeacher,double& hardestAverage ); //prototype for class average
void hardestTeacher(string  hardestSubject, string hardestTeacher, double hardestAverage); //proto for hardest teacher
string hardestSubjectGlobal;
double hardestAverageGlobal;

int main()

{
	string hardestSub;
	string hardestTeach;
	double hardestAvg;
	classAvg(hardestSub, hardestTeach, hardestAvg); //calls class average function

	hardestTeacher(hardestSub, hardestTeach, hardestAvg); //calls hardest teacher function 

	system("pause");
	return 0;
	
}

void classAvg(string&  hardestSubject, string& hardestTeacher, double& hardestAverage) 
{
	ifstream ClassScores;
	ClassScores.open("Text.txt");

	hardestAverage = 100;

	//variables to read and process each record
	int total = 0, score = 0, counter = 0;

	string subject, teacher;
	double average;

	ClassScores >> subject >> teacher;

	while (counter <= 19) // this reads each record in file
	{


		while (score != -99)
		{
			ClassScores >> score; // reads the first score
			if (score != -99)
				total = total + score; // accumulator for all scores per teacher

		}
		average = total / 6; // math for averaging scores 
		total = 0; score = 0;
		// is this teacher tougher than the prior one??
		if (average < hardestAverage) //if average is less than the hardest then it gets set to the average as well as teachers and subjects
		{
			hardestSubject = subject;
			hardestTeacher = teacher;
			hardestAverage = average;
		}
		cout << subject << "    " << teacher << "   " << average << endl;
		ClassScores >> subject >> teacher; // reads the next record
		counter++;

	}
	cout << endl;
	
	
	ClassScores.close();
}

void hardestTeacher(string  hardestSubject, string hardestTeacher, double hardestAverage )
{
	char grade = hardestAverage; //says grade is equal to avg so it outputs a lettergrade for it
	if (hardestAverage >= 90 && hardestAverage <= 100)
	{
		grade = 'A';
	}
	if (hardestAverage >= 80 && hardestAverage <= 89.99)
	{
		grade = 'B';
	}
	if (hardestAverage >= 70 && hardestAverage <= 79.99)
	{
		grade = 'C';
	}
	if (hardestAverage >= 60 && hardestAverage <= 69.99)
	{
		grade = 'D';
	}
	if (hardestAverage <= 59.99)
	{
		grade = 'F';
	}
	cout << "Congrats!!! This Quarter's Hardest Grading Teacher in the subject of " << hardestSubject << " is " << hardestTeacher << " with a average score of: " << hardestAverage << "%" " which is a: "<< grade << endl;
	//cout << hardestSubject << "    " << hardestTeacher << "    " << "   " << hardestAverage << endl;

	system("pause");
}



