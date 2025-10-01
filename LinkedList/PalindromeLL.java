class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class PalindromeLL {

    // Check if LL is Palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode lt = head;
        ListNode rt = head;

        // Find middle using slow-fast pointer
        while (rt != null && rt.next != null) {
            lt = lt.next;
            rt = rt.next.next;
        }

        // Reverse second half
        rt = reverse(lt);
        lt = head;

        // Compare both halves
        while (rt != null) {
            if (lt.val != rt.val) {
                return false;
            }
            lt = lt.next;
            rt = rt.next;
        }

        return true;
    }

    // Reverse helper
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // Utility to print list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        PalindromeLL obj = new PalindromeLL();

        System.out.print("Original Linked List: ");
        obj.printList(head);

        boolean result = obj.isPalindrome(head);
        System.out.println("Is Palindrome? " + result);
    }
}

/*

OUTPUT : 
Original Linked List: 1 -> 2 -> 2 -> 1
Is Palindrome? true
 */