import java.util.*;

public class containerwithwater {
    public static void main (String Args []) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
       // System.out.println(storewater(height));
       System.out.println(storewater1(height));
    }
    public static int storewater (ArrayList<Integer> height) {
        int maxwater = 0;
        //BRUTE FORCE -> O(n^2)
        for(int i=0;i<height.size();i++) {
            for(int j=i+1;j<height.size();j++) {
              int ht = Math.min(height.get(i), height.get(j)) ; //height of that specific container
              int w = j-i; //width of that particular container 
              int currwater = ht * w;
              maxwater = Math.max(maxwater,currwater);
            }
        }
        return maxwater;
    }
    public static int storewater1 (ArrayList<Integer> height) {
        //two pointer Approach -> O(n) 
        int max_water = 0;
        int lp = 0; //LEFT POINTER
        int rp = height.size() - 1; //RIGHT POINTER
        while(lp<rp) {
            int ht1 = Math.min(height.get(lp),height.get(rp)); //height
            int w1 = rp - lp;  //width
            int curr_water = ht1*w1; //area
            max_water = Math.max(max_water,curr_water);
            //Update ptr
            if(height.get(lp)<height.get(rp)) {
                lp++;
            } else {
                rp--;
               
            }
        }
        return max_water;
    }
}
