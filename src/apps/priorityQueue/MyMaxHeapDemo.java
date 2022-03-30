package apps.priorityQueue;

public class MyMaxHeapDemo {
    public static void main(String[] args) {
        MyMaxHeap<Integer> queue1 = new MyMaxHeap<Integer>(20);
        queue1.enqueue(10); queue1.enqueue(20); queue1.enqueue(30);
        queue1.printMaxHeap();
    }
}
