import java.util.*;
//O(n)
public class pairsum2 {
    public static void main(String Args[]) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairsum2(list, 0));
    }
    public static boolean pairsum2 (ArrayList<Integer> list , int target) {
        int bp = -1; //BREAKING POINT
        int n = list.size();
        for(int i=0;i<list.size();i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp+1; //left pointer
        int rp = bp; //right pointer
        while(lp!=rp) {
        if(list.get(lp)+list.get(rp)==target) {
            return true;
        } 
        if(list.get(lp)+list.get(rp)>target) {
           rp = (n+rp-1) % n;
        } else {
            lp = (lp+1)%n;
        }
    }
        return false;
    }
}
