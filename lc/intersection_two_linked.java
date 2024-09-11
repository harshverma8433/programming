public class intersection_two_linked {

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
        intersection_two_linked l1 = new intersection_two_linked();
        intersection_two_linked l2 = new intersection_two_linked();
        l1.insertLast(4);
        l1.insertLast(1);
        l1.insertLast(8);
        l1.insertLast(4);
        l1.insertLast(5);

        l2.insertLast(5);
        l2.insertLast(6);
        l2.insertLast(1);
        l2.insertLast(8);
        l2.insertLast(4);
        l2.insertLast(5);
        l1.display();
        l2.display();
        Node headA = l1.head;
        Node headB = l2.head;
        Node a = headA;
        Node b = headB;

        while (a != b) {

            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        System.out.println(a.val);

    }
}