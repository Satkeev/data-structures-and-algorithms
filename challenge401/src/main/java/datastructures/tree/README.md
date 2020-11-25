#### Code Challenge 15

#### Trees
Contains a BinaryTree, BinarySearchTree, and Node class. Each node has properties for its value, left child, and right child. A Tree is for just a collection of these nodes, while a BinarySearchTree will sort them to the left or right based on their value in comparison to the root.

Create a Node class that has properties for the value stored in the Node, and a pointer to its left adn right children.
Create a Tree class that has a root property.
Define methods for preOrder, inOrder, and postOrder that take in a root node and returns an array of nodes.
Create a BinarySearchTree class.
Define a method called add that takes in a value and adds a new node to the right place in the tree
Define a method called search that takes in a desired value and returns the node with that value

#### Approach & Efficiency
The preOrder, inOrder, and postOrder methods all traverse the tree recursively, meaning they each take O(n) time. Since they all return an ArrayList of Nodes, they also take O(n) space. The add and search methods for the BinarySearchTree should both take O(log n) time and O(1) space.
