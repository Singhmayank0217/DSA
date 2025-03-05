package LinkedList;

public class DoublyInsPos {
    class Solution {
        Node addNode(Node head, int pos, int data) {
            Node newNode = new Node(data);
            if (head == null) {
                return newNode;
            }
            if (pos == 0) {
                newNode.next = head;
                head.prev = newNode;
                return newNode;
            }
            Node current = head;
            for (int i = 0; i < pos && current.next != null; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;
            if (newNode.next != null) {
                newNode.next.prev = newNode;
            }

            return head;
        }
    }
}
