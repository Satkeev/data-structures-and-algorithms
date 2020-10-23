#### Merge sort
#### Challenge 27

Write a function that accepts an array of unsorted integers, and returns a sorted array by a recursive merge sort algorithm.

#### Approach and Efficiency

The approach for this was to utilize a merge function that merges two sorted arrays together, which gets called via the merge sort, and the two arrays being provided are the value returned from a recursive call into the mergeSort method. The base case for mergeSort to return at is when the input array contains 0 or 1 elements, at which point it will return that array. Merge is then first handled on two arrays of size 0 or 1, merging those values together. As the recursive call-stack begins to work its way back up, the two arrays being merged will increase in size, but each should already be sorted. Once the recursive call-stack has completed, the original call to the method will return a single array, sorted from lowest to highest. This method takes O(nlogn) time to run, as merge will take n time to merge all the provided elements together, and is called logn times to completely merge the array. The method takes O(n) space for operation, as the final merge will create a new array that is equal in size to the original array.
