package ExamPrep;

public class ListDemo {
    public static SLLNode<Integer> list(int[]nums){
        SLLNode<Integer> ls = null;
        for(int i = nums.length - 1; i>=0; i--){
            SLLNode<Integer> newNode = new SLLNode<Integer>(nums[i]);
            newNode.next = ls;
            ls = newNode;
        }
        return ls;
    }
    public static void printLinkedList(SLLNode<Integer> node){
        System.out.print("printLinkedList(): ");
        while(node != null) {
            System.out.print(node.info+" ");
            node = node.next;
        }
        System.out.println();
    }
    public static SLLNode<Integer> merge(SLLNode<Integer> node1, SLLNode<Integer> node2){
        // recursion
        // check if any are empty
        if (node1 == null) {
            return node2;
        }

        if (node2 == null) {
            return node1;
        }

       // new sllnode for new values

        SLLNode recursive = merge(node1.next, node2.next);

        SLLNode end = node1;
        node1.next = node2;
        node2.next = recursive;

        return end;
    }

    public static void main(String[] args) {
        SLLNode<Integer> ls1 = list(new int[]{3,4,5});
        SLLNode<Integer> ls2 = list(new int[]{10,20});
        printLinkedList(ls1);
        printLinkedList(ls2);
        printLinkedList(merge(ls1,ls2)); // 3 10 4 20 5
        printLinkedList(merge(list(new int [] {1,2,3}), list(new int[] {10,20}))); // 1 20 2 20 3
    }

}
