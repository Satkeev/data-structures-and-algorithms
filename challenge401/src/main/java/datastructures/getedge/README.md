#### Challenge 37
Write a function which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

##### Approach and Efficiency
The approach for this method was to first iterate over the graphs list of Nodes to find the node whose value matches the provided arrays value at index 0. This node is then the starting node, from where a set of nested for loops begins, starting at i = 1 and looking through the start nodes edges to find if any of its neighbors match the arrays value at index i. If a match is found, then the start node becomes that neighbor node, and the outer loop repeats. If at any point the method cannot find a direct connection to the next city, it will return 0, meaning the trip is not possible with direct flights. 
The Time efficiency for this method is O(n * d) where d represents the degree of the graph. 
This methods space efficiency is O(1), as it only ever needs an instance variable for one node and an integer for the cost.