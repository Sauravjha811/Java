package BST_1;

import LinkedList_1.TakeInputInLL;

public class K1ToK2Elements extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputInLevelWise();
        printLevelWise(root);
        int k1 = 5, k2 = 15;
        printK1K2(root,k1,k2);
    }
    public static void printK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root == null){
            return;
        }
        // 1st condition.
        if(root.data>=k1 && root.data<=k2){
            printK1K2(root.left, k1, k2);
            System.out.print(root.data+" ");
            printK1K2(root.right, k1, k2);
        }
        else if(root.data<k1){
            printK1K2(root.right, k1, k2);
        }
        else if(root.data>k2){
            printK1K2(root.left, k1, k2);
        }
    }
}