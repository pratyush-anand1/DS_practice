import java.util.*;
public class traverse {
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
     static class Btree {
        static int idx = -1;
        public static Node Buildpreorder(int nodes[]) {
          idx++;
          if(nodes[idx] == -1) {
            return null;
          }
           Node newNode = new Node(nodes[idx]);
           newNode.left = Buildpreorder(nodes);
           newNode.right = Buildpreorder(nodes);
           return newNode;
        }
        public static void preorder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root) {
            if(root==null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root) {
            if(root==null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root) {
            if(root==null) {
                return;
            }
            Queue <Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);
            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode==null) {
                    System.out.println();
                 if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                } 
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null) {
                    q.add(currNode.left);
                } if(currNode.right!=null) {
                    q.add(currNode.right);
                }
            }
            }
        }
        public static void levelorder1(Node root) {
            if(root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
           while(!q.isEmpty()) {
             Node currNode = q.remove();
            System.out.print(currNode.data+" ");
            if(currNode.left!=null) {
                q.add(currNode.left);
            } if(currNode.right!=null) {
                q.add(currNode.right);
            } 
           }
        }
    }
    public static void main(String Args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Btree b = new Btree();
       Node root = b.Buildpreorder(nodes);
      //  System.out.println(b.Buildpreorder(nodes));
      b.preorder(root);
      System.out.println();
      b.inorder(root);
      System.out.println();
      b.postorder(root);
      System.out.println();
      b.levelorder1(root);
    }
}
