package tree;

//Create class Node with T type parameter
public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;
    /*
     * Getters and Setters Section
     */
    public Node(T value) {
        // No setter for value because set only once
        this.value = value;
        this.setLeft(null);
        this.setRight(null);
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}