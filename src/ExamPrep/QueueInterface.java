package ExamPrep;

public interface QueueInterface <E>{
    void enqueue(E val);
    E dequeue();
    boolean isEmpty();
    boolean isFull();

}
