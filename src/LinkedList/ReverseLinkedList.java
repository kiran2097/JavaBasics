package LinkedList;

public class ReverseLinkedList {
    //https://leetcode.com/problems/reverse-linked-list/description/
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
        ll.head = reverseLinkedList(ll.head);
        ll.display();
    }

    private static LinkedList.Node reverseLinkedList(LinkedList.Node head) {
        LinkedList.Node prev = null;
        LinkedList.Node curr = head;
        LinkedList.Node nextNode;
        while(curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
