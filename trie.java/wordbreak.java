import java.util.*;
public class wordbreak {
    public static void main(String Args[]) {
       String[] words = {"i","like","sam","samsung","mobile","ice"};
       String key = "ilikesamsung";
       for(int i=0;i<words.length;i++) {
        insert(words[i]);
       }
       System.out.println(word_break( key));

    }
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; //eow--> END OF WORD
        public  Node() { //constructor
          for(int i=0;i<26;i++) {
            children[i] = null;
          }

        }
    }
    public static Node root = new Node();
    public static void insert(String word) { // O(L) 
        Node curr = root;
        for(int level=0;level<word.length();level++) {
            int idx = word.charAt(level) - 'a'; //always return int index of char at that idx
           if(curr.children[idx]==null) {  //new node
               curr.children[idx] = new Node();
           }
           curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key) { //O(L)
        Node curr = root;
        for(int level=0;level<key.length();level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx]==null) { //i.e. doesn't exists
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow==true;
    }
    public static boolean word_break( String key) {
        // Given an input string and a dictonary of words  find out if the input string can be broken into a space-seperated sequence of dictonary words
        if(key.length()==0) { //BASE CASE
            return true;
        }
        for(int i=1;i<=key.length();i++) {
            if(search(key.substring(0,i)) && word_break(key.substring(i))) {
                return true;
            } 
        }
      return false;
    }
    
}
