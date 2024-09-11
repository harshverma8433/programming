
import java.util.*;

public class remove_node_linked_list {

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

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        remove_node_linked_list list = new remove_node_linked_list();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        // list.insertLast(8);
        list.display();
        Node ptr = list.head;
        Stack<Integer> s = new Stack<>();
        while (ptr != null) {
            s.push(ptr.val);
            ptr = ptr.next;
        }

      

        int len = s.size();
int idx = 0;
boolean b = true;
        for (int i = 0; i < len; i++) {
            int v = s.get(idx);
            for (int j = idx + 1; j < s.size(); j++) {
                if (s.get(j) > v) {
                    s.remove(idx);
                    b = false;
                    break;
                }
                else {
                    b = true;
                }
            }
            if(b){
                idx++;
            }
        }

        System.out.println(s);

        list.display();
    }

}
