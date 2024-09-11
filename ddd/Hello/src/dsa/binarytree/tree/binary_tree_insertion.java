import java.util.*;

public class binary_tree_insertion {
    
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
    static Node temp = root;

    static void insert(Node temp , int val){
        if(root == null){
            root = new Node(val);
            return ;
        }


        Queue<Node> q = new LinkedList<>();
        q.add(temp);

        while(!q.isEmpty()){
            temp = q.peek();
            q.remove();

            if(temp.left == null){
                temp.left = new Node(val);
                break;
            }
            else{
                q.add(temp.left);
            }

            if(temp.right == null){
                temp.right = new Node(val);
                break;
            }
            else{
                q.add(temp.right);
            }
        }
    }


    static void levelorder(Node temp){
        int h = height(temp);
        for(int i=1;i<=h;i++){
            currentlevel(temp , i);
        }
    }

    static void currentlevel(Node temp , int level){
        if(temp == null){
            return ;
        }
        if(level == 1){
            System.out.print(temp.val + " " );
        }
        else if(level > 1){
            currentlevel(temp.left, level-1);
            currentlevel(temp.right, level-1);
        }
    }

    static int height(Node temp){
        if(temp == null){
            return 0;
        }
        else{
            int lheight = height(temp.left);
            int rheight = height(temp.right);

            if(lheight > rheight){
                return lheight+1;
            }
            else{
                return rheight +1;
            }

        }
    }


    static void inorder(Node root){
        if(root == null){
            return ;
        }

        inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);

    }





    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        inorder(root);
        System.out.println();
        
        insert(root , 12);
        inorder(root);
        System.out.println();

        levelorder(root);
        System.out.println();
    }
}
