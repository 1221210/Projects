package apps.ch2;
import java.util.ArrayList;

public class MyStack2 <E> extends ArrayList<E> implements StackInterface<E>{
    public void push(E val){
        add(val);
    }
    public E pop(){
        E temp = get(size()-1);
        remove(size()-1);
        return temp;
    }
    public E peek(){
        if(isEmpty())
            return null;
        return get(size()-1);
    }
}
