package Binary_Trees_1;

public class NumOfNodes extends BinaryTreeByInput {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, true);
        printInDetailed(root);
        System.out.println(countNodes(root));
    }
    private static int countNodes(BinaryTreeNode<Integer> root){
        // base case
        if(root==null)
        {
            return 0;
        }
        int countLeftSubtree = countNodes(root.left);
        int countRightSubtree = countNodes(root.right);
        return 1+countLeftSubtree+countRightSubtree;
    }
}
