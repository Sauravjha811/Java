package BST_1;

public class isBSTbest extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputInLevelWise();
        printLevelWise(root);
        System.out.println("Is Tree BST:-"+isBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    private static boolean isBST(BinaryTreeNode<Integer> root, int minRange, int maxRange){
        if(root == null){
            return true;
        }
        if(root.data<minRange || root.data>=maxRange){
            return false;
        }
        boolean isLeftWithRange = isBST(root.left, minRange, root.data);
        boolean isRightWithRange = isBST(root.right,root.data,maxRange);
        return isLeftWithRange && isRightWithRange;
    }
    
}
