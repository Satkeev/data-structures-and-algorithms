package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<T> {
//declare array list
    private ArrayList<GraphNode<T>> nodes;

    public Graph() {
//Initialize array list with nodes
        this.setNodes(new ArrayList<GraphNode<T>>());
    }

    public GraphNode addNode(T value) {
//create graph with value
        GraphNode<T> newNode = new GraphNode<T>(value);
        ArrayList<GraphNode<T>> nodes = this.getNodes();
        nodes.add(newNode);
        this.setNodes(nodes);
        return newNode;
    }
//add edges to graph
    public void addEdge(GraphNode<T> nodeA, GraphNode<T> nodeB, int weight) {
        if (this.getNodes().contains(nodeA) && this.getNodes().contains(nodeB)) {
            nodeA.addNeighbor(nodeB, weight);
            nodeB.addNeighbor(nodeA, weight);
        }
    }

    public HashMap<GraphNode<T>, Integer> getNeighbors(GraphNode<T> node) {
        return node.getNeighbors();
    }

    public int size() {
        return this.getNodes().size();
    }

    public ArrayList<GraphNode<T>> getNodes() {
        return new ArrayList<GraphNode<T>>(this.nodes);
    }

    public void setNodes(ArrayList<GraphNode<T>> nodes) {
        this.nodes = new ArrayList<GraphNode<T>>(nodes);
    }
}
