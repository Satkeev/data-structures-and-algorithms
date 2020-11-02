package datastructures.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class GraphNodeTest {

    public GraphNode<Integer> testGraphNode;

    @Before
    public void setUpNode() {
        this.testGraphNode = new GraphNode<Integer>(66);
    }

    @Test
    public void testInstantiate() {
        GraphNode<Integer> testGraphNode = new GraphNode<Integer>(5);
    }

    @Test
    public void testGetValue() {
        assertTrue("Should return the proper value",
                this.testGraphNode.getValue().equals(66)
        );
    }

    @Test
    public void testGetNeighborsEmpty() {
        assertTrue("Should return empty",
                this.testGraphNode.getNeighbors().equals(new HashMap<GraphNode<Integer>, Integer>())
        );
    }

    @Test
    public void testGetNeighbors() {
        GraphNode<Integer> newNode = new GraphNode<Integer>(54);
        this.testGraphNode.addNeighbor(newNode, 3);
        HashMap<GraphNode<Integer>, Integer> testNeighbors = new HashMap<GraphNode<Integer>, Integer>();
        testNeighbors.put(newNode, 3);

        assertTrue("Should return empty",
                this.testGraphNode.getNeighbors().equals(testNeighbors)
        );
    }
}
