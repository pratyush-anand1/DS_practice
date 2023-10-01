import java.util.*;

public class palindrome {
    public static boolean Palindrome (String str) {
        for(int i=0;i<str.length()/2;i++) {
            int n = str.length();
            if(str.charAt(i)!= str.charAt(n-1-i)) {
               return false;
            }
        }
        return true;
 
    }
    public static void main (String Args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be checked");
        String str;
        str = sc.next();
        System.out.println(Palindrome(str));
    }
}
