package Linked_List;

public class delete_middle_node {

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
            newnode.next = null;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }
        temp.next = newnode;
        newnode.next = null;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        delete_middle_node l1 = new delete_middle_node();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(3);
        // l1.insertLast(4);
        // l1.insertLast(5);
        // l1.insertLast(6);
        // l1.insertLast(7);
        // l1.insertLast(8);
        l1.display();

        int len = 0;
        Node temp = l1.head;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        len = len/2;
        System.out.println(len);

        Node ptr = l1.head;
        Node temp1 = l1.head.next;

        len = len-1;

        while(len-- > 0){
            ptr = ptr.next;
            temp1 = temp1.next;
        }

        ptr.next = ptr.next.next;

        l1.display();

        
    }
}
