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

void printArray(string prices[][13], string status[][4]);

int main()
{
	HANDLE h = GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
	// note colors can be mixed like real life i.e. red and blue should in theory be purple. intensity makes it lighter

	//string quit;
	bool quit = 1 || 'Yes' || 'Y' || 'yes';
	const int RSIZE = 13; // row size set to 13
	const int CSIZE = 4; // column to 4
	string seatNumber;
	// welcome banner because why not
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

	cout << "You will be prompted with a list of rooms followed with prices and descriptions" << endl;
	cout << "in which you will enter which you want to rent if any.";
	cout << endl;

	//SetConsoleTextAttribute(h, FOREGROUND_RED); // command to make things red (needs #include <windows.h>

	string avaliable = "O"; // status room empty
	string unavaliable = "X"; // status room full (Want to display in red text so array shows full seats as red.) 

	string roomAvaliability[RSIZE][CSIZE] = // string (array) for roomAvaliability
	{
		{ avaliable, avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable,avaliable } ,{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable,avaliable } ,{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable,avaliable } ,{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable, avaliable } ,{ avaliable, avaliable, avaliable,avaliable } ,{ avaliable, avaliable, avaliable,avaliable },{ avaliable, avaliable, avaliable, avaliable }
	};
	int row, col;
	bool vacancy;
	
	////string bCls;
	//string fCls;
	//string eCls;
	string seatClass;

	////bCls =  2, roomAvaliability[2][0], roomAvaliability[2][1], roomAvaliability[2][2], roomAvaliability[2][3], roomAvaliability[3][0], roomAvaliability[3][1], roomAvaliability[3][2], roomAvaliability[3][3], roomAvaliability[4][0], roomAvaliability[4][1], roomAvaliability[4][2], roomAvaliability[4][3], roomAvaliability[5][0], roomAvaliability[5][1], roomAvaliability[5][2], roomAvaliability[5][3], roomAvaliability[6][0], roomAvaliability[6][1], roomAvaliability[6][2], roomAvaliability[6][3], roomAvaliability[7][0], roomAvaliability[7][1], roomAvaliability[7][1], roomAvaliability[7][2], roomAvaliability[7][3];
	//fCls = 1, roomAvaliability[0][0], roomAvaliability[0][1], roomAvaliability[0][2], roomAvaliability[0][3], roomAvaliability[0][4], roomAvaliability[1][0], roomAvaliability[1][1], roomAvaliability[1][2], roomAvaliability[1][3];
	//eCls = 3, roomAvaliability[8][0], roomAvaliability[8][1], roomAvaliability[8][2], roomAvaliability[8][3], roomAvaliability[9][0], roomAvaliability[9][1], roomAvaliability[9][2], roomAvaliability[9][3], roomAvaliability[10][0], roomAvaliability[10][1], roomAvaliability[10][2], roomAvaliability[10][3], roomAvaliability[11][0], roomAvaliability[11][1], roomAvaliability[11][2], roomAvaliability[11][3], roomAvaliability[0][0], roomAvaliability[12][0], roomAvaliability[12][1], roomAvaliability[12][2], roomAvaliability[12][3], roomAvaliability[13][0], roomAvaliability[13][1], roomAvaliability[13][2], roomAvaliability[13][3];


	do {
		vacancy = false;
		//print array

		//cout << "Here is the current status of our seats: " << endl; cout << "Note: O is avaliable and X is not." << endl << endl;
		//cout << "Do you want First Class, Business Class or Economy Class seating. Enter 1 for 1st class , 2 for business and 3 for economy. ";
		//cin >> seatClass; 

		//if ('bCls')
		//	cout << "It works";

		cout << endl;
		int count = 1;
		SetConsoleTextAttribute(h, FOREGROUND_RED);
		cout << "          A" "    B" "    C" "    D" << endl;
		SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
		for (row = 0; row < RSIZE; row++) //couts seats  array
		{
			if (count < 10)
				cout << " ";
			cout << "Row " << count << " | ";

			for (col = 0; col < CSIZE; col++)
				cout << setw(2) << roomAvaliability[row][col] << " | ";
			cout << endl;
			count++;

		}
		cout << endl;


		cout << endl;



		cout << "Will you be flying with us today on an airplane? 1 for yes 0 for no. ";
		cin >> quit;
		switch (quit) {

		case 1:
			if (quit = 0 || 'Yes' || 'Y' || 'yes')
			{
				SetConsoleTextAttribute(h, FOREGROUND_BLUE | FOREGROUND_RED | FOREGROUND_INTENSITY);
				cout << "GoodBye" << endl;
				system("pause");
				return 0;
			}
		}
		cout << endl;
		SetConsoleTextAttribute(h, FOREGROUND_BLUE);
		cout << "Blue Rows are First Class,";
		SetConsoleTextAttribute(h, FOREGROUND_GREEN);
		cout << "Green rows are Business Class";
		SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
		cout << " ,and White Rows are economy class." << endl;
		cout << " Enter the seat number you want : ";
		cin >> seatNumber;
		cout << endl;
		if (seatNumber != "1a" && seatNumber != "1b" &&seatNumber != "1c" && seatNumber != "1d" && seatNumber != "2a" && seatNumber != "2b" && seatNumber != "2c" && seatNumber != "2d" && seatNumber != "3a"&& seatNumber != "3b"&& seatNumber != "3c"&& seatNumber != "3d"&& seatNumber != "4a"&& seatNumber != "4b"&& seatNumber != "4c"&& seatNumber != "4d"&& seatNumber != "5a"&& seatNumber != "5b"&& seatNumber != "5c"&& seatNumber != "5d"&& seatNumber != "6a"&& seatNumber != "6b"&& seatNumber != "6c"&& seatNumber != "6d"&& seatNumber != "7a"&& seatNumber != "7b"&& seatNumber != "7c"&& seatNumber != "7d"&& seatNumber != "8a"&& seatNumber != "8b"&& seatNumber != "8c"&& seatNumber != "8d"&& seatNumber != "9a"&& seatNumber != "9b"&& seatNumber != "9c"&& seatNumber != "9d"&& seatNumber != "10a"&& seatNumber != "10b"&& seatNumber != "10c"&& seatNumber != "10d"&& seatNumber != "11a"&& seatNumber != "11b"&& seatNumber != "11c"&& seatNumber != "11d"&& seatNumber != "12a"&& seatNumber != "12b"&& seatNumber != "12c"&& seatNumber != "12d"&& seatNumber != "13a"&& seatNumber != "13b"&& seatNumber != "13c"&& seatNumber != "13d")
		{
			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "Sorry this is an invalid seat number please try again." << endl;
			cout << endl;
			cout << "Enter a proper room number described above:";
			cin >> seatNumber;
			cout << endl;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);

		}


		if (seatNumber == "1a")
		{
			if (roomAvaliability[0][0] == avaliable)
			{


				cout << "You have reserved first class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[0][0] = unavaliable;

			}
			//if (roomAvaliability[0][0] == unavaliable)
			//{
			//	SetConsoleTextAttribute(h, FOREGROUND_RED);
			//	cout << "Sorry this seat is already taken. Please pick another.";
			//	cin >> seatNumber;
			//	SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
			//}


		}
		if (seatNumber == "1b")
		{


			if (roomAvaliability[0][1] == avaliable)
			{
				cout << "You have reserved first class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[0][1] = unavaliable;

			}

		}
		if (seatNumber == "1c")
		{
			if (roomAvaliability[0][2] == avaliable)
			{
				cout << "You have reserved first class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[0][2] = unavaliable;

			}

		}
		if (seatNumber == "1d")
		{
			if (roomAvaliability[0][3] == avaliable)
			{
				cout << "You have reserved first class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[0][3] = unavaliable;

			}

		}
		if (seatNumber == "2a")
		{
			if (roomAvaliability[1][0] == avaliable)
			{
				cout << "You have reserved first class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[1][0] = unavaliable;

			}

		}
		if (seatNumber == "2b")
		{
			if (roomAvaliability[1][1] == avaliable)
			{
				cout << "You have reserved first class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[1][1] = unavaliable;

			}

		}
		if (seatNumber == "2c")
		{
			if (roomAvaliability[1][2] == avaliable)
			{
				cout << "You have reserved first class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[1][2] = unavaliable;

			}

		}
		if (seatNumber == "2d")
		{
			if (roomAvaliability[1][3] == avaliable)
			{
				cout << "You have reserved first class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[1][3] = unavaliable;

			}

		}
		if (seatNumber == "3a")
		{
			if (roomAvaliability[2][0] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[2][0] = unavaliable;
			}

		}
		if (seatNumber == "3b")
		{
			if (roomAvaliability[2][1] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[2][1] = unavaliable;

			}

		}
		if (seatNumber == "3c")
		{
			if (roomAvaliability[2][2] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;

				cout << endl;
				roomAvaliability[2][2] = unavaliable;

				system("pause");

			}

		}
		if (seatNumber == "3d")
		{
			if (roomAvaliability[2][3] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[2][3] = unavaliable;

			}

		}
		if (seatNumber == "4a")
		{
			if (roomAvaliability[3][0] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[3][0] = unavaliable;
			}

		}
		if (seatNumber == "4b")
		{
			if (roomAvaliability[3][1] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[3][1] = unavaliable;

			}

		}
		if (seatNumber == "4c")
		{
			if (roomAvaliability[3][2] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;

				cout << endl;
				roomAvaliability[3][2] = unavaliable;

			}

		}
		if (seatNumber == "4d")
		{
			if (roomAvaliability[3][3] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[3][3] = unavaliable;

			}

		}
		if (seatNumber == "5a")
		{
			if (roomAvaliability[4][0] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[4][0] = unavaliable;
			}

		}
		if (seatNumber == "5b")
		{
			if (roomAvaliability[4][1] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[4][1] = unavaliable;

			}

		}
		if (seatNumber == "5c")
		{
			if (roomAvaliability[4][2] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;

				cout << endl;
				roomAvaliability[4][2] = unavaliable;

			}

		}
		if (seatNumber == "5d")
		{
			if (roomAvaliability[4][3] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[4][3] = unavaliable;

			}

		}
		if (seatNumber == "6a")
		{
			if (roomAvaliability[5][0] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[5][0] = unavaliable;
			}

		}
		if (seatNumber == "6b")
		{
			if (roomAvaliability[5][1] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[5][1] = unavaliable;

			}

		}
		if (seatNumber == "6c")
		{
			if (roomAvaliability[5][2] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[5][2] = unavaliable;

			}

		}
		if (seatNumber == "6d")
		{
			if (roomAvaliability[5][3] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[5][3] = unavaliable;

			}

		}
		if (seatNumber == "7a")
		{
			if (roomAvaliability[6][0] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[6][0] = unavaliable;
			}

		}
		if (seatNumber == "7b")
		{
			if (roomAvaliability[6][1] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[6][1] = unavaliable;

			}

		}
		if (seatNumber == "7c")
		{
			if (roomAvaliability[6][2] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[6][2] = unavaliable;

			}

		}
		if (seatNumber == "7d")
		{
			if (roomAvaliability[6][3] == avaliable)
			{
				cout << "You have reserved business class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[6][3] = unavaliable;

			}

		}
		if (seatNumber == "8a")
		{
			if (roomAvaliability[7][0] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[7][0] = unavaliable;
			}

		}
		if (seatNumber == "8b")
		{
			if (roomAvaliability[7][1] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[7][1] = unavaliable;

			}

		}
		if (seatNumber == "8c")
		{
			if (roomAvaliability[7][2] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[7][2] = unavaliable;

			}

		}
		if (seatNumber == "8d")
		{
			if (roomAvaliability[7][3] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[7][3] = unavaliable;

			}

		}
		if (seatNumber == "9a")
		{
			if (roomAvaliability[8][0] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[8][0] = unavaliable;
			}

		}
		if (seatNumber == "9b")
		{
			if (roomAvaliability[8][1] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[8][1] = unavaliable;

			}

		}
		if (seatNumber == "9c")
		{
			if (roomAvaliability[8][2] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[8][2] = unavaliable;

			}

		}
		if (seatNumber == "9d")
		{
			if (roomAvaliability[8][3] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[8][3] = unavaliable;

			}

		}
		if (seatNumber == "10a")
		{
			if (roomAvaliability[9][0] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[9][0] = unavaliable;
			}

		}
		if (seatNumber == "10b")
		{
			if (roomAvaliability[9][1] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[9][1] = unavaliable;

			}

		}
		if (seatNumber == "10c")
		{
			if (roomAvaliability[9][2] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[9][2] = unavaliable;

			}

		}
		if (seatNumber == "10d")
		{
			if (roomAvaliability[9][3] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[9][3] = unavaliable;

			}

		}
		if (seatNumber == "11a")
		{
			if (roomAvaliability[10][0] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[10][0] = unavaliable;
			}

		}
		if (seatNumber == "11b")
		{
			if (roomAvaliability[10][1] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[10][1] = unavaliable;

			}

		}
		if (seatNumber == "11c")
		{
			if (roomAvaliability[10][2] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[10][2] = unavaliable;

			}

		}
		if (seatNumber == "11d")
		{
			if (roomAvaliability[10][3] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[10][3] = unavaliable;

			}

		}
		if (seatNumber == "12a")
		{
			if (roomAvaliability[11][0] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[11][0] = unavaliable;
			}

		}
		if (seatNumber == "12b")
		{
			if (roomAvaliability[11][1] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[11][1] = unavaliable;

			}

		}
		if (seatNumber == "12c")
		{
			if (roomAvaliability[11][2] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[11][2] = unavaliable;

			}

		}
		if (seatNumber == "12d")
		{
			if (roomAvaliability[11][3] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[11][3] = unavaliable;

			}

		}
		if (seatNumber == "13a")
		{
			if (roomAvaliability[12][0] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[12][0] = unavaliable;
			}

		}
		if (seatNumber == "13b")
		{
			if (roomAvaliability[12][1] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[12][1] = unavaliable;

			}

		}
		if (seatNumber == "13c")
		{
			if (roomAvaliability[12][2] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[12][2] = unavaliable;

			}

		}
		if (seatNumber == "13d")
		{
			if (roomAvaliability[12][3] == avaliable)
			{
				cout << "You have reserved economy class seat: " << seatNumber << endl;
				cout << endl;
				roomAvaliability[12][3] = unavaliable;

			}

		}
		for (row = 0; row < RSIZE; row++)

			for (col = 0; col < CSIZE; col++)
			{
				if (roomAvaliability[row][col] == "Empty")
					vacancy = true;
			}


		/*string seatInput = seatNumber;

		if (seatInput != avaliable)
		{


			SetConsoleTextAttribute(h, FOREGROUND_RED);
			cout << "Sorry this seat is already taken. Please pick another.";
			cin >> seatNumber;
			SetConsoleTextAttribute(h, FOREGROUND_RED | FOREGROUND_BLUE | FOREGROUND_GREEN | FOREGROUND_INTENSITY);
		}*/



	} while (vacancy = true);
	cout << " All seats are now sold out., Goodbye! " << endl;
	system("pause");
	return 0;
}

void printArray(string prices[][13], string status[][4])
{
	int row1; int column1; int column2;

	for (row1 = 0; row1 < 13; row1++) //couts room price array
	{

		for (column2 = 0; column2 < 4; column2++)
			cout << setw(2) << status[row1][column2] << " | ";
		cout << endl;
	}




}
