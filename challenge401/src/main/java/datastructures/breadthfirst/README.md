#### Challenge 36

#### Breadth First Graph
This is the implementation of a Breadth First Traversal in a graph in Java

#### Challenge Description
The graph data structure will have a new method:
The approach taken for this method was to utilize a List of Nodes to be returned, a Set of Nodes that had already been seen while traversing, and a Queue to maintain the order of traversal. Starting from the root, it is added to the Queue and the Set of seen Nodes. The algorithm then loops while the Queue is not empty, dequeuing the front value, adding it to the List to return, and then iterating over its list of neighbors. Each neighbor Node is checked to see if it's in the Set of already seen Nodes, and if it is not, then that Node is added to the queue and the Set of seen Nodes. Once the Queue is empty, the List of Nodes is returned. This solution takes both O(n) space and time, as it has to iterate over each Nodes neighbors, and utilize multiple other data structures to track all relevant information.

#### breadthFirst
Will traverse the Graph in a breadth first manner
Approach & Efficiency
breadthFirst() - O(n)
