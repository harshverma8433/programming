import java.util.Stack;

public class palindrome_ll {

    
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


    public static void main(String[] args) {
        palindrome_ll l1 = new palindrome_ll();
        l1.insertFirst(1);
        l1.insertFirst(2);
        l1.insertFirst(2);
        l1.insertFirst(1);

        l1.display();

        Stack<Integer> stack = new Stack<>();
        Node temp = l1.head;
        int len = 0;
        while(temp != null){
            len++;
            stack.push(temp.val);
            temp = temp.next;
        }

        len = len/2;

        temp = l1.head;

        boolean b = false;

        while(len-- > 0){
            int pop = stack.pop();
            if(pop == temp.val){
                b  =  true;
            }
            else{
                b = false;
                break;
            }

            temp = temp.next;
        }

        System.out.println(b);
    }
    
}
