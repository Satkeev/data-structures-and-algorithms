package DataStructures.linkedList;


public class LinkedList {
      class Node {
        int num;
        Node next;

        public Node(int num) {
            this.num = num;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;


    public boolean insert(int num){
        Node node = new Node(num);

        if(this.head == null) {
            this.head = node;
            this.tail = node;
            head.next = null;
            tail.next = null;
        }else {
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

    public String toString(){
        String result = "";
        Node ptv = head;
        while(ptv != null) {
            result = result + "{" + ptv.num + "}" + "->";
            ptv = ptv.next;
        }
            result = result + "->" + "NULL";
            return result;
        }
    }











