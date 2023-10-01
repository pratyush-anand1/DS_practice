import java.util.*;

public class stack {
    public static void main(String Args []) {
      Stack s = new Stack();
      s.push(1);
      s.push(2);
      s.push(3);
    //   while(!s.isEmpty()) {  // THIS IS ALSO A METHOD TO PRINT THE STACK CONTENTS BY PEEKING TOP ELEMENT AND POPPING IT AND AGAI PEEKING TOP UNTIL STACK GETS EMPTY
    //     System.out.println(s.peek());
    //     s.pop();
    //   }
    s.print();
    }
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size()==0;
        }
        public static void push(int data) { //PUSH
            list.add(data);
        }
        public static int pop() { //POP
            if(isEmpty()) {
                return -1;
            }
          int top = list.get(list.size()-1);
          list.remove(list.size()-1);
          return top;
        }
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
        public static void print() {
            for(int i=list.size()-1;i>=0;i--) {
                System.out.println(list.get(i));
            }
        }
    }
}
