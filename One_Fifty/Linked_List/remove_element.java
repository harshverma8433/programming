package Linked_List;

public class remove_element {
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
        remove_element l1 = new remove_element();
        l1.insertLast(1);
        l1.insertLast(1);
        l1.insertLast(1);
        l1.insertLast(6);
        // l1.insertLast(2);  
        // l1.insertLast(6);  
        // l1.insertLast(3);
        // l1.insertLast(4);
        // l1.insertLast(5);
        // l1.insertLast(6);  
        l1.display();

        int val = 6;

        while( l1.head!=null && l1.head.val == val){
            System.out.println(l1.head.val);
                if(l1.head.next == null){
                    l1.head = null;
                }else{
                    l1.head = l1.head.next;
                }
                
            
        }

        if(l1.head == null){
            return;
        }

        Node ptr = l1.head;
        Node temp = l1.head.next;
        

        while(temp != null){
            if(temp.val == val){
                ptr.next = ptr.next.next;
                temp = ptr.next;
            }
            else{
                ptr = ptr.next;
                temp = temp.next;
            }
        }

        l1.display();
    }
    
}
