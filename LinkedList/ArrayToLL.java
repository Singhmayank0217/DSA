package LinkedList;

public class ArrayToLL {
    class Solution {
        // Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x) {
            Node newNode = new Node(x);
            if (head == null) {
                return newNode;
            }
            Node Current = head;
            while (Current.next != null) {
                Current = Current.next;
            }
            Current.next = newNode;
            retrun head;
        }
    }
}
