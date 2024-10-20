package singly_misc;
//search if key is present or not
class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}
public class singly_search {

    public static boolean searchKey(Node head, int key) {
        Node curr = head;

        while(curr != null) {
            if(curr.data == key)
                return true;
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args) {
        // 14 -> 21 -> 13 -> 30 -> 10
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(13);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        int key = 12;
        if(searchKey(head, key))
            System.out.println("Yes, present");
        else
            System.out.println("No, not present");
    }   
}
