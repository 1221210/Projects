package hw.MyBST;

public class MyBST<E> {
    BSTNode<E> root = null;
    public void printBST(){
        InOrder(root); System.out.println();
    }
    private void PreOrder(BSTNode<E> root){
        if(root == null)
            return;
        System.out.print(root.info + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    private void InOrder(BSTNode<E> root){
        if(root == null)
            return;
        InOrder(root.left);
        System.out.print(root.info + " ");
        InOrder(root.right);
    }
    private void PostOrder(BSTNode<E> root){
        if(root == null)
            return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.info + " ");
    }
    public E min(){
        if(root == null)
            return null;
        BSTNode<E> node = root;
        while(node.left != null)
            node = node.left;
        // here you don't have left child. node is the leftmost one.
        return node.info;
    }
    public E max(){
        return maxHelper(root);
    }
    E maxHelper(BSTNode<E> node){
        if(node == null)
            return null;
        if(node.right == null) // no right child. Your value is the maximum
            return node.info;
        return maxHelper(node.right);
    }

    public BSTNode<E> search(E val){
        return searchHelper(val, root);
    }
    BSTNode<E> searchHelper(E val, BSTNode<E> node){
        if(node == null)
            return null;
        if( val.equals(node.info) )
            return node;
        else if( ((Comparable)val).compareTo(node.info) <= 0 ) //( val <= node.info)
            return searchHelper(val, node.left);
        else
            return searchHelper(val, node.right);
    }
    public void remove(E val){
        root = removeHelper(val, root);
    }
    BSTNode<E> removeHelper(E val, BSTNode<E> node){
        // This is recursive.
        if(node == null)
            return null;
        if( ((Comparable)val).compareTo(node.info) < 0 ){
            node.left = removeHelper(val, node.left);
            return node;
        }
        else if( ((Comparable)val).compareTo(node.info) > 0 ){
            node.right = removeHelper(val, node.right);
            return node;
        }
        else { // val == node.info. You found the node to remove
            // case 1. node has no child
            // case 2. node has just one child
            // case 3. node has two children.
            if(node.left == null && node.right == null)// case 1
                return null;
            else if(node.left == null) // case 2(a)
                return node.right;
            else if(node.right == null)
                return node.left;
            else{ // case 3. Two children
                // step1. Find a replacement - predecessor (max value in your left subtree)
                // step2. copy the replacement value to node.info
                // step3. remove that replacement
                E predecessor  = maxHelper(node.left); // step 1
                node.info = predecessor; // step 2
                node.left = removeHelper(predecessor, node.left);
                return node;
            }
        }
    }
    public void add(E val) {
        BSTNode<E> node = root, parent = null;
        while(node != null){
            if( ((Comparable)val).compareTo(node.info) <= 0 ){// if(val <= node.info){
                parent = node;
                node = node.left;
            }
            else{
                parent = node;
                node = node.right;
            }
        }
        // At this point, node is null
        BSTNode<E> newNode = new BSTNode<E>(val);
        if(root == null){
            root = newNode;
            return;
        }
        if( ((Comparable)val).compareTo(parent.info) <= 0 )//if(val <= parent.info)
            parent.left = newNode;
        else
            parent.right = newNode;
    }

    public void addR(E val){
        root = addRHelper(val, root);
    }
    BSTNode<E> addRHelper(E val, BSTNode<E> node){
        // Use recursion.
                                                                               // Need work here
        if(node == null)
            return new BSTNode<E>(val);
        if(((Comparable)val).compareTo(node.info)<=0)
            node.left = addRHelper(val, node.left);
        else
            node.right = addRHelper(val, node.right);
        return node;
    }
    public int size() {
        // returns the number of nodes in the binary search tree. This is complete
        return sizeHelper(root);
    }
    int sizeHelper(BSTNode<E> node) {
        if(node == null) return 0;
        return sizeHelper(node.left) + sizeHelper(node.right) + 1;
    }
    public int height(){
        // returns the height of the tree. This is complete
        return heightHelper(root);
    }
    int heightHelper(BSTNode<E> node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 0;
        return Math.max(heightHelper(node.left),heightHelper(node.right)) + 1;
    }
}
