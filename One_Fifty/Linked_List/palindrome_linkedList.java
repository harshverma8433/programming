public class palindrome_linkedList {

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

    public void deleteFirst(){
        head = head.next;
    }

    public void deleteLast(){

        if(head.next == null){
            head = null;
            return;

        }
        Node temp = head.next;
        Node temp1 = head;

        

        while(temp.next != null){
            temp = temp.next;
            temp1 = temp1.next;
        }
        temp1.next = null;
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
        palindrome_linkedList l1 = new palindrome_linkedList();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(2);
        l1.insertLast(3);

        l1.display();

        Node temp = null;
        Node ptr = l1.head;

        while(ptr!=null){
            Node temp1 = ptr.next;
            ptr.next = temp;
            temp = ptr;
            ptr = temp1;
        }

        l1.head = temp;

        temp = l1.head;

        while(temp != null){

        }

        
    }
    
}
