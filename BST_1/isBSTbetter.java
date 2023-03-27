package BST_1;

public class isBSTbetter extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputInLevelWise();
        printLevelWise(root);
        isBSTreturn ans = isBST2(root);
        System.out.println(ans.min+" "+ans.max+" "+ans.isBST);
    }
    public static isBSTreturn isBST2 (BinaryTreeNode<Integer> root){
        if(root == null){
            isBSTreturn ans = new isBSTreturn (Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            return ans;
        }
        isBSTreturn leftAns = isBST2(root.left);
        isBSTreturn rightAns = isBST2(root.right);

        int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
        boolean isBST = true;
        if(leftAns.max>=root.data){
            isBST = false;
        }
        if(rightAns.min<root.data){
            isBST = false;
        }
        if(!leftAns.isBST){
            isBST = false;
        }
        if(!rightAns.isBST){
            isBST = false;
        }
        isBSTreturn ans = new isBSTreturn(min, max, isBST);
        return ans;
    }
}