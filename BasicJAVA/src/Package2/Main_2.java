package Package2;

import com.company.*;

public class Main_2 extends Basic{
    //Method Overriding
    public void displayClass(){
        System.out.println("Child Class:Main_2");
    }

    public void getNameRollno(int number){
        System.out.println("Class Child-Main_2"+number);
    }
    public static void main(String[] args) {
        Basic obj1=new Basic();
        Basic obj3=new Basic(2,"Third","Protect","Private","default");
        Basic obj4=new Main_2();    //Parent Reference and Child Object, we can call Parent's methods, but can't call child's, in case a method is overridden in child class, then that method will be called--- DYNAMIC DISPATCH
        obj4.displayClass();
        obj1.setRollNo(1);
        obj1.setName("First");
        System.out.println(obj1.getName());
        System.out.println(obj1.getRollNo());
        System.out.println(obj3.getPrivateName());
        System.out.println(obj3.rollNo);
        Main_2 m1 = new Main_2();       //protected member from parent class from different package only accessible by sub class object
        obj3.displayClass();    //method overriding
        m1.displayClass();      //method overriding
        obj3.getNameRollno(5);   //method overriding
        m1.getNameRollno(5);     //method overriding

        System.out.println("abcdef".substring(2,4));
    }
}
