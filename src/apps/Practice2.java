package apps;

public class Practice2 {
    static int plus(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    static void displayNumbers(int max, int numPerLine) {
        for (int i = 1; i <= max; i++) { //counts 1 to 100
            System.out.print(i + "\t"); // \t is tab
            if (i % numPerLine == 0) //1 of x cases, print new line // % is modulo
                System.out.println();
        }
    }

    static String score2letterGrade(double score) {
        String grade;
        // if score >= 90, "A"
        // if 80<= score <90, "B"
        // if 70 <= score < 80 , "C"
        // if 60 <= score <70, "D"
        // if score < 70, "D"
        if (score >= 90) {
            grade = "A";
            System.out.println("Your grade is: " + score + "% which is a letter grade of " + grade + " Congrats.");
        } else if (score >= 80) {
            grade = "B";
            System.out.println("Your grade is: " + score + "% which is a letter grade of " + grade + " Congrats.");
        } else if (score >= 70) {
            grade = "C";
            System.out.println("Your grade is: " + score + "% which is a letter grade of " + grade + " Congrats.");
        } else if (score >= 60) {
            grade = "D";
            System.out.println("Your grade is: " + score + "% which is a letter grade of " + grade + " Congrats.");
        } else {
            grade = "F";
            System.out.println("Your grade is: " + score + "% which is a letter grade of " + grade + " Lmao.");
        }
        return grade;
    }


    public static void main(String[] args) {
        //displayNumbers(40, 7); //imports function  displayNumbers , set max, numbers per line accordingly.
        score2letterGrade(80); // tells you corresponding letter grades to entered number
        score2letterGrade(59);
        score2letterGrade(99);
        score2letterGrade(69);
        score2letterGrade(79);



        //System.out.println(plus(2,3));
//        int a1 = 4 * plus(1+1, plus(1,2));
//        System.out.println(a1);


    }
}


