import java.util.*;
public class digit {
    public static void main(String Args []) {
        int digits[] = {1,2,3};
        plusone(digits);
    }
    public static void plusone(int arr[]) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i]);
        }
        String str = sb.toString();
        int x = Integer.valueOf(str);
        x++;
        String s = Integer.toString(x);
        int temp[] = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            temp[i] = s.charAt(i);
        }
        for(int i=0;i<temp.length;i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
