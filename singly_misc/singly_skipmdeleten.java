class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class singly_skipmdeleten {

    static Node skipMdeleteN(Node head, int m, int n)
    {
        Node curr = head; // Current node pointer
        Node t; // Temporary node pointer
        int count; // Counter variable

        while (curr != null) {

            // Skip m nodes
            for (count = 1; count < m && curr != null; count++)
                curr = curr.next;

            if (curr == null) // If end of the list is reached, return head
                return head;

            t = curr.next; // Start from the next node and delete n nodes
            for (count = 1; count <= n && t != null; count++) {
                Node temp = t;
                t = t.next;
                temp = null; //dereference
            }
            curr.next = t; // Link the current node to the remaining list
            curr = t;  // Move the current pointer to the next node
        }
        return head;
    }

    static void printList(Node head)
    {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Create the following linked list:
        // 1->2->3->4->5->6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        int m = 2, n = 2;
        head = skipMdeleteN(head, m, n);
        printList(head);
    }
}