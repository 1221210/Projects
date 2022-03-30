package apps;

public class TimeComplexity {
    public static void main(String[] args) {
        int a =0;
        int b = 999999;
        int c = a * 10 + 20; // will take longer than a, or b
        int N = 1000;


     //standard for loop examples
                                // cost 1 time execution     //(T  =  time) // cX constant
        for(int i=0; i<N; i++) //c1  // arrives N+1 times  ( i=0,1,2,3...,9,N) // line x
            a = a + 1;         //c2  // arrives 10 times (i=0,1,2....,N-1)     // line y
        //T(N) = c1 * (N+1) + c2*N = c1*N + c1*1 + c2*N = c1*N + c2*N + c1*1 = (c1+c2)*N +c1
        // = 0(N) // time to execute is directly related to size of N, if N is increased 10x, execution time is 10x too
        // 0(1) = c1,and c2
        //basically exponent bad in terms of time complexity

                                //cost  //times
        for(int i=0; i<N; i++){ // c1 N+1 (i = 0,1....N)
            a = a + 1;          // c2 N (i = 0,1....,N-1)
            b = b + 1;          // c3 N (i = 0,1....,N-1)
        }                                                        //(ignore all except N)
        // T(N) c1*(N+1) +c2*N +c3*N = c1*N +c1*1 + c2*N + c3*N = (c1+c2+c3)*N +c2
        // 0(N)
        //
        // nested for loop example   // cost        //times
        for(int i=0; i<N; i++)       //c1           // N+1 (i=0,1...,N)
        {
            for(int j=0; j<N; j++)   //c2         tot: N*(N+1) ==  //N+1 (i=0, j=0, 1,2,....,N) + N+1 (i=1, j=0,1,...N)
            {
                a = a + 1;           //c3         tot:  N*N == //N (i=0,j=0,0,1...N-1) + N (i=0,j=0,0,1...N-1)
            } //total complexity: T(N) = c1*(N+1) + c2*N*(N+1) +c3*N*N = c1*N + c1*1 + c2*N*N + c2*N*1 + c3*N*N =
        }    // = (c2+c3)*N*N + (c1+c2)*N +c1 = 0(N*N)

        //Double nested
                                        //cost      //times
        for(int k=0;k<N;k++)            //c1        // N+1 (k=0, 1,...,N)
            for(int i=0;i<N;i++)        //c2        // N*(N+1) = (k=0,i=0,1,2,....N) + ... + (k=N-1
                for(int j=0;j<N;j++)    //c3        // N*N*(N+1) {N*(N+1) (k=0,i=0, j=0,1,2....N) + (k=0,i=1, j=0,1,2....N)...(k=0,i=1, j=0,1,2....N)}
                    a = a + 1;          //c4        // N*N*N

        // T(N) = c1*(N+1) + c2*N*(N+1) + c3*N*N*(N+1) + c4*N*N*N
        // = c1*N + c1 + c2*N*N + c2*N + c3*N*N*N + c3*N*N + c4*N*N*N
        // = (c4+c3)*N*N*N + (c2+c3)*N*N + (c1+c2)*N + c1  //everything below N^3 is ignored here so N^3 is all that remains
        // = 0(N*N*N)

        //slightly quicker version of above

                                         //cost      //times
        for(int j=0;j<N;j++)             //c1        // N+1 (j=0,1...N)
            for(int i=0;i<j;i++)         //c2        //  0.5*N*(N+1)= 1 (i=0, j=0) + 2 (i=1,j=0,1) + 3 (i=1,j=0,2)... N (i=1,j=0,1,...
                a = a  + 1;              //c3        // 0.5*N*(N-1) = 0 + 1 + .... + N-1
        // T(N) = c1*(N+1) + c2*0.5*N*(N+1) + c3*0.5*N*(N-1)
        // = c1*N + c1 + c2*0.5*N*N + c2*0.5*N + c3*0.5*N*N - c3*0.5*N
        // = (c2*0.5 + c3*0.5)*N*N + (c1 + c2*0.5 - c3*0.5)*N + c1
        // = 0(N*N)
                                    //cost          //time
        for(int i=0;i<N;i++){       //c1            // N+1
            for(int j=0;j<N;j++)    //c2            // N*(N+1)
                a = a +1;           //c3            // N*N
            b=b+1;                  //c4            // N (i=0,1...N-1)
        }
        //T(N) = c2*N(N+1)+c3*N*N... = O(N*N)
                                    //cost      //time
        for(int i=0;i<10;i++){      //c1        // 11 runs
            for(int j=0;j<N;j++)    //c2        // 10*(N+1)
                a = a + 1;          //c3        //10*N
            System.out.println(a);  //c4      // 10
        //T(N) = c2*10(N+1) + c3*10*N + ... = 0(N)
        }
                                    //cost          // time
        for(int i=0;i<N;i++){       //c1            // 11 (i=0,1,2,3,4...10)
            if(i==10)               //c2            // 11 (i=0,1,2,...10)
                break;              //c3            // 1 because break
            //T(N) = 0(1) = 0(10) are same technically
        }

                                    //cost          //time
        int[] nums = new int[N];    // N            // 1


                                    //cost          //time
        for(int i=0;i<N;i++)        // c1           // N+1
            if(i<10)                // c2           // N (checks every time)
                a = a + 1;          // c3           // 10 (i=0,1....10)(goes only when above is true)
            else                    // 0 // nothing do add
                a = a + 2 ;         // c4           //N-10  =  N-1 - 10 + 1 when i=10,11,...N-1;
        // T(N) = c1*(N+1) + c2*N + c3*10 + c4*(N-10)
        // T(N) = O(N)

    }
}
