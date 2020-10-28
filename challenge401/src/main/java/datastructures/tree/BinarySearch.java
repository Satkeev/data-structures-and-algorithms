package datastructures.tree;

public class BinarySearch extends BinaryTree {

    public BinarySearch(Node root) {
        super(root);
    }

    public BinarySearch() { super(); }

    public void add(int value, Node current) throws Exception {
        // edge case for empty tree
        if (current == null) {
            this.setRoot(new Node(value));
            return;
        }
        if (value == current.getValue()) throw new Exception("This value is already in the tree");
        // if less than current, checks for a left node
        //
        if (value < current.getValue()) {
            if (current.getLeft() == null) {
                current.setLeft(new Node(value));
                return;
            } else {
                add(value, current.getLeft());
                return;
            }
        }
        if (value > current.getValue()) {
            if (current.getRight() == null) {
                current.setRight(new Node(value));
                return;
            } else {
                add(value, current.getRight());
                return;
            }
        }
    }

    public boolean contains(int value, Node current) {
        // base case:
        if (current == null) return false;
        if (value == current.getValue()) return true;
        if (value < current.getValue()) return contains(value, current.getLeft());
        return contains(value, current.getRight());
    }
}
