package Queue.ch2;

public class MyQueueLL<E> implements QueueInterface<E> {
    SLLNode<E> front;
    SLLNode<E> rear;
    int numElements;

    public MyQueueLL(){
        front = null;
        rear = null;
        numElements = 0;
    }
    
    public void enqueue(E val) {
//        var element  = new SLLNode(val);
        SLLNode element  = new SLLNode(val);
        if (rear.info != null)
            rear.next = element;
        if (front == null)
            front = element;
        rear.next = element; // rear = rear.next
        rear = element;

        numElements ++;
    }

    public E dequeue() {
        if(isEmpty())
            return null;
        SLLNode element = new SLLNode(front.info);
        front = front.next; // rid of front value
        if(isEmpty())
            rear = null;
        numElements --;
        return (E) element;
    }

    
    public boolean isEmpty() {
        return front == null;
    }

    
    public boolean isFull() {
        return false;
    }
}
