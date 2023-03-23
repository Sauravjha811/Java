package Binary_Trees_1;

public class SumOfNodes extends BinaryTreeByInput {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, true);
        printInDetailed(root);
        System.out.println("Sum of all Nodes of the Binary Tree is:-"+sumNodes(root));
    }
    private static int sumNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int sumLeft = sumNodes(root.left);
        int sumRight = sumNodes(root.right);
        return root.data+sumLeft+sumRight;
    }
}
