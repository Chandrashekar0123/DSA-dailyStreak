class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class nthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // Step 1: find size of list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        // Step 2: if removing the first node
        if (n == size) {
            return head.next;
        }

        // Step 3: go to (size - n)th node
        int idx = size - n;
        curr = head;
        for (int i = 1; i < idx; i++) {
            curr = curr.next;
        }

        // Step 4: remove the target node
        curr.next = curr.next.next;

        return head;
    }

    // Utility: print linked list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        nthNode obj = new nthNode();

        System.out.print("Original Linked List: ");
        obj.printList(head);

        int n = 2; // remove 2nd node from end (removes '4')
        head = obj.removeNthFromEnd(head, n);

        System.out.print("After Removing " + n + "th node from end: ");
        obj.printList(head);
    }
}

/*
OUTPUT :
Original Linked List: 1 -> 2 -> 3 -> 4 -> 5
After Removing 2th node from end: 1 -> 2 -> 3 -> 5

 */