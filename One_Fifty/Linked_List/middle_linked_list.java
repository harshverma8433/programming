package Linked_List;

public class middle_linked_list {

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
        middle_linked_list l1 = new middle_linked_list();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(3);
        l1.insertLast(4);
        l1.insertLast(5);
        l1.insertLast(6);
        // l1.insertLast(7);
        l1.display();

        int len = 0;
        Node temp = l1.head;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        len = (len/2);
        
        temp = l1.head;

        while(len-- > 0){
            temp =  temp.next;
        }

        l1.head = temp;

        l1.display();

        
    }
    
}
