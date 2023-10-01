import java.util.*;
public class permutation {
    public static void main(String Args []) {
       String str = "abc";
      PrintPermutations(str, "");
    }
    public static void PrintPermutations (String str, String ans) {
        if(str.length()==0) {   //BASE CASE
             System.out.println(ans);
             return;
        }
        for(int i=0;i<str.length();i++) {  //RECURSION CASE
            char curr = str.charAt(i);
          String  newstr = str.substring(0, i) + str.substring(i+1);
            PrintPermutations(newstr, ans+curr);
        }
    }
}
