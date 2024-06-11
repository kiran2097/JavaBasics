package LinkedList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
//        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAtEnd(int data) {
        if (this.head == null) {
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node currentNode = this.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertAtAnyIndex(int data, int idx) {
        if (this.head == null) {
            insertAtFirst(data);
        }
        Node newNode = new Node(data);
        Node currentNode = this.head;
        for (int i = 0; i < idx - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public int deleteAtFirst() {
        if (this.head == null) return -1;
        int data = this.head.data;
        this.head = this.head.next;
        return data;
    }

    public int deleteAtEnd() {
        if (this.head == null) {
            return deleteAtFirst();
        }
        Node currentNode = this.head;
        while(currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        int data = currentNode.next.data;
        currentNode.next = null;
        return data;
    }

    public int deleteAtAnyIndex(int idx) {
        if (idx < 0) return -1;
        if (idx == 0) {
            return deleteAtFirst();
        }
        Node currentNode = this.head;
        for (int i = 0; i < idx - 1; i++) {
            currentNode = currentNode.next;
        }
        int data = currentNode.next.data;
        currentNode.next = currentNode.next.next;
        return data;
    }
}
