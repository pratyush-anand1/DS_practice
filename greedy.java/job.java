import java.util.*;
public class job {
    static class Job {
        int deadline;
        int profit;
        int id;
        public void job(int i , int d , int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String Args[]) {
       int jobinfo[][] = {{4,20},{1,10},{1,40},{1,30}};
       Job job[] = new Job[jobinfo.length];
        for(int i=0;i<job.length;i++) {
            job[i] = job(i,jobinfo[i][0],jobinfo[i][1]);
        }
    }
   
}
