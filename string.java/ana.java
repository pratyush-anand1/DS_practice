import java.util.*;

public class ana {
    public static boolean anagram (String str1, String str2){
        for(int i=0;i<str1.length();i++) {
            for(int j=0;j<str2.length();j++) {
                if(str1.charAt(i)== str2.charAt(j))
                 {
                    j++;
                   return true;

                }
            }
        }
        return false;
    }
    public static void main(String Args []) {
        String str1 = "race";
        String str2 = "pare";
        System.out.println(anagram(str1, str2));
    }
}
