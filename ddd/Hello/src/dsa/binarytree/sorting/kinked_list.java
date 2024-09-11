package dsa.binarytree.sorting;


public class kinked_list {
    
static class Node{
    int val;
    Node next;
    Node(int val){

        this.next = null;
        this.val = val;

    }
}

static Node head;


static void insertfirst(int val){
    Node newnode = new Node(val);
    if(head == null){
        head = newnode;
        head.next = null;
        return;
    }


    newnode.next = head;
    head = newnode;
}

static void display(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.val+ " ");
        temp = temp.next;

    }
    System.out.println();
}

static void delete(int val){
    Node temp = head;
    Node ptr = null;
    while(temp.next.val != val){
        temp = temp.next;
        ptr = ptr.next;
    }
    ptr.next = temp.next;
}

    public static void main(String[] args) {
        insertfirst(5);
        insertfirst(4);
        insertfirst(3);
        insertfirst(2);
        insertfirst(1);

        display();

        delete(3);

        display();
    }
}
