public class rotate_list_2{
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
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        rotate_list_2 l1 = new rotate_list_2();
        l1.insertLast(1);
        l1.insertLast(2);
        l1.insertLast(3);
        l1.insertLast(4);
        l1.insertLast(5);
        l1.display();
        int left = 2;
        int right = 4;

        Node temp = l1.head;
        Node leftptr = l1.head.next; 
        
        
        for (int i = 2; i < left; i++) {
            temp = temp.next;
            leftptr = leftptr.next;
        }

        Node temp1 = l1.head;
        Node rptr = l1.head.next;

        for (int i = 2; i < right; i++) {
            temp1 = temp1.next;
            rptr = rptr.next; 
        }

        temp.next = rptr;

        while(left < right){
            rptr.next = temp1;
            
        }

        
        cleftptr.next = rptr;

        l1.display();


    }
}