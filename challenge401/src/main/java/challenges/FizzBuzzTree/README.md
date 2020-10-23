#### Challenge 18

#### FizzBuzz Tree

Create a class named FizzBuzzTree that contains a method named fizzBuzzTree. This method should take in a tree, and change the values of the nodes based on their current value. If the value is divisible by 3, the node's value should be changed to fizz. If the value is divisible by 5, the node's value should be changed to buzz. If the value is divisible by both 3 and 5, the node's value should be changed to fizzbuzz.

#### Approach and Efficiency
The approach for this method was to traverse the list in a post-order depth search, and check the nodes value to see which condition it meets (divisible by 3, divisible by 5, or both) and change its value as needed. This solution takes O(n) time as it has to traverse the entire tree recursively, and O(1) space