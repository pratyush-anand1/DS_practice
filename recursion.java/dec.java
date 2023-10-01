import java.util.*;

import javax.print.event.PrintJobAdapter;

public class dec {
    public static void main (String Args []) {
        
      printinc(5);
    }
    public static void Print (int n) {
       if(n==1) {
        System.out.println(n);
        return ;
       }
       System.out.println(n+" ");
       Print(n-1);
    }
    public static  void printinc (int n){
       
       if (n==1) {
        System.out.println(1);
        return ;
       }
       printinc(n-1);
       System.out.println(n+" ");
    }
}
