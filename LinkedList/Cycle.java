class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Cycle {

    // Method to detect cycle
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // cycle detected
            }
        }

        return false; // no cycle
    }

    // Utility method to print linked list (only works for non-cyclic lists)
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Cycle solution = new Cycle();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Linked List: ");
        solution.printList(head);

        System.out.println("Does the linked list have a cycle? " + solution.hasCycle(head));

        head.next.next.next.next = head.next;

        System.out.println("After introducing a cycle...");
        System.out.println("Does the linked list have a cycle? " + solution.hasCycle(head));
    }
}

/*
OUTPUT : 

 */