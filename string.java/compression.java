import java.util.*;

public class compression {
    public static String compress (String str) {
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0;i<str.length();i++) {
           Integer count = 1;
           while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
            count++;
            i++;
           }
           sb.append(str.charAt(i));
           if(count>1) {
            sb.append(count.toString());
           }
        }
        return sb.toString();
    }
    public static void main(String Args []) {
        System.out.println("Enter you String to convert each of first letter of word to upper case");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(compress(str));
    }
}
