import java.util.*;

public class queuearray {
    static class queue {
        static int arr[];
        static int size;
        static int rear;
        queue(int n) {
            arr = new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty() {
            return rear==-1;
        }
        public static void add(int data) {
            if(rear==size-1) {
                 System.out.println("queue is FULL");
                 return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++) { //i IS LIMITED TILL REAR-1 BECAUSE THERE'S NO ELEMENT AHEAD OF REAR SO REAR+1 IS NOT AVAILABLE
                arr[i] = arr[i+1]; //SHIFTING ALL ELEMENTS BACK BY 1 INDEX TO FILL UP THE VACANCY CAUSED BY REMOVE OPT
            }
            rear = rear-1;
            return front;
        }
        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
        public static void print() {
            for(int i=0;i<=rear;i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String Args[]) {
        queue q = new queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        q.print();
        q.remove();
        q.print();
        q.remove();
        q.print();
    }
}
