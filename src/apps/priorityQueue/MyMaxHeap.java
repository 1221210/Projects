package apps.priorityQueue;

import Queue.ch2.QueueInterface;

public class MyMaxHeap <E> implements QueueInterface<E> {
    E[] elements;
    int numElements;

    public MyMaxHeap(int capacity){
        elements = (E[]) new Object[capacity];
        numElements = 0;
    }
    public void printMaxHeap(){
        System.out.print("printMaxHeap(): ");
        for(int i = 0; i< numElements; i++){
            System.out.print(elements[i] + " ");
        }
        System.out.println();

    }
    int left(int i) { return 2*i+1; }
    int right(int i) { return 2*i+2; }
    int parent(int i) { return(i-1) / 2;}

    void reheapUp(int index){
        if(index == 0) // you are the root
            return; //. end
        int parentIndex = parent(index);
        if(((Comparable)elements[parentIndex]).compareTo(elements[index]) < 0){
            // swap you and your parent
            E temp = elements[index];
            elements[index] = elements[parentIndex];
            elements[parentIndex] = temp;
            reheapUp(parentIndex);
        }
    }
    public void enqueue(E val) {
        // step 1: add 'val' to the last position
        // step 2: bubble it up until it finds the right place
        elements[numElements++] = val;
        reheapUp(numElements -1);

    }

    public E dequeue() {
        return null;
    }

    public boolean isEmpty() { return numElements == 0; }

    public boolean isFull() { return numElements == elements.length; }
}
