/**
 * Created by Brent Baker on 5/17/15.
 */
public class Main {


    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();

        theTree.addNode("F");

        theTree.addNode("B");

        theTree.addNode("A");

        theTree.addNode("D");

        theTree.addNode("C");

        theTree.addNode("E");

        theTree.addNode("G");

        theTree.addNode("I");

        theTree.addNode("H");

        // Different ways to traverse binary trees
        System.out.println("\nIn Order");
        theTree.inOrderTraverseTree(theTree.root);

        System.out.println("\nPre Order");
        theTree.preorderTraverseTree(theTree.root);

        System.out.println("\nPost Order");
        theTree.postOrderTraverseTree(theTree.root);


        System.out.println("\nNode with the key E");

        System.out.println(theTree.findNode("E"));

    }
}
