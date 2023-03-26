package Binary_Tree_2;

public class isBalancedTree extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, false);
        printTree(root);
        System.out.println("\nTree is Balanced->"+balanced(root));
    }
    private static boolean balanced(BinaryTreeNode<Integer> root){
        // check the base
        if(root == null){
            return true;
        }
        // get the height of the tree from left or right.
        // after that find the absolute value.
        int leftHeight = height(root.left);
        int RightHeight = height(root.right);
        // abs value greater then 1 then return false;
        // because balanced tree height is equal to -1, 0, 1.
        if(Math.abs(leftHeight-RightHeight)>1){
            return false;
        }
        // now using recursion we check the every level of the BinaryTree.
        boolean isLeftBal = balanced(root.left);
        boolean isRightBal = balanced(root.right);
        // return only true when both sides tree is balanced otherwise return false.
        return isLeftBal && isRightBal;
    }
    private static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return (1 + Math.max(leftHeight,rightHeight));
    }
    
}
