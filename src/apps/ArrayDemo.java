package apps;

public class ArrayDemo
{
    //function to print array
   static void printArray (int[] nums) // T(nums.length) = 0(nums.length)
   {                                            //cost          //times
        for (int i = 0; i<nums.length; i++) {   // c1           // ~ nums.length
            System.out.print(nums[i] + " ");    // c2           // nums.length
        }
       System.out.println("");                  // c3           // 1 (is outside loops)
        //T(nums.length) = 0(nums.length)
   }
   static int[] copyArray(int[] nums){ // 0(nums.length)
       // return a new array that has the same elements with nums
                                                  //cost             //times
       int[] newNums = new int[nums.length];      //nums.length      // 1
       for(int i=0; i< nums.length; i++)          // c1              // nums.length + 1
           newNums[i] = nums[i];                  // c2              // nums.length
       return newNums;          //exit            // c3              // 1
      // return nums; // no good because it does not return a new array, instead it returns the array nums
    }
    static void plusOneArray(int[] nums){ //0(nums.length)
       //make change in place. add1 to each element of nums;
                                            //cost            //times
        for(int i=0; i<nums.length; i++)    // c1             // nums.length
            nums[i]++;                      //c2                //nums.length
    }
  static int[] plusOneArrayNew(int[] nums){ // 0(nums.length)
       //return a new array which has an element larger than the element by 1
       // eg) nums = [10,20,30] then return a new array [11, 21, 31] while nums does not change.
                                            //cost          //times
      int[] newNums = new int[nums.length]; // nums.length  //1
      for(int i=0; i< nums.length; i++)     //c1            //nums.length
          newNums[i] = nums[i] + 1;         //c2            //nums.length
      return newNums;                       //c3            // 1
    }
    static int[] shiftLeftArrayNew(int[] nums){
       // returns a new array which shifted element of nums to the left by 1
       // if nums=[10,20,30,40], then it returns [20,30,40,10]
        int[] newNums = new int[nums.length];
       // for(int i=0; i< nums.length-1; i++) // note i=1 instead of 0 because we want 20, 30, 40, 10 output
//            int[] newNums = new int[nums.length];
        for(int i=0; i< nums.length-1; i++) // note i=1 instead of 0 because we want 20, 30, 40, 10 output
            newNums[i] = nums[i+1]; // i-1 because index needs changed
        newNums[newNums.length-1] = nums[0]; // returns first value in rear
        return newNums;

    }
    public static void main(String[] args) {
       int[] nums1 = new int[]{10, 20, -5, 30};
       int[] nums2 = plusOneArrayNew(nums1);
       printArray(nums2); //20 -5 30 10
       printArray(shiftLeftArrayNew(new int[]{10,20})); // 20 10
        printArray(shiftLeftArrayNew(new int[]{10})); //  10
        printArray(shiftLeftArrayNew(new int[]{})); //


//       printArray(nums2); //11 21 -4 -31
//       printArray(nums1); //10 20 -5 30
//       printArray(nums1);
//       plusOneArray(nums1);
//       printArray(nums1); //11 21 -4 31
//       int[] nums2 = copyArray(nums1);
//       printArray(nums2);
//       nums1[0] = 99;
//       printArray(nums2); // 10 , 20, -5, 30
//       printArray(nums1); // 99 , 20, -5, 30

////      int[] nums1; // same as below single line
////      nums1 = new int[5];
//     int[] nums1 = new int[5]; //20 bytes allocated to array var nums1
//        //array values is default value of 0 and arrays begin at 0.
//        nums1[0] = 99; // sets value 0 in array to 99
//        System.out.println(nums1[0]); //prints value 0 in array
//        printArray(nums1);
//        printArray(new int[]{10,20,30}); // new array initialized in instance of function but isnt accessible
//        printArray(new int[]{10});
//        printArray(new int[]{});
//
//        //  System.out.println(nums1);

    }
}
