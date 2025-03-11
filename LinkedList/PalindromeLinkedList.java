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

/*
 * using two pointer
 * /**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * class Solution {
 * public ListNode reverseList(ListNode head) {
 * if(head == null || head.next == null) return head;
 * ListNode newHead = reverseList(head.next);
 * ListNode front = head.next;
 * front.next = head;
 * head.next = null;
 * return newHead;
 * }
 * 
 * public boolean isPalindrome(ListNode head) {
 * if (head == null || head.next == null) return true;
 * ListNode slow = head;
 * ListNode fast = head;
 * while (fast.next != null && fast.next.next != null){
 * slow = slow.next;
 * fast = fast.next.next;
 * }
 * ListNode newHead = reverseList(slow.next);
 * ListNode first = head;
 * ListNode second = newHead;
 * while(second != null){
 * if(first.val != second.val){
 * reverseList(newHead);
 * return false;
 * }
 * first = first.next;
 * second = second.next;
 * }
 * reverseList(newHead);
 * return true;
 * }
 * }
 */