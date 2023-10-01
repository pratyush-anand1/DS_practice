import java.util.*;

public class activity {
    public static void main(String Args []) {
        int startTime[] = {1,3,0,5,8,5};
        int endTime[] = {2,4,6,7,9,9};
        int maxActivity = 0;
        ArrayList <Integer> ans = new ArrayList<>();
        //If endTime is sorted
        //1st Activity
         maxActivity = 1;
         ans.add(0);
         int lastTime = endTime[0];
         for(int i=1;i<startTime.length;i++) {
            if(startTime[i]>=lastTime) {
                maxActivity++;
                ans.add(i);
                lastTime = endTime[i];
            }
         }
         System.out.println("Maximum activity performed = "+maxActivity);
         System.out.println();
         for(int i=0;i<ans.size();i++) {
            System.out.println(ans.get(i)+" ");
         }
         //IF ENDTIME IS NOT SORTED THEN WE MAKE A 2D MATRIX
         int activities[][] = new int[startTime.length][3];
         //1st col->INDEX,2nd col->STARTTIME,3rd col->ENDTIME
        for(int i=0;i<startTime.length;i++) {
            activities[i][0] = i; //1ST COL WILL STORE THE INDEX
            activities[i][1] = startTime[i]; //2ND COL WILL STORE START TIME
            activities[i][2] = endTime[i]; //3RD COL WILL STORE END TIME 
        }
        //LAMBDA FUNCTION -> SHORT FORM
        Arrays.sort(activities , Comparator.comparingDouble(o->o[2]));//SORTING BASED ON COL NO-2
        ArrayList <Integer> ans1 = new ArrayList<>();
        //1ST ACTIVITY
        int maxAct = 1;
        ans1.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1;i<startTime.length;i++) {
            if(activities[i][1]>=activities[i][2]) {
                maxAct++;
                ans1.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
    }
}
