import java.util.Stack;

public class max_twin_sum_linked_list {

    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void insertLast(int val){
        Node newnode = new Node(val);
        if (head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void display(){
        Node ptr = head;
        while(ptr != null) {
            System.out.print(ptr.val+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        max_twin_sum_linked_list lst = new max_twin_sum_linked_list();
        lst.insertLast(4);
        lst.insertLast(2);
        lst.insertLast(2);
        lst.insertLast(3);
        lst.display();

        Node ptr = lst.head;
        Stack<Integer> stack = new Stack<>();
        while(ptr!=null){
            stack.push(ptr.val);
            ptr = ptr.next;
        }

        Node temp = lst.head;
        int len = stack.size()/2;
        int max = 0;
        for (int i = 0; i < len; i++) {
            int sum = temp.val + stack.pop();
            if(sum > max){
                max = sum;
            }
            temp = temp.next;
        }

        System.out.println(max);
    }
    
}
