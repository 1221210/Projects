	/*
	Name:  Ian Selby
	Date: 8/31/2018 Last Edited 8:22 pm
	Project: CH3 OYO
	Description: This program will display “Ian - 19" constructed using the “+ or -” symbol after user is prompted"
	*/

	#include <iostream>
	#include <cmath>
	#include <fstream>
	#include <string>
	#include <iomanip>
	using namespace std;
	
	int main() {

	//ifstream input;	char ch1;	string p8 = string(8, ch1);
	string p2 = string(2, ch1);
	string p3 = string(3, ch1);
	string p5 = string(5, ch1);
	string p6 = string(6, ch1);
	string p4 = string(4, ch1);
		ofstream output;		output.open("outputFile.txt"); //tells output file to open		cout << "Enter the letter you wish the words to be made of: "; //prompts user to enter a character to choose what the letters are made of	output << "Enter the letter you wish the words to be made of: ";		cin >> ch1; //here user inputs value for the char.	output << ch1; 	
				 	
	
	//input.open("inputFile.txt");

	system("pause");	//code determining char placement on order to make Ian - 19
	cout << setw(9) << p8 << setw(9) << p8 << setw(9) << p8 << setw(9) << p2 << setw(6) << p5 << endl; //done
	output << setw(9) << p8 << setw(9) << p8 << setw(9) << p8 << setw(9) << p2 << setw(6) << p5 << endl; //done
	cout << setw(9) << p8 << setw(9) << p8 << setw(9) << p8 << setw(9) << p2 << setw(6) << p5 << endl; //done
	output << setw(9) << p8 << setw(9) << p8 << setw(9) << p8 << setw(9) << p2 << setw(6) << p5 << endl; //done
	cout << setw(6) << p2 << setw(7) << p3 << setw(5) << p3 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(3) << p2 << setw(3) << p2 << endl; //done
	output << setw(6) << p2 << setw(7) << p3 << setw(5) << p3 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(3) << p2 << setw(3) << p2 << endl; //done
	cout << setw(6) << p2 << setw(7) << p3 << setw(5) << p3 << setw(3) << p2 << setw(6) << p2 << setw(6) << p5 << setw(3) << p2 << setw(6) << p5 << endl; //done
	output << setw(6) << p2 << setw(7) << p3 << setw(5) << p3 << setw(3) << p2 << setw(6) << p2 << setw(6) << p5 << setw(3) << p2 << setw(6) << p5 << endl; //done
	cout << setw(6) << p2 << setw(12) << p8 << setw(3) << p2 << setw(6) << p2 << setw(6) << p5 << setw(3) << p2 << setw(6) << p5 << endl; //done
	output << setw(6) << p2 << setw(12) << p8 << setw(3) << p2 << setw(6) << p2 << setw(6) << p5 << setw(3) << p2 << setw(6) << p5 << endl; //done
	cout << setw(6) << p2 << setw(12) << p8 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(6) << p2 << endl;
	output << setw(6) << p2 << setw(12) << p8 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(6) << p2 << endl;
	cout << setw(6) << p2 << setw(6) << p2 << setw(6) << p2 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(6) << p2 << endl; //done
	output << setw(6) << p2 << setw(6) << p2 << setw(6) << p2 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(6) << p2 << endl; //done
	cout << setw(9) << p8 << setw(3) << p2 << setw(6) << p2 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(6) << p2 << endl; //done
	output << setw(9) << p8 << setw(3) << p2 << setw(6) << p2 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(6) << p2 << endl; //done
	cout << setw(9) << p8 << setw(3) << p2 << setw(6) << p2 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(6) << p2 << endl; //done
	output << setw(9) << p8 << setw(3) << p2 << setw(6) << p2 << setw(3) << p2 << setw(6) << p2 << setw(9) << p2 << setw(6) << p2 << endl; //done
	//input.close(); //closes file
	output.close(); //this closes file

	system("pause");

	return 0;





}