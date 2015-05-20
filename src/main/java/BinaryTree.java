/**
 * Created by Brent Baker on 5/17/15.
 */
public class BinaryTree {
    Node root;

    /**
     * Add Node to Binary Tree
     * @param data Value node data
     */
    public void addNode(String data) {
        // Create a new Node and initialize it

        Node<String> newNode = new Node<String>(data);
        if (root == null) {
            root = newNode;
        } else {
            // Set root as the Node we will start
            // with as we traverse the tree
            Node<String> focusNode = root;

            // Future parent for our new Node
            Node parent;

            while (true) {

                // root is the top parent so we start
                // there

                parent = focusNode;

                // Check if the new node should go on
                // the left side of the parent node

                if (data.compareTo(focusNode.data) < 0) {
                    focusNode = focusNode.leftChild;

                    // If the left child has no children
                    if (focusNode == null) {
                        // then place the new node on the left of it
                        parent.leftChild = newNode;
                        return; // All Done
                    }
                } else { // If we get here put the node on the right
                    focusNode = focusNode.rightChild;

                    // If the right child has no children
                    if (focusNode == null) {
                        // then place the new node on the right of it

                        parent.rightChild = newNode;
                        return; // All Done
                    }

                }
            }
        }
    }

    /**
     * Traverse binaryTree in order
     *
     * @param focusNode BinaryTree Node
     */
    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            // Traverse the left node
            inOrderTraverseTree(focusNode.leftChild);

            // Print the currently focused on node
            System.out.println(focusNode);

            // Traverse the right node
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    /**
     * Traverse binaryTree pre order
     *
     * @param focusNode BinaryTree Node
     */
    public void preorderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            // Print the currently focused on node
            System.out.println(focusNode);

            // Traverse the left node
            inOrderTraverseTree(focusNode.leftChild);

            // Traverse the right node
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    /**
     * Traverse binaryTree post order
     *
     * @param focusNode BinaryTree Node
     */
    public void postOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            // Traverse the left node
            inOrderTraverseTree(focusNode.leftChild);

            // Traverse the right node
            inOrderTraverseTree(focusNode.rightChild);

            // Print the currently focused on node
            System.out.println(focusNode);

        }
    }


    /**
     * Find data in binaryTree
     * @param data search value
     * @return
     */
    public Node<String> findNode(String data) {
        // Start at the top of the tree
        Node<String> focusNode = root;

        while (!focusNode.data.equals(data)) {
            // If we should search to the left
            if (data.compareTo(focusNode.data) < 0) {
                // Shift the focus Node to the left child
                focusNode = focusNode.leftChild;
            } else {
                // Shift the focus Node to the right child
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null)
                return null;
        }
        return focusNode;
    }
}
