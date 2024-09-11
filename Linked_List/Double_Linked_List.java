public class Double_Linked_List {

    Node head;
    Node tail;

    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public int size(){
        Node temp = head;
        int len = 0;

        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }

    public void insertFirst(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void insertLast(int val){
        Node newnode = new Node(val);
        if(head == null){
            insertFirst(val);
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;

    }

    public void insert(int val , int idx){
        Node newnode = new Node(val);
        int size = size();

        if(idx == 0){
            insertFirst(val);
            return;
        }

        else if(idx == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx ; i++) {
            temp = temp.next;
        }
        Node ptr = temp.next;
        temp.next = newnode;
        newnode.prev = temp;
        newnode.next = ptr;
        ptr.prev = newnode;
    }

    public void DeleteFirst(){
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void DeleteLast(){
        if(tail.prev == null){
            tail = null;
            head = null;
            return;
        }
       tail = tail.prev;
       tail.next = null;

    }

    public void delete(int idx){
        int size = size();
        if(idx == 0){
            DeleteFirst();
            return;
        }

        if(idx == size-1){
            DeleteLast();
            return;
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.prev = temp;

    
    } 

 
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;

        }
        System.out.println("Null");
    }
    
    public void reverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.prev;
        }
        System.out.println("Null");
    }

    
    public static void main(String[] args) {
         Double_Linked_List list = new Double_Linked_List();
         list.insertFirst(3);
         list.insertFirst(9);

         list.insertLast(4);
         list.insertLast(8);
        
         list.insert(200 , 3);
         list.insert(100 , 4);
        

        list.display();
        
        // list.DeleteFirst();
        // list.display();

        // list.DeleteLast();
        // list.display();
       
        list.delete(3);
        list.display();

        list.reverse();

    }
}