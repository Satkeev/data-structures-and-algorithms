package datastructures.tree;


import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {
    @Test public void testEmptyTree() {
        tree.Tree tree = new tree.Tree();
        assertNotNull("tree should be instantiated", tree);
        assertNull("root should be empty", tree.root);
    }

    @Test public void testTreeWithNode() {
        tree.Tree tree = new tree.Tree(new Node(1));
        assertNotNull("tree should be instantiated", tree);
        assertEquals("root should have input value", 1, tree.getRoot().getValue());
    }
}