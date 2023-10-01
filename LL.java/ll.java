public class ll {
    public static void main(String Args []) {

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
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
   public void swap(int key1 , int key2) {
    Node temp = head;
    while(temp!=null) {
        temp = temp.next;
        if(temp.data == key1) {
            continue;
        } if(temp.data == key2) {
            break;
        }
    }
   }
}
