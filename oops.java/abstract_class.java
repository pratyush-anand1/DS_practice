import java.util.*;

public class abstract_class {
    horse h = new horse();
    h.eat();
    h.walk();

}
abstract class Animal {  //Cannot create an instance (obj) of abstract class but can have abstract or non-abs methods or constructors
   void eat() { // non-abstract method
    System.out.println("eats");
   }
   abstract void walk();//abstract method i.e. not defined each class inherited has to define it

}
class horse extends Animal {
    void walk() {
        System.out.println("walks on 4 legs");
    }
   
}
