package Breath.First;

import java.util.Iterator;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collection;

public class BinaryTree<I extends Number> {
    private static Object Node;
    private static Object Number;
    public Node<Number> root;

    public BinaryTree() {
        this.root = null;
    }

    public static class Node<I extends Number> {
        public Node<Number> left;
        public Node<Number> right;
        public int value;
        public Node<Number> next;
        public int num;

        public Node(int value) {
        }
    }


    public static ArrayList<Node<Number>> preOrder(Node<Number> root) {
        return preOrderHelper(new ArrayList<>(), root);
    }

    private static ArrayList<Node<Number>> preOrderHelper(ArrayList<Node<Number>> ordered, Node<Number> root) {
        ordered.add(root);
        if (root.left != null) {
            preOrderHelper(ordered, root.left);
        }
        if (root.right != null) {
            preOrderHelper(ordered, root.right);
        }

        return ordered;
    }


    public static ArrayList<Node<Number>> inOrder(Node<Number> root) {
        return inOrderHelper(new ArrayList<>(), root);
    }

    private static ArrayList<Node<Number>> inOrderHelper(ArrayList<Node<Number>> ordered, Node<Number> root) {
        if (root.left != null) {
            inOrderHelper(ordered, root.left);
        }
        ordered.add(root);
        if (root.right != null) {
            inOrderHelper(ordered, root.right);
        }

        return ordered;
    }

    //pre order
    public static ArrayList<Node<Number>> postOrder(Node<Number> root) {
        return postOrderHelper(new ArrayList<>(), root);
    }

    private static ArrayList<Node<Number>> postOrderHelper(ArrayList<Node<Number>> ordered, Node<Number> root) {
        if (root.left != null) {
            postOrderHelper(ordered, root.left);
        }
        if (root.right != null) {
            postOrderHelper(ordered, root.right);
        }
        ordered.add(root);

        return ordered;
    }

      public static void breadthTraversal(BinaryTree<Number> t) {
        if (t.root == null) {
            return;
        }

        class Queue<T> {
            Queue front;

            public Queue() {
                front = null;

            }

            public void enqueue(T root) {
            }

            public T dequeue() {
                return null;
            }
        }


        Queue<Node> q = new Queue<>();
        q.enqueue(t.root);

        while (q.front != null) {
            Node<Number> front = q.dequeue();
            if (front.left != null) {
                q.enqueue(front.left);
            }
            if (front.right != null) {
                q.enqueue(front.right);
            }
            System.out.println(front.value);
        }
    }

    //is empty
    public int findMaximumValue(BinaryTree<Integer> t) {
        if (t.root == null) {
            return 0;
        }
        return findMaximumValueHelper(t.root);
    }

    //Helper function 
    private static int findMaximumValueHelper(Node<Number> root) {
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



