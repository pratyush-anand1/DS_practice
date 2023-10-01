import java.util.*;
public class search {
    public static int largest (int marks[]) {
      int Largest = Integer.MIN_VALUE;
      for(int i=0;i<marks.length;i++) {
        if (marks[i]>Largest) {
            Largest = marks[i];
        }
      }
      return Largest;
    }
    public static int binary_search (int marks[], int key, int s, int e,int mid)  {
        s = 0;
        e = (marks.length)-1;
        mid = s + (e-s)/2;
        while(s<=e) {
            if(marks[mid]==key) {
                return mid;
            }
            if(key>marks[mid]) {
                s= mid +1;
                e = (marks.length)-1;
            }
            else {
                e = mid-1;
            }

           
        }
        return -1;   
        }
    public static void main (String args []) {
      int marks[] = {12,13,14,15,16,17,18};
      int key = 16;
      System.out.println(largest(marks));
    }
}
    