import java.util.*;
public class stockspan {
    public static void main(String Args []) {
        int arr[] = {13,7,6,12};
        int arr1[] = new int[arr.length];
       // arr1[arr.length-1] = -1;
       Stack<Integer> s = new Stack<>();
       nextGreater(arr, s, arr1);
       // nextgreater(arr,arr1);
        for(int i=0;i<arr1.length;i++) {
            System.out.println(+arr1[i]);
        }
    }
    public static void stockSpan(int stocks[], int span[]) {
       Stack<Integer> s = new Stack<>();
       span[0] = 1;
       s.push(0);
       for(int i=1;i<stocks.length;i++) {
        int currprice = stocks[i];
        while(!s.isEmpty() && currprice>stocks[s.peek()]) {
            s.pop();
        }
        if(s.isEmpty()) {
            span[i] = i+1;
        } else {
            int prevhigh = s.peek();
            span[i] = i-prevhigh;
        }
        s.push(i);
       }
    }
    public static void nextgreater(int arr[], int arr1[]) { //BRUTE FORCE APPROACH
       for(int i=0;i<arr.length;i++) {//O(N) SPACE COMPLEXITY
        for(int j=i+1;j<arr.length;j++) { //O(n^2) TIME COMPLEXITY
            if(arr[i]<arr[j]) {
                arr1[i] = arr[j];
                break;
            } else {
                arr1[i] = -1;
            }
        }
       }
    }
    public static void nextGreater(int arr[] , Stack<Integer> s,int nextgreater[]) { //OPTIMIZED TC
      for(int i=arr.length-1;i>=0;i--) { //TC->O(n)
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
            s.pop();
        }
        if(s.isEmpty()) {
          nextgreater[i] = -1;
        } else {
            nextgreater[i] =arr[s.peek()]; // WE DONT WANT TO STORE INDEX IN ARR WE WANT TO STORE THE VALUE OF THAT INDEX IN NGE ARR
        }
        s.push(i);//STACK STORES INDEX NOT VALUE 
      }
     
    }
}