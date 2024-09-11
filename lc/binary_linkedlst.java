public class binary_linkedlst {
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
        binary_linkedlst l1 = new binary_linkedlst();
        l1.insertLast(1);
        l1.insertLast(0);
        l1.insertLast(1);
        l1.display();

        int len = -1;
        Node temp = l1.head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        System.out.println(len);

        Node ptr = l1.head;
        int res = 0;
        while(ptr!=null){
            int v = (ptr.val)*(int)Math.pow(2, len);
            res += v;
            ptr = ptr.next;
            len--;
        }

        System.out.println(res);

    }
    
}
