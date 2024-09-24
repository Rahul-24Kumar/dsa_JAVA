class Node {
    int data;
    Node next;

    // Constructor with next node reference
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor without next node reference
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    // Method to reverse the linked list
    public static Node reverseLinkedList(Node head) {
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node front = temp.next; // Save the next node
            temp.next = prev; // Reverse the link
            prev = temp; // Move prev to current node
            temp = front; // Move to next node in original list
        }
        return prev; // New head of the reversed list
    }

    // Method to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the reversal
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseLinkedList(head);

        System.out.println("Reversed Linked List: ");
        printLinkedList(head);
    }
}
