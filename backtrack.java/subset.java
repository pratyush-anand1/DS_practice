import java.util.*;

public class subset {
    public static void main(String Args []) {
        String str = "abc";
        findsubsets(str, "", 0);
    }
    public static void findsubsets(String str , String ans , int i) {
        //ans is the box
       if(i==str.length()) {  //BASE case
        if(ans.length()==0) {
            System.out.println("NULL");
        }
           System.out.println(ans); 
           return ;
       }
        //recursion case  //YES choice
        findsubsets(str, ans+str.charAt(i), i+1);
        //NO choice
        findsubsets(str, ans, i+1);
    }
}
