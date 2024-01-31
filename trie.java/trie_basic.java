import java.util.*;
public class trie_basic {
    // ALSO CALLED AS PREFIX TREE OR RETRIVAL TREE
    /* it is having less time complexity in searching since its height is very limited
     * and it is a k-ary tree though its storage is quite complex
     * AVL tree search (balanced BST) O(logn)
     * Unbalanced tree O(n)
     */
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; //eow--> END OF WORD
        Node() { //constructor
          for(int i=0;i<26;i++) {
            children[i] = null;
          }

        }
    }
    public static Node root = new Node();
    //root in a trie is always empty
    public static void main(String Args[]) {
       String[] words = {"the","a","there","their","any","thee"};
       for(int i=0;i<words.length;i++) {
        insert(words[i]);
       }
       System.out.println(search("thee"));
       System.out.println(search("thor"));
    }
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
}
