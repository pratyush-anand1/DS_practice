import java.util.*;
public class builder {
    public static String toUpper (String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i)==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String Args []) {
        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z';ch++) { //abcdefghijklmnopqrstuvwxyz
        //     sb.append(ch); //adds character at from the last or at the last position
        // } //O(26) much better than O(n^2)
        // System.out.println(sb);
        // System.out.println(sb.length());
        System.out.println("Enter you String to convert each of first letter of word to upper case");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toUpper(str));
    }
}
