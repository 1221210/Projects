package hw;
//cs2300
//name: Ian J. Selby
//700720666

import java.util.Arrays;

public class MyArrayHw {
    int[] elements;
    int numElements;

    public MyArrayHw() {
        elements = new int[5];
        numElements = 0;
    }

    public void printArray() {
        System.out.printf("printArray(%d,%d):", numElements, elements.length);
        for (int i = 0; i < numElements; i++)
            System.out.print(elements[i] + " ");
        System.out.println();
    }

    public void enlarge() {
        int[] newArray = new int[elements.length * 2];
        for (int i = 0; i < numElements; i++)
            newArray[i] = elements[i];
        elements = newArray;
    }

    public void add(int val) {
        if (isFull())
            enlarge();
        elements[numElements++] = val;
    }

    public void remove(int val) {
        int index = linearSearch(val);
        if (index < 0)
            return;
        elements[index] = elements[--numElements];
    }

    public void removeOrder(int val) {
        int index = linearSearch(val);
        if (index < 0) return;

        for (int i = index; i < numElements - 1; i++)    // shifting values to left
            elements[i] = elements[i + 1];
        numElements--;
    }

    public int linearSearch(int k) {
        for (int i = 0; i < numElements; i++)
            if (elements[i] == k)
                return i;
        return -1;
    }

    boolean isFull() {
        return numElements == elements.length;
    }

    boolean isEmpty() {
        return numElements == 0;
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////
    // End of provided functions...
    ///
    ///
    ///
    ///
//////////////////////////////////////////////////////////////////////////////////////////////////////


    public MyArrayHw(int[] numbers) { // Working ? Meets expected outcome
        // Another Constructor with int array parameter
        // allocate necessary amount of memory to elements
        // copy from array 'numbers' to 'elements' and set numElements properly
        elements = Arrays.copyOf(numbers, numbers.length);
        numElements = elements.length; // sets occupied spaces equal to length of array
    }

    public void add(int val, int pos) { // need to figure out how to Move the element originally at the position to the last position
        // insert given value 'val' at the given position 'pos'
        // Move the element originally at the position to the last position
        // eg) add(10, 1) for {1,2,3,4} will change it into {1,10,3,4,2}
        // System.out.println("Original Array before adding " + val + Arrays.toString(elements));
        int tempPos = elements[pos]; // value equal to element being replaced
        int elementsAdded[] = new int[numElements + 1]; // new array with space for new value
        int tempNumEle = numElements;

        for (int i = 0; i <numElements; i++) {
            elementsAdded[i] = elements[i]; // makes copy of elements with space for new val
        }
        CapacityDoubler(); // doubles capacity of array
        elements[pos] = val; //sets position as new value
        for (int a = pos + 1; a < numElements; a++)
            elements[a] = elementsAdded[a];

        elements[tempNumEle] = tempPos;
        numElements = elementsAdded.length;



    }

    public void addOrder(int val, int pos) { // works
        // insert given value 'val' at the given position 'pos'
        // Keep the order of elements
        // eg) addOrder(10, 1) for {1,2,3,4} will change it into {1,10,2,3,4}

        for (int i = elements.length - 1; i > pos; i--) { // printArray(7,5): 46,82,71, 66 10 44 20
            elements[i] = elements[i - 1];
        }
        numElements++;
        if (numElements > elements.length - 1) {
            CapacityDoubler(); // part of ensure capacity since for some reason it would not work in this instance.
        }
        elements[pos] = val;

    }

    public void sort() {
        // make change to the array.
        // algorithm: selection sort which
        // finds the minimum and moves it to index 0
        // find second minimum and move to index 1 and so on...
        for (int i = 0; i < numElements; i++) { //0(numElements^2)
            int minIdx = i;
            for (int j = 1; j < numElements; j++)
                if (elements[j] < elements[minIdx])
                    minIdx = j;
            // swap values at i and minIdx
            int t = elements[i];
            elements[i] = elements[minIdx];
            elements[minIdx] = t;
        }
    }

    public void add(int[] valArray) {
        // add all elements of valArray to the end of the array.
        //elements.concat(valArray);
        int[] combinedArray = new int[elements.length + valArray.length]; // sets new array equal to both array's lengths
        System.arraycopy(elements, 0, combinedArray, 0, elements.length);
        System.arraycopy(valArray, 0, combinedArray, elements.length, valArray.length);
        elements = combinedArray;
        numElements = elements.length;

        //public static void arraycopy(Object src, int srcPos, Object dest,int destPos, int length)
    }

    public void addOrder(int idx, int[] valArray) { // not functional


        int tempLength = elements.length;
        int[] newArray = new int[numElements + valArray.length];

        for (int i = 0; i < idx; i++) // copies valid elements to idx
            newArray[i] = elements[i];

        for (int i = 0; i < valArray.length; i++) {
            newArray[i + idx] = valArray[i];
            //elements[i] = elements[i + valArray.length];
        }

        for (int i = idx; i < numElements; i++)
            newArray[i + valArray.length] = elements[i];

        ensureCapacity(newArray.length);

        for(int i = 0; i<newArray.length; i++){
            elements[i] = newArray[i];
        }
        numElements = newArray.length;

    }

    public void removeAll(int val) { //  working
        // {10, 2, 10, -4, 10} -> removeAll(10) will make it as {2, -4}
        // algorithm need to be efficient. worst case time complexity O(N).
        int[] copy = new int[5];
//           // boolean found = false;
//            int search = 50;
        int idxKept = 0;
        int x = numElements;
        int j = 0;
//
//            for(int x : copy){
//                if(x == search){
//                    //found = true;
//                    i++;
//                }
//            }
//            while (i>0){ // not acceptable due to time complexity
//                remove(val);
//                i--;
//                System.out.println(i);
//
//            }
//
        for (int i = 0; i < numElements; i++) {
            if (elements[i] == val)
                x--; // decrement x(numElements) if i = val
            else
                copy[idxKept++] = elements[i]; // if the element is not equal to the one being removed make it equal to elements and iterate
        }

        for (int i = 0; i < copy.length; i++)
            elements[i] = copy[i];
        numElements = idxKept;

    }


    public void repeatEach() { // does work except it isn't sorted
        // repeat each number once again.
        // For example, {10, 2, 3} becomes {10, 10, 2, 2, 3, 3}
        trimSize();
        int valueDuplicator = elements.length;
        int[]elementsExpanded = new int[elements.length * 2];
        for(int i = 0; i<elements.length; i++){
            elementsExpanded[i] = elements[i];
            elementsExpanded[valueDuplicator + i] = elements[i];
            numElements++;
        }
        elements = elementsExpanded;


    }

    public void clear() { // meets expected output
        // remove all the elements in the array.
        // Hint: It is very simple.
        elements = new int[elements.length];
        numElements = 0; // sets numElements to 0 effectively clearing the array
    }

    public int[] toArray() { // working
        // return a copy of the array 'elements'.
        // The array size is supposed to be equal to numElements.
        trimSize();
        int[] toArray = Arrays.copyOf(elements, elements.length);
        return toArray; // Here to avoid syntax error. change this as needed
    }

    public MyArrayHw clone() { // ??? what?
        // return a copy of the object which is of MyArray class.
        MyArrayHw cloned = new MyArrayHw();
        int[] nums1 = Arrays.copyOf(elements, elements.length);

        cloned.elements = nums1;
        cloned.numElements = numElements;
        return cloned;

    }

    public void ensureCapacity(int minCapacity) { // Working! Unedited
        // increase the capacity if it is less than minCapacity
        // Do nothing if it is already greater than that.
        int l = elements.length; // temp variable for elements.length
        int difference = (minCapacity - l); // calculates difference to be added to array.length
        if (elements.length < minCapacity) { // if the array length is less than the capacity
            int[] newArray = new int[elements.length + difference]; // make a new array equal to the prior array's length plus the difference of the array length and the expected capacity
            for (int i = 0; i < numElements; i++) // copies valid elements to copied array
                newArray[i] = elements[i];
            elements = newArray; // points elements to the newArray (local var)

        }
    }
        public void CapacityDoubler() {
            int[] newArray = new int[elements.length * 2]; // make a new array equal to the prior array's length plus the difference of the array length and the expected capacity
            for (int i = 0; i < numElements; i++) // copies valid elements to copied array
                newArray[i] = elements[i];
            elements = newArray; // points elements to the newArray (local var)
        }

        public void trimSize () { // Working!
            // decrease the size of the array 'elements' just enough to keep existing elements.
            // eg) printArray(3, 10) will become printArray(3,3) after trimSize()

            int z = elements.length; //local var for calculating difference between array length and filled spaces
            int j = numElements;
            int distance = z - j;
            int[] newArray = new int[elements.length - distance]; // makes a new array with length equal to elements
            for (int i = 0; i < numElements; i++) // copies valid elements to copied array
                newArray[i] = elements[i];
            elements = newArray; // points elements to the newArray (local var)


        }

    }

