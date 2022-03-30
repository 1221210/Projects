//        cs2300
//        name: Ian J. Selby
//        700720666
//        Assignment / Exercise: ArrayPractice 
//
        package apps;

import java.util.Arrays; // import java array util

public class ArrayPractice {

    static void printArray(int[] nums) {
        // This function is complete. Here to help your test
        System.out.print("printArray(): ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        // system suggested enhanced for loop ?         for (int num : nums) System.out.print(num + " ");

        System.out.println();
    }

    static int[] shiftRightArray(int[] nums) {
        // make change to nums. (make a change to the array called nums)
        // Shift the elements to the right by 1 position. left most elements goes to the right most pos. (make the leftmost value display on the far right)
        // nums = [10,2,3,-5]. shiftRightArray(nums) will change it to [-5, 10, 2,3]
        // end of instructions ^
        int[] numsCopy = new int[nums.length]; // copies original array nums
      //  int last = nums[nums.length - 1]; unneeded temp variable?
        for (int i = 0; i< nums.length-1; i++)
            numsCopy[i+1] = nums[i]; // copies elements of nums to a new array incrementally (i+1)
        //Should copy the last element to the first position of array numsCopy
        numsCopy[0] = nums[nums.length - 1];
        return numsCopy;

    }

    static void generateEvenNumbers(int count) {
        // Return a new int array filled with n even numbers starting from 2.
        // eg) generateEvenNumbers(3) returns [2,4,6]
        // eg) generateEvenNumbers(5) returns [2,4,6,8,10]
        try {
            int evenNums[] = new int[count]; // array length is equal to count value
            for (count = 0; count < evenNums.length; count++) // iterates count value as long as the count is less than the length of the array
                evenNums[count] = (count + 1) * 2; // sets evenNums equal to the count+1 then multiplied by two
            System.out.println("For count: " + count);
            System.out.println(Arrays.toString(evenNums)); // system prints evenNums array
        }
        catch (Exception outOfBounds) { // catches error when value is non-positive integer
            System.out.println("The value you have entered for count is: " + count + ". " + " Please run the program again with a value that is in bounds. (any positive number >0) ");
        }

    }

    static int[] insertKeepOrder(int[] nums, int idx, int val) {
        // Return a new int array.
        // insert the given 'val' at index 'idx' pushing numbers to the right. // basically, idx is where you want to insert the new value, and val is whatever u wanna insert. then make it so that the existing order of values next or around the inserted value remain.
        //		insertKeepOrder([10,20,30],0,5) will return [5, 10, 20, 30]
        //		insertKeepOrder([10,20,30],1,5) will return [10, 5, 20, 30]
        int newNums[] = new int[nums.length + 1];

        for (int i = 0; i < nums.length + 1; i++) { // iterate thru array
            if (i < idx - 1)
                newNums[i] = nums[i];
            else if (i == idx - 1) // if the value of i is equal to the index's position change newNum's value to val
                newNums[i] = val;
            else
                newNums[i] = nums[i - 1]; // otherwise, copy nums values into newNums
        }
        return newNums;
//
    }

    static int[] reverseNew(int[] nums) {
        // Return a new int array that is reversed version of nums
        // eg) reverseNew([1,2,3]) returns [3,2,1]
        // eg) reverseNew([5,1,2,3]) returns [3,2,1,5]
        int[] reversedNums = new int[nums.length]; // makes a copy of nums called reversedNums
        for (int i = nums.length - 1; i >=0; i--){ // till i >= 0 it decrements i filling array reversedNums with the reverse of array nums
            //System.out.print(nums[i] + " "); unneeded due to below code
            reversedNums[nums.length - 1 - i] = nums[i];
        }
        return(reversedNums); // returns array reversedNums which causes program to goto print function soon after

    }



    public static void main(String[] args) {
        System.out.println("The following is the function shiftRightArray:"+ "\n");
        int[] nums1 = {10,2,3,-5}; // array nums1 for shiftRightArray, expected output: [-5, 10, 2,3]
        int[] numsRightShifted = shiftRightArray(nums1); // makes an array that is equal to array nums1 put thru the shift right function
		printArray(shiftRightArray(nums1)); // prints nums1 array post shifting right / expected [-5, 10, 2,3]
        printArray(shiftRightArray(new int[]{-10, 20,34})); // print new array -10, 20, 34 as reversed

        System.out.println( "\n"+ "End of the function shiftRightArray... " + "\n");
        // --------------------------------------------end---------------------------------------------------------------------------------

        System.out.println("The following is the function generateEvenNumbers:" + "\n"); // function start
        // a few different test cases
        generateEvenNumbers(32); // count of 32
        generateEvenNumbers(26); // count of 26
        generateEvenNumbers(29); // count of 29
        generateEvenNumbers(92); // count of 92
        generateEvenNumbers(0); // program should display [] with no value inside
        generateEvenNumbers(-2); // program should tell you this input is invalid
        System.out.println("\n" + "End of the function generateEvenNumbers... " + "\n"); // states the end of this function for cleanliness
        // --------------------------------------------end---------------------------------------------------------------------------------

        System.out.println("The following is the function insertKeepOrder:" + "\n"); // function start
        // to be completed
        printArray(insertKeepOrder(new int[]{10,20,30,40,50}, 1,  45)); // puts at front of array
        printArray(insertKeepOrder(new int[]{10,20,30,40,50}, 3,  325)); // mid array
        printArray(insertKeepOrder(new int[]{10,-4567,30,40,50}, 5,  3785)); // second to last

        System.out.println("\n" + "End of the function insertKeepOrder... " + "\n"); // states the end of this function for cleanliness
        // --------------------------------------------end---------------------------------------------------------------------------------

        System.out.println("The following is the function reverseNew:" + "\n"); // function start
        printArray(reverseNew(new int[]{10, 20,34,243,56,7,7678,7,3,43,34,23,4,5,6,3}));
        printArray(reverseNew(new int[]{1,2,3}));
        printArray(reverseNew(new int[]{5,1,2,3})); // how do I get it so that the function is like reverseNew([5,1,2,3]) ? I suppose this method works as it does return a new array.
        printArray(reverseNew(new int[]{-10, 20,34,243,56,7,7678,7,3,43,34,23,4,5,6,3}));
        System.out.println("\n" + "End of the function reverseNew... " + "\n"); // states the end of this function for cleanliness

        // --------------------------------------------end---------------------------------------------------------------------------------




        // add you test codes below. You have freedom how to test.
    }
}
