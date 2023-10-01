import  java.util.*;

public class Interface {
    public static void main(String Args[]) {
      Queen q = new Queen();
      q.moves();
    }
     //interface is a blueprint of a class
    //interface is used to implement multiple inheritance which is by default present in C++ but not in java directly.
    //100%  abstraction achieved using interface
    //All methods in interface are public,abstract and without implementation
    //variables in interface are final,public and static
    interface ChessPlayer {
        void moves(); //No implementation by default public and it's abstract
    }
    class Queen  implements ChessPlayer {
       public void moves() {
            System.out.println("up,down,left,right,diagonal");
        }
    }
    class King implements ChessPlayer {
        public void moves() {
            System.out.println("up,down,left,right");
        }
    }
    //static keyword in java is used to share the same variable or methods of a given class
//For eg: in a class student there can be many students s1,s2... but all have same school hence it can be declared static 
//Super keyword is used to refer immediate parent class object
}
