package stacksandqueues;

import org.w3c.dom.Node;
import java.util.Stack;

public class PseudoQueue<Num> {

        public Stack<Num> stack1 = new Stack<>();
        public Stack<Num> stack2 = new Stack<>();
        public Node front;


        public PseudoQueue() {
            this.front = null;

        }

        public Num enqueue(Num value) {
            Num current = this.stack1.pop();

            while (current != null) {
                this.stack2.push(current);
                current = this.stack1.pop();
            }

            if (this.front == null) {
                this.stack1.push(value);

            } else {
                this.stack1.push(value);
                current = this.stack2.pop();
            }

            while (current != null) {
                this.stack1.push(current);
                current = this.stack2.pop();
            }
            return this.stack1.pop();
        }

        public <num> Node peek() {
            return this.front;
        }
}
