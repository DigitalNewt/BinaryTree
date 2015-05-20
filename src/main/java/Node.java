/**
 * Created by Brent Baker on 5/17/15.
 */
public class Node<T> {
    T data;

    Node leftChild;
    Node rightChild;

    public Node(T data) {
        this.data = data;
    }

    public String toString() {
        return "Node Data = " + data;
    }
}
