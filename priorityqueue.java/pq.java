import java.util.*;
public class pq {
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        public Student(String name , int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override 
        public int CompareTo(Student s2) {
            return this.rank-s2.rank;
        }
    }
    public static void main(String Args []) {
      PriorityQueue<Student> pq = new PriorityQueue<>();
      pq.offer('A',5);
      pq.offer('B',4);
      pq.offer('C',3);
      pq.offer('D',2);
      pq.offer('E',1);
    }
}
