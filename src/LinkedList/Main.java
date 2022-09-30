package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insertLast(1001);
////        list.display();
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(8);
        list.insertAtFirst(17);
        list.insertLast(99);

        list.insert(105,3);
        list.display();

    }
}
