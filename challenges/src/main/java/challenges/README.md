### Array Shift
Challenge
Write a function that takes an array and a value as arguments. It should return an array with the new value at the middle index

Approach and Efficiency
The approach for this challenge was to take all the values in the original array before it's middle and add them to a new array 
that had a length 1 greater than the original, then insert the new value at the middle index, followed by taking the rest of the
values in the original array and adding them to the new array at an index 1 higher than they were in the original. This approach
could probably be more efficient, however with only limited knowledge of arrays in Java, this was the only workable idea I wound up with.
