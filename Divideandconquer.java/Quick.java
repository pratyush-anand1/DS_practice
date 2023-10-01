import java.util.*;
//T(n)= O(nlogn) is the best case and O(n^2) is worst case it occurs when pivot is the smallest or largest element; equal to inbuilt sort method  Space: O(1) 
public class Quick {
    public static void main (String Args []) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, 5);
        printarr(arr);
    }
    public static void quickSort(int arr[],int si,int ei) {
        if(si>=ei) {
            return ;
        }
        int pidx = partition(arr,si,ei); //Index of pivot is returned
        quickSort(arr, si, pidx-1); //left part of pivot sorting
        quickSort(arr, pidx+1, ei); //right part of pivot sorting
    }
    public static int partition(int arr[],int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; //to make place for smaller elements than pivot
        for(int j=si;j<ei;j++) {
            if(arr[j]<=pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
         //swap for pivot element
         int temp = pivot;
         arr[ei] = arr[i];
         arr[i] = temp;
          return i;
    }
    public static void printarr (int arr[]) {
        for(int k=0;k<arr.length;k++) {
            System.out.println(arr[k]+" ");
        }
        
    }
}
