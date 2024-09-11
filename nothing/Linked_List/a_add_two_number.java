package Linked_List;

public class a_add_two_number{
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
        a_add_two_number l1 = new a_add_two_number();
        a_add_two_number l2 = new a_add_two_number();
        a_add_two_number l3 = new a_add_two_number();
        for (int i = 0; i < 7; i++) {
            l1.insertLast(9);
        }
        for (int i = 0; i < 4; i++) {
            l2.insertLast(9);
        }

        l1.display();
        l2.display();


        Node h1 = l1.head;
        Node h2 = l2.head;

        int carry = 0;
        while(h1!=null && h2!=null){
            int sum = h1.val+h2.val+carry;
            l3.insertLast(sum%10);
            carry = sum/10;

            h1 = h1.next;
            h2 = h2.next;

            

        }

        while(h1!=null){
            int add = h1.val + carry;
            l3.insertLast(add % 10);
            carry = add / 10;
            h1=h1.next;
        }

        while (h2!=null) {
            int add = h2.val+carry;
            l3.insertLast(add % 10);
            carry = add / 10;
            h2=h2.next;    
        }

        if(carry == 1){
            l3.insertLast(1);
        }

        l3.display();
    }
    
}
