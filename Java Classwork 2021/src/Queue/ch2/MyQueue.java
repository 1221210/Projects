package Queue.ch2;

public class MyQueue <E> implements QueueInterface<E>{

    E[] elements;
    int front, rear, numElements;
    public MyQueue(){
        elements = (E[]) new Object[5];
        front = 0;
        rear = -1;
        numElements = 0;
    }

    private void enLarge(){
        E[] newArray = (E[]) new Object[elements.length * 2]; // doubles capacity of new array
        for(int i=0, j=front; i<numElements; i++, j=(j+1) % elements.length)
            newArray[i] = elements[j];
        elements = newArray;
        front = 0;
        rear = numElements - 1;
    }
    public void enqueue(E val) {
//        rear++;
//        if(rear == elements.length) // this works but below is a simpler method
//            rear = 0;
        if(isFull())
            enLarge();
        rear = (rear + 1) % elements.length; // same purpose as above
        elements[rear] = val;
        numElements++; // increase numelements
    }

    public E dequeue() {
        if(isEmpty())
            return null; // checks if is empty before doing anything else

        E temp = elements[front]; //copies front
        // remove first (oldest)
        front = (front + 1) % elements.length;
        numElements --; // shrink numElements
        return temp; // returns the removed value
    }
    
    public boolean isEmpty() {
        return numElements == 0;
    }

    public boolean isFull() {
        return numElements == elements.length;
    }
}
