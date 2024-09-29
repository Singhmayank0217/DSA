package LinearDataType.LInkedLIst;

public class SinglyLL {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void AddAtBeg(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void AddAtEnd(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void AddRandom(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void Reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void DeleteNthNodeFromEnd(int n) {
        Node prev = head;
        if (size == n) {
            head = head.next;
            return;
        }
        int i = 1;
        int find = size - n;
        while (i < find) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        SinglyLL sll = new SinglyLL();
        sll.AddAtBeg(10);
        sll.AddAtBeg(20);
        sll.AddAtBeg(30);
        sll.AddAtBeg(40);
        sll.AddAtBeg(50);
        sll.Print();
        // sll.AddAtEnd(60);
        System.out.println();
        // sll.Print();
        // System.out.println();
        // sll.AddRandom(3, 70);
        // sll.Print();
        // System.out.println();
        // System.out.println(size);
        // System.out.println(sll.itrSearch(20));
        // System.out.println(sll.recSearch(80));
        // sll.Reverse();
        sll.DeleteNthNodeFromEnd(2);
        sll.Print();
    }
}
