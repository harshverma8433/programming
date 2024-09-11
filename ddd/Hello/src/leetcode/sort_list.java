package leetcode;
public class sort_list {
    
    Node head;
    class Node{
        int val;;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void insertfirst(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head =  newnode;
    }

    public void display(){
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public void sortList(Node heafdd) {
        Node temp = head;
        Node ptr = head.next;
        while(temp!=null){
            while(ptr!=null){
                if(temp.val > ptr.val){
                    int s = temp.val;
                    temp.val = ptr.val;
                    ptr.val = s;
                }
                temp = temp.next;
                ptr = ptr.next;
            }
            temp = head;
            ptr = head.next;
        }
    }

    public static void main(String[] args) {
        sort_list s = new sort_list();
        s.insertfirst(4);
        s.insertfirst(2);
        s.insertfirst(1);
        s.insertfirst(3);
        s.display();
        s.sortList(null);
    }

}
