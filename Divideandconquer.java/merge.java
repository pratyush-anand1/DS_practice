//will not be able to use this sorting if extra space is not available because we use a temp array
import java.util.*;
//T(n)= O(nlogn); equal to inbuilt sort method  Space: O(n) 
public class merge {
    public static void main(String Args []) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printarr(arr);
    }
    public static void printarr (int arr[]) {
        for(int k=0;k<arr.length;k++) {
            System.out.println(arr[k]+" ");
        }
        System.out.println();
    }
    public static void mergeSort (int arr[], int si , int ei) { //divides arr recursively until it reaches base case i.e single element left
        if(si>=ei) {
            return ;
        }
        int mid = si + (ei-si)/2; //(si+ei)/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        Merge(arr,si,mid,ei);
    }
    public static void Merge(int arr[] , int si , int mid , int ei ) {
        int temp[] = new int[ei-si+1]; //left(0,3)=4 right(4,6)=3 -> 6-0+1 = 7
        int i = si;  //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; //iterator for temp array
        while(i<=mid && j<=ei) {
            if(arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid) { //if elements are left in LEFT part of the array
           temp[k++] = arr[i++];    //temp[k] = arr[i];  k++;  i++;
        }
        while(j<=ei) { //if elements are left in RIGHT part of the array
            temp[k++] = arr[j++];   //temp[k] = arr[j];  k++;  j++;
        }
        for( k=0 , i=si;k<temp.length;k++,i++) { //To copy temp array into original array
            arr[i] = temp[k];
        }
    }
}
