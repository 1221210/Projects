package apps;

public class ListDemo {
    public static void printLinkedList(SLLNodeEx<Integer> node){
        while (node != null){
            System.out.print(node.info + " ");
            node = node.next;
        }
        System.out.println();
    }
    static SLLNodeEx<Integer> generatePositiveLL(int count) {  // count is how many num u want
        // create and return a new linked list that has 1,2,3... , count
        if (count == 0)
            return null;
        else if (count == 1)
            return new SLLNodeEx<Integer>(1);

        SLLNodeEx<Integer> node1 = new SLLNodeEx<Integer>(1);
        SLLNodeEx<Integer> head  = node1; // var to store node1
        SLLNodeEx<Integer> node2 = new SLLNodeEx<Integer>(2);
        node1.next = node2;

        for(int i = 3; i <= count; i++){
            node1 = node2; // node 1 = node1.next
            node2 = new SLLNodeEx<Integer>(i);
            node1.next = node2;
        }
        return head; // returns original node1 value
    }

    public static void main(String[] args) {

        printLinkedList(generatePositiveLL(3)); // 1 2 3
        printLinkedList(generatePositiveLL(5)); // 1 2 3 4 5
        printLinkedList(generatePositiveLL(1)); // 1
        printLinkedList(generatePositiveLL(0)); // (null), nada
//        SLLNode<Integer> node1 = new SLLNode<Integer>(10);
//        SLLNode<Integer> node2 = new SLLNode<Integer>(20);
//        SLLNode<Integer> node3 = new SLLNode<Integer>(30);
//        SLLNode<Integer> node4 = new SLLNode<Integer>(40);
//        // [10]    [20]    [30]    [40]   none currently linked (each node pointing to each from n1 to n4)
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        printLinkedList(node1);        // 10, 20, 30, 40
//        // make change to the connections so that we have list: 40,30,20,10
//
//        node4.next = node3;
//        node3.next = node2;
//        node2.next = node1;
//        node1.next = null;
//        printLinkedList(node4);
//
//
//
    }

}
