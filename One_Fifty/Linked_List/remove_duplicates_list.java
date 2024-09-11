package Linked_List;

public class remove_duplicates_list {

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
            remove_duplicates_list l1 = new remove_duplicates_list();
            l1.insertLast(1);
            l1.insertLast(1);
            l1.insertLast(2);
            l1.insertLast(3);
            l1.insertLast(3);
            l1.display();

            Node temp = l1.head;
            Node ptr = l1.head.next;
            while(temp.next != null){
                if(ptr.val == temp.val){
                    temp.next = temp.next.next;
                    ptr = temp.next;
                    
                }
                else{
                    ptr = ptr.next;
                    temp = temp.next;
                }

            }
            l1.display();

    }   
}
