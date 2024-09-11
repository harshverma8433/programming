package Linked_List;

public class rotate_list {
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
        rotate_list l1 = new rotate_list();
        l1.insertLast(0);
        l1.insertLast(1);
        l1.insertLast(2);
        l1.display();

        int k = 4;

        int len = 0;
        Node p = l1.head;
        while(p!=null){
            len++;
            p = p.next;
        }
        k = k%len;
        while(k-- > 0){
            Node temp = l1.head;
            Node ptr = l1.head.next;
            while(ptr.next!=null){
                ptr = ptr.next;
                temp = temp.next;
            }
            temp.next = null;
            ptr.next = l1.head;
            l1.head = ptr;


        }

        l1.display();

    }
}
