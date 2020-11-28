#### Stacks and Queues
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

