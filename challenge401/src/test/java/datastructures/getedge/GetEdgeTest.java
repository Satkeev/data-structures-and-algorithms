package datastructures.getedge;

import datastructures.breadthfirst.Graph;

public class GetEdgeTest {
    public static Graph setupGraph() {

        Graph graph = new Graph();
        Graph.GraphNode o = graph.addNode("o");
        Graph.GraphNode p = graph.addNode("p");
        Graph.GraphNode r = graph.addNode("r");
        Graph.GraphNode s = graph.addNode("s");
        Graph.GraphNode t = graph.addNode("t");
        Graph.GraphNode u = graph.addNode("u");

        graph.addEdge(o, p, 150);
        graph.addEdge(p, r, 99);
        graph.addEdge(p, s, 42);
        graph.addEdge(t, u, 105);
        graph.addEdge(t, u, 37);
        graph.addEdge(r, u, 26);
        graph.addEdge(s, u, 73);
        graph.addEdge(t, u, 250);

        return graph;
    }
}