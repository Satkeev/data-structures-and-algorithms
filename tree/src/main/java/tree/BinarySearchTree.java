package tree;


public class BinarySearchTree<T extends Comparable<T>> extends Tree<T> {
    public void add(T value) {
        // Do not add the new value if it already exists in the BST
        // Don't throw an error (my choice)
        if (this.contains(value))
            return;

        Node<T> newNode = new Node<>(value);
        Node<T> root = this.getRoot();

        if (root == null)
            // Add the new tree node if the BST is empty to begin with
            this.setRoot(newNode);
        else
            // Execute the recursive addHelper method if the BST is not empty
            this.addHelper(root, newNode);
    }

    private void addHelper(Node<T> treeNode, Node<T> newNode) {
        // Magic happens here with the compareTo method.
        // It is needed for comparing generics which is why the T type for the class signature extends Comparable<T>
        if (newNode.getValue().compareTo(treeNode.getValue()) < 0) {
            if (treeNode.getLeft() == null)
                treeNode.setLeft(newNode);
            else
                this.addHelper(treeNode.getLeft(), newNode);
        } else {
            if (treeNode.getRight() == null)
                treeNode.setRight(newNode);
            else
                this.addHelper(treeNode.getRight(), newNode);
        }
    }

    public boolean contains(T value) {
        return this.containsHelper(this.getRoot(), value);
    }

    private boolean containsHelper(Node<T> treeNode, T value) {
        if (treeNode == null)
            return false;

        if (treeNode.getValue().equals(value))
            return true;

        return (value.compareTo(treeNode.getValue()) < 0) ?
                this.containsHelper(treeNode.getLeft(), value) :
                this.containsHelper(treeNode.getRight(), value);
    }
}