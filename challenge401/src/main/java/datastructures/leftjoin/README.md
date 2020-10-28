#### Challenge 33

Write a method that takes in two Hashtables and performs a left join on them. It should return a representation of that join in some sort of data structure

#### Approach and Efficiency
The approach for this was to create a 2d dimensional array with a size equal to that of the number of keys stored in the table. The inner arrays are each of size 3, as they only need to hold the key, and its value in the two tables. The method then iterates over each key in the first table, adding both the key and its value to the appropriate location in the 2d array. If the second table also contains that key, its value is added to the array as well, otherwise it is set to null. This method takes O(n) time and space where n represents the total key/value pairings in the first table.

<img src="src/main/java/datastructures/leftjoin/assets/aww-board (10).png">