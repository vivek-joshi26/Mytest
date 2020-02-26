package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Books {
    public String name;
    public int id;
    public Books(){
        name="";
        id=0;
    }
    public Books(String name,int id){
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Books b1=new Books("First",1);
        Books b2=new Books("Second",2);

        ArrayList<Books> newArray=new ArrayList<Books>();
        newArray.add(b1);
        newArray.add(b2);

        for (Books b:newArray){
            System.out.println(b.name+" "+b.id);
        }

    }
}
