
class Node {
    int data;
    Node next;

    // Constructors
    Node(int data1, Node next1) {
        this.data = data1; // initialize data with the given val
        this.next = next1; // Initialize next with the given reference
    }

    Node(int data1) {
        this.data = data1; // initialize data with the given val
        this.next = null; // initialize next as null since it's the end of the list
    }
}

public class createLinkedList {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 7 };
        Node y = new Node(arr[1]);

        System.out.println(y.data);
    }
}