

public class treee {

    Node root;

    
    
    class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        treee tree = new treee();
        tree.root = new Node(3);


        
    }
}
