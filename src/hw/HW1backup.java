/*
       cs2300
       name: Ian J. Selby
       700720666
       Assignment / Exercise: Homework 1
       */
package hw;


public class HW1backup {

    static String score2letterGrade(double max, double score) {
        String grade;
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

        System.out.println("Your grade is: " + score + " out of: " + max + " which is a letter grade of " + grade + " Congrats.");
        return grade;
    }

    static void displayLinearSpace(double start, double end, int count){

        /*Objectives:
        Display the numbers between start and end inclusively
        the numbers are to be spaced equally
        assume start < end and count is at least 2
        Hint: 'count' numbers have 'count-1' intervals.
        */
        int newCount = count;
        double InitialResult = start / (count + 1);
        System.out.println(" ");
        //count = count + 1;
        if(count < 3){
            System.out.println(start + " " + end);
        }

        else if(InitialResult>= end)
            System.out.print("End of program");
        else {
            count = count - 1;
            InitialResult = start / count;
            count = count + 1;
            double midResult = InitialResult + start;
            System.out.println(start + " " + midResult + " " + end);

        }
    }

    public static void main(String[] args) {

        System.out.println("max is 110 now"); //announces new max score
        score2letterGrade(110, 80); //out of a max of x pts apply the score to it to get a letter grade, applicable to all score2LetterGrade functions.
        score2letterGrade(110, 50);

        System.out.println("max is 1000 now");
        score2letterGrade(1000, 740);

        System.out.println("max is 150 now");
        score2letterGrade(150, 123);

        System.out.println("max is 90 now");
        score2letterGrade(90, 78);

        System.out.println("max is 140 now");
        score2letterGrade(140, 80) ;

        System.out.println(" ");
        System.out.println("End of score2letterGrade function");


        displayLinearSpace(10, 20, 2);
        displayLinearSpace(10, 20, 3);
        displayLinearSpace(10, 20, 4);
        displayLinearSpace(1, 2, 5);


    }













}