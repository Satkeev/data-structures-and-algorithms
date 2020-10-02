package linkedlist;

public class LinkedList {
    public Node head = null;
    public Node tail = null;
    public Node next = null;
    private Object Exception;

    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        list.append(2);
        list.append(5);
        list2.append(32);
        list2.append(23);
        list.insertBefore(5, 10);
        list.insertAfter(10, 55);
        list2.insertBefore(23, 45);
        list2.insertAfter(32, 65);
        list.findKthFromEnd(2);
        list.findKthFromEnd(0);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(zipLists(list, list2));
    }

    public void addToFront(int newValue) {
        Node newNode = new Node(newValue);
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }


    //Helped with writing the method: https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
    public void append(int newVal) {
        Node newNode = new Node(newVal);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = null;
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

    }

    // Helped with writing the method: https://stackoverflow.com/questions/6824067/manual-linked-list-insert-before-method
    public void insertBefore(int val, int newVal) {
        Node curr = this.head;

        while(curr.next != null) {
            if (curr.next.value == val) {
                Node newNode = new Node(newVal);
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            curr = curr.next;
        }
    }

    // Helped me understand to change my while loop from curr.next to just curr: https://stackoverflow.com/questions/37137350/linkedlist-insert-after-node/37138082
    public void insertAfter(int prev, int newValue) {
        Node curr = this.head;

        while (curr != null) {
            if (curr.value == prev) {
                Node newNode = new Node(newValue);
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            curr = curr.next;
        }
    }

    // Used the website to construct method https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
    public int findKthFromEnd(int k) throws Exception {
        int length = 0;
        Node temp = this.head;

        while(temp != null) {
            temp = temp.next;
            length++;
        }

        if(length > k) {
            temp = this.head;
            for (int i = 1; i < length - k ; i++) {
                temp = temp.next;

            }
        } else {
            throw new Exception("Your link list is shorter than your argument value");
        }
        return temp.value;
    }

    // Used the website for help https://www.techiedelight.com/merge-alternate-nodes-two-linked-lists/
    public static LinkedList zipLists(LinkedList one, LinkedList two) {
        if(one == null) {
            return two;
        } else if (two == null) {
            return one;
        }

        Node head1 = one.head;
        Node head2 = two.head;
        Node temp = head1.next;
        Node temp2 = head2.next;
        LinkedList shadowClone = new LinkedList();
        shadowClone.append(head1.value);
        shadowClone.append(head2.value);
        System.out.println(shadowClone);

        while(temp != null && temp2 != null) {
            shadowClone.append(temp.value);
            temp = temp.next;
            shadowClone.append(temp2.value);
            temp2 = temp2.next;
        }
        return shadowClone;
    }

    public String toString() {
        return toString(this.head);
    }

    public String toString(Node current) {
        if(current == null) {
            return "null";
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));
    }
}