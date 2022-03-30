package Queue.ch2;

public class MyQueueDemo {
    public static void main(String[] args) {
//        MyQueue<Integer> q1 = new MyQueue<Integer>();
        MyQueueLL<Integer> q1 = new MyQueueLL<Integer>();

        q1.enqueue(10); q1.enqueue(20);
        System.out.println(q1.dequeue()); // 10
        System.out.println(q1.dequeue()); // 20
        System.out.println(q1.dequeue()); // null
        System.out.println(q1.isEmpty()); // true
        q1.enqueue(30); q1.enqueue(40); q1.enqueue(50); q1.enqueue(60); q1.enqueue(70);
        System.out.println(q1.isFull()); // true
        q1.enqueue(80);
        System.out.println(q1.dequeue()); // 30
        System.out.println(q1.dequeue()); // 40


    }

}
