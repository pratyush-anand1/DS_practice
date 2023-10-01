import java.util.*;
public class duplicateparantheses {
    public static void main(String Args[]) {
       String str = "((a+b))"; //TRUE
       String str1 = "(a+b)"; //FALSE
       System.out.println(duplicateParantheses(str1));
    }
    public static boolean duplicateParantheses(String str) {
       Stack<Character> s = new Stack<>();
       for(int i=0;i<str.length();i++) {
         char ch = str.charAt(i);
         if(ch==')') { //CLOSING
           int count=0;
           while(s.peek()!='(' ) {
            s.pop();
            count++;
           }
           if(count<1) {
            return true; //duplicate
           } else {
            s.pop();
           }
         } else {
            s.push(ch);
         }
       }
       return false;
    }
}
