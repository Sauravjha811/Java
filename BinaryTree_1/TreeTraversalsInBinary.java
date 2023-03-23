package Binary_Trees_1;

public class TreeTraversalsInBinary extends BinaryTreeByInput {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = improveInputOfTree(true, 0, false);
        printInDetailed(root);
        // preOrder traversals in the tree.
        System.out.println("PreOrder traversals of the above tree is given below:-");
        preOrder(root);
        System.out.println();
        System.out.print("PostOrder traversals of the above tree is given below:-");
        postOrder(root);
        System.out.println();
        System.out.print("Inorder traversals of the above tree is given below:-");
        inOrder(root);
    }
    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inOrder(BinaryTreeNode<Integer>root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}
