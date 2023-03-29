package BST_2;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputInLevelWise();
        printLevelWise(root);
    }
    public static void printLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
            System.out.print(frontNode.data+" ");
            if(frontNode.left!=null){
                pendingNodes.add(frontNode.left);
            }
            if(frontNode.right!=null){
                pendingNodes.add(frontNode.right);
            }
        }
        System.out.println();
    }

    public static BinaryTreeNode<Integer> takeInputInLevelWise(){
        System.out.println("Enter the root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);
        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of "+front.data);
            int left = sc.nextInt();
            if(left!=-1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter right child of "+front.data);
            int right = sc.nextInt();
            if(right!=-1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }
}






