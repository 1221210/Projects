package apps;

public class ArrayDemoTeach {
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
        // returns a new array which shifted elements of nums to the left by 1
        // if nums=[10,20,30,40], then it returns [20,30,40,10]
        int[] newNums = new int[nums.length];
//        for(int i=1;i<nums.length;i++)
//            newNums[i-1] = nums[i];
        for(int i=0;i<nums.length-1;i++)
            newNums[i] = nums[i+1];
        newNums[newNums.length-1] = nums[0];
        return newNums;
    }
    static void shiftLeftArray(int[] nums){
        // shifts the elements of nums to the left by 1
        // make change in place.
        if(nums.length == 0)
            return;
        int temp = nums[0];
        for(int i=1; i<nums.length-1;i++)
            nums[i-1] = nums[i];
        nums[nums.length-1] = temp;
    }
    static int linearSearch(int[] nums, int val){ //0(N)
        // return the index of val if found
        // return -1, if val is not found

                                        //best-case 0(1)                       //worse-case 0(nums.length)
                                        //  val is at idx 0                    //val is not found
                                        //cost              //times             //times
        for(int i=0;i<nums.length;i++)  //c1                //1                 //nums.length
            if(nums[i] == val)          //c2                // 1                //nums.length
                return i;               //c3                // 1                // 0 (never occurs)
            //val is not found
        return -1;                      //c4                //0                 // 1 (happens since not found)
    }
  static int binarySearch(int[] nums, int val){ // 0(logN)
        //return the index of val in nums if found
        //return -1 if val is not found
        //assumption: nums IS sorted in ascending order

      // y = 2^x -> x  = log y
                                                                            //best case             //worse case
                                                                            // val @ mid pt         // val not found
                                                                            // cost       //times   //times
      int start = 0;                                                        // c1         //1       // 1
      int end = nums.length-1;                                              // c2         // 1      // 1
      int mid;                                                              // c3         // 1      // 1
      while(start<end){                                                     // c4         // 1      // log(nums.length) 8 -> 4 ,16 -> 5, 32 -> 6, 64 -> 7
      mid = (start + end ) / 2;                                             // c5         // 1      // // log(nums.length)
      if(val == nums[mid])                                                  // c6         // 1      // log(nums.length)
          return mid;                                                       // c7         // 1      // 0
      else if(val<nums[mid])                                                // c8         // 0      // log(nums.length)
          end = mid - 1;                                                    // c9         // 0      // <= log(nums.length) = x
      else //val > nums[mid
          start = mid + 1;                                                  // c10        // 0      //  ? log(nums.length) - x
        }
      return -1;                                                            // c11        // 0      //
    }
    static int[] generateMultiplesOf10(int count){
        // create and return a new array of size 10 that has multiples of 10 in ascending order.
         //eg generateMultiplesOf10(5) returns a new array [10, 20, 30, 40, 50}
        int[] newNums = new int[count];
        for(int i=0; i<count; i++)
            // when i=0  = 10, i = 1 = 20, 1=2 = 30
            newNums[i] = 10*i + 10; // same as (i+1) * 10
        return newNums;
     }

    public static void main(String[] args) {

        int[]nums2 = new int[] {5,10,20,25,29,32,40,50};
        int[] numsBig = generateMultiplesOf10(100000000); // makes array with numbers that are multiples of 10
        long t1 = System.nanoTime();
       // linearSearch(numsBig, 12); // time elapses is LONG
        binarySearch(numsBig, 12); // note time elapsed is significantly shorter

        long t2 = System.nanoTime();
        System.out.println("The time it takes is: " + (t2-t1));
       // printArray(numsBig); //rip system ram


//        System.out.println(binarySearch(nums2, 40));


//        int[] nums1 = new int[]{10, 20, -5, 30};
//        int[] nums2 = shiftLeftArrayNew(nums1);
//        printArray(nums2); // 20 -5 30 10
//        printArray(shiftLeftArrayNew(new int[]{10, 20})); // 20 10
//        printArray(shiftLeftArrayNew(new int[]{10})); // 10
//        printArray(shiftLeftArrayNew(new int[]{})); //

//        int[] nums1 = new int[]{10, 20, -5, 30};
       // int[] nums1 = new int[]{10};
//        int[] nums1 = new int[]{};
//        int[] nums1 = new int[]{10, 20, -5, 30};
//        System.out.println(linearSearch(nums1, 20));// 1
//        System.out.println(linearSearch(nums1, 10));// 0
//        System.out.println(linearSearch(nums1, 30));// 3
//        System.out.println(linearSearch(nums1, 15));// -1




//        shiftLeftArray(nums1);
//        printArray(nums1); // 10

//        int[] nums2 = plusOneArrayNew(nums1);
//        printArray(nums2); // 11 21 -4 30
//        printArray(nums1); // 10 20 -5 30

        //printArray(nums1);
//        plusOneArray(nums1);
//        printArray(nums1); // 11 21 -4 31

//        int[] nums2 = copyArray(nums1);
//        printArray(nums2);
//        nums1[0] = 99;
//        printArray(nums2); // 10 20 -5 30
//        printArray(nums1); // 99 20 -5 30

//        int[] nums1;
//        nums1 = new int[5];
//        int[] nums1 = new int[5];
//        nums1[0] = 99;
//        System.out.println(nums1[0]);
//        //System.out.println(nums1);
//        printArray(nums1);
//        printArray(new int[]{10,20,30});
//        printArray(new int[]{10});
//        printArray(new int[]{});
//        int[] nums2 = new int[] {5, 10, 20, 25, 29, 32, 40, 50};
//        System.out.println(binarySearch(nums2, 40));
    }
}
