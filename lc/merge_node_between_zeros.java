public class merge_node_between_zeros {
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
        merge_node_between_zeros list = new merge_node_between_zeros();
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(0);
        list.insertLast(3);
        list.insertLast(0);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(0);

        merge_node_between_zeros list2 = new merge_node_between_zeros();
        Node temp = list.head.next;

        int v = 0;

        while (temp != null) {
            if (temp.val != 0) {
                v += temp.val;
            } else {
                list2.insertLast(v);
                v = 0;
            }
            temp = temp.next;
        }

        list2.display();
    }

}
