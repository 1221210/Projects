package apps.ch2;

public interface StackInterface<E>{
    void push(E val);
    E pop();
    E peek();
}
