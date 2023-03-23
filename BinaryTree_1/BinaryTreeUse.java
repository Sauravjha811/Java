package Binary_Trees_1;

public class BinaryTreeUse {
    public static void main(String[] args) {
        
        /*BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        root.left = rootLeft;
        root.right = rootRight;
        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
        rootLeft.right = twoRight;
        rootRight.left = threeLeft;*/
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        BinaryTreeNode<Integer> twoLeft = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(5);
        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(6);
        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.left = twoLeft;
        rootLeft.right = twoRight;
        rootRight.left = threeLeft;

        printInDetailed(root);
    }
    public static void printInDetailed(BinaryTreeNode<Integer> root){
        // base case
        if(root == null){
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print("L->"+root.left.data+",");
        }
        if(root.right!=null){
            System.out.print("R->"+root.right.data);
        }
        System.out.println();
        printInDetailed(root.left);
        printInDetailed(root.right);
    }


    public static void printBinaryTree(BinaryTreeNode<Integer>root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }
}
