import java.util.*;

public class linklist {
    public static void main(String Args []) {
     linklist ll = new linklist();
     ll.addFirst(2);
     ll.addFirst(1);
     ll.addLast(3);
     ll.addLast(4);
     ll.add(2,9);
     ll.print();
     System.out.println();
     System.out.println(ll.size);
     ll.removeFirst();
     ll.print();
     System.out.println();
     ll.removeLast();
     ll.print();
     System.out.println();
     ll.removeNthfromlast(2);
     ll.print();
    }
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null; //Initially the reference will point to null which will be connected afterwards
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data) {
        Node newnode = new Node(data); //CREATING A NEW NODE
        size++;
    if(head == null) {
        head = tail = newnode;
        return;
    }
        newnode.next = head; //LINK
        head = newnode; //MAKING THE NEWNODE THE HEAD SINCE ITS ADDING AT THE FRONT END
    }
    public void addLast(int data) {
        Node newnoNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newnoNode;
            return;
        }
        tail.next = newnoNode; //Current tail node is made to point to the new node
        tail = newnoNode; //new node is given tail hence it is inserted at last position
    }
    public void add(int idx , int data) {
        if(idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new  Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i< idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public int removeFirst() {
        if(size==0) {
            System.out.println("LL is EMPTY!");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast() {
        
        if(size==0) {
            System.out.println("LL is EMPTY");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = tail.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = tail.data;
        Node prev = head;
        for(int i=0;i<size-2;i++) {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int iterativeSearch(int key) {
        int i = 0;
        Node temp = head;
       
        while(temp!=null) {
            if(temp.data == key) {
                return i; }
            
                temp = temp.next;
                i++;
            
            
        }
        return -1;
    }
    // public int helper(Node head , int key) { //Since head is changes in recursive search a helper fnx is made since in recsearch only key can be passed as argument
    //     if(head == null) {
    //         return -1;
    //     }
    //     if(head.data == key) {
    //         return 0;
    //     }
    //     int idx = helper(head.next, key);
    //     if(idx == -1) {
    //         return -1;
    //     }
    //     return idx+1;
    // }
    // public int recsearch(int key) {
    //        return helper(head, key);
    // }
    public void removeNthfromlast(int n) {
       int sz = 0; //To calculate Size
       Node temp = head;
       while(temp != null) {
        temp = temp.next;
        sz++;
       }
       if(n==sz) { //REMOVE FIRST
        head = head.next; 
        return;
       }
       int i =1;
       int itoFind = sz-n;
       Node prev = head;
       while(i<itoFind) {
        prev = prev.next;
        i++;
       }
       prev.next = prev.next.next;
       return;
    }
    //SLOW FAST APPROACH TO FIND MID NODE
       public Node  findmid(Node head) {
           Node slow = head;
           Node fast = head;
           while(fast!=null && fast.next != null) {
            slow = slow.next;                         //+1
            fast = fast.next.next;                 //+2
           }
           return slow; //slow is my midnode
       }
       public Boolean isPalindrome() {
        if(head==null | head.next == null) {
            return true;
        }
        Node midnode = findmid(head);
        Node prev = null;
        Node curr = midnode;
        Node next;
            while(curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
            }
            Node right = prev; //right half head
            Node left = head;
            while(right != null) {
                if(left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
       }
       public boolean isCycle() { //FLOYD CYCLE FINDING ALGORITHM
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null) {
           slow = slow.next; //+1
           fast = fast.next.next; //+2
           if(slow == fast) {
            return true; //cycle exists
           }
        }
        return false; //cycle doesn't exists
       }
       public void removeCycle() {
        //STEP-1: CYCLE DETECTION
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null) {
           slow = slow.next; //+1
           fast = fast.next.next; //+2
           if(slow == fast) {
             cycle = true;
             break;
           }
        }
        if(cycle = false) {
            return;
        }
        //FIND MEETING POINT
        slow = head;
        Node prev = null;
        while(slow != fast) {
          slow = slow.next;
          prev = fast;
          fast = fast.next;
        }
        //REMOVE CYCLE : LAST.NEXT->NULL;
        prev.next = null;
       }
       public Node mergesort(Node head) {
          if(head==null || head.next==null) {
            return head;
          }
          //find mid
          Node mid = getMid(head);
          Node rightHead = mid.next;
          mid.next = null;
          Node newLeft = mergesort(head);
          Node newRight = mergesort(rightHead);
          return merge(newLeft,newRight);
       }
       private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next; //Since this mergesort is done by choosing mid in even case as last node of first half
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        private Node merge(Node head1 , Node head2) {
            Node mergedLL = new Node(-1); //DUMMY NODE
            Node temp = mergedLL;
            while(head1!=null && head2!=null) {
               if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
               } else {
                temp.next = head2;
                head2= head2.next;
                 temp = temp.next;
               }
            }
            while(head1!=null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2!=null) {
                temp.next = head2;
                head2= head2.next;
                 temp = temp.next;
            }
            return mergedLL.next;
        }
       }
}

