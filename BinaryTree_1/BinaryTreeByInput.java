package Binary_Trees_1;
import java.util.Scanner;

public class BinaryTreeByInput extends BinaryTreeUse {
    public static void main(String[] args) {
        // create the BinaryTree Using the user's input.
        BinaryTreeNode<Integer> root = improveInputOfTree(true,0,true);
        printInDetailed(root);
    }
    public static BinaryTreeNode<Integer> improveInputOfTree(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter the Root Data:-");
        }
        else
        {
            if(isLeft){
                System.out.println("Enter the Left child of "+parentData);
            }
            else
            {
                System.out.println("Enter the right child of "+parentData);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = improveInputOfTree(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = improveInputOfTree(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static BinaryTreeNode<Integer> inputOfTree(){
        System.out.println("Enter the root data:-");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        // if user enter -1 then it indicates us the user does not want to enter the data in the tree.
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = inputOfTree();
        BinaryTreeNode<Integer> rightChild = inputOfTree();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
}
