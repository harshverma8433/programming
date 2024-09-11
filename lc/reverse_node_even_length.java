public class reverse_node_even_length {
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
        reverse_node_even_length list = new reverse_node_even_length();
        list.insertLast(5);
        list.insertLast(2);
        list.insertLast(6);
        list.insertLast(3);
        list.insertLast(9);
        list.insertLast(1);
        list.insertLast(7);
        list.insertLast(3);
        list.insertLast(8);
        list.insertLast(4);

        list.display();

    }

}
