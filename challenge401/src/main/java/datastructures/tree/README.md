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


#### Challenge 16
Creating a method for finding a max in a binary tree.

### Challenge Description
Add an instance method to the BinaryTree class called findMaximumValue that returns the max value found in the instance of a binary tree.

### Approach & Efficiency
Created the findMaximumValue method requiring no parameters. It first checks for the edge case of the tree being empty and throws an exception if it is. Otherwise it makes use of a recursive helper method and passes it the root node. It returns the integer result of the helper method call.

The helper method checks its own value against the max values of its left and right children. Whichever value is highest of the three will be returned as an integer. The recursion is depth first and has a base case checking if the current node being checked is null. If it is null then it returns a minimum integer value that will naturally be less than its parent.

Time Efficiency: O(n) (where n is the number of values in the tree)

Space Efficiency: O(h) (where h is the height of the tree)


#### Challenge 17
Traversing a binary tree, breadth first.

### Challenge Description
Create a method to return a string representation of the values in a binary tree. The values should be ordered by rows starting at the root and continuing down.

### Approach & Efficiency
Started by checking the edge case of an empty tree and returning the String "null". If the tree isn't empty then the root node is stored in a queue. As long as the queue isn't empty, the node in front is popped out and its value is added to and output array. Any existing child nodes are then added to the back of the queue.


Once the queue is empty, the array is returned as a string.

Time Efficiency: O(n) (where n is the number of values in the tree)

Space Efficiency: O(n)