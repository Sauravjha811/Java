package Binary_Trees_1;

public class HeightOfTree extends BinaryTreeByInput {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, false);
        printInDetailed(root);
        System.out.println("The height of the given Tree is->"+height(root));
    }
    private static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        // find the height of the left subtree
        int heightLeft = height(root.left);
        // find the height of the right subtree
        int heightRight = height(root.right);
        return 1+(Math.max(heightLeft,heightRight));
    }
}
