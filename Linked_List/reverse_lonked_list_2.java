
import java.util.Stack;

public class reverse_lonked_list_2 {

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

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void insert(int val){
        Node newnode = new Node(val);
        
    }


    public static void main(String[] args) {
        reverse_lonked_list_2 l1 = new reverse_lonked_list_2();
        l1.insertFirst(5);
        l1.insertFirst(4);
        l1.insertFirst(3);
        l1.insertFirst(2);
        l1.insertFirst(1);
        l1.display();

        int left = 2;
        int l = left;
        int right = 4;

        Node leftptr = l1.head;
        Node temp = l1.head.next;

        for (int i = 2; i < left; i++) {
            leftptr = leftptr.next;
            temp = temp.next;     
        }

        Node rightptr = l1.head;
        for (int i = 0; i < right; i++) {
            rightptr = rightptr.next;
        }

        Stack<Integer> stack = new Stack<>();

        while(left <= right){
            stack.push(temp.val);
            temp = temp.next;
            left++;
        }



        while(l < right){
            int val = stack.pop();
            System.out.println(val);
            l1.insert(val);



        }

        

        System.out.println(stack);


    }
    
}
