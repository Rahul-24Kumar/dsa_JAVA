public class reverseDLinkedList {
    public static class Node {
        public int data;

        public Node next;

        public Node back;

        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }

        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }

    }

    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node reverseDLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node current = head;

        while (current != null) {
            prev = current.back;
            current.back = current.next;
            current.next = prev;
            current = current.back;
        }

        return prev.back;
    }

    public static void main(String[] args) {
        int[] arr = { 21, 5, 6, 8, 4 };
        Node head = convertArr2DLL(arr);
        System.out.println("Doubly Linked List Initially: ");
        print(head);

        System.out.println("Doubly Linked List After Reversing: ");
        head = reverseDLL(head);
        print(head);
    }
}
