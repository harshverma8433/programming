import java.util.LinkedList;

public class palindrome_linkded{

    Node head;


    class Node{
        int val;
        Node node;
        public Object next;

        Node(int val){
            this.val = val;
        }
    }

    public void insertfirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.next = null;
        }


    }



    public static void main(String[] args) {
        

    }
}