package Linked_List;

public class reverse_linked_list_2 {

    Node head;
     class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;

        }
     }

     public void insertFirst(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
     }

     public void reverse() {
        
     }

     public void display(){
        Node teemp = head;
        while(teemp != null){
            System.out.print(teemp.val+"->");
            teemp = teemp.next;
        }
        System.out.println("null");
     }

    public static void main(String[] args) {
        reverse_linked_list_2 l1 = new reverse_linked_list_2();
        l1.insertFirst(5);
        l1.insertFirst(4);
        l1.insertFirst(3);
        l1.insertFirst(2);
        l1.insertFirst(1);
        l1.display();
    }
    
}
