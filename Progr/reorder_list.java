import java.util.*;
public class reorder_list {
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
        Node newnode = new Node( val);
        if(head == null){
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
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
        
    }

    public static void main(String[] args) {
        reorder_list lst = new reorder_list();
        for (int i = 1; i <4 ; i++) {
            lst.insertLast(i);
        }

        lst.display();

        Stack<Node> stack = new Stack<>();
        Node temp = lst.head;
        while (temp!=null) {
            stack.push(temp);
            temp = temp.next;   
        }

        Node ptr = lst.head;
        Node ptr1 = lst.head.next;
        int l = stack.size()/2;
        for (int i = 0; i < l ; i++) {
            Node pop = stack.pop();
            ptr.next = pop;
            pop.next = ptr1;
            ptr = ptr1;
            ptr1 = ptr.next;   
        }
        
        ptr.next = null;
        lst.display();

    }    
}
