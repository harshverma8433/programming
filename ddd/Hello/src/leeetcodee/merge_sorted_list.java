
public class merge_sorted_list {

    Node head;
    static class Node{
        Node next;
        int val;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void insert(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ") ;
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        merge_sorted_list l1 = new merge_sorted_list();
        merge_sorted_list l2 = new merge_sorted_list();
        l1.insert(4);
        l1.insert(2);
        l1.insert(1);
        l1.insert(0);
        l1.insert(-10);
        
        l2.insert(4);
        l2.insert(3);
        l2.insert(1);
        l1.display();
        l2.display();

        Node list1 = l1.head;
        Node list2 = l2.head;

        merge_sorted_list l = new merge_sorted_list();
        Node head = new Node(0);
        Node temp = head;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;


        }
        
        while(list1!=null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        
        while(list2!=null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }

        l.display();
        
        


    }
    
}
