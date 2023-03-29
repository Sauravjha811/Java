package BST_2;
import java.util.ArrayList;
public class RootToNodeInBST extends BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputInLevelWise();
        printLevelWise(root);
        ArrayList<Integer> Path = getPath(root, 7);
        for(Integer element: Path){
            System.out.print(element+" ");
        }
    }
    private static ArrayList<Integer> getPath(BinaryTreeNode<Integer>root, int x){
        if(root == null)
        {
            return null;
        }
        if(root.data == x){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        else if(x<root.data){
            ArrayList<Integer> leftOutput = getPath(root.left,x);
            if(leftOutput!=null){
                leftOutput.add(root.data);
                return leftOutput;
            }
        }
        else {
            ArrayList<Integer> rightOutput = getPath(root.right, x);
            if(rightOutput!=null){
                rightOutput.add(root.data);
                return rightOutput;
            }
        }
        return null;
    }
}
