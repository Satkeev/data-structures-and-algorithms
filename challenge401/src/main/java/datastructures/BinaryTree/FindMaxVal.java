package BinaryTree;

import java.util.ArrayList;

class FindMaxValue<T> {
    public Node<T> root;

    public FindMaxValue() {
        this.root = null;
    }

    //Takes in a root Node, and utilizing a helper method will return an ArrayList of all the Nodes in the tree, traversed by a depth first pre-order
    public ArrayList<Node<T>> preOrder(Node<T> root) {
        return preOrderHelper(new ArrayList<>(), root);
    }

    private ArrayList<Node<T>> preOrderHelper(ArrayList<Node<T>> ordered, Node<T> root) {
        ordered.add(root);
        if (root.left != null) {
            preOrderHelper(ordered, root.left);
        }
        if (root.right != null) {
            preOrderHelper(ordered, root.right);
        }

        return ordered;
    }

    //Takes in a root Node, and utilizing a helper method will return an ArrayList of all the Nodes in the tree, traversed by a depth first in-order
    public  ArrayList<Node<T>> inOrder(Node<T> root) {
        return inOrderHelper(new ArrayList<>(), root);
    }

    private  ArrayList<Node<T>> inOrderHelper(ArrayList<Node<T>> ordered, Node<T> root) {
        if (root.left != null) {
            inOrderHelper(ordered, root.left);
        }
        ordered.add(root);
        if (root.right != null) {
            inOrderHelper(ordered, root.right);
        }

        return ordered;
    }

    //Takes in a root Node, and utilizing a helper method will return an ArrayList of all the Nodes in the tree, traversed by a depth first post-order
    public  ArrayList<Node<T>> postOrder(Node<T> root) {
        return postOrderHelper(new ArrayList<>(), root);
    }

    private  ArrayList<Node<T>> postOrderHelper(ArrayList<Node<T>> ordered, Node<T> root) {
        if (root.left != null) {
            postOrderHelper(ordered, root.left);
        }
        if (root.right != null) {
            postOrderHelper(ordered, root.right);
        }
        ordered.add(root);

        return ordered;
    }

    //Takes in a tree, and using a queue for help, traverses the tree breadth first, printing out the value of nodes in that order
    public void breadthTraversal(FindMaxValue t) {
        if (t.root ==null) {
            return;
        }

        Queue<Node<T>> q = new Queue<>();
        q.enqueue(t.root);

        while (q.front != null) {
            Node<T> front = q.dequeue();
            if (front.left != null) {
                q.enqueue(front.left);
            }
            if (front.right != null) {
                q.enqueue(front.right);
            }
            System.out.println(front.value);
        }
    }

    //Takes in a tree of Integer values and returns the highest value in the tree. Returns 0 if the tree is empty
    public static int findMaximumValue(FindMaxValue<Integer> t) {
        if (t.root == null) {
            return 0;
        }
        return findMaximumValueHelper(t.root);
    }

    //Helper function to traverse the tree recursively in post order to return the highest value compared to a nodes value, and its highest left and right values
    private static int findMaximumValueHelper(Node<Integer> root) {
        int highestLeft = root.value;
        int highestRight = root.value;

        if (root.left == null && root.right == null) {
            return root.value;
        }
        if (root.left != null) {
            highestLeft = findMaximumValueHelper(root.left);
        }
        if (root.right != null) {
            highestRight = findMaximumValueHelper(root.right);
        }
        return Math.max(root.value, Math.max(highestLeft, highestRight));
    }

}
