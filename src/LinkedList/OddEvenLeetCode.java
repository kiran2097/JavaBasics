package LinkedList;

public class OddEvenLeetCode {

    // https://leetcode.com/problems/odd-even-linked-list/description/
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        oddEvenLinkedList(ll.head);
        ll.display();
    }

    private static void oddEvenLinkedList(LinkedList.Node head) {
        LinkedList.Node odd = head;
        LinkedList.Node even = odd.next;
        LinkedList.Node preEven = even;
        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = preEven;
//        return head;head
    }
}
