import java.util.*;
public class startsWith {
//Create a function boolean startswith(String w) for a trie
//return true if there is a previously inserted string word that has prefix w else return false
  public static void main(String Args[]) {
    String[] words = {"app","man","mango","woman","apple"};
    for(int i=0;i<words.length;i++) {
        insert(words[i]);
    }
    System.out.println(startsWith("app"));
    System.out.println(startsWith("wo"));
  }
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
public static boolean startsWith(String prefix) { //O(L)
    Node curr = root;
    for(int i=0;i<prefix.length();i++) {
        int idx = prefix.charAt(i)-'a';
       if(curr.children[idx]==null) return false;
       curr = curr.children[idx];
    }
    return true;

}
}
//count unique prefixes using tries google,microsoft
//Longest  word with all prefixes using tries
//GRAPHS :
// TOPOLOGICAL SORTING : DFS , BFS(KAHNS) , ALLPATHS FROM SOURCE TO TARGET
//DJIKISTRA , BELLMAN FORD , MST , PRIMS , CHEAPEST FLIGHTS WITHIN K STOPS
//CONNECTING CITIES , DISJOINT SET UNIONS , KRUSKALS ALGORITHM , FLOOD FILL ALGORITHM
//FLOYD WARSHALL ALGO , STRONGLY CONNECTED COMPONENTS(KOSARAJU) 
//BRIDGE IN GRAPH(TARJAN ALGO) , ARTICULATION POINT(TARJAN)
//SEGMENT TREE-> INSERT,COUNT&MEANING NODE,CREATE,QUERIES,UPDATE,MAX/MIN SEGMENT TREE(UPDATE & QUERIES & CREATE)
//BOTS MANIPULATION->BITWISE OPERATOR,BINARY AND,BINARY OR,BINARY XOR,BINARY 1S COMPLEMENT
//BINARY LEFT & RIGHT SHIFT,CHECK IF ODD EVEN,GET/UPDATE/CLEAR ith BIT,CLEAR LAST ith BIT
//CLEAR RANGE OF BITS,COUNT SET BITS IN A NUMBER , FAST EXPONENTIATION
//BACKTRACKING->SUDOKU,GRID WAYS,FIND PERMUTATIONS,N QUEENS
