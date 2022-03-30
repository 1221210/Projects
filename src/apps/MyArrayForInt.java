package apps;

public class MyArrayForInt {
   private int numElements;
   private int[] elements;
    public MyArrayForInt(){ //0(1)
        numElements = 0; // 0 occupied array spaces
        elements = new int[5];
    }
   public void printArray() // 0(numElements)
    {
        System.out.printf("printArray(%d,%d): ", numElements, elements.length); // %d is a placeholder for a upcoming int
        for (int i = 0; i<numElements; i++) {   // goes to numElements to prevent going out of range
            System.out.print(elements[i] + " ");
        }
        System.out.println("");
    }
   public void add(int val){ // WOrst case: full, 0(elements.length), // avg
        if (isFull()) { //if full
            enlarge(); // call function enlarge
        }
        elements[numElements++] = val;  // replaces empty element with new one and increments thru array
    }
    private void enlarge() { // doubles up the size of elements // 0(elements.length)
        int[] newArray = new int[elements.length * 2]; // makes a new array equal to the original with double the space (improves Perf)
        for(int i=0; i<numElements; i++) // copies valid elements to copied array
            newArray[i] = elements[i];
        elements = newArray; // points elements to the newArray (local var)
    }
    public int search(int val){ // output of search is...
        return linearSearch(val); // ...the output of this function
        // return binarySearch(val);
    }
    private int linearSearch(int val){ // best case 0(1), worse 0(numElements)
        for(int i=0;i<numElements;i++)
            if(elements[i] == val)
                return i;
        return -1; // -1 returned if not found
    }
    public int remove (int val){   // best case 0(1), worse 0(numElements)
        // search for the value and remove the first instance of the element equal to val
        // return 1 if one is removed else return 0 if val isn't found
        int idx = search(val);
        if(idx < 0)
            return 0;
        elements[idx] = elements[numElements - 1];   // copy elements same as : elements[idx] = elements[ --numElements - 1]
        numElements --; //decrement count
        return 1;
    }
    public int min(){
        // take the first element as the minimum value and check all remaining values individually
        // if a smaller value is found, update the minimum value
        if (isEmpty())
            return Integer.MIN_VALUE;
        int minV = elements[0];
        for(int i = 1; i<numElements; i++)
            if(elements[i] < minV) // checks elements of array vs minV value
                minV = elements[i]; // sets minV equal to new lower value
        return minV; // returns value
    }
    public void sort(){
        // make change to the array.
        // algorithm: selection sort which
        // finds the minimum and moves it to index 0
        // find second minimum and move to index 1 and so on...
        for(int i = 0; i< numElements; i++) { //0(numElements^2)
            int minIdx = i;
            for(int j = 1; j< numElements; j++)
                if (elements[j] < elements[minIdx])
                    minIdx = j;
                // swap values at i and minIdx
                int t = elements[i];
                elements[i] = elements[minIdx];
                elements[minIdx] = t;
        }



    }
    public boolean isFull(){return numElements == elements.length; } // simplifies if statement visually // 0(1)
    public boolean isEmpty(){return numElements == 0; } //0(1)


}