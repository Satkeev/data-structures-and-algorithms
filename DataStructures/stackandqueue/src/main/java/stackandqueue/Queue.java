package stackandqueue;

public class Queue {
    private Node front;

    public Queue() {
        front = null;

    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;

        } else {
            front.next = newNode;

        }

    }


    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Cannot dequeue an empty queue!");
        }

            Node temp = front.next;
            int num = front.num;
            front = temp;
            return num;

    }

    public int peek() {
        if (front == null)
            throw new IllegalAccessError("Cannot peek an empty queue!");
         int num = front.num;
         return num;
    }

    public boolean isEmpty(){
        if(front == null){
            return true;

        } else{
            return false;
        }
    }
}
