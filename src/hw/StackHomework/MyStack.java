package hw.StackHomework;

public class MyStack<E> { // uses array
    E[] elements;
    int numElements;
    public MyStack(){
        elements = (E[]) new Object[5];
        numElements = 0;
    }
    private void enlarge(){
        // doubles capacity of array elements
        E[] newArray =  (E[]) new Object[elements.length * 2];
        for(int i = 0; i<numElements; i++)
            newArray[i] = elements[i];
        elements = newArray;
    }
    public void push(E val){
        if(isFull())
            enlarge();
        elements[numElements++] = val;
    }
    public E pop(){
        if(isEmpty())
            return null;
        return elements[-- numElements];

    }
    public E peek(){
        if(isEmpty())
            return null;
        return elements[numElements - 1];
    }
    boolean isEmpty(){
        return numElements == 0;
    }
    boolean isFull(){
        return numElements == elements.length;
    }

}
