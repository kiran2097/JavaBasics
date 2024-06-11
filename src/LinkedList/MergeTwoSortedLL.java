package LinkedList;

public class MergeTwoSortedLL {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.display();

        LinkedList l2 = new LinkedList();
        l2.insertAtFirst(1);
        l2.insertAtEnd(2);
        l2.insertAtEnd(11);
        l2.display();

        LinkedList.Node newHead = mergeTwoSortedLinkedList(ll.head, l2.head);
        LinkedList l3 = new LinkedList();
        l3.head = newHead;
        l3.display();
    }

    private static LinkedList.Node mergeTwoSortedLinkedList(LinkedList.Node list1, LinkedList.Node list2) {
        LinkedList.Node dummy = new LinkedList.Node(-1);
        LinkedList.Node curr = dummy;
        while(list1 != null && list2 != null) {
            if(list1.data <= list2.data) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null) {
            curr.next = list1;
        } else { curr.next = list2;}
        return dummy.next;
    }
}
