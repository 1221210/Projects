//package ExamPrep;
//
//public class TreeTraversal {
//    public static void breadFirstTraversal(BSTNode<Integer> tr) {
//        MyQueue<BSTNode<Integer>> queue1 = new MyQueue<BSTNode<Integer>>();
//
//        if(tr != null){
//            queue1.enqueue(tr); // tr is root
//            while(!queue1.isEmpty())
//            {
//                node = queue1.dequeue();
//                queue1.enqueue(node.left);
//                queue1.enqueue(node.right);
//
//            }
//
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        BSTNode<Integer> node1 = new BSTNode<Integer>(10);
//        BSTNode<Integer> node2 = new BSTNode<Integer>(20);
//        BSTNode<Integer> node3 = new BSTNode<Integer>(30);
//        BSTNode<Integer> node4 = new BSTNode<Integer>(40);
//        BSTNode<Integer> node5 = new BSTNode<Integer>(50);
//        node4.left = node2;
//        node4.right = node5;
//        node2.left = node1;
//        node2.right = node3;
//
//        breadFirstTraversal(node4); // 40 20 50 10 30
//        breadFirstTraversal(node2); // 20 10 30
//
//    }
//}
