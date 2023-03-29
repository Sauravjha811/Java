package BST_2;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    public int getSize(){
        return this.size;
    }
    private boolean isPresent(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        if(x<root.data){
            return isPresent(root.left, x);
        }
        else 
        {
            return isPresent(root.right, x);
        }
    }
    public boolean isPresent(int x){
        return isPresent(root, x);
    }
    private void printTree(BinaryTreeNode<Integer>root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        if(root.left!=null){
            System.out.print("L-"+root.left.data+",");
        }
        if(root.right!=null){
            System.out.print("R-"+root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);

    }
    public void printTree(){
        printTree(root);
    }
    public void insert(int data){
        root = insert(data,root);
    }
    private BinaryTreeNode<Integer> insert(int data, BinaryTreeNode<Integer> root)
    {
        if(root == null){
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
            size++;
            return newNode;
        }
        if(root.data>=data){
            root.left = insert(data, root.left);
        }
        else
        {
            root.right = insert(data,root.right);
        }
        return root;
    }

    public void remove(int data){
        root = remove(data, root);
    }
    private BinaryTreeNode<Integer> remove(int data, BinaryTreeNode<Integer> root)
    {
        if(root == null){
            return null;
        }
        if(data < root.data){
            root.left = remove(data, root.left);
            return root;
        }
        else if(data> root.data){
            root.right = remove(data, root.right);
            return root;
        }
        else {
            if(root.left == null && root.right == null){
                size--;
                return null;
            }
            else if(root.left == null && root.right!=null){
                size--;
                return root.right;
            }
            else if(root.right == null && root.left!=null){
                size--;
                return root.left;
            }
            else {
                BinaryTreeNode<Integer> minNode = root.right;
                while(minNode.left!= null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = remove(minNode.data, root.right);
                return root;
            }
        }
    }
    }
    