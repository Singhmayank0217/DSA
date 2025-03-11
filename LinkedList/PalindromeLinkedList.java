public class PalindromeLinkedList {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            if (head == null || head.next == null)
                return true;
            ListNode current = head;
            while (current != null) {
                stack.push(current.val);
                current = current.next;
            }
            current = head;
            while (current != null) {
                if (current.val != stack.pop())
                    return false;
                current = current.next;
            }
            return true;
        }
    }
}
