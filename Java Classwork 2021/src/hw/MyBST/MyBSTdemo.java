package hw.MyBST;

// import hw.MyBST;

public class MyBSTdemo {
    public static void main(String[] args) {
        MyBST<Integer> tr1 = new MyBST<Integer>();
        MyBST<Integer> tr2 = new MyBST<Integer>();

        // Testing size() and height()
        System.out.println(tr1.size()); // 0
        System.out.println(tr1.height()); // 0
        tr1.add(10);
        System.out.println(tr1.size()); // 1
        System.out.println(tr1.height()); // 0
        tr1.add(5); tr1.add(20);
        System.out.println(tr1.size()); // 3
        System.out.println(tr1.height()); // 1
        tr1.add(2); tr1.add(3);
        System.out.println(tr1.size()); // 5
        System.out.println(tr1.height()); // 3
        tr1.add(14); tr1.add(30); tr1.add(11); tr1.add(13);
        System.out.println(tr1.size()); // 9
        System.out.println(tr1.height()); // 4

        System.out.println("Testing addR() - recursive version of add()");
        tr2.addR(10); tr2.printBST(); // 10
        tr2.addR(5); tr2.addR(2); tr2.printBST(); // 2 5 10
        tr2.addR(20); tr2.addR(12); tr2.addR(1); tr2.addR(14); tr2.printBST(); // 1 2 5 10 12 14 20
    }
}
