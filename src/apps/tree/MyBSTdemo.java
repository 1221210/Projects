package apps.tree;

public class MyBSTdemo {
    public static void main(String[] args) {
        MyBST<Integer> tr1 = new MyBST<Integer>();
        tr1.add(10); tr1.add(5); tr1.add(20); tr1.add(2); tr1.add(3); tr1.add(14);tr1.add(7);
        tr1.printBST();
//        tr1.remove(14); // case 1
//        tr1.remove(20); //case 2
        tr1.remove(5); // case 3
//        tr1.remove(10); // case 3 alt
        tr1.printBST();

//        System.out.println(tr1.min()); // 2
//        System.out.println(tr1.max()); // 20
//        System.out.println(tr1.search(3)); // bstnode(3)
//        System.out.println(tr1.search(13)); //null
    }
}
