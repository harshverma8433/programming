package Linked_List;
    public class add_two_number {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val ){
            this.val = val;
            Node next = null;
        }
    }
    public void insertfirst(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void insertlast(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
        }
        val = val%10;
        Node temp = head;
        while(temp.next!=null){
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
        add_two_number l1 = new add_two_number();
        l1.insertfirst(9);
        l1.insertfirst(9);
        l1.insertfirst(9);
        l1.insertfirst(9);   
        l1.display();
        add_two_number l2 = new add_two_number();
        l2.insertfirst(9);
        l2.insertfirst(9);
        l2.insertfirst(9);
        l2.insertfirst(9);
        l2.insertfirst(9);
        l2.insertfirst(9);
        l2.insertfirst(9);
        l2.display();
        Node head_l1 = l1.head;
        Node head_l2 = l2.head;
        add_two_number l3 = new add_two_number();
        int carry = 0;
        while(head_l1!=null && head_l2!=null){
            int v = head_l1.val + head_l2.val + carry;
            head_l1.val = (v)%10;
            carry = (v>9)?1:0;
            head_l1 = head_l1.next;
            head_l2 = head_l2.next;
        }
        while(head_l1 !=null){
            int v = (head_l1.val+carry);
            head_l1.val = v%10;
            carry = (v>9)?1:0;
            head_l1 = head_l1.next;
        }
        while(head_l2 !=null){
            int v = (head_l2.val+carry);
            l1.insertlast(v%10);
            carry = (v>9)?1:0;
            head_l2 = head_l2.next;
        }
        if(carry == 1){
            Node temp = l1.head;
            while(temp.next != null){
                temp = temp.next;
            }
            l1.insertlast(1);
        }
        l1.display();
    }
}