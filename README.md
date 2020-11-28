# data-structures-and-algorithms

[Array Reverse](/challenge401/src/main/java/challenges/ArrayReverse)


Challenge
Write a function that takes an array as an argument and returns an array that is the reverse of the original.

Approach and Efficiency
The approach used for this challenge was using nested for loops to start from the end of the array and move one item to it's reveresed position each iteration. I'm not sure how to calculate efficiency based on Big O yet.

![img](/challenge401/src/main/java/challenges/ArrayReverse/assets/Screenshot%202020-09-14%20204733.png)



[Array Shift](/challenge401/src/main/java/challenges/ArrayShift.java)

Challenge
Write a function that takes an array and a value as arguments. It should return an array with the new value at the middle index

Approach and Efficiency
The approach for this challenge was to take all the values in the original array before it's middle and add them to a new array that had a length 1 greater than the original, then insert the new value at the middle index, followed by taking the rest of the values in the original array and adding them to the new array at an index 1 higher than they were in the original. This approach could probably be more efficient, however with only limited knowledge of arrays in Java, this was the only workable idea I wound up with.

![img](/challenge401/assets/Screenshot%202020-11-27%20180041.png)

[BinarySearch](/challenge401/src/main/java/challenges/BinarySearch.java)

### Code Challenge 3
### Binary Search
This search algorithm code challenge is used to further our understanding of Java syntax as well as introduce us to the idea of time and space complexity.

### Challenge Description
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the search key, or -1 if the element does not exist

### Approach & Efficiency
Fairly simple approach.

### Big(O)
Time: O(log(n))
Space: O(1)

### Whiteboard solution
![img](/challenge401/assets/Screenshot%202020-11-27%20182031.png)


[Linked List](/challenge401/src/main/java/datastructures/linkedlist)

A library for the Linked List data type.

### Challenge
Creating a Linked List class allowing for a collection of values to be updated efficiently. Should create a Node class to represent each point of the collection. The Linked List class should provide methods to insert new Nodes in the head position and search the Nodes for a specific value. The LinkedList should pretty print.

Linked list class should also include a method to retrieve a value based on distance from the end of the list.

Linked list class should also include append to end, insert before an element, and insert after an element functionality.

Linked list class should also include a method to retrieve a value based on distance from the end of the list.

Linked list class should also have a static method allowing for two linked lists to be zipped together into one.


#### Approach & Efficiency
I created a LinkedList class and a Node class. To encapsulate the data in the Node class, I set the fields to private and allowed access to set and get values through the Node's methods. The LinkedList class can be instantiated with a null head field. When the insert method is called, it will set the head field to a new Node and if there was an existing Node then it updates the new Node's next field to point to the previous Node. The include method loops through all existing Nodes and searches for a value returning a boolean. Similarly, the toString method loops through all the Nodes to create a representative String.
The append method will iterate through the linked list starting at the head until it finds the last element. It then sets a new node with the passed value after the last element. If there are not elements, then it would also be the first and require that the head field be updated.

The insertBefore method iterates through the list until it finds the given search value. It creates a new node with the passed value and sets its next field to point to the node with the found search value. It also keeps track of the previous node searched so it can update that node's next field to point at the new node. If the list is empty, it calls the insert method to complete its task. If the search value is not present in the list, it throws an exception.

The insertAfter method iterates through the list checking each value. If it finds a node with the search value, it creates a new node with the passed value and gets its next from the node where the search value was found. It then sets the node found in the search's next field to the new node. If the search value is not found, it throws an exception.

The kthFromEnd method iterates through the list from the head to find its total length. Then it iterates from the head again until it reaches the list's length less the given integer k. It then returns the value found at that node. If the k given would be outside the list length or if it is negative, the method throws an exception.

The zipLists static method iterates through both input lists and points each Node's next field at the next Node from the other list, returning a LinkedList that is a zipped version of the two input.

### Time Efficiency:

insert : O(1)
includes : O(n)
toString : O(n)
append : O(n)
append : O(n)
insertBefore : O(n)
insertAfter : O(n)
kthFromEnd : O(n)
zipLists : O(n)

insert : O(n)
includes : O(1)
toString : O(n)
append : O(1)
insertBefore : O(1)
insertAfter : O(1)
kthFromEnd : O(1)
zipLists : O(1)

API
LinkedList Methods:

insert : Takes in an integer and stores it in the value field of a new node. Sets the new node as the new head of the linked list and assigns a pointer in the new node to the previous head node.
includes : Takes in an integer and checks all nodes for that value. Returns true if it's found, false if not.
toString : Returns a string that visually represents the linked list with the node values inside it.
append : Takes in an integer and adds a node with that value to the end of the linked list.
insertBefore : Takes in an integer to search for and an integer for a new node, if it finds the search value, it places the new node before it, otherwise it throws an exception.
insertAfter : Takes in an integer to search for and an integer for a new node, if it finds the search value, it places the new node after it, otherwise it throws an exception.
kthFromEnd : Takes in an integer, k, and returns the value of the node k from the end of the linked list. If k is negative or if k units from the end is outside the list, it throws an exception.

zipLists : Static method takes in 2 LinkedList instances and returns 1 LinkedList with the Nodes from the input lists zipped together. Throws an exception if two empty lists are passed.

![Linked List](/challenge401/src/main/java/datastructures/linkedlist/assets/Screenshot%202020-11-23%20215926.png)
![Linked List kthFromEnd](/challenge401/src/main/java/datastructures/linkedlist/assets/Screenshot%202020-11-23%20221342.png/)
![Linked List zipList](/challenge401/src/main/java/datastructures/linkedlist/assets/Screenshot%202020-11-23%20223353.png)


[Stacks and Queues](/challenge401/src/main/java/datastructures/stacksandqueues)

A library for implementations of stacks and queues.

### Challenge
Build implementations for stack and queue style data structures and well as a node class. Both stacks and queues should use node elements and be able to add, remove, check top value, and check existence of nodes.

### Approach & Efficiency
I started by building the Node class and creating a set of tests that would prove their base functionality. Once the nodes were ready, I created the Stack class.

The Stack class only points at the top node. Through its methods, it can add nodes to the top of the stack and check the values in those nodes. It is also able to pop the top node off the stack and retrieve its value. Each method is tested successively to prove its own functionality and only uses methods proved to work previously if necessary.

The Queue class includes a pointer to the front of the queue as well as a pointer to the back. The pointer to the back allows for efficient addition of values while the pointer to the front allows for efficient retrieval. All interaction with the queue instances is handled through their methods to add, remove, check value, and check emptiness.

### Time Efficiency:

Stack Methods:
push : O(1)
isEmpty : O(1)
pop : O(1)
peek : O(1)
toString : O(n)
Queue Methods:
isEmpty : O(1)
enqueue : O(1)
dequeue : O(1)
peek : O(1)
toString : O(1)
Space Efficiency:

Stack Methods:
push : O(1)
isEmpty : O(1)
pop : O(1)
peek : O(1)
toString : O(n)
Queue Methods:
isEmpty : O(1)
enqueue : O(1)
dequeue : O(1)
peek : O(1)
toString : O(1)
API
Stack Methods:

push : Takes in an integer and adds it to the top of the stack.
isEmpty : Checks if there are values in the stack. Returns true if there are, false if not.
pop : Returns the most recent value added to the stack and removes it from the stack. If the stack is empty, throws a null pointer exception.
peek : Returns the most recent value added to the stack. If the stack is empty, throws a null pointer exception.
toString : Returns a string representing the stack.
Queue Methods:

isEmpty : Checks if thre are values in the queue. Returns true if there are, false if not.
enqueue : Takes in an integer and adds it to the back of the queue.
dequeue : Returns the value from the front of the queue and removes it from the queue. If the queue is empty, throws a null pointer exception.
peek : Returns the value from the front of the queue. If the queue is empty, throws a null pointer exception.
toString : Returns a string representing the queue.

### Queue With Stacks
### Challenge
Implement a Pseudo Queue class that acts just like a Queue but operates internally using two stacks. It should include an enqueue and dequeue method that work under the first in first out basis.

#### Approach and Efficiency
The approach for this challenge was to maintain the queues state in one primary stack, which is achieved by popping the primary stack and pushing each value into the secondary stack when a new item needs to be added. When the primary stack is empty, the enqueued value is added to it, then the process of popping and pushing is reversed, moving all the other values back from the secondary stack to the primary. This will move the enqueued value to the bottom of the stack, and maintain the proper order for the queue, with the first item in being on the top. The Big O efficiency for this method is O(n) time and space.

The usefulness of maintaining the state of the queue all with the enqueue method means that the dequeue method simply just has to pop the top value from the primary stack and return in, giving it O(1) time and space efficiency.

![img](/challenge401/assets/aww-board.png)


[FIFO animal shelter](/challenge401/src/main/java/challenges/utilities/AnimalShelter.java)


### Challenge Description
Create an AnimalShelter class that operates like a queue. Its enqueue method should take in an animal that can be either a dog or cat and add it to the shelter queue. Its dequeue method should take in a preference of dog or cat and return the dog or cat that has spent the longest time in the shelter.

### Approach & Efficiency
In order to add and return animals, I started by building the Animal super class. Then created subclasses of Dog and Cat. Each dog and cat carries a type identifier field.

For the animal shelter, I used a singly-linked list structure with nodes that store the Animal class as a value. The enqueue method adds Animals nodes at the back of the queue unless its empty, in which case it gets added to the front.

The dequeue method immediately returns null if the shelter is empty or the preference given is not "cat" or "dog". Otherwise, it recursively checks nodes for a match to preference and returns that object. If it does find the object, it also links the previous node to the following node in order to maintain the queue order. if it doesn't find a match to the preference given, then passes a null to the top and returns it.

### Time Efficiency:

enqueue : O(1)
dequeue : O(n)
Space Efficiency:

enqueue : O(1)
dequeue : O(1)

![img](/challenge401/src/main/java/challenges/utilities/assets/Screenshot%202020-11-24%20161726.png)


[MultibracketValidation](/challenge401/src/main/java/challenges/multibracketvalidation)

#### Challenge 13
Write a method named multiBracketValidation that, given a string, returns true or false if that string has balanced brackets ie: (){[]} returns true but ({[)]} returns false.

#### Approach and Efficiency
The approach for this challenge was to use a stack to track every instance of an opening bracket found, as they will then need to be closed in a last-in first-out order. Whenever a closing bracket is found, the top value from the stack of opening brackets is popped to see what type of closing bracket should be expected. If a closing bracket does not match to what it should be, or the stack is not empty after iterating through the entire string, the method will return false. This method has a Big O time and space efficiency of O(n) due to the need of creating a stack to track all opening brackets and having to iterate over every character in the string.

![img](/challenge401/src/main/java/challenges/multibracketvalidation/assets/Screenshot%202020-09-30%20144340.png)


[BinaryTree](/challenge401/src/main/java/datastructures/BinaryTree)

Challenge
Create binary tree and binary search tree classes. The binary tree class should have methods for retrieving all values from the tree in pre-order, in-order, and post-order formats. The binary search tree should extend those methods and also include the ability to add a value and check if a value is contained in the tree.

Approach & Efficiency
For an underlying structure, I created a Node class that carries a value and points at its left and right children. And a Tree class that points to its root node.

The BinaryTree class extends the Tree class and adds methods for searching a binary tree structure. They preOrder() method walks the left nodes then right nodes and returns an array with values in the order they are first encountered. The inOrder() method walks the tree left to right and returns an array with values ordered left to right. The postOrder() method walks the tree left to right and returns an array prioritizing child node values first.

The BinarySearchTree class extends the BinaryTree class and adds methods to add values and check if a value exists in the tree. The add() method checks the value against each node recursively and looks for an empty space to create a new node with that value such that it is greater than all nodes left of it and less than all nodes right of it. If the value is already in the tree, it throws an exception expressing that. The contains() method recursively searches the tree for the value given by checking that value relative to each node and choosing to search left or right. It returns boolean true if it is found and false if it is not.

Time Efficiency:

preOrder : O(n)
inOrder : O(n)
postOrder : O(n)
add : O(h) (where h is the height of the tree)
contains : O(h)
Space Efficiency:

preOrder : O(h)
inOrder : O(h)
postOrder : O(h)
add : O(h)
contains : O(h)
API
preOrder : Takes in a Node and an empty Integer ArrayList and returns an Integer ArrayList including all values in the tree.
inOrder : Takes in a Node and an empty Integer ArrayList and returns an Integer ArrayList including all values in the tree.
postOrder : Takes in a Node and an empty Integer ArrayList and returns an Integer ArrayList including all values in the tree.
add : Takes in an Integer and adds it to the tree in sorted order. Throws an Exception if the value already exists in the tree.
contains : Takes in an Integer and returns true if it is in the tree, false if not.

[BreadthFirst](/challenge401/src/main/java/datastructures/breadthfirst)


#### Breadth First Graph
This is the implementation of a Breadth First Traversal in a graph in Java

#### Challenge Description
The graph data structure will have a new method:
The approach taken for this method was to utilize a List of Nodes to be returned, a Set of Nodes that had already been seen while traversing, and a Queue to maintain the order of traversal. Starting from the root, it is added to the Queue and the Set of seen Nodes. The algorithm then loops while the Queue is not empty, dequeuing the front value, adding it to the List to return, and then iterating over its list of neighbors. Each neighbor Node is checked to see if it's in the Set of already seen Nodes, and if it is not, then that Node is added to the queue and the Set of seen Nodes. Once the Queue is empty, the List of Nodes is returned. This solution takes both O(n) space and time, as it has to iterate over each Nodes neighbors, and utilize multiple other data structures to track all relevant information.

#### breadthFirst
Will traverse the Graph in a breadth first manner
Approach & Efficiency
breadthFirst() - O(n)

![img](/challenge401/src/main/java/datastructures/breadthfirst/assets/aww-board12.png)































