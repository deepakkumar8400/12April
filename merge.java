class Node {
    int data;
    Node next;
    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

class Merge {
    static Node merge(Node n, Node m) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (n != null && m != null) {
            if (n.data < m.data) {
                tail.next = n;
                n = n.next;
            } else {
                tail.next = m;
                m = m.next;
            }
            tail = tail.next;
        }

        if (n != null) tail.next = n;
        if (m != null) tail.next = m;

        return dummy.next;
    }

    public static void main(String[] args) {
        Node n = new Node(0);
        n.next = new Node(1);
        n.next.next = new Node(2);

        Node m = new Node(4);
        m.next = new Node(5);
        m.next.next = new Node(6);

        Node merged = merge(n, m);

        while (merged != null) {
            System.out.println(merged.data);
            merged = merged.next;
        }
    }
}
