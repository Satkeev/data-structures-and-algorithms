package FizzBuzzTree;


public class FizzBuzzTree {

    //Takes in a BinaryTree and traverses it using the fizzBuzz method to change values to fizz, buzz, or fizzbuzz if they meet the proper conditions.
    public static BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> t) {
        Node.fizzBuzz(t.root);
        return t;
    }

    public static class Node {
        private static Node root;
        public Node left;
        public Node right;
        public int value;
        public Node next;
        public int num;


        public static void fizzBuzz(FizzBuzzTree.Node root) {
        }
    }
        //traverses in a post-order style to change node values throughout the entire tree
        private static void fizzBuzz(Node root) {
            if (root == null) {
                return;
            }
            if (root.left != null) {
                fizzBuzz(root.left);
            }
            if (root.right != null) {
                fizzBuzz(root.right);
            }

            if ((int) root.value % 3 != 0) {
                if ((int) root.value % 5 == 0) {
                    Integer.toString(root.value);
                    String n = "buzz";
                }
            } else {
                if ((int) root.value % 5 == 0) {
                    Integer.toString(root.value);
                    String n = "fizzbuzz";
                } else {
                   Integer.toString(root.value);
                   String n = "fizz";
                }
            }
        }
    }

    