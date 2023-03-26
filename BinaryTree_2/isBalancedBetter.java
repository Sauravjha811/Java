package Binary_Tree_2;

public class isBalancedBetter extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, false);
        printTree(root);
        BinaryTreeReturn node =isBalBetter(root);
        System.out.println("\n Is Balanced Tree->"+node.isBalanced);
    }
    private static BinaryTreeReturn isBalBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            int height=0;
            boolean isBal=true;
            BinaryTreeReturn ans = new BinaryTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }
        BinaryTreeReturn leftOutput = isBalBetter(root.left);
        BinaryTreeReturn rightOutput = isBalBetter(root.right);
        boolean isBal = true;
        int height=1+Math.max(leftOutput.height,rightOutput.height);
        if(Math.abs(leftOutput.height - rightOutput.height)>1){
            isBal = false;
        }
        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }
        BinaryTreeReturn ans = new BinaryTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }
}
