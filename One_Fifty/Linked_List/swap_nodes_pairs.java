package Linked_List;

public class swap_nodes_pairs {
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

        System.out.println("Null");
    }

    public static void main(String[] args) {
        swap_nodes_pairs l1 = new swap_nodes_pairs();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(3);
        l1.insertLast(4);

        l1.display();

        Node temp = l1.head.next;
        Node temp1 = l1.head;
        while(temp!=null ){
            int swap = temp.val;
            temp.val = temp1.val;
            temp1.val = swap;
            temp = temp.next.next;
            temp1 = temp1.next.next;
        }

       
        
        

        l1.display();
    }
    
}
