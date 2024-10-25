package singly_misc;
class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}
public class singly_middle {

    public static int getMiddleNode (Node head) {
        Node slow = head,fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }


    public static void main(String[] args) {

        // 1 -> 3 -> 5 -> 2 -> 0 -> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(4);
        
    
        System.out.println("Middle node is "+ getMiddleNode(head));
    }
}
