package Linked_List;

public class remove_duplicates_list_02 {
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
        remove_duplicates_list_02 l1 = new remove_duplicates_list_02();
            // l1.insertLast(1);
            // l1.insertLast(1);
            l1.insertLast(1);
            l1.insertLast(2);
            l1.insertLast(2);
            l1.insertLast(2);
            l1.insertLast(3);
            l1.insertLast(4);
            l1.insertLast(4);
            // l1.insertLast(3);
            // l1.insertLast(4);
            // l1.insertLast(4);
            // l1.insertLast(5);
            l1.display();

            Node ptr = l1.head;
            Node temp = l1.head.next;

            boolean c = false;
            while(temp != null){
                if(ptr.val == temp.val){
                    c = true;
                    ptr.next = ptr.next.next;
                    temp = ptr.next;
                }
                else if(c==true){
                    Node temp1 = l1.head;
                    while(temp1.next.val != ptr.val){
                        temp1 = temp1.next;
                    }
                    ptr = ptr.next;
                    temp = temp.next;
                    temp1.next = ptr  ;
                    c = false;

                }
                else{
                    ptr = ptr.next;
                    temp = temp.next;
                    c = false;
                }
            }

            if(c == true){
                Node temp1 = l1.head;
                    while(temp1.next.val != ptr.val){
                        temp1 = temp1.next;
                    }
                    ptr = ptr.next;
                    temp = temp.next;
                    temp1.next = ptr  ;
                    c = false;
            }

            l1.display();

            
    }
    
}
