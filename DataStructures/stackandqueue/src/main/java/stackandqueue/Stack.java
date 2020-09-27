package stackandqueue;

public class Stack {
    private Node top;

    public Node getTop() {
        return this.top;
    }

    public Stack() {
      top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(top == null){
            top = newNode;
        } else{
            newNode.next = top;
            top = newNode;
        }

    }

    public int pop() {
        if (top == null)
            throw new IllegalStateException("Cannot pop an empty stack!");
        Node temp = top.next;
        int num = top.num;
        top = temp;
        return num;
    }


    public int peek() {
        if (top == null)
            throw new IllegalAccessError("Cannot peek an empty stack!");
        int num = top.num;
        return num;
    }

    public boolean isEmpty(){
        if(top == null) {
            return true;
        }else{
            return false;
        }
    }
}