package apps;

//[10] -->           [20]
//SSL Node          SLLnode
// make SLLNODE generic
public class SLLNodeEx<E> {
    E info;
    SLLNodeEx<E> next; // next links nodes?
    public SLLNodeEx(E val){
        info = val;
        next = null; // when a node is first created: [10] [/] where / is null.
    }
    public String toString() {return "SLLNode(" + info + ")";}


}
