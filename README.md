# data-structures-and-algorithms

[Array Reverse](/challenge401/src/main/java/challenges/ArrayReverse)


Challenge
Write a function that takes an array as an argument and returns an array that is the reverse of the original.

Approach and Efficiency
The approach used for this challenge was using nested for loops to start from the end of the array and move one item to it's reveresed position each iteration. I'm not sure how to calculate efficiency based on Big O yet.

![img](/challenge401/src/main/java/challenges/ArrayReverse/assets/Screenshot%202020-09-14%20204733.png)



#### Array Shift
Challenge
Write a function that takes an array and a value as arguments. It should return an array with the new value at the middle index

Approach and Efficiency
The approach for this challenge was to take all the values in the original array before it's middle and add them to a new array that had a length 1 greater than the original, then insert the new value at the middle index, followed by taking the rest of the values in the original array and adding them to the new array at an index 1 higher than they were in the original. This approach could probably be more efficient, however with only limited knowledge of arrays in Java, this was the only workable idea I wound up with.
