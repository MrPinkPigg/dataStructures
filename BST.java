public class BST <T>
{
    public class BSTNode <X>
    {
        X val;
        BSTNode left;
        BSTNode right;

        BSTNode getLeft() {
            return left;
        }

        BSTNode getRight() {
            return right;
        }

        void setLeft(BSTNode bn) {
            left = bn;
        }

        void setRight(BSTNode bn) {
            right = bn;
        }

        X get() {
            return val;
        }

        void set(X v) {
            val = v;
        }

        //need a version of get that returns a comparable object,
        //because compareTo won't work on generic types by default
        //use get when you need to access the value, use getc
        //when you need to do a comparison
        //This will crash if a non-comparable object is used.
        Comparable getc() {
            return (Comparable) val;
        }
    }
    
    void insert(T insertMe){
        
    }
    
    void inOrderPrint(){
        
    }
    
    boolean exists(T checkMe){
        return true;
    }
}