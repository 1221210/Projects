// Description this program will display the king queen voting 
// 1/29/2019
// @author iselby646
//
//
import javax.swing.JOptionPane;

public class votingv2 {
   
   
   public static void main(String[] args)
   { 
     
      String Nominees[] = new String[8]; // array for candidates name
      String Info[] = new String[8]; // array for attribute
      String Position[] = new String[8]; // array for storing king or queen
      int Votes[] = new int[8];
      int votesA = 1;
      
       for (int i = 0; i <8; i++) 
       {
      Object[] options1 = {"King",
                    "Queen",
                    }; // choice between king or queen 

   int input = JOptionPane.showOptionDialog(null, // dialogue box for asking if king or queen
                "Are you running for king or queen?",
                "Running Choice",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options1,
                null);    
   if(input == JOptionPane.YES_OPTION ) // forwards choice to array
   {
   Position[i] = "King"; 
   System.out.print("This contender is running for King and their name is: ");
   }
   else 
    {
       Position[i] = "Queen";
   System.out.print("This contender is running for Queen and their name is:  ");
   }
      Nominees[i] = JOptionPane.showInputDialog("Enter your name "); // prompts user for names
      System.out.println(Nominees[i]);
      Info[i] = JOptionPane.showInputDialog("Tell us something about yourself. ");
      System.out.println("Contender Information: " + Info[i]);
      }
       boolean voteWant = true;

while (voteWant) // how to use Votes[i] and get all string values
{ 
    // while the user wants to continue voting it will ask for each candidate
     
    votesA = Integer.parseInt(JOptionPane.showInputDialog("How many votes do you want to give " + Nominees[0] + " ? "));
        Votes[0] += votesA;
    votesA = Integer.parseInt(JOptionPane.showInputDialog("How many votes do you want to give " + Nominees[1] + " ? "));
        Votes[1] += votesA;
    votesA = Integer.parseInt(JOptionPane.showInputDialog("How many votes do you want to give " + Nominees[2] + " ? "));
        Votes[2] += votesA;
    votesA = Integer.parseInt(JOptionPane.showInputDialog("How many votes do you want to give " + Nominees[3] + " ? "));
        Votes[3] += votesA;
    votesA = Integer.parseInt(JOptionPane.showInputDialog("How many votes do you want to give " + Nominees[4] + " ? "));
        Votes[4] += votesA;
    votesA = Integer.parseInt(JOptionPane.showInputDialog("How many votes do you want to give " + Nominees[5] + " ? "));
        Votes[5] += votesA;
    votesA = Integer.parseInt(JOptionPane.showInputDialog("How many votes do you want to give " + Nominees[6] + " ? "));
        Votes[6] += votesA;
    votesA =Integer.parseInt( JOptionPane.showInputDialog("How many votes do you want to give " + Nominees[7] + " ? "));
        Votes[7] += votesA;

      
      
       


// print statements displaying if candidate is running for king or queen, their name , their information, and their total votes

System.out.println("Role: " + Position[0] + " Name: " +Nominees[0] + " Custom Info: " + Info[0] + " Vote total: " + Votes[0]);

System.out.println("Role: " + Position[1] + " Name: " +Nominees[1] + " Custom Info: " + Info[1] + " Vote total: " + Votes[1]);

System.out.println("Role: " + Position[2] + " Name: " +Nominees[2] + " Custom Info: " + Info[2] + " Vote total: " + Votes[2]);

System.out.println("Role: " + Position[3] + " Name: " +Nominees[3] + " Custom Info: " + Info[3] + " Vote total: " + Votes[3]);

System.out.println("Role: " + Position[4] + " Name: " +Nominees[4] + " Custom Info: " + Info[4] + " Vote total: " + Votes[4]);

System.out.println("Role: " + Position[5] + " Name: " +Nominees[5] + " Custom Info: " + Info[5] + " Vote total: " + Votes[5]);

System.out.println("Role: " + Position[6] + " Name: " +Nominees[6] + " Custom Info: " + Info[6] + " Vote total: " + Votes[6]);

System.out.println("Role: " + Position[7] + " Name: " +Nominees[7] + " Custom Info: " + Info[7] + " Vote total: " + Votes[7]);

Object[] optionsVote = {"Yes",
                    "No",
                    }; // choice between king or queen 

int choice = JOptionPane.showOptionDialog(null, // dialogue box for asking user to continue voting
                "Do you want to keep voting? " ,
                "Vote Choice",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                optionsVote,
                null);    

if(choice == JOptionPane.YES_OPTION ) // logic for if user wants to continue voting or not
   {
   voteWant = true; 
   
   }
   else 
    {
      voteWant = false;
   }


   }
int leastVotesIndex = 9; 
for (int i = 0; i<8; i++) // for loop for kings vote win calc
{
    if (Position[i] == "King" && leastVotesIndex == 9)
    {
    leastVotesIndex = i;
    }
    if (Position[i] == "King" && Votes[i] < Votes [leastVotesIndex])
    {
    leastVotesIndex = i;
    }



}
//checks to see if there are more than one candidate who has the same number of votes as the leastVotesIndex

boolean KingTie = false;// if the queens are not tied


for (int i =0; i< 8; i++)
{ if (i == leastVotesIndex) continue; // skip the bucket that contains the leastVotesIndex since this will always match
  else if  
    (Votes[i] == Votes[leastVotesIndex] && Position[i] == "King")// condition for if the queen tie is true
      KingTie = true;
     
} 
if (KingTie)
   System.out.println("The King winners are tied! There will be a tiebreaker at half court.");
else 
   System.out.printf("The King winner is %s  with a total of %d votes. %n" , Nominees[leastVotesIndex],Votes[leastVotesIndex]); // Congratulates the winner

leastVotesIndex = 9;
for (int i = 0; i<8; i++) // for loop for queen vote win calculation
{
    if (Position[i] == "Queen" && leastVotesIndex == 9)
    {
    leastVotesIndex = i;
    }
    if (Position[i] == "Queen" && Votes[i] < Votes [leastVotesIndex])
    {
    leastVotesIndex = i;
    }
}
    //check to see if there are more than one candidate who has the same number of votes as the leastVotesIndex
  
boolean QueenTie = false; // if the queens are not tied

    for (int i =0; i< 8; i++)
    { if (i == leastVotesIndex) continue; // skip the bucket that contains the leastVotesIndex since this will always match
      else if  
        (Votes[i] == Votes[leastVotesIndex] && Position[i] == "Queen") // condition for if the queen tie is true
          QueenTie = true;
         
    } 
    if (QueenTie)
       System.out.println("The Queen winners are tied! There will be a tiebreaker at half court."); // queen tie statement
    else 
       System.out.printf("The Queen winner is %s  with a total of %d votes. %n" , Nominees[leastVotesIndex],Votes[leastVotesIndex]); // states the queen winner



   } 
   
}
