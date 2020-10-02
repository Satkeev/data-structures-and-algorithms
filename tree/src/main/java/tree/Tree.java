package tree;

import java.util.ArrayList;

//TreeNode have of type T and T should be comparable (i.e Implements the Comparable<T> interface.
public class Tree<T extends Comparable<T>> {
    //Root Node pointer. Will be null for an empty tree.
    private Node<T> root;

    public Tree() {
     //set the root
        this.setRoot(null);
    }

    public void getMax() {
        if (this.getRoot() == null)
            System.out.println("Empty tree. Nothing to find max on!");
        else
            // Calls the recursive helper method
            System.out.println(getMaxHelper(this.getRoot()));
    }
//getMaxHelper
    public T getMaxHelper(Node<T> node) {
        Node<T> leftNode = node.getLeft();
        Node<T> rightNode = node.getRight();

        T currentValue = node.getValue();

        if (leftNode == null && rightNode == null)
            return currentValue;

        T leftValue = null;
        T rightValue = null;

        if (leftNode != null)
            leftValue = this.getMaxHelper(node.getLeft());
        if (rightNode != null)
            rightValue = this.getMaxHelper(node.getRight());

        if (leftValue == null)
            return (currentValue.compareTo(rightValue) < 0) ? rightValue : currentValue;

        if (rightValue == null)
            return (currentValue.compareTo(leftValue) < 0) ? leftValue : currentValue;

        T bigger = (leftValue.compareTo(rightValue) < 0) ? rightValue : leftValue;

        return (currentValue.compareTo(bigger) < 0) ? bigger : currentValue;
    }
//breadthFirst
    public String breadthFirst() {
        StringBuilder output = new StringBuilder();
        Node<T> tempTreeNode;
        ArrayList<Node<T>> tempQueue = new ArrayList<>();

        if (this.getRoot() != null) {
            tempQueue.add(this.getRoot());
            while (!tempQueue.isEmpty()) {
                tempTreeNode = tempQueue.remove(0);
                output.append(tempTreeNode.getValue());
                output.append(" ");
                if (tempTreeNode.getLeft() != null)
                    tempQueue.add(tempTreeNode.getLeft());
                if (tempTreeNode.getRight() != null)
                    tempQueue.add(tempTreeNode.getRight());
            }
        }
        return output.toString().trim();
    }
//preOrder
    public ArrayList<T> preOrder() {
        ArrayList<T> outputArray = new ArrayList<>();
        if (this.getRoot() != null)
            preOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }

  //inOrder
        public ArrayList<T> inOrder() {
        ArrayList<T> outputArray = new ArrayList<>();
        if (this.getRoot() != null)
            inOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }

    public ArrayList<T> postOrder() {
        ArrayList<T> outputArray = new ArrayList<>();
        if (this.getRoot() != null)
            postOrderHelper(this.getRoot(), outputArray);
        return outputArray;
    }
//preOrderHelper
    private void preOrderHelper(Node<T> tree, ArrayList<T> outputArray) {
        outputArray.add(tree.getValue());

        if (tree.getLeft() != null)
            this.preOrderHelper(tree.getLeft(), outputArray);

        if (tree.getRight() != null)
            this.preOrderHelper(tree.getRight(), outputArray);
    }
//inOrderHelper
    private void inOrderHelper(Node<T> tree, ArrayList<T> outputArray) {
        if (tree.getLeft() != null)
            this.inOrderHelper(tree.getLeft(), outputArray);

        outputArray.add(tree.getValue());

        if (tree.getRight() != null)
            this.inOrderHelper(tree.getRight(), outputArray);
    }

    private void postOrderHelper(Node<T> tree, ArrayList<T> outputArray) {
        if (tree.getLeft() != null)
            this.postOrderHelper(tree.getLeft(), outputArray);

        if (tree.getRight() != null)
            this.postOrderHelper(tree.getRight(), outputArray);

        outputArray.add(tree.getValue());
    }

    /*
     * Setters and Getters Section
     */

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return this.root;
    }
}