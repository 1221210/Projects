package Queue.ch2;

public interface QueueInterface <E>{
    void enqueue(E val);
    E dequeue();
    boolean isEmpty();
    boolean isFull();

}
