package apps.ch2;

import java.util.LinkedList;

public class MyStackLL2<E> extends LinkedList<E> implements StackInterface<E> {
    public E pop() {
        if (isEmpty())
            return null;
        return super.pop();  // bruh
    }
}


