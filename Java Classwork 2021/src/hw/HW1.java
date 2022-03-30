/*
       cs2300
       name: Ian J. Selby
       700720666
       Assignment / Exercise: Homework 1
       */

package hw;
public class HW1 {

    static String score2letterGrade(double max, double score) {
        //var initialization
        String grade;
        double lastMax = 0;
        if (max != lastMax)
            System.out.println("max is " + max + " now"); //print statement telling the current max to the user

        // if score >= 90, "A"
        // if 80<= score <90, "B"
        // if 70 <= score < 80 , "C"
        // if 60 <= score <70, "D"
        // if score < 70, "D"
        if (score >= .9 * max) //if else loop establishing conditions for LETTER grades being a percentage of the max score
            grade = "A";
        else if (score >= .8 * max)
            grade = "B";
        else if (score >= .7 * max)
            grade = "C";
        else if (score >= .6 * max)
            grade = "D";
        else
            grade = "F";

        System.out.println("Your grade is: " + score + " out of: " + max + " which is a letter grade of a: " + grade + "."); //grade output
        return grade;
    }

    static void displayLinearSpace(double start, double end, int count){

        /*Objectives:
        Display the numbers between start and end inclusively
        the numbers are to be spaced equally
        assume start < end and count is at least 2
        Hint: 'count' numbers have 'count-1' intervals.
        */

       /* double midResult; //  |
        double midResult1;  //initialization of variables responsible for values between start and end
        double midResult2; // |
        int newCount = count; // |
        double InitialResult;
        System.out.println("\t");

        if(count < 2)
        {
            System.out.println("Unfortunately, counter values below 2 are not valid. Please run again with a valid input.");
            System.exit(0);
        }


        switch (newCount) { // switch for the counter, each case calculates accordingly up to a counter of 5 since I don't know how to make it work for all entered counters yet.

            case 2:
                System.out.println(start + "\t" + end);
                break;

            case 3:
                count = count - 1;
                InitialResult = start / count;
                // count = count + 1;
                midResult = InitialResult + start;
                System.out.println(start + "\t" + midResult + "\t" + end);

            case 4:

                count = count - 1;
                InitialResult = start / count;
                midResult = InitialResult + start;
                midResult1 = midResult + InitialResult ; // deleted +start
                if(midResult + InitialResult >= end)
                    break;
                System.out.println(start + "\t" + midResult + "\t" + midResult1 + "\t" + end);

            case 5:
                count = count - 1;
                InitialResult = start / count;
                midResult = InitialResult + start;
                midResult1 = midResult + InitialResult ;
                midResult2 = InitialResult + midResult1  ;
                if(midResult + InitialResult >= end)
                    break;
                System.out.println(start + "     " + midResult + "     " + midResult1 + "     " + midResult2+ "     " + end); // instead of \t I had to use 5 spaces since the formatting didn't work
                break;


        } */
        double difference = (end - start) / (count - 1); // calculates the difference between the start and end values and divides it by count -1

        System.out.print(start + "    "); // print start value followed by tab for spacing

        for(int i = 1; i<= count - 2; i++)
            System.out.print(start + i * difference + "    ");

        System.out.print(end + "\n"); // print ending value followed by new line for spacing

        }



    public static void main(String[] args) {
//out of a max of x pts apply the score to it to get a letter grade, applicable to all score2LetterGrade functions
        score2letterGrade(110, 80);
        score2letterGrade(110, 50);
        score2letterGrade(1000, 740);
        score2letterGrade(150, 123);
        score2letterGrade(90, 78);
        score2letterGrade(140, 80) ;
        System.out.println("\t");
        System.out.println("End of score2letterGrade function");

// following 4 are function calls for displaying numbers between the starting and ending values given a designated count # which refers to the number of separate numbers displayed
        displayLinearSpace(10, 20, 2);
        displayLinearSpace(10, 20, 3);
        displayLinearSpace(10, 20, 4);
        displayLinearSpace(1, 2, 5);


    }
}
