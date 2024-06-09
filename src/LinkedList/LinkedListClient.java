package LinkedList;

public class LinkedListClient {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAtFirst(5);
        ll.insertAtFirst(10);
        ll.insertAtFirst(15);
        ll.insertAtFirst(20);
        ll.display();
        ll.insertAtEnd(25);
        ll.display();
        ll.insertAtAnyIndex(30, 2);
        ll.display();
        ll.insertAtAnyIndex(35, 5);
        ll.display();
        ll.deleteAtAnyIndex(5);
        ll.display();
        ll.deleteAtEnd();
        ll.display();
        ll.deleteAtAnyIndex(3);
        ll.display();
        ll.deleteAtFirst();
        ll.display();
    }
}
