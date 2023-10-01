import java.util.*;
public class reverse {
    public static void rev(int marks[]) {
        // for(int i=0;i<(marks.length/2)-1;i++) {
        //     for(int j=marks.length-1;j>(marks.length/2);j--) {
        //         int temp=0;
        //        temp = marks[i];
        //        marks[i]=marks[j];
        //        marks[j]=temp;
        //     }
        // }
        
        
        int i=0;         
        int j=marks.length -1;

        while(i<=j){
            int temp=0;
            temp = marks[i];
            marks[i]=marks[j];
            marks[j]=temp;

            i++;
            j--;
        }

        for(int k=0;k<marks.length;k++) {
            System.out.println("Resultant array : "+marks[k]);
         }
    }
    public static void main(String [] Args) {
      int marks[] = {2,4,6,8,10};
      rev(marks);
    }
}
