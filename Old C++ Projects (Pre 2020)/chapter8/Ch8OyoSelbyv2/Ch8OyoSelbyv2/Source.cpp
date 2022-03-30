/* Ian Selby
10.09.18
Description This program will  display a plane seating array and mark if seats are booked or not as well as displaying the seat class types.
*/

#include <iostream>
#include <string>
#include <cstring>
#include <iomanip>
#include <Windows.h>
using namespace std;
//prototypes
void printArray(string prices[][14], string status[][4]); // array print prototype
void printBanner(); // banner print prototype
void firstClass(char thing[][4], int row, int col, int counter); // prototype first class logic
const int RSIZE = 14; // row size set to 13
const int CSIZE = 4; // column to 4
int main()
{
	HANDLE h = GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
	// note colors can be mixed like real life i.e. red and blue should in theory be purple. intensity makes it lighter

	//string quit;
	bool quit = 1 || 'Yes' || 'Y' || 'yes'; // logic for quitting 

	char seatNumber; // variable for seat number question
					 // welcome banner because why not


	cout << "You will be prompted with a list of rooms followed with prices and descriptions" << endl;
	cout << "in which you will enter which you want to rent if any.";
	cout << endl;
	system("pause");
	system("cls");

	char avaliable = 'O'; // status room empty
	char unavaliable = 'X'; // status room full (Want to display in red text so array shows full seats as red.) 

	char roomAvaliability[RSIZE][CSIZE] = // string (array) for roomAvaliability
	{
		{ avaliable, avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable,avaliable } ,{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable,avaliable } ,{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable,avaliable } ,{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable,avaliable } ,{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable, avaliable }
	};
	int row = 1, col = 1;
	bool vacancy;


	char seatClass;

	do {
		vacancy = false;
		//print array
		cout << "Will you be flying with us today on an airplane? 1 for no 0 for yes. ";
		cin >> quit;
		switch (quit) {

		case 1:
			if (quit = 1 || 'Yes' || 'Y' || 'yes') // logic for quitting
			{
				SetConsoleTextAttribute(h, FOREGROUND_BLUE | FOREGROUND_RED | FOREGROUND_INTENSITY);
				cout << "GoodBye" << endl;
				system("pause");
				return 0;
			}
		}
		system("cls");

		printBanner();
		potato:
		cout << endl; cout << "Note: O is avaliable and X is not." << endl << endl;
		cout << "Do you want First Class, Business Class or Economy Class seating?" << endl;
		cout << "Enter F for 1st class , B for business and E for economy. ";
		cin >> seatClass;



		cout << endl;
		int count=1;
		

		switch (seatClass) // switch statement for selecting seat type when running program.
		{
		case 'F':
			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "          A" "    B" "    C" "    D" << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
			firstClass(roomAvaliability, row, col, count);
			break;
		case 'B':
			count = 3;
			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "          A" "    B" "    C" "    D" << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
			for (row = 3; row < 8; row++) //couts seats  array
			{

				if (count < 10)
					cout << " ";
				cout << "Row " << count << " | ";
				SetConsoleTextAttribute(h, FOREGROUND_GREEN);

				for (col = 0; col < CSIZE; col++)
					cout << setw(2) << roomAvaliability[row][col] << " | ";
				cout << endl;
				count++;
				SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);

			} break;
		case 'E':
			count = 8;
			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "          A" "    B" "    C" "    D" << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
			for (row = 8; row < 14; row++) //couts seating array
			{

				if (count < 10)
					cout << " ";
				cout << "Row " << count << " | ";

				for (col = 0; col < CSIZE; col++)
					cout << setw(2) << roomAvaliability[row][col] << " | ";
				cout << endl;
				count++;

			} break;
		default:
			cout << "This is an invalid seat class. Try Again! " << endl;
			goto potato;
			system("pause");
			return 1;

		}
		cout << endl;


		cout << endl;




		cout << endl;
		SetConsoleTextAttribute(h, FOREGROUND_BLUE); // prompts for seat/row choice
		cout << "Blue Rows are First Class,";
		SetConsoleTextAttribute(h, FOREGROUND_GREEN);
		cout << "Green rows are Business Class";
		SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
		cout << " ,and White Rows are economy class." << endl;
	label:
		cout << " What row do you want to sit in? ";
		cin >> row;
		cout << "What seat do you want to sit in? ";
		cin >> seatNumber;

		col = seatNumber - 65;





		if (row < 1 || row >13 || seatNumber < 'A' || seatNumber > 'D') // logic for invalid seat numbers
		{
			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "Sorry this is an invalid seat number please try again." << endl;
			cout << endl;
			cout << "Enter a proper seat number described above:";
			cin >> seatNumber;
			cout << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);

		}

		if (roomAvaliability[row][col] == 'X') // logic for when seat is already taken
		{


			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "Sorry this seat is already taken. Please pick another." << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);

			goto label; //returns to prior question 
		}

		if (roomAvaliability[row][col] == avaliable)
		{


			cout << "You have reserved seat: " << row << seatNumber << endl;
			cout << endl;
			roomAvaliability[row][col] = unavaliable;

		}
		// note it gets set unavaliable  just before this and since it is set to an 'X' this statement gets triggered every time.




		for (row = 1; row < RSIZE; row++)

			for (col = 0; col < CSIZE; col++)
			{
				if (roomAvaliability[row][col] == 'O')
					vacancy = true;
			}







	} while (vacancy = true);
	cout << endl; // when all seats are finally full it couts this message and ends.
	cout << " All seats are now sold out., Goodbye! " << endl;
	system("pause");
	return 0;
}

void printArray(string prices[][14], string status[][4]) //function for printing the array
{
	int row1; int column1; int column2;

	for (row1 = 1; row1 < 14; row1++) //couts room price array
	{

		for (column2 = 0; column2 < 4; column2++)
			cout << setw(2) << status[row1][column2] << " | ";
		cout << endl;
	}




}

void firstClass(char thing[][4], int row, int col, int counter) // code for first class function
{
	using namespace std;
	//char thing; int count, col, row;
	counter = 1;
	HANDLE h = GetStdHandle(STD_OUTPUT_HANDLE);

	for (row = 1; row < 3; row++) //couts seats  array
	{

		if (counter < 10)
			cout << " ";
		cout << "Row " << counter << " | ";
		SetConsoleTextAttribute(h, FOREGROUND_BLUE);

		for (col = 0; col < CSIZE; col++)
			cout << setw(2) << thing[row][col] << " | ";
		cout << endl;
		counter++;
		SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
	}
}

void printBanner() // code for print banner function


{
	HANDLE h = GetStdHandle(STD_OUTPUT_HANDLE);
	using namespace std;

	SetConsoleTextAttribute(h, FOREGROUND_RED);
	cout << "                                     --------------------------------------------" << endl;
	cout << "                                    |                                            |" << endl;
	cout << "                                    |       Hello!! Welcome to An Airplane       |" << endl;
	cout << "                                    |                                            |" << endl;
	cout << "                                    |            We hope you enjoy               |" << endl;
	cout << "                                    |                your stay !!!               |" << endl;
	cout << "                                    |                                            |" << endl;
	cout << "                                     --------------------------------------------" << endl;
	cout << endl;
	SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
}