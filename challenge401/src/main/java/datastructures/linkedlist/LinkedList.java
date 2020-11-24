package datastructures.linkedlist;

public class LinkedList {

    public Node head = null;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (this.head != null) {
            newNode.setNext(this.head);
        }
        this.head = newNode;
    }

    public String toString() {
        if (this.head == null) {
            return "NULL";
        }
        String output = String.format("{%s}", this.head.toString());
        Node nextNode = this.head.getNext();
        while (nextNode != null) {
            output += String.format(" -> {%s}", nextNode.toString());
            nextNode = nextNode.getNext();
        }
        output += " -> NULL";
        return output;
    }

    public boolean includes(int value) {
        if (this.head == null) {
            return false;
        }
        if (this.head.getValue() == value) {
            return true;
        }
        Node nextNode = this.head.getNext();
        while (nextNode != null) {
            if (nextNode.getValue() == value) {
                return true;
            }
            nextNode = nextNode.getNext();
        }
        return false;
    }


}



