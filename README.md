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





[Repeated Word](/challenge401/src/main/java/datastructures/repeatedword)

#### Challenge 31

Write a method that takes in a String and returns the first repeated word in that String, without utilizing any of the built-in library methods available to your language,

#### Approach and Efficiency

The approach for this was to iterate over every character in the String and look for when the current character was a space, comma, or period (could include more punctuation cases). After that, there is a check to handle not including punctuation when grabbing a word, and then the last word that occurred before that space, period, or comma is grabbed, and checked if it's in the HashSet. If it is, that word is immediately returned, as we want to return the first instance that condition is true. If it is not in the Set, then the word is added to the set and the loop continues. This solution takes O(n) time and space. 

#### Solution
![img](/challenge401/src/main/java/datastructures/repeatedword/assets/aww-board%209.png)



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


#### Challenge

[Breadth First Traversal](/challenge401/src/main/java/challenges/BreathFirst)

Within the BinaryTree class, create a method that takes in a tree, and prints out the values of it Nodes via a breadth first traversal.

#### Approach and Efficiency
The approach used for this challenge was to utilize a queue, starting by enqueueing the root node and then dequeuing it, printing its value and enqueuing its children. This process is repeated for every Node in the tree, which will fill the queue level by level for all the Nodes in the tree. This method is O(n) for both time and space.

![img](/challenge401/src/main/java/challenges/BreathFirst/assets/Screenshot%202020-10-08%20213405.png)


### Challenge 18

[FizzBuzz Tree](/challenge401/src/main/java/challenges/FizzBuzzTree)

Create a class named FizzBuzzTree that contains a method named fizzBuzzTree. This method should take in a tree, and change the values of the nodes based on their current value. If the value is divisible by 3, the node's value should be changed to fizz. If the value is divisible by 5, the node's value should be changed to buzz. If the value is divisible by both 3 and 5, the node's value should be changed to fizzbuzz.

#### Approach and Efficiency
The approach for this method was to traverse the list in a post-order depth search, and check the nodes value to see which condition it meets (divisible by 3, divisible by 5, or both) and change its value as needed. This solution takes O(n) time as it has to traverse the entire tree recursively, and O(1) space

![img](/challenge401/src/main/java/challenges/FizzBuzzTree/assets/aww-board%204.png)


[Insertion Sort](/challenge401/src/main/java/challenges/insertionsort)

#### Challenge
Write a function for insertion sort that takes in an unsorted array and returns the array sorted using insertion sort.

#### Approach and Efficiency
The approach for this was to use a for loop that begins at the 2nd value in the array, and compare it to every value before it, while the next value is still greater than the current one being moved. Every time a value before the one being moved is greater than the one being moved, that larger value is shifted forward one index. Once the while loop within the for has been exited, the current value being moved is placed in the location it needs to go. This solution takes O(n^2) time to run, where the worst case is the input array is reverse ordered. As for space, the solution takes O(1) space, only needing a few int variables for tracking.

#### Solution
![img](/assets/codeChallenge26.PNG)


[Merge sort](/challenge401/src/main/java/challenges/mergesort)

#### Challenge 27

Write a function that accepts an array of unsorted integers, and returns a sorted array by a recursive merge sort algorithm.

#### Approach and Efficiency

The approach for this was to utilize a merge function that merges two sorted arrays together, which gets called via the merge sort, and the two arrays being provided are the value returned from a recursive call into the mergeSort method. The base case for mergeSort to return at is when the input array contains 0 or 1 elements, at which point it will return that array. Merge is then first handled on two arrays of size 0 or 1, merging those values together. As the recursive call-stack begins to work its way back up, the two arrays being merged will increase in size, but each should already be sorted. Once the recursive call-stack has completed, the original call to the method will return a single array, sorted from lowest to highest. This method takes O(nlogn) time to run, as merge will take n time to merge all the provided elements together, and is called logn times to completely merge the array. The method takes O(n) space for operation, as the final merge will create a new array that is equal in size to the original array.

#### Solution

![img](/challenge401/src/main/java/challenges/mergesort/assets/aww-board%207.png)


#### Challenge 28
[Quick Sort](/challenge401/src/main/java/challenges/quicksort)

Quick Sort is a sorting algorithm that operates by taking a value from the array, called the pivot, and using it as reference for a series of swaps. Any value lower than the pivot gets swapped into the lower portion of the array until all values are checked. Then the pivot is added at the end of the lower values. This results in all the values to the left of the pivot being lower than it and all values to the right are higher, meaning the pivot is exactly where it needs to be in the end. Then quick sort just needs to be run to the left and the right of the pivot recursively to finish the sort.


#### Efficiency
Time Efficiency: O(n2) - exponential

It's possible for this algorithm to run in (nlogn) time
Unfortunately, if the input is already sorted, this implementation reaches exponential time
Space Efficiency: O(logn) - logarithmic

While it looks like there will be more space used, the recursion depth is (logn)
The stack will resolve its left route before entering its right route, maintaining a relative amount of space needed to the size of the input array




[LeftJoin](/challenge401/src/main/java/datastructures/leftjoin)

### Challenge 33

Write a method that takes in two Hashtables and performs a left join on them. It should return a representation of that join in some sort of data structure


#### Approach and Efficiency
The approach for this was to create a 2d dimensional array with a size equal to that of the number of keys stored in the table. The inner arrays are each of size 3, as they only need to hold the key, and its value in the two tables. The method then iterates over each key in the first table, adding both the key and its value to the appropriate location in the 2d array. If the second table also contains that key, its value is added to the array as well, otherwise it is set to null. 
This method takes O(n) time and space where n represents the total key/value pairings in the first table.

![img](/challenge401/src/main/java/datastructures/leftjoin/assets/aww-board%2010.png)


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


[Depth First](/challenge401/src/main/java/datastructures/depthfirst)

This is the implementation of a pre-order traversal for a graph in Java

##### Challenge Description

Create a function that accepts an adjacency list as a graph, and conducts a depth first traversal. Without utilizing any of the built-in methods available to your language, return a collection of nodes in their pre-order depth-first traversal order.

#### DepthFirst()

Will take in an array of node values and return true or false if there exists a path along with the sum of edge weights.

#### Approach & Efficiency
DepthFirst():
Time: O(n)
Space: O(n*e)

![img](/challenge401/src/main/java/datastructures/depthfirst/assets/aww-board%2013.png)


[GetEdge](/challenge401/src/main/java/datastructures/getedge)

#### Challenge 37
Write a function which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

##### Approach and Efficiency
The approach for this method was to first iterate over the graphs list of Nodes to find the node whose value matches the provided arrays value at index 0. This node is then the starting node, from where a set of nested for loops begins, starting at i = 1 and looking through the start nodes edges to find if any of its neighbors match the arrays value at index i. If a match is found, then the start node becomes that neighbor node, and the outer loop repeats. If at any point the method cannot find a direct connection to the next city, it will return 0, meaning the trip is not possible with direct flights. 
The Time efficiency for this method is O(n * d) where d represents the degree of the graph. 
This methods space efficiency is O(1), as it only ever needs an instance variable for one node and an integer for the cost.

![img](/challenge401/src/main/java/datastructures/getedge/assets/Screenshot%202020-11-03%20234137.png)


#### Challenge 35
[Graph](/challenge401/src/main/java/datastructures/graph)

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


![img](/challenge401/src/main/java/datastructures/graph/assets/challenge35.jpg)


[HashTable](/challenge401/src/main/java/datastructures/hashtable)

#### Challenge 30
Create a Hashtable implementation that stores key/value pairs. It should include methods to add a key/value pair, get a value using a key, check if a key exists in the Hashtable, and an internal method to hash keys consistently.

### Approach & Efficiency
The base structure of this Hashtable implementation is a list of lists that each store nodes containing the key/value pairs. Anytime a key is added, it is passed through a protected hash method that converts the key into an index of the parent list. The child list at that index is checked for nodes that already contain the key, throwing an error if it is found. Otherwise, a new node is created with the given key and value and added to the child list.

To retrieve a value with the get method, the first step is to pass the key given through the same hash method as was used in the add method. This leads to the same index in the parent list, at which point the child list at that index is checked for the key. If the key is found, then the value stored in the same node is returned. Otherwise, the get method throws an exception indicating that they key is not in the table.

The contains method follows the same logical pattern as the get method: hashing and searching for a key. The method returns true if the key is found and false if not.

Time efficiency is constant for initial use, but will very gradually increase with collisions (multiple nodes stored in the same child bucket).

The space efficiency is also constant, but it's worth noting that the initial instance of this Hashtable will create a batch of lists.

Time Efficiency:

add : O(1)
get : O(1)
contains : O(1)
Space Efficiency:

add : O(1)
get : O(1)
contains : O(1)
API
Hashtable Methods:

add
takes in a string key and int value and stores them in the Hashtable
if the key already exists in the table, throws an exception
get
takes in a string key and returns the stored int value paired with that key
if they key does not exist in the hashtable, throws an error
contains
takes in a string key and checks if it exists in the hashtable
returns true if the key exists, false if not

![img](/challenge401/src/main/java/datastructures/hashtable/assets/Screenshot%202020-11-25%20115020.png)





























