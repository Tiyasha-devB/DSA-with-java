//Insertion after a given Node
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}
public class singly_insertion2 {
    static Node insertAfterNode(Node head, int key, int newData) {
        
        if (head == null){
            return null;
        }
        Node curr = head;
        while (curr != null)
        {
            if (curr.data == key) //iterate to find key
                break;
            curr = curr.next;
        }
        if (curr == null){  //if key not found
            return head;
        }
        Node newNode = new Node(newData);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    static void printList(Node head) {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        int key = 3;
        int newData = 4;
        head = insertAfterNode(head, key, newData); 
      
        printList(head);
    }
}
