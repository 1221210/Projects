package apps.tree;

import Queue.ch2.MyQueue;

public class BSTdemo {
    static void BreadthFirstTraversal(BSTNode<Integer> root){
        MyQueue<BSTNode<Integer>> q = new MyQueue<BSTNode<Integer>>();
        if(root != null)
            q.enqueue(root);
            while(!q.isEmpty())
            {
               BSTNode<Integer> node = q.dequeue();
               System.out.print(node + " ");
               if(node.left != null)
                   q.enqueue(node.left);
               if(node.right != null)
                   q.enqueue(node.right);

            }
            System.out.println();
    }
    static void PreOrder(BSTNode<Character> root){
        if(root == null)
            return;
        System.out.print(root.info + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    static void InOrder(BSTNode<Character> root){
        if(root == null)
            return;
        InOrder(root.left);
        System.out.print(root.info + " ");
        InOrder(root.right);
    }
    static void PostOrder(BSTNode<Character> root){
        if(root == null)
            return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.info + " ");
    }
    public static void main(String[] args) {
        // Code for preorder test cases
        BSTNode<Character> nodeP = new BSTNode<Character>('P');
        BSTNode<Character> nodeF = new BSTNode<Character>('F');
        BSTNode<Character> nodeS = new BSTNode<Character>('S');
        BSTNode<Character> nodeB = new BSTNode<Character>('B');
        BSTNode<Character> nodeH = new BSTNode<Character>('H');
        BSTNode<Character> nodeR = new BSTNode<Character>('R');
        BSTNode<Character> nodeY = new BSTNode<Character>('Y');
        BSTNode<Character> nodeG = new BSTNode<Character>('G');
        BSTNode<Character> nodeT = new BSTNode<Character>('T');
        BSTNode<Character> nodeZ = new BSTNode<Character>('Z');
        BSTNode<Character> nodeW = new BSTNode<Character>('W');

        nodeP.left = nodeF;
        nodeP.right = nodeS;
        nodeF.left = nodeB;
        nodeF.right = nodeH;
        nodeS.left = nodeR;
        nodeS.right = nodeY;
        nodeH.left = nodeG;
        nodeY.left = nodeT;
        nodeY.right = nodeZ;
        nodeT.right = nodeW;
        System.out.print("Preorder: ");
        PreOrder(nodeP);
        System.out.println();
        System.out.print("InOrder: ");
        InOrder(nodeP);
        System.out.println();
        System.out.print("PostOrder: ");
        PostOrder(nodeP);



        // The following is code for Breadth First Search
//        BSTNode<Integer> node1 = new BSTNode<Integer>(10);
//        BSTNode<Integer> node2 = new BSTNode<Integer>(20);
//        BSTNode<Integer> node3 = new BSTNode<Integer>(30);
//        BSTNode<Integer> node4 = new BSTNode<Integer>(40);
//        BSTNode<Integer> node5 = new BSTNode<Integer>(50);
//        BSTNode<Integer> node6 = new BSTNode<Integer>(60);
//
////        node4.left = node2; // top
////        node4.right = node6;
////        node2.left = node1;
////        node2.right = node3;
////        node6.left = node5;
////        BreadthFirstTraversal(node4);
////        BreadthFirstTraversal(node2);// 20 10 30
////        BreadthFirstTraversal(node1);//10
////        BreadthFirstTraversal(null); // null
//
//        node6.left = node3;
//        node3.left = node1;
//        node3.right = node5;
//        node1.right = node2;
//        node5.left = node4;
//        BreadthFirstTraversal(node6); // 60 30 10 50 20 40
//        BreadthFirstTraversal(node3); // 30 10 50 20 40
//        BreadthFirstTraversal(node5); // 50, 40


//

    }
}
