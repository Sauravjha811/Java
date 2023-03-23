package Binary_Trees_1;

public class NumOfLeafNodes extends BinaryTreeByInput{
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, false);
        printInDetailed(root);
        System.out.println("Total Num of Leaf Nodes is:-"+numLeafNodes(root));
    }
    private static int numLeafNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left== null && root.right == null){
            return 1;
        }
        int leafNodesLeft = numLeafNodes(root.left);
        int leafNodesRight = numLeafNodes(root.right);
        return leafNodesLeft+leafNodesRight;
    }
}
