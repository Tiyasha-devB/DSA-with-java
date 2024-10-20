package singly_misc;
class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}
public class singly_countlist {

    public static int countNodes(Node head) {
        int c = 0;
        Node curr = head;

        while(curr != null){
            c++;
            curr = curr.next;
        }
        return c;
    }


    public static void main(String[] args) {

        // 1 -> 3 -> 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
    
        System.out.println("Count of nodes is "+ countNodes(head));
    }
}
