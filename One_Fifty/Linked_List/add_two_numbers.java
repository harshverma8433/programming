package Linked_List;
import java.util.Stack;
public class add_two_numbers {
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val ){
            this.val = val;
            Node next = null;
        }
    }
    public void insertlast(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
        }
        val = val%10;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = null;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        
        add_two_numbers l1 = new add_two_numbers();
        add_two_numbers l2 = new add_two_numbers();
        l1.insertlast(9);
        l1.insertlast(9);
        l1.insertlast(9);
        l1.insertlast(9);
        l2.insertlast(9);
        l2.insertlast(9);
        l2.insertlast(9);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Node temp = l1.head;
        Node ptr = l2.head;
        while(temp!=null){
            s1.push(temp.val);
            temp = temp.next;
        }
        while(ptr!=null){
            s2.push(ptr.val);
            ptr = ptr.next;
        }
        System.out.println(s1);
        System.out.println(s2);
        int carry = 0;
        Stack<Integer> s3 = new Stack<>();
        while(s1.size()!=0 && s2.size()!=0){
            int n = s1.pop() + s2.pop()+carry;
            carry = (n>9)?1:0;
            s3.push(n%10);
        }
        while(s1.size()!=0){
            int n = s1.pop() + carry;
            carry = (n>9)?1:0;
            s3.push(n%10);
        }
        while(s2.size()!=0){
            int n = s2.pop() + carry;
            carry = (n>9)?1:0;
            s3.push(n%10);
        }
        if(carry == 1){
            s3.push(1);
        }
        add_two_numbers l3 = new add_two_numbers();
        while(s3.size()>0){
            l3.insertlast(s3.pop());
        }
        l3.display();
    }
}