Challenge 06
##Add an append  to LinkedList class that takes a value and adds it at the end of the Linked List.

##Add an insertBefore method to  LinkedList class that takes in a value and newValue, and inserts a new Node 
before the Node that contains the given value.

##Add an insertAfter method to  LinkedList class that takes in a value and newValue, and inserts a new Node after
 the Node that contains the given value.
 
![](https://github.com/Satkeev/data-structures-and-algorithms/blob/inheritance/DataStructures/assets/LinkedList2.png)


Challenge 07

##Challenge
Write a method for your LinkedList class that takes in an integer k and returns the value from the kth node from the end of the list.

##Approach and Efficiency
The approach for this method was to start by looking at the head of the list, and then look k nodes forward from there and see if the next value of that node is null. If that node k away from the current has a next value of null then it will return the value from the current node. If not, then the current node will be set to the next in the list until either the proper node is found or the function has to throw an error due to being out of the bounds of the list. The time of this method is O(n) and the space is O(1)

Challenge 8

##Write a static method for your LinkedList class that takes in two LinkedLists and merges them together, alternating nodes from each list, and returns the head of the new list

##Approach and Efficiency
The approach for this method was to merge the second list into the first one, simply adding values after each node from the original list. To achieve this a counter is used while moving through both the lists, and every time the counter is an even number a node from the 2nd List is inserted into the first. It will also handle cases where one of the two lists are longer than the other, and if one or both lists are empty (head points to null). The Big O time efficiency for this solution is O(n) and the space efficiency is O(1).
![](https://github.com/Satkeev/data-structures-and-algorithms/blob/inheritance/DataStructures/assets/Screenshot%202020-09-22%20213251.png)

