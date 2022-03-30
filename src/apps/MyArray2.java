package apps;

import java.util.ArrayList;

public class MyArray2 <E> extends ArrayList<E>{
    public void printArray() // 0(numElements)
    {
        System.out.printf("printArray(%d): ", size()); // %d is a placeholder for a upcoming int
        for (int i = 0; i<size(); i++) {   // goes to numElements to prevent going out of range
            System.out.print(get(i) + " ");
        }
        System.out.println("");
    }
    public void repeat(int count){
        //repeat the elements as many as count
        //ex: if the elements are (10,20), repeat(3) change them into {10,20,10,20,10,20}
        for(int i=0; i<count-1; i++){
            //add the whole list of elements
            //MyArray2
            E[] elements = (E[]) toArray();
            for(int j=0; j<elements.length; j++)
                add(elements[j]);
        }
    }
}
