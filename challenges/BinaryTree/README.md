#### Challenge 16

#### Find Maximum Value Binary Tree

Within the BinaryTree class, write a method that takes in a tree and returns the highest value stored in the tree. Assume that all the nodes contain integer values.

#### Approach and Efficiency
The approach taken for this challenge was to traverse the tree using a depth first post-order recursive method. It will find what the highest value node is to both the right and left of a node, and then compare those values to find which is the highest, and return it. This method takes O(n) time since it needs to traverse the entire tree, and O(n) space as the more Nodes there are, the more variables are created as the call stack grows in size.