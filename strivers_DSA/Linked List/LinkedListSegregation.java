
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class LinkedListSegregation {
    static ListNode head, tail;

    static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    static void insertAtLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    static ListNode segregateToOddEven() {
        ListNode oddHead = new ListNode(-1), oddTail = oddHead;
        ListNode evenHead = new ListNode(-1), evenTail = evenHead;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val % 2 != 0) {
                oddTail.next = curr;
                oddTail = curr;

            } else {
                evenTail.next = curr;
                evenTail = curr;
            }
            curr = curr.next;
        }
        evenTail.next = oddHead.next;
        oddTail.next = null;
        return evenHead.next;
    }

    public static void main(String[] args) {
        insertAtLast(1);
        insertAtLast(2);
        insertAtLast(3);
        insertAtLast(4);
        insertAtLast(5);
        insertAtLast(6);

        System.out.println("Original Linked List: ");
        printList(head);

        ListNode newHead = segregateToOddEven();
        System.out.println("Segregated Linked List: ");
        printList(newHead);
    }
}
