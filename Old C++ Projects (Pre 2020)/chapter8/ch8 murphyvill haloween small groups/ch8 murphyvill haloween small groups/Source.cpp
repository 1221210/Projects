/* Ian Selby
10.09.18
Description This is a piece of the ch8 group project on murphville halloween. it controls the hotel.
*/

#include <iostream>
#include <string>
#include <cstring>
#include <iomanip>
#include <Windows.h>
#include <mmsystem.h>

using namespace std;

void printArray(string prices[][3], string status[][3]);

int main()
{
	//string quit;
	bool quit = 1 || 'Yes' || 'Y' ||'yes';
	const int RSIZE = 3; // row size set to 3
	const int CSIZE = 3; // column to 3
	string roomNumber;
	string name;
	  // welcome banner because why not
	cout << "                                     --------------------------------------------" << endl;
	cout << "                                    |                                            |" << endl;
	cout << "                                    |  Hello!! Welcome to Murphyville's Hotel.   |" << endl;
	cout << "                                    |                                            |" << endl;
	cout << "                                    |            We hope you enjoy               |" << endl;
	cout << "                                    |                your stay !!!               |" << endl;
	cout << "                                    |                                            |" << endl;
	cout << "                                     --------------------------------------------" << endl;
	cout << endl;
	cout << "You will be prompted with a list of rooms followed with prices and descriptions" << endl;
	cout << "in which you will enter which you want to rent if any.";
	cout << endl;

	string avaliable = "Empty" ; // status room empty
	string unavaliable = "Full"; // status room full

	string roomPrices[1][4] = //array for displaying room prices
	{
	{ "A","B","C","D"}
	};
	string roomAvaliability[RSIZE][CSIZE] = // string (array) for roomAvaliability
	{
		{ avaliable, avaliable, avaliable} ,{ avaliable, avaliable, avaliable} ,{ avaliable, avaliable, avaliable}
	};
	int row, col;
		bool vacancy;

		do {
			vacancy = false;
			//print array
			cout << "Here is the list of our rooms and their prices." << endl;
			cout << "Here is the current status of our rooms: " << endl << endl;

			cout << endl;
			for (row = 0; row < RSIZE; row++) //couts room price array
			{
				for (col = 0; col < CSIZE; col++)

					cout << setw(20) << roomPrices[row][col] << " | ";
				cout << endl;

				for (col = 0; col < CSIZE; col++)
					cout << setw(20) << roomAvaliability[row][col] << " | ";
				cout << endl;
			}
			cout << endl;


			cout << endl;
			cout << "After the next prompt room descriptions will be shown." << endl;
			system("pause"); system("cls");
			// room description start

			if (roomAvaliability[0][0] == avaliable)
			{
				cout << "Room 1a is on floor 1 and is the first room on the floor. " << endl;
				cout << "It is a seemingly endless space that expands as you walk into it." << endl;
				cout << endl;
			}

			if (roomAvaliability[0][1] == avaliable)
			{
				cout << "Room 1b is on floor 1 and is the second room on the floor. " << endl;
				cout << "It is a room that slowly loses all friction and gravitational pull over time." << endl;
				cout << endl;
			}
			if (roomAvaliability[0][2] == avaliable)
			{
				cout << "Room 1c is on floor 1 and is the third room on the floor. " << endl;
				cout << "It is a room that teleports you to a random location on earth while you are sleeping." << endl;
				cout << endl;
			}

			if (roomAvaliability[1][0] == avaliable)
			{
				cout << "Room 2a is on floor 2 and is the first room on the floor. " << endl;
				cout << "It is a room in which everything is upside down." << endl;
				cout << endl;
			}
			if (roomAvaliability[1][1] == avaliable)
			{

				cout << "Room 2b is on floor 2 and is the second room on the floor. " << endl;
				cout << "It is a room with portals that toss things around the room." << endl;
				cout << endl;
			}
			if (roomAvaliability[1][2] == avaliable)
			{
				cout << "Room 2c is on floor 2 and is the third room on the floor. " << endl;
				cout << "It is a seemingly empty room with object you can't see constantly moving." << endl;
				cout << endl;
			}

			if (roomAvaliability[2][0] == avaliable)
			{
				cout << "Room 3a is on floor 3 and is the first room on the floor. " << endl;
				cout << "It is a room in which all objects come to life at night." << endl;
				cout << endl;
			}

			if (roomAvaliability[2][1] == avaliable)
			{
				cout << "Room 3b is on floor 3 and is the second room on the floor. " << endl;
				cout << "It is a pitch black room that only illuminates where you walk." << endl;
				cout << endl;
			}
			if (roomAvaliability[2][2] == avaliable)
			{
			
				cout << "Room 3c is on floor 3 and is the third room on the floor. " << endl;
				cout << "It is a room where everything is made of bones and skeletons are everywhere." << endl;
				cout << endl;
			}

 
	//end of room descriptions
			cout << "Do you want to quit? 1 for yes 0 for no. ";
			cin >> quit;
			switch (quit){
			
			case 1: 
				if (quit = 1 || 'Yes' || 'Y' || 'yes')
			{
					cout << "GoodBye" << endl;
				system("pause");
				return 0;
			}
			}
	cout << endl;
	cout << "Please enter your last name: ";
		cin >> name;
	cout << "Now enter the room number you want : " ;
		cin >> roomNumber;
		cout << endl;
		if (roomNumber !=  "1a" && roomNumber != "1b" &&roomNumber != "1c" && roomNumber != "2a" && roomNumber != "2b" && roomNumber != "2c" && roomNumber != "3a" && roomNumber != "3b" && roomNumber != "3c")
		{
			system("COLOR 4");
			cout << "Sorry this is an invalid room number please try again." << endl;
			cout << endl;
			cout << "Enter a proper room number described above:";
			cin >> roomNumber;			
			system("COLOR 7");

		}

	if (roomNumber == "1a")
	{
		if (roomAvaliability[0][0] == avaliable)
		{
		cout << "You have reserved " << roomNumber << " and it cost $62.50 with 25% tax. " <<endl;
		cout << endl;
		 roomAvaliability[0][0] = unavaliable;

		}
		if (roomAvaliability[0][0] == unavaliable)
			roomPrices[0][0] =  name;
	}
	if (roomNumber == "1b")
	{
		if (roomAvaliability[0][1] == avaliable)
		{
			cout << "You have reserved " << roomNumber << " and it cost $62.50 with 25% tax. " << endl;
			cout << endl;
			roomAvaliability[0][1] = unavaliable;

		}
		if (roomAvaliability[0][1] == unavaliable)
			roomPrices[0][1] = name;
	}
	if (roomNumber == "1c")
	{
		if (roomAvaliability[0][2] == avaliable)
		{
			cout << "You have reserved " << roomNumber << " and it cost $62.50 with 25% tax. " << endl;
			cout << endl;
			roomAvaliability[0][2] = unavaliable;

		}
		if (roomAvaliability[0][2] == unavaliable)
			roomPrices[0][2] = name;
	}
	if (roomNumber == "2a")
	{
		if (roomAvaliability[1][0] == avaliable)
		{
			cout << "You have reserved " << roomNumber << " and it cost $87.50 with 25% tax. " << endl;
			cout << endl;
			roomAvaliability[1][0] = unavaliable;

		}
		if (roomAvaliability[1][0] == unavaliable)
			roomPrices[1][0] = name;
	}
	if (roomNumber == "2b")
	{
		if (roomAvaliability[1][1] == avaliable)
		{
			cout << "You have reserved " << roomNumber << " and it cost $87.50 with 25% tax. " << endl;
			cout << endl;
			roomAvaliability[1][1] = unavaliable;

		}
		if (roomAvaliability[1][1] == unavaliable)
			roomPrices[1][1] = name;
	}
	if (roomNumber == "2c")
	{
		if (roomAvaliability[1][2] == avaliable)
		{
			cout << "You have reserved " << roomNumber << " and it cost $87.50 with 25% tax. " << endl;
			cout << endl;
			roomAvaliability[1][2] = unavaliable;

		}
		if (roomAvaliability[1][2] == unavaliable)
			roomPrices[1][2] = name;
	}
	if (roomNumber == "3a")
	{
		if (roomAvaliability[2][0] == avaliable)
		{
			cout << "You have reserved " << roomNumber << " and it cost $125.00 with 25% tax. " << endl;
			cout << endl;
			roomAvaliability[2][0] = unavaliable;
		}
		if (roomAvaliability[2][0] == unavaliable)
			roomPrices[2][0] = name;
	}
	if (roomNumber == "3b")
	{
		if (roomAvaliability[2][1] == avaliable)
		{
			cout << "You have reserved " << roomNumber << " and it cost $125.00 with 25% tax. " << endl;
			cout << endl;
			roomAvaliability[2][1] = unavaliable;

		}
		if (roomAvaliability[2][1] == unavaliable)
			roomPrices[2][1] = name;
	}
	if (roomNumber == "3c")
	{
		if (roomAvaliability[2][2] == avaliable)
		{ 
			cout << "You have reserved " << roomNumber << " and it cost $125.00 with 25% tax. " << endl;
			cout << "Get Ready FOR SPOOK!!!! " << endl;
			cout << endl;
			roomAvaliability[2][2] = unavaliable;
			PlaySound(TEXT("spooky.wav"), NULL, SND_ASYNC);
			cout << R"(,,;;;,,'''..  ......................  .........''''''''.''......
,;;;;;'',,'.  ..','.......',;,,;;;,... ....'''''''','''..''''.''
;;;;;,''','.  ..','''';ldkO0KKKKKK00Oxl:'.''''''''',,''.''''.'''
;;;,,,',,,,.  .,;;,:dOKNNNXXXXXXXXXXNNNXOd:,,,,,''',,'''''''''''
:::,''',:;.....';:dKNNNNNNNNNNNNNXNNNWWNNNKd;;;;;,',,,,'.''.'',,
:::;,,'.',;. ...;xXWNNWWWWWWWWWNNNNNWWWWWNNKo;:;;;,,,''''..',,,,
:::;;;;'.... ..'lKNNNNWWWWWWNWWNNNNNWWNNNWNNO:;;;;,,'''''..';,;;
;:;,';:'...  ..'dXNNNNNWWNNNNNNNNNNNNNNNNNNN0c,;::;;;;,,'..,;;;:
,;;..;,...  .'''dXNXKOdlc::oO000Oxc;:ldkKNNXd,;loooolc:'...,,;;:
'''...... ..','.,xkc..     'dl;ox;     .,xOl'':::c:cokx:...,;:::
..........''',...:c.      ;xl. ,ol'      cc..... ...,dOx, .,;:::
,;;,.:o:;cl:;c;':OO;   'ckKd'....cko,..'o0x;,;',okkl''oOd'..',''
lodollld0WWNK0Oxx0X0dlokXNXOxO0OkOK0dco0KkocldkKNNXx'.,oko......
clllc:;oKWWNNXNNXKK0d:;cxkOkOkxxdxkkd'.;lxkOOO0000Od,..'ol......
0KKKx;:kNNNXKOdodkOOl:llolollc::;clcc:;;oOkl;,o00K0c'...lo'...''
XXKOo::lONN0kxl;;:dOdd:              .l;.cko'',;l00:''',,'...'..
XKOo:::oXMXxooclclKXoo;              .lod00o,''',xKl'''....'''''
XXKd;;c0MNxlllooxOO00xoc;,,'.........;llooddc,','c0k;'..';::::;;
Oxd:,;xWNxcccclxKk;.';okkxxOOkkkoxkkdd;   'dO:.'.,kKl''';:::cc:;
doooldXWOlccc:ckNXkl:;dKXX00OO0OxO000OddddkKKl''',xXd;;;:ccllc::
xkkkx0WKxdxxdodOKKXNNXOxxk0KXKKKKKOdllk000O0x:;::;dXOc:ccooollll
dxxdkNNkdxxxxx00l'.''''.':d0KKKKK0d'  .....:xlcc;;oKKolooooolool
oodo0W0ooddddkXKkxddddxOKNNNNNNNXXX0xl;'...:xdcll:o0Xxloolllllcc
dddkNNxoxkxddokKXNNNNKOxo::xXXXXXk:';ldkO0KKOolll:l0Xkcclc::::::
OkxKWKxkOOkxddxko;,,'''';lx0KKKKKOo,.  ..,oOoloolclOXOl:ccccccc:
kxkXNkdkkxxdoxK0occloxO0KXK0OOO000KKOxl:;,lOdlloocckX0l:lllcccc:
ddOWKdodddodolx0KK00KXKOxl;.....',cx0KXK000OocllolcxK0l:::ccc:::
ldKW0olooooollcllclk0koc;,.       .;coO0dcllcclllcckK0d:;;:c:::;
xKNX0dloolllllcc:lOOc'....        ..'':x0xccllloocd000Ol:ccccc::
xXXXkc:llccclllcckO;        ..         'xkc:llllc:okOOd::ccllccc
lOXKd:c::clloolc:l:....',,,lxxxoc,''....,c:cccc::::lkkc;ccc:::::
:xXKoll:ccoxdollc:,,::cc:::d0000Odccc:;,;;::::::cc;:xOc;:cc::;;;
)" << endl;
			system("pause");

		}
		if (roomAvaliability[2][2] == unavaliable)
			roomPrices[2][2] = name;
	}
	

	
	for (row = 0; row < RSIZE; row++)
	
		for (col = 0; col < CSIZE; col++)
		{
			if (roomAvaliability[row][col] == "Empty")
				vacancy = true;
		}

	} while (vacancy);
	cout << " All rooms are now sold out., Goodbye! " << endl;
	system("pause");
	return 0;
}

void printArray(string prices[][3], string status[][3])
{
	int row1; int column1; int column2;  

	for (row1 = 0; row1 < 3; row1++) //couts room price array
	{
		for (column1 = 0; column1 < 3; column1++)

			cout << setw(20) << prices[row1][column1] << " | ";
			cout << endl;

		for (column2 = 0; column2 < 3; column2++)
			cout << setw(20) << status[row1][column2] << " | ";
			cout << endl;
	}




}
