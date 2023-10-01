import java.util.*;
public class bubble {
    public static void bubble (int arr[]) {
        for(int turns=0;turns<arr.length-1;turns++) {
            for(int j=0;j<arr.length-turns-1;j++) {
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
    }
    public static void printarray (int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void selection(int arr[]) {
        for(int i=0;i<arr.length-1;i++) { //last element is anyways sorted 
            int minpos = i;
            for(int j=i+1;j<arr.length-1;j++) {

            }
        }
    }
    public static void main(String Args []) {
        int arr[] = {3,7,5,4,6};
      //  bubble(arr);
      Arrays.sort(arr,0,3,Collections.reverseOrder());
        printarray(arr);
    }
}
