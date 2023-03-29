package BST_2;
import java.util.ArrayList;
public class RootToNodeInBT extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputInLevelWise();
        printLevelWise(root);
        ArrayList<Integer> Path = nodeToRootPath(root,6);
        for(int element: Path){
            System.out.print(element+" ");
        }
    }
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x)
    {
        if(root == null){
            return null;
        }
        if(root.data == x){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
        if(leftOutput!=null){
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
        if(rightOutput!=null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
    }
}

