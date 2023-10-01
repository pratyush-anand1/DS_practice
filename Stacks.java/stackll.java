import java.util.*;

public class stackll {
    public static void main(String Args[]) {
      stack s = new stack();
      stack s1 = new stack();
      s.push(1);
      s.push(2);
      s.push(3);
      s.print();
      
      System.out.println();
    //   while(!s.isEmpty()) { //ANOTHER WAY TO PRINT THE CONTENTS OF STACK
    //     System.out.println(s.peek());
    //       s.pop();
    //   }
      String str = "abc";
     System.out.println(reverseString(str));
    }
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    } 
    static class stack {  
        static Node head = null;
        public static boolean isEmpty() {
            return head==null;
        }
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return head.data;
        }
        public static void print() {
            Node temp = head;
            while(temp!=null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        public static void pushAtBottom(stack s , int data) { //DOUBT
            if(s.isEmpty()) {
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(s, data);
            s.push(top);
        }
        
    }
    public static String reverseString(String str) {
        Stack<Character> s1 = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s1.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s1.isEmpty()) {
            char curr = s1.pop();
            result.append(curr);
        }
        str = result.toString();
        return str;
    }
      public static void reverseStack(Stack<Integer> s) { //DOUBT
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
      } 
}
