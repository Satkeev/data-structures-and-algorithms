package tree;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

    public class TreeTest {
        public Tree<Integer> binTree;

            public void setBinaryTree() {
            Node<Integer> root = new Node<>(8);
            Node<Integer> l = new Node<>(4);
            Node<Integer> r = new Node<>(10);
            Node<Integer> ll = new Node<>(5);
            Node<Integer> lr = new Node<>(3);
            Node<Integer> rl = new Node<>(9);
            Node<Integer> rr = new Node<>(1);
            root.setLeft(l);
            l.setLeft(ll);
            l.setRight(lr);
            root.setRight(r);
            r.setLeft(rl);
            r.setRight(rr);
            this.binTree = new Tree<>();
            this.binTree.setRoot(root);
        }

        @Test
        public void testPreOrder() {
            assertEquals("Should return the proper output",
                    new ArrayList<>(Arrays.asList(8, 4, 10, 5, 3, 9, 7)),
                    this.binTree.preOrder()
            );
        }

        @Test
        public void testInOrder() {
            assertEquals("Should return the proper output",
                    new ArrayList<>(Arrays.asList(6, 10, 5, 3, 6, 9, 7)),
                    this.binTree.inOrder()
            );
        }

    }