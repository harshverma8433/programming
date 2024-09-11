package Linked_List;

public class b_remove_n_node_end {
    Node head;

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }

    public void insertLast(int val){
        Node newnode = new Node(val);

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
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        b_remove_n_node_end l = new b_remove_n_node_end();
        for (int i = 0; i < 5; i++) {
            l.insertLast(i+1);
        }
        int n = 5;

        int len = 0;
        Node temp = l.head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        int diff = len-n-1;
        Node ptr = l.head;
        Node ptr1 = l.head.next;
        while(diff > 0){
            ptr = ptr.next;
            ptr1 = ptr1.next;
            diff--;
        }


        ptr.next = ptr1.next;
        l.display();
    }
}
