package BST_1;

public class searchNodesInBST extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputInLevelWise();
        printLevelWise(root);
        int k = 10;
        System.out.println(k +" is present in the BST:-"+ searchBST(root,k));
    }
    public static boolean searchBST(BinaryTreeNode<Integer>root,int k){
        if(root == null){
            return false;
        }
        if(root.data==k){
            return true;
        }
        else if(root.data>k){
            return searchBST(root.left, k);
        }
        else {
            return searchBST(root.right, k);
        }
    }
}
