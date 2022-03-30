/*
Caleb Lavery and Ian Selby
10/5/2018
This is our pig latin project -the function of this project is to read
a input file and change the input files words to pig latin into a output file
and the program keeps track of how many a,b, and c's there are in the output file.
*/


#include<string>
#include<fstream>
#include<iostream>


using namespace std;

//prototypes
bool isVowel(char ch);
string rotate(string pStr, int len);
string pigLatinString(string pStr);
void getNextWord(ifstream& inF, char& ch, string &word);
void abc();


int main()
{
	//varibles to keep track of certain letters
	int amounta = 0;
	int amountb = 0;
	int amountc = 0;

	char ch; // for processing input file text
	string str;

	ifstream inFile; //input file
	ofstream outFile; //output file
	inFile.open("PigLatinInput.txt"); //opens text file

	if (!inFile) //if file is not found
	{
		cout << "Error inFile not read." << endl;
	}
	outFile.open("PigLatinOutput.txt"); //opens output file
										//start reading characters / processing the input file

	inFile.get(ch); //gets characters

	while (ch != '^') // if character is not a carrot
	{
		while (ch != '\n') //while character is not a endline
		{
			if (ch == ' ') //if character is a space
			{
				outFile << ch; // this simply moves spaces between words
				inFile.get(ch); //gets characters from input file

			}
			else
			{
				getNextWord(inFile, ch, str); // process word
				outFile << pigLatinString(str); // write PigLatin word out to file
			}
		}

		outFile << endl;
		inFile.get(ch); // reads the next char in the file.
		if (ch = '^') //if charcters is a carrot
			break;
	}
	inFile.close(); //close input file
	outFile.close(); //close output file

	abc(); //for counting a , b and c's

	system("pause");
	return 0;
}

bool isVowel(char ch) //determines if a character is a vowel
{

	switch (ch) //list of vowels
	{
	case 'A':
	case 'a':
	case 'E':
	case 'e':
	case 'I':
	case 'i':
	case 'O':
	case 'o':
	case 'U':
	case 'u':
	case 'Y':
	case 'y':
		return true;
	default:
		return false;
	}


	return false;
}


void getNextWord(ifstream& inF, char& ch, string &word) //finds the words/characters in the input file to make the words(finds the words)
{
	word = ch;

	while (ch != ' ' && ch != '\0')
	{
		inF.get(ch);
		if (ch != ' ' && ch != '\0') //if not a space or endline continue to add letter to the string(word)
			word = word + ch;
	}


}
void abc() //used for counting abc's in the output file
{
	//varibles for keeping track of abc's
	int a = 0;
	int b = 0;
	int c = 0;
	char ch; // for processing input file text

	ifstream inFile;
	inFile.open("PigLatinOutput.txt"); //opens file to count abc's
	inFile.get(ch);

	while (inFile) //while loop for counting a b and c in the file.
	{
		switch (ch) //determines if a letter we need to count is in the output file
		{
		case'a':
		case'A':
			a += 1; // makes a + 1 per one counter
			break;
		case'b':
		case'B':
			b += 1;  // makes b + 1 per one counter
			break;
		case'c':
		case'C':
			c += 1;  // makes c + 1 per one counter
			break;




		}
		inFile.get(ch); // reads the next char in the file.



	}
	//tells users how many a,b,and c's there are in the output file
	cout << "There are " << a << " a's in the file." << endl; // tells how many are in file
	cout << "There are " << b << " b's in the file." << endl;  // tells how many are in file
	cout << "There are " << c << " c's in the file." << endl;  // tells how many are in file

	system("pause");

	inFile.close(); //closes the file

}
bool isPunctuation(char ch) {
	//determines if there is punctuation in the file
	switch (ch)
	{
	case ',':
	case '.':
	case '?':
	case '!':
	case ';':
	case '\'':
	case '\"':
		return true;
		break;
	default:
		return false;
	}
}
string rotate(string pStr, int len)  // string for rotating text 
{
	string rStr;
	rStr = pStr.substr(1, len) + pStr[0];
	return rStr; //returns the new string with pig latin
}

string pigLatinString(string pStr) {
	//translates words into pig latin
	string::size_type len = pStr.length(); // calculations for piglatin strings.


	bool foundVowel = false;
	bool isPunct = isPunctuation(pStr[len - 1]);
	char puncMark;

	string::size_type counter;
	if (isPunct)
	{
		puncMark = pStr[len - 1];
		len = len - 1;
	}
	if (isVowel(pStr[0])) //determines if there is a vowel
		pStr = pStr.substr(0, len) + "-way"; //adds -way to the string
	else
	{
		pStr = pStr.substr(0, len) + "-"; //adds - to the string
		pStr = rotate(pStr, len);
		len = pStr.length();
		foundVowel = false;
		for (counter = 1; counter < len - 1; counter++)
			if (isVowel(pStr[0])) //determines if there is a vowel
			{
				foundVowel = true;
				break;
			}
			else
				pStr = rotate(pStr, len);
		if (!foundVowel) // calc for if vowel
			pStr = pStr.substr(1, len) + "-way"; //adds away to word
		else
			pStr = pStr + "ay"; //adds ay to the word
	}
	if (isPunct)
		pStr = pStr = puncMark;
	return pStr; //returns string


}



