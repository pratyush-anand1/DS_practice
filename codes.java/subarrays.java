import java.util.*;
public class subarrays {
    public static void subarray(int nums[]) {
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            int start = i;
            for(int j=i;j<nums.length;j++) {
                int end = j;
                currsum = 0;
                for(int k=start;k<=end;k++) {
                    currsum += nums[k];
                }
                if(maxsum<currsum) {
                    maxsum = currsum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum = "+maxsum);
        
    }
   
    public static void main(String Args []) {
        int nums[] = {2,4,6,8,10};
        subarray(nums);
    }
}
