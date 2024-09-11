public class double_number_linked_list {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public void insertLast(int val){
        Node newnode = new Node( val);
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
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[] args) {
        double_number_linked_list lst = new double_number_linked_list();
       for (int i = 0; i < 4; i++) {
         lst.insertLast(9);
       }
        Node prev = null;
        Node ptr = lst.head;

        while (ptr!=null) {
            Node temp = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = temp;  
        }

        lst.head = prev;

        lst.display();

        int carry = 0;
        Node temp = lst.head;
        while (temp!=null) {
            int v = temp.val;
            v = (v*2)+carry;
            temp.val = v%10;
            carry = v/10;
            temp = temp.next;
        }

        if(carry >= 1){
            lst.insertLast(carry);
        }
        lst.display();

    }

    
    
}

