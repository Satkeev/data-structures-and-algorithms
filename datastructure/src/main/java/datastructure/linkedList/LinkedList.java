package datastructure.linkedList;


public class LinkedList {

    class Node {
        public int value;
        int num;
        Node next = null;

        public Node(int num, Node next) {
            this.num = num;
        }
    }

    public Node head = null;
    public Node tail = null;


    public boolean insert(int num) {
        Node current = head;
        Node node = new Node(num, current.next);

        if (this.head == null) {
            this.head = node;
            this.tail = node;
            head.next = null;
            tail.next = null;
        } else {
            tail.next = node;
            node.next = null;
            tail = node;

        }
        return true;
    }

    public boolean includes(int n) {
        Node ptv = head;
        while (ptv != null) {
            if (ptv.num == n) {
                return true;
            }
            ptv = ptv.next;
        }
        return false;
    }

    public String toString() {
        String result = "";
        Node ptv = head;
        while (ptv != null) {
            result = result + "{" + ptv.num + "}" + "->";
            ptv = ptv.next;
        }
        result = result + "->" + "NULL";
        return result;
    }

    //append new value and which adds a new node with the given value to the end of the list
    public void append(int value) {
        Node current = this.head;
        Node newNode = new Node(value, current.next);

        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                this.tail = newNode;
                return;
            }
        }

    }
    //insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node

    public void insertBefore(int value, int newValue) {
        if (!includes(value)) {
            return;
        }
        Node current = this.head;
        if (value == current.value) {
            insert(newValue);
            return;
        }

        while (current.next != null) {
            if (current.next.value == value) {
                current.next = new Node(newValue, current.next);
                break;
            }
            current = current.next;
        }
    }

    //Will add a new Node to the list right after the Node with the value passed in
    public void insertAfter(int value, int newValue) {
        if (!includes(value)) {
            return;
        }

        Node current = this.head;

        while (current != null) {
            if (current.value == value) {
                current.next = new Node(newValue, current.next);
                break;
            }
            current = current.next;
        }
    }
}

