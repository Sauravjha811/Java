package Binary_Tree_2;

public class BuildTreeUsingInorderPreorder extends PrintLevelWise {
    public static void main(String[] args) {
        int [] preOrder = {8,3,1,6,4,7,10,14,13};
        int [] InOrder = {1,3,4,6,7,8,10,13,14};
        BinaryTreeNode<Integer> root = buildTree(preOrder,InOrder);
        printLevelWise(root);
    }
    private static BinaryTreeNode<Integer> buildTree(int [] preOrder, int[] InOrder){
        int n = preOrder.length;
        int preStart = 0;
        int preEnd = n-1;
        int inStart = 0;
        int inEnd = n-1;
        return buildTreeHelper(preOrder, preStart, preEnd, InOrder, inStart, inEnd);
    }
    private static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int preStart, int preEnd, int[] InOrder, int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        int rootVal = preOrder[preStart];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootVal);

        // find root element index form the inorder array.
        int k=0;
        for(int i=inStart;i<=inEnd;i++){
            if(rootVal == InOrder[i]){
                k=i;
                break;
            }
        }
        root.left = buildTreeHelper(preOrder, preStart+1, preEnd+(k-inStart), InOrder, inStart, k-1);
        root.right = buildTreeHelper(preOrder, preStart+(k-inStart)+1, preEnd, InOrder, k+1, inEnd);
        return root;
    }
}
