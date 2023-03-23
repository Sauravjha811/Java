package Binary_Trees_1;

public class BinaryTreeNode<T> {
    // these stores the data of the nodes.
    public T data;
    // these points to the left node of the tree.
    public BinaryTreeNode<T> left;
    // these points to the right node of the tree.
    public BinaryTreeNode<T> right;

    // constructor initalize the data of the nodes.
    public BinaryTreeNode( T data){
        this.data = data;
    }
}
