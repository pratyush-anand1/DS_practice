import java.util.*;

public class rotated {
   public static void main(String Args[]) {
    int arr[] = {4,5,6,7,0,1,2};
    int target = 0; //output->4
    int tidx = search(arr, 0, arr.length-1, target);
    System.out.println(tidx);
   }
   public static int search(int arr[] , int si , int ei , int tar) {
    if(si>ei) {
        return -1;
    }
    int mid = si + (ei-si)/2;
    if(arr[mid]==tar) { //base case
        return mid;
    }
    if(arr[si]<=arr[mid]) { //mid on L1
      if(arr[si]<=tar && tar<=arr[mid]) { //caseA: LEFT of mid
         return search(arr, si, mid, tar);
      } else { //caseB: RIGHT
        return search(arr, mid+1, ei, tar);
      }
    }
    else {
        if(arr[mid]<=tar && tar<=arr[ei]) {  //caseC: right of mid
            return search(arr,mid,ei,tar);
        } else { //caseD: LEFT
            return search(arr, si, mid-1, tar);
        }
    }
   }
}

