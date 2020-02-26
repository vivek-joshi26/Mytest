package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Basic obj1=new Basic();
        Basic obj2=new Basic(2, "Second");
        Basic obj3=new Basic(2,"Third","Protect","Private","default");
        obj1.setRollNo(1);
        obj1.setName("First");
        System.out.println(obj1.getName());
        System.out.println(obj1.getRollNo());
        System.out.println(obj2.getName());
        System.out.println(obj2.getRollNo());
        System.out.println(obj3.defaultName);
        obj1.getNameRollno(2);      /* method overloading */
        obj1.getNameRollno(2,"Method Overloading");
    }
}
