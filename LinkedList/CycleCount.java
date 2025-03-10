package LinkedList;

public class CycleCount {
    class Solution {
        public static int countNodesinLoop(Node head) {
            if (head == null || head.next == null)
                return 0;
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    int count = 1;
                    slow = slow.next;
                    while (slow != fast) {
                        slow = slow.next;
                        count++;
                    }
                    return count;
                }
            }
            return 0;
        }
    }
}
