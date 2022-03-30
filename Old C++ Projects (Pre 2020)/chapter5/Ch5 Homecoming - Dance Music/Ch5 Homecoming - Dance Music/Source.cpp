/*
Name: Jace Tenorio
Date: 9/13/18
Project: Ch5 Homecoming - Dance Music Portion
Description: This program will play a playlist from a text file until an hour is reached, and then cut the code off and thank the listeners.
*/

#include <iomanip>
#include <cmath>
#include <iostream>
#include <string>
#include <fstream>

using namespace std;

int main()
{
	int brass;	//variable for the brass
	int woodwinds;	//variable for the woodwinds	
	int percussionists; //variable for percussion
	int bandsize; //variable for the bandsize
	int bandwidth; //variable for bandwidth
	int row; //variable for the rows in the nested for loop
	int column; //variable for the columns in the nested for loop
	int rowoverflow; //variable for the overflow for a remainder row
	int numberofrows; // variable to calculate the number of rows

	int touchdown;
	int goal;
	int quarter;
	int touchdown2;
	int goal2;
	int points2;
	int points;

	char ch1 = '-';
	int answer = 1 || 0;
	answer = 0;
	int hotdog = 0; // Used for total items calculation. (dinner item)
	int nachos = 0; // Used for total items calculation. (dinner item)
	int pizza = 0; // Used for total items calculation. (dinner item)
	int popcorn = 0; // Used for total items calculation. (dinner item)
	int steak = 0; // Used for total items calculation. (dinner item)
				   //
	int Soda; // Used for total items calculation. (breakfast item)
	int Skittles; // Used for total items calculation. (breakfast item)
	int peanuts; // Used for total items calculation. (breakfast item)
	int Chocolate; // Used for total items calculation. (breakfast item)
	int potatochips; // Used for total items calculation. (breakfast item)

	int stkhotdog = 500; // Total stock of hotdogs
	int stknacho = 340; // Total stock of nachos
	int stkpizza = 702; // Total stock of pizza slices
	int stkpopcorn = 25; // Total stock of popcorn
	int stksteak = 420; // Total stock of steak
	int stock = stkhotdog + stknacho + stkpizza + stkpopcorn + stksteak;

	double totalItems2; //Total items variable for menu 2
	double totalItems; //Total items variable.
					   //double tax; //Variable in calculating tax.
	double hotdogprice; //itemPrice descriptor
	double nachosprice; //itemPrice descriptor
	double pizzaprice; //itemPrice descriptor
	double popcornprice; //itemPrice descriptor
	double steakprice; //itemPrice descriptor
					   //seprator dinner/breakfast
	double Sodaprice; //itemPrice descriptor
	double Skittlesprice; //itemPrice descriptor
	double peanutsprice; //itemPrice descriptor
	double Chocolateprice; //itemPrice descriptor
	double potatochipsprice; //itemPrice descriptor


	double finalPrice1; //used in total price calculations dinner
	double finalPrice2; //used in total price calculations dinner
	double finalPrice3; //used in total price calculations dinner

	double finalPrice4; //used in total price calculations breakfast
	double finalPrice5; //used in total price calculations breakfast
	double finalPrice6; //used in total price calculations breakfast

	string answerTime;
	string d44 = string(44, ch1);

	double minutes;
	string song;
	double songRuntime;
	minutes = 60;
	ifstream Source_Files("MMMAB.txt");

	int menuChoice;
	int menuChoice2;
	cout << setw(80) << "----------------------------------------------------" << endl;
	cout << "                            |                     Welcome To                   |" << endl;
	cout << "                            |              Murphy High Mudmoles Fall           |" << endl;
	cout << "                            |                    Homecoming!                   |" << endl;
	cout << setw(80) << "----------------------------------------------------" << endl;

	cout << "Hello there! Please choose the option you would like to perform!" << endl;
	cout << "1 = Band Management" << endl;
	cout << "2 - Scoreboard Management" << endl;
	cout << "3 - Snack Bar Management" << endl;
	cout << "4 - Dance Music Management" << endl;
	cout << "5 - Exit the Program" << endl;
	cout << endl;
	cout << "Please input which option you would like to perform: ";
	cin >> menuChoice;
	system("cls");

	while (menuChoice != 5)
	{
		switch (menuChoice)
		{
		case 1:
			cout << "Please enter the number of Brass, Woodwind, and Percussionist players that will be marching in the parade." << endl;
			cout << "Brass = ";
			cin >> brass;  //user input for the brass
			cout << "Woodwinds = ";
			cin >> woodwinds; // user input for woodwinds
			cout << "Percussionists = ";
			cin >> percussionists; //user input for percussion
			bandsize = brass + percussionists + woodwinds; //adds up the sections to determine bandsize
			cout << bandsize << " Band members" << endl;
			cout << "enter the bandwidth here" << endl;
			cin >> bandwidth;

			row = bandsize / bandwidth;

			//For loop overflow
			rowoverflow = bandsize % bandwidth;
			//calculations for a remainder 
			numberofrows = bandsize / bandwidth;

			cout << "Band layout for the full marching band" << endl;
			cout << "The band formation should look like this" << endl;


			{

				for (row = 1; row <= numberofrows; row++)
				{
					for (column = 1; column <= bandwidth; column++)
						cout << "M";
					cout << endl;
				}
				if (rowoverflow > 0)
					for (column = 1; column <= rowoverflow; column++)
						cout << "M";


				cout << endl;
				cout << " ";

			}

			cout << "Darn! The lead car in the parade has broken down and the band needs to split in half";
			cout << " to make enough room" << endl;
			cout << "Your new formation looks like this" << endl;

			bandwidth = column / 2; //calculation to split the rows in half
			numberofrows = row * 2; //calculation to double the number of rows


			for (row = 1; row <= numberofrows; row++)
			{
				for (column = 1; column <= bandwidth; column++)
					cout << "M";
				cout << endl;
			}
			if (rowoverflow > 0)
				for (column = 1; column <= rowoverflow; column++)
					cout << "M";


			cout << endl;
			cout << " ";


			system("pause");
		break;

		case 2:

			//Initial points set
			points2 = 0;
			points = 0;
			//Shoes  Scoreboard Management 
			cout << "You have chosen Scoreboard Management:" << endl;
			cout << endl;
			cout << "----------------------------------------------" << endl;
			cout << endl;
			system("color 02");

			for (int quarter = 1; quarter <= 4; quarter++) {//If quarter = 1,2,3,4
				cout << "Quarter: " << quarter << endl;//Display Quarter
				system("pause");
				//Display score for touchdowns and goals
				cout << "Put in number of touchdowns for The Murphy MudMoles: ";
				cin >> touchdown;
				cout << "Put in number of goals for The Murphy MudMoles: ";
				cin >> goal;
				points = (touchdown * 7) + (goal * 3) + points;
				cout << "Put in number of touchdowns for Fortune City Lucky Ducks: ";
				cin >> touchdown2;
				cout << "Put in number of goals for The Fortune City Lucky Ducks: ";
				cin >> goal2;
				points2 = (touchdown2 * 7) + (goal2 * 3) + points2;
				cout << "The quarter is over Fortune City Lucky Ducks, " << points2 << endl;
				cout << "The Murphy MudMoles, " << points << endl;
			}
			//If score is tied go to overtime
			if (points2 == points) {
				cout << "The score is tied, where goin to overtime!" << endl;
				while (points2 == points)
				{

					cout << "Put in number of touchdowns for The Murphy MudMoles: ";
					cin >> touchdown;
					cout << "Put in number of goals for The Murphy MudMoles: ";
					cin >> goal;
					points = (touchdown * 7) + (goal * 3) + points;
					cout << "Put in number of touchdowns for Fortune City Lucky Ducks: ";
					cin >> touchdown2;
					cout << "Put in number of goals for The Fortune City Lucky Ducks: ";
					cin >> goal2;
					points2 = (touchdown2 * 7) + (goal2 * 3) + points2;
					cout << "The  The Murphy MudMoles Score is now: " << points << endl;
					cout << "The Fortune City Lucky Ducks Score is now: " << points2 << endl;
				}
				if (points > points2)
				{
					cout << "The game is over the winner is The Murphy MudMoles" << endl;
				}
				else
				{
					cout << "The game is over the winner is The Fortune City Lucky Ducks" << endl;
				}

			}
			else {
				if (points > points2)
					cout << "The game is over the winner is The Murphy MudMoles" << endl;
				else
					cout << "The game is over the winner is The Fortune City Lucky Ducks" << endl;
			}

			cout << endl;
			system("pause");
			system("color 07");
			break;

		case 3:
			do {
				if (answer == 0)
				{
					cout << fixed << showpoint << setprecision(2); //makes numbers 2 decimal places
					cout << setw(81) << d44 << endl;
					cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
					cout << string(36, ' ') << " | " << "Hello! Welcome to Murphy's Snack Bar !!! |" << endl;
					cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
					cout << string(36, ' ') << " | " << string(10, ' ') << " Program created by :" << string(10, ' ') << "|" << endl;
					cout << string(36, ' ') << " | " << string(9, ' ') << "Ian, Logan, Jace, and Dj " << string(7, ' ') << "|" << endl;
					cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
					cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
					cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;

					cout << setw(81) << d44 << endl;
					cout << endl; cout << "Snack foods and Drinks we have are: Soda, Skittles, Peanuts, Chocolate Soup, and Chips ." << endl;
					cout << "We have endless supply of these as well. " << endl;
					cout << endl;

					system("PAUSE");
					cout << endl;

					//This is where the user will be prompted to put in the amount of items they would like to be purchased. (breakfast)

					cout << "Our Soda consist of standard CocaCola products such as fanta, etc..." << endl;
					cout << "There is an unlimited stock of sodas remaining, and they cost $3.50 + Tax. " << endl;
					cout << "Please enter how many you would like to purchase: " << endl;

					cin >> Soda;
					cout << endl;


					cout << "We have many flavors of Chocolate Bars such as Krackle, Caramel, and Dark Chocolate. " << endl;
					cout << "There is an unlimited stock of Chocolate bars remaining and they cost $3.00 + Tax. " << endl;
					cout << "Please enter how many you would like to purchase: " << endl;

					cin >> Chocolate;
					cout << endl;


					cout << "Skittles are a sugary snack with a similar appearence to an M&M candy. " << endl;
					cout << "There is an unlimited stock of Skittles remaining and they cost $2.00 + Tax. " << endl;
					cout << "Please enter how many you would like to purchase: " << endl;

					cin >> Skittles;
					cout << endl;


					cout << "Our Peanuts consist of what it says, peanuts. They come in chocolate covered of salted variety. " << endl;
					cout << "There is an unlimited stock of Peanuts remaining and they cost $5.00 + Tax. " << endl;
					cout << "Please enter how many you would like to purchase: " << endl;

					cin >> peanuts;
					cout << endl;


					cout << "Our bags of chips are big enough for a group of people, comes in cheddar, sourcream and onion, and more." << endl;
					cout << "There is an unlimited stock of Bags of Chips remaining and they cost $6.00 + Tax. " << endl;
					cout << "Please enter how many you would like to purchase: " << endl;

					cin >> potatochips;
					cout << endl;






					//This is where the user will be prompted to put in the amount of items they would like to be purchased.
					if (stksteak > 0)
					{
						cout << fixed << showpoint << setprecision(2); //makes numbers 2 decimal places   	 
						system("cls");
						cout << setw(81) << d44 << endl;
						cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
						cout << string(36, ' ') << " | " << "Hello! Welcome to Murphy's Snack Bar !!! |" << endl;
						cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
						cout << string(36, ' ') << " | " << string(10, ' ') << " Program created by :" << string(10, ' ') << "|" << endl;
						cout << string(36, ' ') << " | " << string(9, ' ') << "Ian, Logan, Jace, and Dj " << string(7, ' ') << "|" << endl;
						cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
						cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;
						cout << string(36, ' ') << " | " << string(40, ' ') << " | " << endl;

						cout << setw(81) << d44 << endl;
						cout << endl;


						cout << "The hot foods we have are: Steak, Nachos, Hotdogs , Pizza , and Popcorn ." << endl;
						cout << endl;

						system("PAUSE");
						cout << endl;
						cout << "Our steak is enough for two. It also happens to be the chef's favorite ." << endl;
						cout << "There are " << stksteak << " Steak remaining and they cost $10.00 + Tax, please enter how many you would like to purchase: ";

						cin >> steak;
						cout << endl;
					}
					else
						cout << " We are currently out of Steak, please pick another item." << endl;
					if (steak > stksteak)
					{
						cout << "Sorry, We don't have that many in stock. " << endl;
						steak = stksteak; cout << endl;
					}
					stksteak = stksteak - steak;

					if (stknacho > 0)
					{
						cout << "Our nachos consist of ground beef and cheese on tortilla chips with jalapenos on the side ." << endl;
						cout << "There are " << stknacho << " Nachos remaining and they cost $8.99 + Tax. " << endl;
						cout << "Please enter how many you would like to purchase: " << endl;

						cin >> nachos;
						cout << endl;
					}
					else
						cout << "We are currently out of nachos, please pick another item." << endl;
					if (nachos > stknacho)
					{
						cout << "Sorry, We don't have that many in stock. " << endl;
						nachos = stknacho; cout << endl;
					}
					stknacho = stknacho - nachos;

					if (stkhotdog > 0)
					{

						cout << "Our Hotdogs often recommended by customers and comes with the option of chili or just ketchup and mustard." << endl;
						cout << "There are " << stkhotdog << " Hotdog remaining and they cost $4.99 + Tax. " << endl;
						cout << "Please enter how many you would like to purchase: " << endl;

						cin >> hotdog;
						cout << endl;
					}
					else
						cout << "We are currently out of hotdogs, please pick another item." << endl;
					if (hotdog > stkhotdog)
					{
						cout << "Sorry, We don't have that many in stock. " << endl;
						hotdog = stkhotdog; cout << endl;
					}
					stkhotdog = stkhotdog - hotdog;

					if (stkpizza > 0)
					{
						cout << "Our Pizza Slices come in several varietys including stuffed crust, pepperoni, and sausage . " << endl;
						cout << "There are " << stkpizza << " Pizza Slices remaining and they cost $1.50 + Tax. " << endl;
						cout << "Please enter how many you would like to purchase: " << endl;

						cin >> pizza;
						cout << endl;
					}
					else
						cout << "We are currently out of pizza slices , please pick another item." << endl;
					if (pizza > stkpizza)
					{
						cout << "Sorry, We don't have that many in stock. " << endl;
						pizza = stkpizza; cout << endl;
					}
					stkpizza = stkpizza - pizza;

					if (stkpopcorn > 0)
					{
						cout << "Our Popcorn comes buttered in an enourmous 3 ft by 2 ft container guaranteed to last all game long. " << endl;
						cout << "There are " << stkpopcorn << " Popcorn remaining and they cost $20.00 + Tax. " << endl;
						cout << "Please enter how many you would like to purchase: " << endl;

						cin >> popcorn;
						cout << endl;
					}
					else
						cout << "We are currently out of popcorn, please pick another item." << endl;
					if (popcorn > stkpopcorn)
					{
						cout << "Sorry, We don't have that many in stock. " << endl;
						popcorn = stkpopcorn; cout << endl;
					}
					stkpopcorn = stkpopcorn - popcorn;


					//This is where the sum of each item and the sum of all items will be calculated. (Dinner)
					totalItems = hotdog + nachos + pizza + popcorn + steak;
					hotdogprice = (hotdog * 4.99);
					nachosprice = (nachos * 8.99);
					pizzaprice = (pizza * 1.50);
					popcornprice = (popcorn * 20.00);
					steakprice = (steak * 10.00);


					//This is where the sum of each item and the sum of all items will be calculated. (Breakfast)
					totalItems2 = Skittles + Soda + peanuts + Chocolate + potatochips;
					Sodaprice = (Soda * 3.50);
					Skittlesprice = (Skittles * 2.00);
					peanutsprice = (peanuts * 5.00);
					Chocolateprice = (Chocolate * 3.00);
					potatochipsprice = (potatochips * 6.00);




					//The grand total will be calculated here, along with tax for evenine menus
					finalPrice1 = (hotdogprice + pizzaprice + nachosprice + popcornprice + steakprice) * .0395; //tax
					finalPrice2 = (hotdogprice + pizzaprice + nachosprice + popcornprice + steakprice); //food total
					finalPrice3 = finalPrice2 + finalPrice1; //food + tax

					finalPrice4 = (Sodaprice + Skittlesprice + peanutsprice + Chocolateprice + potatochipsprice)* .0395; //tax
					finalPrice5 = (Sodaprice + Skittlesprice + peanutsprice + Chocolateprice + potatochipsprice); //food total
					finalPrice6 = finalPrice4 + finalPrice5; //food+tax



															 //The total amount of items and the grand total (for now) will be listed.

					system("cls");
					cout << "Recipt:" << endl; cout << endl;
					cout << "Total Snack Food Items Purchased : " << endl;
					cout << endl;
					cout << "Skittles $2.00 / per: " << Skittles << endl;
					cout << "Chocolate Bar $3.00 / per: " << Chocolate << endl;
					cout << "Peanuts $5.50 / per: " << peanuts << endl;
					cout << "Soda $3.50 / per: " << Soda << endl;
					cout << "Chips $6.00 / per: " << potatochips << endl;
					cout << endl;

					//The total amount of items purchased along with the final price with tax will be displayed here.

					cout << "Hot Food Items: " << totalItems2 << endl;
					cout << "Final Price (Before Taxes): $" << finalPrice5 << endl;
					cout << "Final Price (With Tax Rate of .0395): $" << finalPrice6 << endl;
					cout << endl;
					cout << endl;


					//The total amount of items and the grand total (for now) will be listed.
					cout << "Hot Food Items Purchased: " << endl;
					cout << endl;
					cout << "Hotdog $4.99 / per : " << hotdog << endl;
					cout << "Nachos $8.99 / per: " << nachos << endl;
					cout << "Pizza Slices $1.50 / per : " << pizza << endl;
					cout << "Popcorn $20.00 / per: " << popcorn << endl;
					cout << "Steak $10.00 / per: " << steak << endl;
					cout << endl;

					//The total amount of items purchased along with the final price with tax will be displayed here.

					cout << "Total Hot Food Items: " << totalItems << endl;
					cout << "Final Price (Before Taxes): $" << finalPrice2 << endl;
					cout << "Final Price (With Tax Rate of .0395): $" << finalPrice3 << endl;
					cout << endl;
					cout << endl;





					cout << " Type : 1 to go back to the main menu or 0 to keep buying snacks. " << endl;
					cin >> answer;

					switch (answer)
					{
					case 1:
						system("cls");
						cout << "You have chosen to go back to the menu." << endl;
						if (answer = 1)
						{
							cout << "Thanks for shopping, enjoy your day" << endl;
							system("pause");
							system("cls");
							cout << "Current remaining hot item stock :" << endl;
							cout << stkhotdog << " Hotdogs" << endl;
							cout << stknacho << " Nachos" << endl;
							cout << stkpizza << " Pizza Slices" << endl;
							cout << stkpopcorn << " Popcorns" << endl;
							cout << stksteak << " Steaks" << endl;

							system("pause");
							break;
						}
						break;
					case 0:
						system("cls");

						cout << "Current remaining hot item stock :" << endl; //remaing stock displays
						cout << stkhotdog << " Hotdogs" << endl;
						cout << stknacho << " Nachos" << endl;
						cout << stkpizza << " Pizza Slices" << endl;
						cout << stkpopcorn << " Popcorns" << endl;
						cout << stksteak << " Steaks" << endl;

						system("pause");
						system("cls");

						if (answer = 0)
						{
							cout << "Your have chosen to buy more items, Cycling menu again." << endl;
							system("pause");
						}

						break;
					}
					break;
				}
				break;
			} while (stksteak > 0 || stkpizza > 0 || stknacho > 0 || stkpopcorn > 0 || stkhotdog > 0);

			if (stksteak <= 0 || stkpizza <= 0 || stknacho <= 0 || stkpopcorn <= 0 || stkhotdog <= 0)
			{
				cout << "Sorry all hot foods are sold out, we must close" << endl;
				cout << "in order to restock. Goodbye " << endl;
				system("pause");
				system("cls");
			}
			break;

		case 4:

			//Dance Music Portion
			while (minutes <= 0) // If the amount of minutes is less than or equal to 0, it will move back to the main menu.
			{
				cout << "Time's all up, you can't emcee anymore." << endl;
				system("pause");
				system("cls"); // Refreshes the system console.
				break;
			}
			while (minutes >= 2.75) // While the minutes are more than 2.75 (lowest song runtime), this program will run.
			{
				cout << "You have chosen Dance music:" << endl;
				cout << endl;
				cout << "----------------------------------------------" << endl;
				cout << endl;

				cout << "What's up everybody! I'm your emcee for the next hour, so let's get this party started!" << endl;
				cout << endl;
				system("pause");
				cout << endl;
				cout << "----------------------------------------------" << endl;
				cout << endl;

				while (Source_Files >> song) // Reads the file for a song name.
				{

					if (minutes <= 0) // If the amount of minutes is less than or equal to 0, it will move back to the main menu.
					{
						break;
					}

					while (Source_Files >> songRuntime) // Reads the file for a song runtime.
					{
						minutes = minutes - songRuntime; // Subtracts the runtime from the minutes, so we can calculate how much time we have.
						if (minutes >= 0) // If the minutes equal more than 0, then this will run continuously. Along with putting in new songs and runtimes for the variables each time.
						{
							cout << "Now Playing: " << song << endl;
							cout << "Song Runtime: " << songRuntime << endl;
							cout << "Time left: " << minutes << " minutes" << endl;
							system("pause");
							cout << endl;
							cout << "----------------------------------------------" << endl;
							cout << endl;
						}
						if (minutes <= 0) // If the minutes equal less than or equal to zero, it will move onto this next segment.
						{
							//The knock-knock joke will be told here.
							cout << "Sorry guys, my hours about to be up!" << endl;
							cout << "Let's finish the day with a knock-knock joke." << endl;
							cout << "Who's there?" << endl;
							cout << "Wooden shoe!" << endl;
							cout << "Wooden shoe who?" << endl;
							cout << "Wooden shoe like to hear another joke?" << endl;
							cout << "----------------------------------------------" << endl;
							cout << endl;
							system("pause"); // Holds the system until user inputs a button.
							cout << endl;
							cout << "----------------------------------------------" << endl;
							cout << endl;

							//This is where we will thank the audience for listening.
							cout << "You guys are great, sorry for the horrible knock-knock joke!" << endl;
							cout << "Thank you audience for being such awesome MudMoles, and a special thank you" << endl;
							cout << "to the MMMAB for picking out such a great playlist!" << endl;
							cout << "That's all for tonight folks! Goodnight everybody!" << endl;
							system("pause"); // Holds the system until user inputs a button.
							system("cls"); //Clears the System.
						}
						break; // Breaks the program to move onto the main menu.
					}
				}
			}
			break; // Breaks the case statement so that it doesn't interfere with the next.

		case 5:
			cout << "Thank you for coming to homecoming! Have a good night!" << endl;
			cout << endl;
			system("pause");
			return 0;
			break;

		default:
			cout << "That is an invalid option, opening up the menu again." << endl;
			system("pause");
			system("cls");
		}

		if (menuChoice != 5)
		{
			cout << endl;
			cout << "-----------------------------------------------------------------" << endl;
			cout << "What would you like to do now?" << endl;
			cout << "1 = Band Management" << endl;
			cout << "2 - Scoreboard Management" << endl;
			cout << "3 - Snack Bar Management" << endl;
			cout << "4 - Dance Music Management" << endl;
			cout << "5 - Exit the Program" << endl;
			cout << endl;
			cout << "Please input which option you would like to perform: ";
			cin >> menuChoice2;
			cout << endl;
			cout << "-----------------------------------------------------------------" << endl;
			cout << endl;
			system("cls");

			while (menuChoice2 == menuChoice)
			{
				cout << "This action has already been performed. Please pick another: ";
				cin >> menuChoice2;
				cout << endl;
				system("cls");
			}

			menuChoice = menuChoice2;

		}
	}
}






