package Binary_Tree_2;

public class removeLeafNodes extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, false);
        printTree(root);
        System.out.println("Tree after removing leaf nodes:-");
        root = removeLeaf(root);
        printTree(root);
        }
    private static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }
        if(root.left == null && root.right==null){
            return null;
        }
        // recursion gives the result that should be stored to the 
        // left or right parts of the tree.
        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }
}
