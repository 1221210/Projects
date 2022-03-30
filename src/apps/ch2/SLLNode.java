package apps.ch2;

//[10] -->           [20]
//SSL Node          SLLnode
// make SLLNODE generic
public class SLLNode<E> {
    E info;
    SLLNode<E> next; // next links nodes?
    public SLLNode(E val){
        info = val;
        next = null; // when a node is first created: [10] [/] where / is null.
    }
    public String toString() {return "SLLNode(" + info + ")";}


}
