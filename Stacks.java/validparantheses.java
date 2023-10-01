import java.util.*;
public class validparantheses {
    public static void main(String Args[]) {
      String str = "({[]}())";
      
    }
    public static boolean validParantheses(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            //OPENING
            if(ch=='('|| ch=='{'|| ch=='[') {
                s.push(ch);
            } else {
                //CLOSING
                if(s.isEmpty()) {
                    return false;
                }
                if((s.peek() == '(' && ch==')')
                    ||(s.peek()=='{'&& ch=='}')
                    ||(s.peek()=='['&& ch==']')) {
                        s.pop();
                    } else {
                        return false;
                    }
                   
                
            }
        }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
