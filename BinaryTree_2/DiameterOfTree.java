package Binary_Tree_2;

public class DiameterOfTree extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, false);
        printTree(root);
        System.out.println("Binary Tree Diameter is:-"+diameterTree(root));
    }
    public static int diameterTree(BinaryTreeNode<Integer> root){
        // we call the helper method to get the details of nodes, that stores the 
        // info of longest diameter, height of the tree.
        Pair pair = diameterTreeHelper(root);
        return pair.diameter;
    }
    public static Pair diameterTreeHelper(BinaryTreeNode<Integer>root){
        // base case if root null, then initailize or create the pair class
        // return the pair.
        if(root == null){
            Pair pair = new Pair(0,0);
            return pair;
        }
        // scan to the leftPair of the tree, and find the diameter, height of the tree
        Pair leftPair = diameterTreeHelper(root.left);
        // scan to the rightPair of the tree, and find the diameter, height of the tree.
        Pair RightPair = diameterTreeHelper(root.right);

        // leftDimater stores the heightest diamter of the leftpart of the tree.
        int leftDiameter = leftPair.diameter;
        // rightDiamter stores the highest diamter of the rightPart of the tree.
        int rightDiameter = RightPair.diameter;
        
        // dist stores the overall height of the tree.
        int dist = leftPair.height+RightPair.height+1;

        // dia stores the overall the highest value of the leftDia, rightDia, or dist.
        int dia = Math.max(leftDiameter,Math.max(rightDiameter,dist));
        // hieght pair stores the max of left height or rightHeight;
        int height = Math.max(leftPair.height,RightPair.height)+1;
        return new Pair(dia,height);
    }

}
// create a customize pair to stored the info about diameter, height of the specific nodes of the tree
// it also helps us to improve the time complexity of the algorithm.
class Pair{
    int diameter;
    int height;
    Pair(int diameter, int height){
        this.diameter = diameter;
        this.height = height;
    }
}
