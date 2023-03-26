package Binary_Tree_2;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class levelWiseTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();

    }
    // method to take input in the levelwise order in the tree.
    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root data:-");
        int rootData = sc.nextInt();

        if(rootData==-1)
        {
            return null;
        }
        // create a root node of the tree and initialize with the rootData.
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        // used the queue data structure for the storing the information of the tress nodes
        // in the levelwise order.
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        // add the nodes the queue.
        pendingChildren.add(root);
        // traverse or taking the values until the Queue is not empty.
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
