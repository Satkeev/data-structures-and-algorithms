#### Challenge 35
#### Graph
This is the implementation of a graph in Java

#### Challenge Description
The graph data structure will contain the following methods:

## AddNode
Adds a new node to the graph
Takes in the value of that node
Returns the added node
## AddEdge
Adds a new edge between two nodes in the graph
Include the ability to have a “weight”
Takes in the two nodes to be connected by the edge
Both nodes should already be in the Graph
## GetNodes
Returns all of the nodes in the graph as a collection (set, list, or similar)
GetNeighbors
Returns a collection of nodes connected to the given node
Takes in a given node
Include the weight of the connection in the returned collection
## Size
Returns the total number of nodes in the graph

#### Approach & Efficiency
addNode() - O(1)
addEdge() - O(1)
getNodes() - O(1)
getNeighbors() - O(1)
size() - O(1)

#### API
public GraphNode addNode(T value) - adds a new node to the graph
public void addEdge(GraphNode<T> nodeA, GraphNode<T> nodeB, int weight) - adds an edge between two nodes in the graph along with the weight
public ArrayList<GraphNode<T>> getNodes() - returns all the nodes in the graph
public HashMap<GraphNode<T>, Integer> getNeighbors(GraphNode<T> node) - returns a hashmap of neighbor nodes and weights for a given node
public int size() - returns the number of nodes in the graph

