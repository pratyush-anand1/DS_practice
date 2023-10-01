import java.util.*;

public class ithbit {
    public static int getithbit(int n , int i) { //get Ith bit
        int bitmask = 1<<i;
        if((n & bitmask)==0)  {
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int setithbit(int n , int i) { //set Ith bit to 1
       int bitmask = ~(1<<i) ;
       return n|bitmask;
    }
    public static int clearithbit (int n , int i) { //set Ith bit to 0
        int bitmask = 1<<i;
        return n&bitmask;
    }
    public static int updateithbit(int n , int i , int newbit) { //newbit =0 or 1
        // if (newbit==0) {
       // return clearithbit(n,i); }
       // else 
       // return setithbit(n,i);
        n = clearithbit(n, i);
        int bitmask = newbit<<i;
        return n|bitmask;
        
    }
    public static void main (String Args []) {
        System.out.println(setithbit(10,2));
    }
}
