package LinkedList;

public class KeyNodeCheck {
    class Solution {
        static boolean searchKey(int n, Node head, int key) {
            if( head == null ) return false;
            Node temp = head;
            if ( head.data == key) return true;
            while (temp != null) {
                if (temp.data == key) return true;
                temp = temp.next; 
            }
            return false;
        }
    }
}
