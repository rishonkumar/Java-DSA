package LinkedList;

public class LinkedList {
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        this.size = 0;
    }

    /*
        Create node and update its next to next node and make new node to head
        if there is no tail then head and tail are same node
     */
    public void insertAtFirst(int val) {
        Node n1 = new Node(val);
        n1.next = head;
        head = n1;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    // TC - O(1) coz we  are storing tail value
    public void insertLast(int val) {
        if(tail == null) {
            insertAtFirst(val);
            return;
        }
        Node n1 = new Node(val);
        tail.next = n1;
        tail = n1;
        size++;
    }

    public void insert(int val,int pos) {

        if(pos == 0) {
            insertAtFirst(val);
            return;
        }
        if(pos == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1 ; i < pos - 1 ; i++) {
            temp = temp.next;
        }
        /*
            temp is reached pos - 1
            Create new node
            connect newNode next = temp next
            and temp next to newNode
         */
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
}
