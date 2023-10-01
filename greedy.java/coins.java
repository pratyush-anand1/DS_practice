import java.util.*;
public class coins {
    public static void main(String Args []) {
        Scanner sc = new Scanner(System.in);
        Integer denominations[] = {1,2,5,10,20,50,100,500,1000};
        //FIRST WE WILL SORT IN DESCENDING ORDER AND USE GREEDY
         Arrays.sort(denominations,Comparator.reverseOrder());
        int val;
        System.out.println("Enter the value");
        val = sc.nextInt();
        int count=0;
        for(int i=0;i<denominations.length;i++) {
           if(denominations[i]<=val) {
            while(denominations[i]<=val) {
                count++;
                val-=denominations[i];
            }
           }
        }
       System.out.println("Minimum number of coins/notes is : "+count);
    

    }
}
