import java.util.*;
//s1 is the primary structure s2  is only helping nothing is stored in it
public class queue2stacks {
    public static void main(String Args []) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    static class queue {
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        public static void add(int data) { //ADD-> O(2n) -> O(n)
            while(!s1.isEmpty()) { //first all elements are popped out of s1 and pushed into s2
                s2.push(s1.pop());
            }
            s1.push(data); //then the data is pushed into s1
            while(!s2.isEmpty()) {
                s1.push(s2.pop()); //then all are brought back into s1 so that the first element inserted always stays at the top to be able to exit first
            }
        }
        public static int remove() { //REMOVE-> O(1)
            if(isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek() { //PEEK-> O(1)
            if(isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return s1.peek();
        }
    }
}
