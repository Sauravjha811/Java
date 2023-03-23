package Binary_Trees_1;

public class printNodesAtKdepth extends BinaryTreeByInput {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, false);
        printBinaryTree(root);
        printNodesK(root,2);
    }
    private static void printNodesK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
            return;
        }
        printNodesK(root.left,k-1);
        printNodesK(root.right,k-1);
    }
}
