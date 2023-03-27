package BST_1;

public class isBST extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputInLevelWise();
        printLevelWise(root);
        System.out.println("The Tree is BST:-"+isBst(root));
    }
    public static boolean isBst(BinaryTreeNode<Integer>root){
        // base if root null return true.
        if(root == null){
            return true;
        }
        // leftMax fetch the data or value of max value in the left subtree
        int leftMax = largest(root.left);
        // max value is greater or equal to the root data return false
        // that means it is not BST.
        if(leftMax>=root.data){
            return false;
        }
        // similar manner, its fetch the minimum value in the right subtree
        // if the min value is smaller then root.data return false.
        int rightMin = Minimum(root.right);
        if(rightMin<root.data){
            return false;
        }
        // above condition are not met, then comes to the left subtree or right subtree
        // part of the binary Tree.
        boolean isLeftBST = isBst(root.left);
        boolean isRightBST = isBst(root.right);
        // for BST, both left and right should be return true.
        return isLeftBST && isRightBST;
    }
    public static int largest(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }
    public static int Minimum(BinaryTreeNode<Integer> root){
        if(root == null){
           return Integer.MAX_VALUE;
        }
        int MinimumLeft = Minimum(root.left);
        int MinimumRight = Minimum(root.right);
        return Math.min(root.data,Math.min(MinimumLeft, MinimumRight));
    }
}

