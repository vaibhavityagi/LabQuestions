package college.linkedlist;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node head = null;
    public Node tail = null;

    // at tail
    public void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // at head
    public void insertAtHead(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insert(int val, int posn) {

        Node prevNode = head;
        for (int i = 2; i < posn - 1; i++) {
            prevNode = prevNode.next;
        }

        Node nodeToInsert = new Node(val, prevNode.next);
        prevNode.next = nodeToInsert;

    }

    public void displaylist() {
        Node current = head;
        if (head == null) {
            System.out.println("The given list is empty");
            return;
        }
        System.out.println("The data in the given list are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList newList = new SinglyLinkedList();

        newList.insert(10);
        newList.insert(30);
        newList.insert(50);
        newList.insert(70);
        newList.insert(100);
    }
}