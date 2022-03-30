package ExamPrep;

public class testPrep {

    static int func_m(int[] numbers){
        return func_m_Helper(numbers,0);

    }
    static int func_m_Helper(int[] nums, int idx){
        System.out.printf("func_m_Helper(nums,%d)\n", idx);
        if(idx >= nums.length-1)
            return nums[idx];
        int m = func_m_Helper(nums,idx+1);
        if(nums[idx] > m )
            m = nums[idx];
        System.out.printf("func_m_Helper(nums,%d) returns %d\n",idx,m);
        return m;
    }
    public static void main(String[] args) {
        System.out.println(func_m(new int[] {100}));
        System.out.println(func_m(new int[] {2,30,20,15,4}));

        int func(int n){

            if (n<1)
                return 1;
            else return n*func(n-1);

        }
    }
}
