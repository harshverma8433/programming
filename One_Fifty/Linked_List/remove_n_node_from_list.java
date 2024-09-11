package Linked_List;



public class remove_n_node_from_list {

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

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        remove_n_node_from_list l1 = new remove_n_node_from_list();
        l1.insertfirst(5);
        l1.insertfirst(4);
        l1.insertfirst(3);
        l1.insertfirst(2);
        l1.insertfirst(1);
        l1.display();

        int n = 5;

        int len = 0;
        Node temp = l1.head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        if(len == n){
            l1.head = l1.head.next;
            l1.display();
            return;
        }

        temp = l1.head;
        int diff = len-n-1;
        while(diff-- > 0){
            temp = temp.next;

        }
        temp.next = temp.next.next;

        l1.display();


        
    }
    
}
