package Binary_Tree_2;

public class MirrorBinaryTree extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, false);
        printTree(root);
        System.out.println("\nMirror of the tree is:-");
        mirror(root);
        printTree(root);
    }
    private static void mirror(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        mirror(root.left);
        mirror(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
