    //cs2300
    //name: Ian J. Selby
    //700720666
package hw;

public class MyArrayHwDemo {

    static void printArray(int[] nums){
        for(int i=0; i< nums.length;i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
    public static final String ANSI_GREEN = "\u001B[32m"; //Temporary
    public static final String ANSI_RESET = "\u001B[0m"; // Temporary
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args)  {

        MyArrayHw mynums1;
        System.out.println(""); // expected outcome met, double check requirements
        System.out.println(ANSI_GREEN + "testing a new constructor 'public MyArrayHw(int[] numbers)"+ ANSI_RESET);
        MyArrayHw mynums2 = new MyArrayHw(new int[] {10, -4, 10, 5});
        mynums2.printArray(); // printArray(4,4): 10 -4 10 5
        (new MyArrayHw(new int[] {55})).printArray(); // printArray(1,1): 55
        System.out.println("");

        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20); // expected outcome met
        System.out.println(ANSI_GREEN + "testing ensureCapacity()"+ ANSI_RESET);
        mynums1.ensureCapacity(3); mynums1.printArray(); // no change when the capacity is already greater. printArray(2,5): 10 20
        mynums1.ensureCapacity(20); mynums1.printArray(); // printArray(2,20): 10 20
        System.out.println("");


        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20); // expected outcome met
        System.out.println("Pre-Clear Test Case: "); mynums1.printArray(); // delete me when finished?
        System.out.println(ANSI_GREEN + "\nTesting clear()"+ ANSI_RESET);
        mynums1.clear(); mynums1.printArray(); // printArray(0,5):
        System.out.println("");


        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20); // meets expected outcome
        System.out.println(ANSI_GREEN + "testing trimSize()"+ ANSI_RESET);
        mynums1.trimSize(); mynums1.printArray(); // printArray(2,2): 10 20
        System.out.println("");


        System.out.println(ANSI_GREEN + "testing add(int[] valArray)" + ANSI_RESET); //mynums1 = 10,20 so adding 1,3,4,5,7,9 should be printArray(2,7): 10 20 1 3 5 7 9
        mynums1.add( new int[]{1,3,5,7,9} ); mynums1.printArray(); // printArray(2,7): 10 20 1 3 5 7 9
        System.out.println("");


        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20);
        System.out.println(ANSI_GREEN + "testing add(int val, int pos)" + ANSI_RESET);
        mynums1.add(99,1); mynums1.printArray(); System.out.println("Expected Output:  // printArray(3,5): 10 99 20) ");// printArray(3,5): 10 99 20
        mynums1.add(-5,0); mynums1.printArray(); System.out.println("Expected Output:  // printArray(4,5): -5 99 20 10) ");// printArray(4,5): -5 99 20 10
        System.out.println("");


        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20); // this one works but there are trailing zeros
        System.out.println( ANSI_GREEN + "testing addOrder(int val, int pos)" + ANSI_RESET);
        mynums1.addOrder(44,1); mynums1.printArray(); // printArray(3,5): 10 44 20
        mynums1.addOrder(66,0);mynums1.addOrder(71,0);mynums1.addOrder(82,0);mynums1.addOrder(46,0); mynums1.printArray(); // printArray(7,5): 46,82,71, 66 10 44 20
        System.out.println("");

//
        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20);
        System.out.println("testing addOrder(int idx, int[] valArray)");
        mynums1.addOrder(1, new int[]{1,3} ); mynums1.printArray(); // printArray(4,5): 10 1 3 20
        mynums1.addOrder(0, new int[]{44, 55, 66} ); mynums1.printArray(); // printArray(7,7): 44 55 66 10 1 3 20
        System.out.println("");
//

        mynums1 = new MyArrayHw(); mynums1.add(10);
        System.out.println(ANSI_GREEN + "testing repeatEach()" + ANSI_RESET);
        mynums1.repeatEach(); mynums1.printArray(); // printArray(2,5): 10 10
        mynums1.add(20); mynums1.printArray(); // printArray(3,5): 10 10 20
        mynums1.repeatEach(); mynums1.printArray(); // printArray(6,6): 10 10 10 10 20 20
        System.out.println("");


        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20); mynums1.add(50);mynums1.add(50);mynums1.add(50); // works
        System.out.println(ANSI_GREEN + "testing removeAll()" + ANSI_RESET);
        mynums1.removeAll(50); mynums1.printArray(); // printArray(2,5): 10 20
        System.out.println("");


        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20);
        System.out.println(ANSI_GREEN + "testing toArray()" + ANSI_RESET);
        int[] nums1 = mynums1.toArray();
        nums1[0] = 99;
        printArray(nums1); // 99 20                            //works
        mynums1.printArray(); // printArray(2,5): 10 20
        System.out.println("");


        mynums1 = new MyArrayHw(); mynums1.add(10); mynums1.add(20); mynums1.add(50);
        System.out.println(ANSI_GREEN + "testing clone()" + ANSI_RESET);
        MyArrayHw cloned = mynums1.clone(); // saying array is equal to
        cloned.remove(10); cloned.remove(50); cloned.printArray(); // printArray(1,2): 20
        mynums1.printArray(); // printArray(2,5): 10 20
        System.out.println("");

    }
}