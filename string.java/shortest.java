import java.util.*;
public class shortest {
    public static float shortestdistance (String str) {
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='N') {
                y++;
            }
            if(str.charAt(i)=='S') {
                y--;
            }
            if(str.charAt(i)=='E') {
                x++;
            }
            if(str.charAt(i)=='W') {
                x--;
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float) Math.sqrt(X+Y);
    }
    public static void main (String Args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string to find shortest distance");
    String str;
    str = sc.next();
    System.out.println(shortestdistance(str));
    }
}
