#### Challenge 28
Quick Sort
Quick Sort is a sorting algorithm that operates by taking a value from the array, called the pivot, and using it as reference for a series of swaps. Any value lower than the pivot gets swapped into the lower portion of the array until all values are checked. Then the pivot is added at the end of the lower values. This results in all the values to the left of the pivot being lower than it and all values to the right are higher, meaning the pivot is exactly where it needs to be in the end. Then quick sort just needs to be run to the left and the right of the pivot recursively to finish the sort.


#### Efficiency
Time Efficiency: O(n2) - exponential

It's possible for this algorithm to run in (nlogn) time
Unfortunately, if the input is already sorted, this implementation reaches exponential time
Space Efficiency: O(logn) - logarithmic

While it looks like there will be more space used, the recursion depth is (logn)
The stack will resolve its left route before entering its right route, maintaining a relative amount of space needed to the size of the input array