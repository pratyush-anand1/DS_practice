import java.util.*;
public class prefix {
    /* find the shortes Unique prefix for every word in a given list assume no word 
     * is prefix for other
     * eg: arr[] = {"zebra","dog","duck","dove"}
     * output : ans = {"z","dog","du","dov"}
     */
    public static void main(String Args[]) {
       String[] words = {"zebra","dog","duck","dove"};
       String ans="";
       for(int i=0;i<words.length;i++) {
        insert(words[i]);
       }
       root.freq=-1;
       findprefix(root, ans);
    }
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq=0;
        public Node() {
            for(int i=0;i<26;i++) {
                children[i] = null;
            }
            freq=1;
        }
    }
    public static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for(int level=0;level<word.length();level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx]==null) {
                curr.children[idx] = new Node();
            } else {
              curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow=true;
    }
    public static void findprefix(Node root,String ans) {
        if(root==null) {
            return;
        }
        if(root.freq==1) {
            System.out.println(ans);
            return;
        }
       for(int i=0;i<26;i++) {
          if(root.children[i] != null) {
            findprefix(root.children[i], ans + (char)(i+'a'));
          }
       }
    }
}
