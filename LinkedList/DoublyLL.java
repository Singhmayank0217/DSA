package LinkedList;

public class DoublyLL {
    class Solution {
        Node constructDLL(int arr[]) {
            int n = arr.length;
            if (n == 0)
                return null;
            Node head = new Node(arr[0]);
            Node current = head;

            for (int i = 1; i < n; i++) {
                Node newNode = new Node(arr[i]);
                current.next = newNode;
                newNode.prev = current;
                current = newNode;
            }

            return head;

        }
    }
}
