package Binary_Tree_2;
import java.util.Scanner;
public class BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, false);
        printTree(root);
    }
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);
    }
    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft)
    {
       if(isRoot){
        System.out.println("Enter the Root data:-");
       }
       else{
        if(isLeft)
        {
            System.out.println("Enter the left child of "+parentData);
        }
        else{
            System.out.println("Enter the right child of "+parentData);
        }
       }
       Scanner sc = new Scanner(System.in);
       int rootData = sc.nextInt();
       if(rootData == -1){
        return null;
       }
       BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
       root.left = takeInput(false, rootData, true);
       root.right = takeInput(false, rootData, false);
       return root;
    }
}
