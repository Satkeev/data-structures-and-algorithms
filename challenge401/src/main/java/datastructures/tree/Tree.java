package datastructures.tree;


public class Tree {
    public Node root = null;

    public Tree() {}

    public Tree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
