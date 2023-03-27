package BST_1;

public class isBSTreturn {
    // we make or create a class of BST return that
    // stores the min,max and isBST value in it.
    // that's class or nodes helps us to find the 
    // min, max value and isBST value in the linear time.
    int min;
    int max;
    boolean isBST;
    isBSTreturn(int min, int max, boolean isBST){
        this.min = min;
        this.max = max;
        this.isBST = isBST;
    }
}
