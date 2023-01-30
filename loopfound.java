import java.util.*;
public class lib {
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
    static public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            if (s.contains(h))
                return true;
            s.add(h);
            h = h.next;
        }
        return false;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        lib l = new lib();

        l.push(20);
        l.push(4);
        l.push(15);
        l.push(10);
        l.head.next.next.next.next = l.head;
    }
}
