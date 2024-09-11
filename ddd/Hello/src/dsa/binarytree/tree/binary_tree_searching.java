public class binary_tree_searching {
    
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

    static void inorder(Node temp){
        if(temp == null){
            return;
        }
        inorder(temp.left);
        System.out.print(temp.val + " ");
        inorder(temp.right);
    }

    static boolean flag = false;

    static void search(Node temp , int data){
        if(temp == null){
            return;
        }

        if(temp.val == data){
            flag = true;
            return;
        }

        else if(flag==false && temp.left!=null){
            search(temp.left, data);
        }
        else if(flag==false && temp.right != null){
            search(temp.right, data);
        }


    }


    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        Node temp = root;
        inorder(temp);
        System.out.println();
        
        search(root, 6);
        if(flag){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Not present");
        }

    }
}
