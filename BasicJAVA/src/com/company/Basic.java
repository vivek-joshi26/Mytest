package com.company;

import javax.xml.namespace.QName;

public class Basic {
    public int rollNo;
    public String name;
    protected String protectedName;
    private String privateName;
    String defaultName;


    public Basic() {
        rollNo=0;
        name="NA";
    }

    public Basic(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name   =   name;
    }

    public Basic(int rollNo, String name, String protectedName, String privateName, String defaultName) {
        this.rollNo = rollNo;
        this.name = name;
        this.protectedName = protectedName;
        this.privateName = privateName;
        this.defaultName = defaultName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getPrivateName() {
        return privateName;
    }

    public String getProtectedName() {
        return protectedName;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getNameRollno(int number){
        System.out.println(number);
    }
//method overloading
    public void getNameRollno(int number, String sName){
        System.out.println(number+sName);
    }

    public void displayClass(){
        System.out.println("Parent Class Basic");
    }

}
