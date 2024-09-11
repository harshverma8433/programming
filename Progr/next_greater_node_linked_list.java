import java.util.Arrays;
import java.util.Stack;

public class next_greater_node_linked_list {

    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void insertLast(int val){
        Node newnode = new Node(val);
        if (head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void display(){
        Node ptr = head;
        while(ptr != null) {
            System.out.print(ptr.val+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        next_greater_node_linked_list l1 = new next_greater_node_linked_list();
        l1.insertLast(2);
        l1.insertLast(7);
        l1.insertLast(4);
        l1.insertLast(3);
        l1.insertLast(5);

        l1.display();

        Node t = l1.head;
        int len = 0;
        while(t != null){
            len++;
            t = t.next;
        }
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[len];
        int c = 0;

        Node temp = l1.head;
        while(temp!=null){
            Node ptr = temp.next;
            while(ptr!=null){
                if(ptr.val > temp.val){
                    arr[c] = ptr.val;
                    break;
                }
                
                ptr = ptr.next;
            }
            c++;
            temp = temp.next;       
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
