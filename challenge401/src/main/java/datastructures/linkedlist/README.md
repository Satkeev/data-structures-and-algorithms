### Code Challenge 5
### Linked List
A library for the Linked List data type.

### Challenge
Creating a Linked List class allowing for a collection of values to be updated efficiently. Should create a Node class to represent each point of the collection. The Linked List class should provide methods to insert new Nodes in the head position and search the Nodes for a specific value. The LinkedList should pretty print.

Linked list class should also include a method to retrieve a value based on distance from the end of the list.


#### Approach & Efficiency
I created a LinkedList class and a Node class. To encapsulate the data in the Node class, I set the fields to private and allowed access to set and get values through the Node's methods. The LinkedList class can be instantiated with a null head field. When the insert method is called, it will set the head field to a new Node and if there was an existing Node then it updates the new Node's next field to point to the previous Node. The include method loops through all existing Nodes and searches for a value returning a boolean. Similarly, the toString method loops through all the Nodes to create a representative String.


### Time Efficiency:

insert : O(1)
includes : O(n)
toString : O(n)
append : O(n)

insert : O(n)
includes : O(1)
toString : O(n)

API
LinkedList Methods:

insert : Takes in an integer and stores it in the value field of a new node. Sets the new node as the new head of the linked list and assigns a pointer in the new node to the previous head node.
includes : Takes in an integer and checks all nodes for that value. Returns true if it's found, false if not.
toString : Returns a string that visually represents the linked list with the node values inside it.
