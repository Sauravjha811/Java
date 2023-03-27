package BST_1;

public class SortedArrayToBST extends BinaryTreeUse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        BinaryTreeNode<Integer> root = SortedarrayToBST(arr, 0,arr.length-1);
        printLevelWise(root);
    }
    public static BinaryTreeNode<Integer> SortedarrayToBST(int []arr,int start, int end)
    {
        if(start>end){
            return null;
        }
        int mid = start+(end-start)/2;
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(arr[mid]);
        temp.left = SortedarrayToBST(arr, start, mid-1);
        temp.right = SortedarrayToBST(arr, mid+1, end);
        return temp;
    }
}
