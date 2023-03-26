package Binary_Tree_2;
import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise extends levelWiseTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("level wise order of the tree is:-");
        printLevelWise(root);
    }
    public static void printLevelWise(BinaryTreeNode<Integer>root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
            System.out.print(frontNode.data+":L:");
            if(frontNode.left!=null){
                pendingNodes.add(frontNode.left);
                System.out.print(frontNode.left.data+",R:");
            }
            else{
                System.out.print(-1+",R:");
            }
            if(frontNode.right!=null){
                pendingNodes.add(frontNode.right);
                System.out.println(frontNode.right.data);
            }
            else
            {
                System.out.println(-1);
            }
        }
    }
}
