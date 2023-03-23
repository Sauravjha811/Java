package Binary_Trees_1;

public class ReplaceNodesWithDepth extends BinaryTreeByInput {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, false);
        printInDetailed(root);
        System.out.println();
        changeNodesToDepth(root,0);
        printInDetailed(root);
    }
    private static void changeNodesToDepth(BinaryTreeNode<Integer>root, int level){
        if(root == null){
            return;
        }
        root.data = level;
        changeNodesToDepth(root.left, level+1);
        changeNodesToDepth(root.right,level+1);
    }
}
