public class Single_linked_List{

    Node head;

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }

    public void insertFirst(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;    
    }

    public void insertLast(int val){
        Node newnode = new Node(val);

        if(head == null){
            insertFirst(val);
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public int size(){
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void insert(int val , int idx){
        int size = size();
        if(idx == 0){
            insertFirst(val);
        }

        else if(idx == size){
            insertLast(val);
        }

        Node temp = head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        Node newnode = new Node(val);
        Node  nextnode = temp.next;
        temp.next = newnode;
        newnode.next = nextnode; 
        

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void DeleteFirst(){
        if(head.next == null){
            head = null;
            return;
        }

        head = head.next;
    }

    public void DeleteLast(){
        if(head.next == null){
            head = null;
            return;
        }

        Node temp = head;
        Node ptr = head.next;

        while(ptr.next != null){
            ptr= ptr.next;
            temp = temp.next;
        }
        temp.next = null;
    }

    public void Delete(int idx){
        int size = size();
        if(idx == 0){
            DeleteFirst();
            return;
        }
        if(idx == size-1){
            DeleteLast();
            return;
        }

        Node temp = head;;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }



    public static void main(String[] args) {
        Single_linked_List list = new Single_linked_List();
        
        // Insertion
        list.insertFirst(8);
        list.insertFirst(23);
        list.insertFirst(44);

        list.insertLast(3);
        list.insertLast(34);
        list.insertLast(54);

        list.insert(100, 5);
        list.insert(200, 3);

        list.display();

        // Deletion
        list.DeleteFirst();

        list.DeleteLast();
        list.DeleteLast();

        list.display();
        
        list.Delete(2);

        list.display();
    }
}