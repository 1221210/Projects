package apps.tree;

public class MyBST <E>{
    BSTNode<E> root;
    public void printBST(){
        InOrder(root);System.out.println();
//        PreOrder(root); System.out.println();
//        PostOrder(root);System.out.println();
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
            BSTNode<E> node = root;
            while(node.left != null){
                node = node.left;
            // at the moment, node is null, you are za minimum
            }
            return node.info;

        }
        public E max(){
            return maxHelper(root);
        }

        E maxHelper(BSTNode<E> node){
            if(node == null)
                return null;
            if(node.right == null)
                return node.info;
           return maxHelper(node.right);
        // recursive

        }
       public void add(E val) {
           BSTNode<E> node = root;
           BSTNode<E> parent = null;

           while (node != null) {
               if (((Comparable) val).compareTo(node.info) <= 0) {//if(val <= node.info){
                   parent = node;
                   node = node.left;
               } else {
                   parent = node;
                   node = node.right;
               }
           }
           // at this moment node is null
           // make connection from the parent to the new node
           BSTNode<E> newNode = new BSTNode<E>(val);
           if (root == null) {
               root = newNode;
               return;
           }
           if (((Comparable) val).compareTo(parent.info) <= 0) {//if(val < parent.info)
               parent.left = newNode;
           } else {
               parent.right = newNode;
               node = node.right;
           }
       }
           public BSTNode<E> search(E val){
                return searchHelper(val, root);
           }
           BSTNode<E> searchHelper(E val, BSTNode<E> node){
                // use recursion
                if(node == null)
                    return null;
                if(val.equals(node.info))
                    return node;
                if(((Comparable)val).compareTo(node.info) <= 0)
                    searchHelper(val, node.left);
                else
                    return searchHelper(val, node.right);
               return node;
           }
           public void remove(E val){
                removeHelper(val, root);
           }
          BSTNode<E> removeHelper(E val, BSTNode<E> node){
                // recursive
               // if the value is less than the node.info, remove the val in the left subtree
               // else if val is greater than node.info, remove the value in the right subtree
               // else(val is same as node.info), then remove you(node) - casw1,2,3
              if(node == null)
                  return null;
              if(((Comparable)val).compareTo(node.info) < 0){
                  node.left = removeHelper(val, node.left);
                  return node;
               }
               else if(((Comparable)val).compareTo(node.info) > 0){
                  node.right = removeHelper(val, node.right);
                  return node;
               }
               else{
                   // val == node.info
                       // remove you (node)
                       // case 1 node has no child
                       // case 2 node has one child
                       // case 3 node has two child
                    if(node.left == null && node.right == null){
                        // cut the connection from the parent
                        return null;
                    }
                    else if(node.left == null){ // node.right is not null case 1
                            // hand over your child(right child)
                        return node.right;
                    }
                    else if(node.right == null){ // node.left is not null case 2
                        return node.left;
                    }
                    else{
                        // case 3 node has both children
                        // step 1: find a replacement, predecessor(max value in your left subtree)
                        // step 2: copy replacement value into node.info
                        // step 3: remove predecessor
                       E predecessor =  maxHelper(node.left);
                       node.info = predecessor;
                       removeHelper(predecessor, node.left);
                       return node;
                   }
                }
           }

}
