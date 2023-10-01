import java.util.*;
public class DoubleLL {
     public static void main(String Args []) {
     DoubleLL dll = new DoubleLL();
     dll.addFirst(3);
     dll.addFirst(2);
     dll.addFirst(1);
     dll.print();
    // dll.reverse();
     //dll.print();
     dll.removeLast();
     dll.print();
    }
    public class Node {
        int data;
        Node next;
        Node prev;
        public  Node(int data) { //CONSTRUCTOR
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public int removeFirst() {
      if(head ==null) {
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
      }
      if(size == 1) {
        int val = head.data;
        head = tail = null;
        size--;
        return val;
      }
      int val = head.data;
      head = head.next;
      head.prev = null;
      return val;
    }
    public int removeLast() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
    
        }
        if(size == 1) {
            int val = tail.data;
            head = tail = null;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }
    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
       while(curr!=null) {
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
       }
       head = prev;
    }
}