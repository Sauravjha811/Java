package BST_2;

import BST_1.isBST;

public class BSTUse {
    public static void main(String[] args) {
        BST tree = new BST();
        
        tree.insert(4);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.printTree();
        System.out.print("is Presnet "+tree.isPresent(2)+" "+tree.isPresent(7));
        tree.remove(4);
        tree.printTree();
        System.out.println("SIZE :"+tree.getSize());
    }
}
