import java.util.*;

public class oddoreven {
    public static void odd_even (int n) {
        int bitmask = 1;
        if((n & bitmask )==0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
    public static void main(String Args []) {
        int n = 7;
        odd_even(n);
    }
}
