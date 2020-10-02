package tree;


public class BinarySearchTree<T extends Comparable<T>> extends Tree<T> {
    public void add(T value) {
        // No add the new value if it already exists in the BinSearchTree
               if (this.contains(value))
            return;

        Node<T> newNode = new Node<>(value);
        Node<T> root = this.getRoot();

        if (root == null)
            // Next step is add the new tree node if the BST is empty to begin with
            this.setRoot(newNode);
        else
            // Recursive addHelper method if the BST is not empty
            this.addHelper(root, newNode);
    }

    private void addHelper(Node<T> treeNode, Node<T> newNode) {
        // compareTo method.
        // for comparing generics which is why the T type for the class signature extends Comparable<T>
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
//contains
    public boolean contains(T value) {
        return this.containsHelper(this.getRoot(), value);
    }

    private boolean containsHelper(Node<T> treeNode, T value) {
        if (treeNode == null)
            return false;
//getValue
        if (treeNode.getValue().equals(value))
            return true;

        return (value.compareTo(treeNode.getValue()) < 0) ?
                this.containsHelper(treeNode.getLeft(), value) :
                this.containsHelper(treeNode.getRight(), value);
    }
}