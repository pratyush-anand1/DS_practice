import java.util.*;
//Pairsum1 means searching for pairs in a sorted list whose sum = target 
public class pairsum1 {
    public static void main (String Args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 4;
        System.out.println(pairsum1(list, target));
    }
    public static boolean pairsum1 (ArrayList<Integer> list , int target) {
        int lp = 0; //left pointer
        int rp = list.size()-1; //right pointer
       while(lp<rp) {
        if(list.get(lp)+list.get(rp)== target) {
            return true;
        }
        if(list.get(lp)+list.get(rp) < target) {
            lp++;
        } else {
            rp--;
        }
       }
     return false;
    }
}
