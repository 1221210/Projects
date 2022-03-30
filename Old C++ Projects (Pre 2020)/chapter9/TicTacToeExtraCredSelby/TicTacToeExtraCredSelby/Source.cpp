/* Ian Selby
10.29.18
Description This program will display a 3x3 array in the form of a tic tac toe game where user 
can enter x or o and once they get 3 in a row a winner is declared and the winning array is displayed.
*/

#include <iostream>
#include <string>
#include <cstring>
#include <iomanip>
#include <Windows.h>
using namespace std;
//prototypes
void printArray(string prices[][3], string status[][3]); // array print prototype
void printBanner(); // banner print prototype
void firstClass(char thing[][3], int row, int col, int counter); // prototype first class logic
const int RSIZE = 3; // row size set to 3
const int CSIZE = 3; // column to 3

int main()
{
	HANDLE h = GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
	// note colors can be mixed like real life i.e. red and blue should in theory be purple. intensity makes it lighter

	char seatNumber; // variable for seat number question

	system("cls");

	char avaliable = '-'; // status room empty
	char unavaliable = 'X'; // status room full (Want to display in red text so array shows full seats as red.) 
	char unavaliable2 = 'O';
	char unavaliabilitys;
	char squareAvaliability[RSIZE][CSIZE] = // string (array) for squareAvaliability
	{
		{ avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable }
	};
	int row = 0, col = 0;
	bool vacancy;


	char seatClass;

	do {
		vacancy = true;
		system("cls");
		printBanner();
	potato:
		cout << endl; cout << "Note: - is avaliable and X and O are not." << endl << endl;


		cout << endl;
		int count = 0;



		cout << "          A" "    B" "    C" << endl;
		SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
		firstClass(squareAvaliability, row, col, count);


		cout << endl;




	label2:

		cout << " What row do you want to choose? ";
		cin >> row;
	




		if (row != 1 && row != 2 && row != 0) //INVALID ROW LOGIC
		{
			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "Sorry this is an invalid row please try again." << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);

			cout << endl;
			goto label2;
			cout << endl;

		}
	
	label:
		cout << "What column (A,B,C) do you want to choose? ";
		cin >> seatNumber;

		col = seatNumber - 65;
		if ( seatNumber < 'A' || seatNumber > 'C' ) // logic for invalid column choice
		{
			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "Sorry this is an invalid column number please try again." << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);

			cout << endl;
			goto label;
			cout << endl;

		}

		if (squareAvaliability[row][col] == 'X' || squareAvaliability[row][col] == 'O') // logic for when square is already taken
		{


			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "Sorry this square is already taken. Please pick another." << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);

			goto label; //returns to prior question 
		}

		if (squareAvaliability[row][col] == avaliable)
		{


			system("cls");
			cout << endl;
			cout << "Is this player X or O? :" << endl;
			cin >> unavaliabilitys;
			if (unavaliabilitys == 'X')
				squareAvaliability[row][col] = unavaliable;
			if (unavaliabilitys == 'O' )
				squareAvaliability[row][col] = unavaliable2;

		}

		for (row = 0; row < RSIZE; row++)

			for (col = 0; col < CSIZE; col++)
			{
				 // BUNCH OF IF STATEMENTS FOR WINNING CONDITIONS
				if (squareAvaliability[0][0] == 'O' && squareAvaliability[1][1] == 'O' && squareAvaliability[2][2] == 'O')
					vacancy = false;
				if (squareAvaliability[2][0] == 'O' && squareAvaliability[1][1] == 'O' && squareAvaliability[0][2] == 'O')
					vacancy = false;
				if (squareAvaliability[0][0] == 'O' && squareAvaliability[0][1] == 'O' && squareAvaliability[0][2] == 'O')
					vacancy = false;
				if (squareAvaliability[1][0] == 'O' && squareAvaliability[1][1] == 'O' && squareAvaliability[1][2] == 'O')
					vacancy = false;
				if (squareAvaliability[2][0] == 'O' && squareAvaliability[2][1] == 'O' && squareAvaliability[2][2] == 'O')
					vacancy = false;
				if (squareAvaliability[0][0] == 'O' && squareAvaliability[1][0] == 'O' && squareAvaliability[2][0] == 'O')
					vacancy = false;
				if (squareAvaliability[0][1] == 'O' && squareAvaliability[1][1] == 'O' && squareAvaliability[2][1] == 'O')
					vacancy = false;
				if (squareAvaliability[0][2] == 'O' && squareAvaliability[1][2] == 'O' && squareAvaliability[2][2] == 'O')
					vacancy = false;
				if (squareAvaliability[0][0] == 'X' && squareAvaliability[1][1] == 'X' && squareAvaliability[2][2] == 'X')
					vacancy = false;
				if (squareAvaliability[2][0] == 'X' && squareAvaliability[1][1] == 'X' && squareAvaliability[0][2] == 'X')
					vacancy = false;
				if (squareAvaliability[0][0] == 'X' && squareAvaliability[0][1] == 'X' && squareAvaliability[0][2] == 'X')
					vacancy = false;
				if (squareAvaliability[1][0] == 'X' && squareAvaliability[1][1] == 'X' && squareAvaliability[1][2] == 'X')
					vacancy = false;
				if (squareAvaliability[2][0] == 'X' && squareAvaliability[2][1] == 'X' && squareAvaliability[2][2] == 'X')
					vacancy = false;
				if (squareAvaliability[0][0] == 'X' && squareAvaliability[1][0] == 'X' && squareAvaliability[2][0] == 'X')
					vacancy = false;
				if (squareAvaliability[0][1] == 'X' && squareAvaliability[1][1] == 'X' && squareAvaliability[2][1] == 'X')
					vacancy = false;
				if (squareAvaliability[0][2] == 'X' && squareAvaliability[1][2] == 'X' && squareAvaliability[2][2] == 'X')
					vacancy = false; 
				
				


				if (vacancy == false)
				{
					cout << "Here is the winning graph: " << endl;
					cout << endl;
						firstClass(squareAvaliability, row, col, count);

					goto end;
				}
				
				//else  if (vacancy == false)
				//	goto loss;

			}









	} while (vacancy = true);
end:
	cout << endl; // when WE HAVE A WINNER couts this message and ends.
	cout << " We have a winner!!! Goodbye! " << endl;
	system("pause");
	return 0;

	//loss:
	//cout << "Game Over we have no winners. :(" << endl;
	//system("pause");
	//return 0;
}

void printArray(string prices[][3], string status[][3]) // array print prototype
{
	int row1; int column1; int column2;

	for (row1 = 0; row1 < RSIZE; row1++) //couts  array
	{

		for (column2 = 0; column2 < CSIZE; column2++)
			cout << setw(2) << status[row1][column2] << " | ";
		cout << endl;
	}




}

void firstClass(char thing[][3], int row, int col, int counter) // code for first class function
{
	using namespace std;
	//char thing; int count, col, row;
	counter = 0;
	HANDLE h = GetStdHandle(STD_OUTPUT_HANDLE);

	for (row = 0; row < 3; row++) //couts seats  array
	{

		if (counter < 4)
			cout << " ";
		cout << "Row " << counter << " | ";
		SetConsoleTextAttribute(h, FOREGROUND_BLUE | FOREGROUND_GREEN);

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
	cout << "                                    |       Hello!! Welcome to Tic Tac Toe       |" << endl;
	cout << "                                    |                                            |" << endl;
	cout << "                                    |            I hope you enjoy                |" << endl;
	cout << "                                    |                   !!!                      |" << endl;
	cout << "                                    |                                            |" << endl;
	cout << "                                     --------------------------------------------" << endl;
	cout << endl;
	SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
}