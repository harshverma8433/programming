public class swap_node_pairs {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void insertLast(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void display() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        swap_node_pairs list1 = new swap_node_pairs();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.display();

        Node l1 = list1.head;
        Node l2 = list1.head.next;

        int len = 0;;
        Node temp = list1.head;
        while (temp!=null) {
            len++;
            temp = temp.next;
        }

        len = len/2;

        for(int i=0;i<len;i++) {
            int val = l1.val;
            l1.val = l2.val;
            l2.val = val;
            l1 = l2.next;
            if (l1 != null) {
                l2 = l1.next;
            }
        }

        list1.display();

    }

}
