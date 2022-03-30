package apps;

public class TimeComplexPract {

    public static void main(String[] args) {
       // 20 is N
        int sum = 0;

        for(int i=0;i<20;i++){       //c1            // 21 (i=0,1,2,3,4...N)
            if(i<10) {              //c2            // 11 (i=0,1,2,...10)
                sum = sum + i; }
            else {
                sum = sum + i - 10;}
        }
    }
}
