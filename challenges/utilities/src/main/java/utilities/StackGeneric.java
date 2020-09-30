package utilities;

public class StackGeneric {
    gNode<String> front;
    gNode<String> back;
    private gNode<String> newAnimal;

    public void enqueue(String animal) {
        if (front != null) {
            back.next = newAnimal;
        } else {
            front = newAnimal;
        }
        back = newAnimal;
    }

    public String dequeue(String pref) {
        if (front == null) {
            return "We are out of animals";
        }
        gNode<String> thisNode = front;
        while (thisNode != null) {
            if (thisNode.getValue() != pref) {
                thisNode = thisNode.getNext();
            } else {
                thisNode.getLast().setNext(thisNode.getNext());
                thisNode.getNext().setLast(thisNode.getNext());
                return thisNode.getValue();
            }
        }
        return String.format("We are out of animals");

    }

    @Override
    public String toString() {
        return "StackGeneric{" + "front=" + front + ", back=" + back + "}";
    }

    public static class gNode<T> {
        T value;
        gNode<T> next;
        gNode<T> last;

        public gNode(T value) {
            this.value = value;
            this.next = null;
            this.last = null;
        }


        public gNode<T> getLast() {
            return last;

        }

        public void setLast(gNode<T> last) {
            this.last = last;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public void setNext(gNode<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "gNode{" +
                    "value=" + value +
                    ", next=" + next +
                    "}";


        }


        public gNode<String> getNext() {
            return getNext();
        }
    }
}








