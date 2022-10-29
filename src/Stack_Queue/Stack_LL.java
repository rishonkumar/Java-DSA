package Stack_Queue;

public class Stack_LL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackL {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // head is stack top
        // connect new node to head
        // we will update head
        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        /*
         * Move head to head next
         */
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty())
                return -1;

            return head.data;
        }
    }

    public static void main(String[] args) {

        StackL s = new StackL();
        s.push(1);
        s.push(3);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
