
#### Challenge

#### Breadth First Traversal
Within the BinaryTree class, create a method that takes in a tree, and prints out the values of it Nodes via a breadth first traversal.

#### Approach and Efficiency
The approach used for this challenge was to utilize a queue, starting by enqueueing the root node and then dequeuing it, printing its value and enqueuing its children. This process is repeated for every Node in the tree, which will fill the queue level by level for all the Nodes in the tree. This method is O(n) for both time and space.