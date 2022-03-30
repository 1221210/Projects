//package apps.ch2;
//
//public class MyStackLL <E> implements StackInterface<E>{
//    SLLNode <E> top = null;
//
//    public void push(E val){
//        SLLNode front = new SLLNode(val);
//        front.next = top;
//        top = front;
//
//    }
//    public E pop(){
//        if(isEmpty())
//            return null;
//        E temp = top.info;
//        top = top.next;
//        return temp;
//    }
//    public  E peek(){
//        if(isEmpty())
//            return null;
//        return top.info;
//    }
//    boolean isEmpty(); return null;
//}
