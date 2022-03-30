package apps;

public class RecursionDemo {
    public static void printLinkedList(SLLNodeEx<Integer> node){
        while (node != null){
            System.out.print(node.info + " ");
            node = node.next;
        }
        System.out.println();
    }

    static SLLNodeEx<Integer> buildLinkedList(int[] nums){
        //return a linked List from given array
        SLLNodeEx<Integer> head = null;
        SLLNodeEx<Integer> newNode;
        for(int i = nums.length - 1; i>=0; i--){
            newNode = new SLLNodeEx<Integer>(nums[i]);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    static int factorial(int n){
        System.out.printf("factorial(%d)\n", n);
        if(n <= 1)
            return 1;
        int res = n * factorial(n-1);
        System.out.println("about to return " + res);
        return res;    }
    static int sumUpTo(int n){
        // returns the sum of 1 thru n
        //ex: sumUpTo(3) returns 6 = (1 + 2 + 3)
        // Use recursion
        if (n <= 0)
            return 0;
        return n + sumUpTo(n-1);
    }
    static int sumFromTo(int a, int b){
        // return the sum from a to b inclusively
        // sumFromTo(10,12) returns 33 (=10+11+12)
        // sumFromTo(10,20) return x (10+11+12+... ... 20)
        // use recursion
        // assume a <= b
        if (a == b)
            return 0; // b;
        //return sumFromTo(a+1, b) + a; // same as below
        return sumFromTo(a, b-1) + b;
    }
    static int sumArray(int[] nums){
        // return the sum of elements in the array
        // sumArray({10,20,30}) returns 60
        // use recursion
//        if(nums.length == 0) // exit condition
//            return 0;
//        int[] newArray = new int[nums.length - 1]; // new array w/o og length
//        for(int i=0; i<newArray.length; i++)
//        {
//            newArray[i] = nums[i+1];
//        }
//        return nums[0] + sumArray(newArray);
       return sumArrayHelper(nums,0);

    }
    static int sumArrayHelper(int[] nums, int start){
        if(start == nums.length)
            return 0;
        else return nums[start] + sumArrayHelper(nums, start + 1);

    }
    static int sumLinkedList(SLLNodeEx<Integer> node){
        // return the sum of all values in the LinkedList
        if(node == null)
            return 0;
        return node.info + sumLinkedList(node.next);
    }
    static int countPositive(int[] nums){
        // return the number / count of positive integers in the array
        // eg) countPositive({10,-2,0,5}) returns 2
        // eg) countPositive({10}) returns 1
        // Use Recursion
        return countPositiveHelper(nums, 0);

    }
    static int countPositiveHelper(int[] nums, int start){
        if(start >= nums.length)
            return 0;
        if(nums[start] > 0)
            return 1 + countPositiveHelper(nums, start + 1);
        else
            return 0 + countPositiveHelper(nums, start + 1);
    }
    static int countPositive(SLLNodeEx<Integer> node){
        // return the number / count of positive values in the linked List
        // use recursion
        if(node == null)
            return 0;
        if(node.info>0)
            return 1 + countPositive(node.next);
        else
            return 0 + countPositive(node.next);
    }
    static SLLNodeEx<Integer> positiveOnly(SLLNodeEx<Integer> node){
        // make change to the list.
        // Remove non-positive elements and return only positive elements in the list
        if (node == null)
            return null;

        if(node.info > 0 ){
            node.next = positiveOnly(node.next);
            return node;
        }
        else
            return positiveOnly(node.next);

    }
    static int power(int a, int b){
        // returns a to the power of b, a**b, a^b
//        int c = a * a;
//        b = c * b;
//        if (b == 0)
//            return 1;
//        else if (b == 1)
//            return a;
//        return b;

        if(b == 0)
            return 1;
        return a * power(a, b-1);

    }


    public static void main(String[] args) {
        SLLNodeEx<Integer> ls = buildLinkedList(new int[]{-10,-20,-2,0,5});
        ls = positiveOnly(ls);
        printLinkedList(ls); // 10 , 5

        System.out.println(sumLinkedList(buildLinkedList(new int[]{10,20,30}))); // 60

//        printLinkedList(buildLinkedList(new int[]{10, 20, 30}) );

//       System.out.println(countPositive(new int[]{10, -2, 0, 5}));
//       System.out.println(countPositive(new int[]{10}));
//       System.out.println(countPositive(new int[]{-10}));
//       System.out.println(countPositive(new int[]{}));

//        System.out.println(sumArray(new int[]{10, 20, 30})); //60
//        System.out.println(sumArray(new int[]{10})); // 10
//        System.out.println(sumArray(new int[]{})); // 0


//        System.out.println(power(2,1)); // 33
//        System.out.println(power(2,0)); // 33
//        System.out.println(power(2,2)); // 33



//        System.out.println(sumFromTo(10,12)); // 33
//        System.out.println(sumFromTo(10,10)); // 10
//        System.out.println(sumFromTo(10,20)); // 165


//        System.out.println(factorial(3)); //6
//        System.out.println(factorial(4)); //24
//        System.out.println(factorial(1)); //1
//        System.out.println(factorial(0)); //

//        System.out.println(sumUpTo(3)); //6
//        System.out.println(sumUpTo(4)); //10
//        System.out.println(sumUpTo(1)); //1
//        System.out.println(sumUpTo(0)); //1






    }
}
