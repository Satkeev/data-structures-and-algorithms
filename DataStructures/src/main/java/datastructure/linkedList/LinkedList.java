package datastructure.linkedList;


public class LinkedList {

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

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
    //insertBefore
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

    //insert after
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
    //from end
    public int findKFromEnd(int k) throws IndexOutOfBoundsException {
        Node current = this.head;

        while (current !=null) {
            Node kTm = current;
            for (int i = 0; i < k; i++) {
                if(kTm.next == null && i != k-1) {
                    throw new IndexOutOfBoundsException("Value entered is greater" + " than total linked list length");
                }
                kTm = kTm.next;
            }
            if (kTm.next == null) {
                return current.value;
            }
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Value entered is greater than " + "total linked list length");
    }

    //merge two lists
    public static Node zipLists(LinkedList list1, LinkedList list2) {
        Node current = list1.head;
        Node insert = list2.head;
        int counter  = 0;

        if (current == null) {
            return list2.head;
        }

        while(current != null && insert != null) {
            if (counter % 2 == 0) {
                list1.insertAfter(current.value, insert.value);
                insert = insert.next;
            }
            current = current.next;
            counter++;
        }
        if (current == null && insert != null) {
            while (insert != null) {
                list1.append(insert.value);
                insert = insert.next;
            }
        }
        return list1.head;
    }

}


