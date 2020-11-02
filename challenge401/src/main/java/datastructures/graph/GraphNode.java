package datastructures.graph;

import java.util.HashMap;

public class GraphNode<T> {

    private T value;
    private HashMap<GraphNode<T>, Integer> neighbors;

    public GraphNode(T value) {
        this.setValue(value);
        this.setNeighbors(new HashMap<>());
    }

    public void addNeighbor(GraphNode<T> node, Integer weight) {
        HashMap<GraphNode<T>, Integer> tmpHM = this.getNeighbors();
        tmpHM.put(node, weight);
        this.setNeighbors(tmpHM);
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public HashMap<GraphNode<T>, Integer> getNeighbors() {
        return new HashMap<>(this.neighbors);
    }

    public void setNeighbors(HashMap<GraphNode<T>, Integer> neighbors) {
        this.neighbors = new HashMap<>(neighbors);
    }
}