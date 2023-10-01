import java.util.*;
public class height {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    public static int tree_height(Node root) { //O(n)
        if(root == null) {
            return 0;
        }
        int lh = tree_height(root.left); //LEFT HEIGHT
        int rh = tree_height(root.right); //RIGHT HEIGHT
        return Math.max(lh, rh)+1;
    }
    public static int count_nodes (Node root) { //O(n)
        if(root == null) {
         return 0;   
        }
        int lc = count_nodes(root.left); //LEFT SUBTREE COUNT
        int rc = count_nodes(root.right); //RIGHT SUBTREE COUNT
        return lc+rc+1;
    }
    public static int node_sum(Node root) {
        if(root == null) {
            return 0;
        }
        int sum = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            sum+= currNode.data;
            if(currNode.left!=null) {
                q.add(currNode.left);
            } if(currNode.right!=null) {
                q.add(currNode.right);
            }
        }
        return sum;
    }
    public static int diametre(Node root) { //O(n^2)
        if(root == null) {
            return 0;
        }
        int ldiam = diametre(root.left);
        int rdiam = diametre(root.right);
        int lh = tree_height(root.left);
        int rh = tree_height(root.right);
        int diam = lh+rh+1;
        
       return Math.max(diam,Math.max(ldiam,rdiam));//MAX OF LDIAM.RDIAM,DIAM
    }
    public static boolean isidentical(Node node, Node subroot) {
     if(node==null && subroot==null) {
        return true;
     } else if(node==null || subroot==null || node.data!=subroot.data) {
        return false;
     } if(!isidentical(node.left, subroot.left)) {
         return false;
     } if(!isidentical(node.right, subroot.right)) {
        return false;
     }
     return true;
    }
    public static boolean isSubtree(Node root,Node subroot) {
       if(root==null ) {
         return false;
       } if(root.data == subroot.data) {
        if(isidentical(root,subroot)) {
            return true;
        }
       }
       return isSubtree(root.left, subroot) | isSubtree(root.right, subroot);
    }
    public static void main(String Args[]) {
        /*      1
         *     / \
         *    2   3
         *   / \ / \
         *   4 5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right  = new Node(7);
       /*  System.out.println(tree_height(root));
        System.out.println(count_nodes(root));
        System.out.println(node_sum(root));
        System.out.println(diametre(root)); */
        System.out.println(diametre(root));
        /*     2
         *    / \
         *   4   5
         */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println(isSubtree(root, subroot));
    }
}
