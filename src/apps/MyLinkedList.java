package apps;

public class MyLinkedList <E> {
    SLLNodeEx<E> head;

    public MyLinkedList() {
        head = null;
    } //0(1)

    public void printLinkedList() { // Assume N as number of elements in the list
        // 0(N)
        SLLNodeEx<E> node = head; // local var
        System.out.printf("printLinkedList(%d): ", size());
        while (node != null) {
            System.out.print(node.info + " ");
            node = node.next;
        }
        System.out.println();
    }
    public void MyLinkedList(E[] elements){    //0(elements.length)         // cost    //times
        for(int i = elements.length - 1; i >=0; i--)    // c1      // elements.length
            add(elements[i]);                           // 0(1)          elements.length

    }
    public void repeatEach(){ // 0(2*N) basically same as 0(N)
        // makes change to the list
        // repeats each element of the list
        // ex: {1,2,3} is 1,1,2,2,3,3
        SLLNodeEx<E> node = head;
        while(node != null) {
            SLLNodeEx<E> newNode = new SLLNodeEx<E>(node.info);
            newNode.next = node.next; // connection 1
            node.next = newNode; // connection 2
            node =  newNode.next; //node.next.next;
        }
    }
    public void add(E val) { // 0(1)
        SLLNodeEx<E> newNode = new SLLNodeEx<E>(val); // setp 1
        newNode.next = head; // connection 1
        head = newNode; // connection 2
    }

    public int size() { // worst 0(N)
        // return the number of elements in the list
        SLLNodeEx<E> node = head; // local var
        int count = 0;
        while (node != null) { // basically the print loop except it is just a counter
            count++;
            node = node.next;
        }
        return count;
    }
    public void clear() {head = null;} //0(1)
    public boolean isEmpty() {return head == null;}//{return size() == 0;} // 0(1)
    public boolean isFull() {return false;} // linked list cannot really be full // 0(1)

    public SLLNodeEx<E> search(E val) { // best 0(1) worse 0(N)
        SLLNodeEx<E> node = head;
        while (node != null) {
            if (node.info.equals(val))
                return node;
            node = node.next; // basically iteration
        }
        return null; // if node not found
    }
   public void remove(E val){ // 0(N) worse      0(1) best
       if(head == null) // empty cases
           return;
       if(head.info.equals(val)){
           head = head.next;
           return;
       }
       SLLNodeEx<E> node = head.next;
       SLLNodeEx<E> prev = head;
       while(node!= null){
           if(node.info.equals(val)){
               prev.next = node.next; // make previous's connection skip node and point to the next
               return; // exit function
           }
           prev = node;
           node = node.next;
       }
       // when value is not found
      // return;
   }
}
