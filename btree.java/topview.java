import java.util.*;
public class topview {
    public static void main(String Args []) {
      Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
    }
    static class info {
        Node node;
        int hd; //HORIZONTAL DISTANCE
        public info(Node node , int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void top_view(Node root) {
        //LEVEL ORDER TRAVERSAL
        Queue<info> q = new LinkedList<>(); //queue of object of class info
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new info(root, 0));
        while(!q.isEmpty()) {
           info curr = q.remove();
           if(!map.containsKey(curr.hd)) { //first time my hd is occuring
            map.put(curr.hd, curr.node);
        }
        if(curr.node.left!=null) {
            q.add(new info(curr.node.left, curr.hd-1));
            min = Math.min(min,curr.hd-1);
        } if(curr.node.right!=null) {
            q.add(new info(curr.node.right,curr.hd+1));
            max = Math.max(max,curr.hd+1);
        }
        }
        
    }
}
