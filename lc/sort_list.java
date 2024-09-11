import java.awt.List;
import java.util.*;

public class sort_list {

    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void insertLast(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void insertfirst(int val) {
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        sort_list l = new sort_list();
        l.insertLast(4);
        l.insertLast(2);
        l.insertLast(1);
        l.insertLast(3);
        l.display();

        Stack<Integer> stack = new Stack<>();
        Node temp = l.head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        Collections.sort(stack,Collections.reverseOrder());

        sort_list l2 = new sort_list();
        int len = stack.size();
        for (int i = 0; i < len; i++) {
            l2.insertfirst(stack.pop());
        }

        l2.display();
    }

}
