package LinkedList;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class DeleteNode {
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
