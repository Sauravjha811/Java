package Binary_Trees_1;

public class LargestValueNodes extends BinaryTreeByInput {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, false);
        printInDetailed(root);
        System.out.println("The Largest Value of Nodes:-"+largestValue(root));
    }
    public static int largestValue(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int largestLeft = largestValue(root.left);
        int largestRight = largestValue(root.right);
        return Math.max(root.data, Math.max(largestLeft,largestRight));
    }
}
