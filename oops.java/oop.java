import java.util.*;

public class oop {
     public static void main (String Args []) {
        BankAccount acc = new BankAccount();
        acc.username = "Rahul29062004";
       // acc.password = "abcdef"; //will show error because password property in class is private
      acc.setpassword("abcdef");
      Student s1 = new Student();
      s1.name = "Rahul";
      s1.age = 18;
      s1.calcpercentage(90,95, 88);
      //Student s2 = new Student(18);
      Student s3 = new Student("Anand");
      Student s2 = new Student(s1);
      s2.percentage = 90;
     }
}
 class Student {
    public String name;
    public int age;
    protected float percentage;
   void calcpercentage (int math, int phy , int chem) {
    percentage = (math+phy+chem)/3;
    int marks [];
   
   }
   Student () { //Constructor if not declared java declares it by default but can't initialize it
      //Non-parametarized constructor
    
   }
   Student (int age) { //parametarized constructor
    this.age = age;
   }
   Student (String Name) {
    this.name = name; //parametarized constructor
   }
   Student (Student s) { // shallow Copy Constructor 
    this.name = s.name;   //we have decided to copy only name and age and not cgpa
    this.age = s.age;
    marks = new int[3];
    this.marks = marks;
   }
 }
 //shallow copy means the changes are reflected in both objects 
 // For Eg: if marks array is copied it's reference is copied so change at one place will reflect on other too cause both are pointing to same array
//in deep copy whole new array is formed so change at any one property of an object won't reflect at the other object's property
//Destructor destroys an object.In java it occurs by default due to garbage collector.It checks arrays or memory which is not being used and free's it.

class BankAccount {
    private String password;
    public String username;
    public void setpassword (String pwd){
        password = pwd;
    }

}

