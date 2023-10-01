import java.util.*;
public class pairs {
    public static void printpairs (int num[]) {
        for(int i=0;i<num.length;i++) {
            int curr = num[i];
            for(int j=i+1;j<num.length;j++) {
                System.out.println("("+curr+","+num[j]+")");
            }
            System.out.println();
        }
    }
public static void main (String [] Args) {
    int num[] = {1,2,3,4,5};
    printpairs(num);
}
}
