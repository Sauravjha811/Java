package Binary_Tree_2;

public class BuilTreeUsingInorderPostorder extends PrintLevelWise {
    public static void main(String[] args) {
        
        int [] postOrder = {8,3,1,6,4,7,10,14,13};
        int [] InOrder = {1,3,4,6,7,8,10,13,14};
        BinaryTreeNode<Integer> root = buildTree(postOrder, InOrder);
        printLevelWise(root);
    }
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder)
    {
        int postStart = 0;
        int postEnd = postOrder.length-1;
        int inStart = 0;
        int inEnd = inOrder.length-1;
        return helper(postOrder,postStart,postEnd,inOrder,inStart,inEnd);
    }
    public static BinaryTreeNode<Integer> helper(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd){
        if(postStart>postEnd || inStart>inEnd){
            return null;
        }
        int rootVal = inOrder[postEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootVal);
        int k=0;
        for(int i=inStart;i<=inEnd;i++){
            if(rootVal == inOrder[i]){
                k=i;
                break;
            }
        }
        root.left = helper(postOrder, postStart, postStart+k-inStart-1, inOrder, inStart, k-1);
        root.right = helper(postOrder, postStart+k-inStart, postEnd-1, inOrder, k+1, inEnd);
        return root;
    }
}
