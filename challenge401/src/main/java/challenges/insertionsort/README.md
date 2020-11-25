#### Insertion Sort
#### Challenge
Write a function for insertion sort that takes in an unsorted array and returns the array sorted using insertion sort.

#### Approach and Efficiency
The approach for this was to use a for loop that begins at the 2nd value in the array, and compare it to every value before it, while the next value is still greater than the current one being moved. Every time a value before the one being moved is greater than the one being moved, that larger value is shifted forward one index. Once the while loop within the for has been exited, the current value being moved is placed in the location it needs to go. This solution takes O(n^2) time to run, where the worst case is the input array is reverse ordered. As for space, the solution takes O(1) space, only needing a few int variables for tracking.


#### Solution
![](assets/codeChallenge26.PNG)