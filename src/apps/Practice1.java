package apps;

public class Practice1 {
    public static void main(String[] args) {
//        for(int i=1; i<=10; i++){ //from 1-10 repeats hello world 10 times, easily repeats task w/ loop
//            System.out.println("hello world");
//        }// (ctrl + / comments out highlighted area)

//        for(int i=0; i<=100; i++){ //from 1-100 repeats hello world 100 times, easily repeats task w/ loop
//            //array begins at 0 so if you want value #100, use 99
//            System.out.println("hello world");
//

        
        for (int i=1; i<=100;i++) { //counts 1 to 100
            System.out.print(i + "\t"); // \t is tab
            if (i % 10 == 0) //1 of 10 cases, print new line // % is modulo
                System.out.println();
//           // if(i<10)
//        int sum = 0;
//        for (int i=1; i<100;i++){
//            sum = sum + i;}
//            System.out.println("Your combined total is: " + sum); //sum = sum + || Line X
        }
    }
}
//}
