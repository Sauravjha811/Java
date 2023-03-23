package Binary_Trees_1;

public class NodesGreaterX extends BinaryTreeByInput {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, false);
        printInDetailed(root);
        // Number of nodes greater then the X value.
        System.out.println(greaterNodes(root, 4));
    }
    public static int greaterNodes(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return 0;
        }
        int count = root.data > x ? 1:0;
        if(root.left!=null){
            count+=greaterNodes(root.left, x);
        }
        if(root.right!=null){
            count+=greaterNodes(root.right, x);
        }
        return count;
    }
    
}
