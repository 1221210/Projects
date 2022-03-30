package hw;

public class HWEmail1

{
    static void displayLinearSpace(double start, double end, int count){

        /*Objectives
        Display the numbers between start and end inclusively
        the numbers are to be spaced equally
        assume start < end and count is at least 2
        Hint: 'count' numbers have 'count-1' intervals.
        */
        if(count < 2)
        {
            System.out.println("Unfortunately, counter values below 2 are not valid. Please run again with a valid input.");
            System.exit(0);
        }

        double num_diff = (end - start) / (count - 1);

        //Printing the start number with a space afterwards
        System.out.print(start + " ");

        //for loop
        for(int i = 1; i <= count - 2; i++) // count - 2 orig
            System.out.print(start + i * num_diff  + " ");

        //Printing the ending numbers
        System.out.print(end);

        //Printing a newline
        System.out.println();


    }

    public static void main(String[] args) {
        displayLinearSpace(10, 20, 2);
        displayLinearSpace(10, 20, 3);
        displayLinearSpace(10, 20, 4);
        displayLinearSpace(1, 2, 5);
    }
}
