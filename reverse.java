import java.util.*;
class lib {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        lib l = new lib();
        l.head = new Node(1);
        l.head.next = new Node(2);
        l.head.next.next = new Node(3);
        l.head.next.next.next = new Node(4);
        l.head.next.next.next.next = new Node(5);
        l.head.next.next.next.next.next = new Node(6);
        head = l.reverse(head);
        l.printList(head);
    }
}
