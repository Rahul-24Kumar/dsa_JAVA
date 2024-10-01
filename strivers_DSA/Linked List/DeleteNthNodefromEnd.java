
class Node {
    public int data;
    public Node next;

    public Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class DeleteNthNodefromEnd {
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node LinkedListDeleteNthNodefromEnd(Node head, int N) {
        Node fastPointer = head;
        Node slowPointer = head;

        for (int i = 0; i < N; i++) {
            if (fastPointer != null) {
                fastPointer = fastPointer.next;
            }
        }

        if (fastPointer == null) {
            head = head.next;
        }

        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        slowPointer.next = slowPointer.next.next;
        return head;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        System.out.println("Original Linked List: ");
        printLinkedList(head);

        head = LinkedListDeleteNthNodefromEnd(head, N);
        System.out.println("Modified Linked List: ");
        printLinkedList(head);
    }
}
