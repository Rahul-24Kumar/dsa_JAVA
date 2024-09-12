class Node {
    int data;   // data stored in node
    Node next;  // reference to the next node in the list

    Node (int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    // Constructor with only data as a parameter, sets next to null
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class searchElem {
    public static int checkifPresent(Node head, int desiredElement) {
        Node temp = head;

        while (temp != null) {
            if(temp.data == desiredElement)
            return 1;
        // Move to the next node
        temp = temp.next;
        }
        return 0;   // if not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3;
        int val2 = 4;

        System.out.println(checkifPresent(head, val));
        System.out.println(checkifPresent(head, val2));
    }
}
