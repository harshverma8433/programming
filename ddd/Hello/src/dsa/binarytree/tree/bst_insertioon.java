public class bst_insertioon {

    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static Node root;

    static void insert(Node temp , int val){
        if(temp == null){
            root = new Node(val);
            return;
        }
        
        else if(val < temp.val){
            temp.left = new Node(val);
        }

        else if(val > temp.val){
            
        }

    }

    static void inorder(Node temp){
        if(temp == null){
            return;
        }
        inorder(temp.left);
        System.out.print(temp.val+" ");
        inorder(temp.right);
    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.right = new Node(40);
        inorder(root);
        insert(root, 50);
        System.out.println();
        inorder(root);
    }
 
}
