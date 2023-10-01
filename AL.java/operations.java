import java.util.*;

public class operations {
    public static void main(String Args []) {
        int x = Integer.MIN_VALUE;
        
        ArrayList <Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       for(int i=0;i<list.size();i++) { //MAX in AL
        if(list.get(i)>x) {
            x = list.get(i);
           
        }
        
       }
       System.out.println(x);
       for(int i=list.size()-1;i>=0;i--) { //print in decreasing order
        System.out.print(list.get(i)+ " ");
       }
       int idx1 = 1;
       int idx2 = 3;
       swap(list, idx1, idx2);
       System.out.println(list);
    }
    public static void swap (ArrayList<Integer> list , int idx1 , int idx2) {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
}
