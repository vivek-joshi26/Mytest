package Basic.Data.Structures;      //HOW to use JAVA Collections

import com.company.Books;

import java.util.*;
import java.util.LinkedList;

public class JavaCollection {
    public static void main(String[] args) {
        ArrayList<String> newArray= new ArrayList();        //Only String values can be assigned using this syntax
        newArray.add("a");
        //newArray.add(1);
        System.out.println(newArray);

        ArrayList newArray2=new ArrayList();                //Any values can be assigned, it will create object from non primitive data members
        newArray2.add(1);
        newArray2.add("a");
        System.out.println(newArray2);

        LinkedList newList1=new LinkedList();               //Any values can be assigned, it will create object from non primitive data members
        newList1.add(1);
        newList1.add("a");
        System.out.println(newList1);

        LinkedList newList2=new LinkedList<String>();       //Any values can be assigned, it will create object from non primitive data members
        newList2.add("a");
        newList2.add("b");
        newList2.add(1);
        System.out.println(newList2);
        System.out.println();

        //Iterable itr=newArray.iterator();
        Iterator itr=newList2.iterator();           // Using the Iterator framework to print elements in the LinkedList(newList2)
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        LinkedList<StackArray> newList3= new LinkedList<>();        //Giving objects of StackArray class as the values inside the LinkedList
        StackArray obj1=new StackArray();
        newList3.add(obj1);
        System.out.println(newList3);

        Iterator<StackArray> itr2=newList3.iterator();          //Using Iterator to print elements
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }


        PriorityQueue<Integer> newQueue=new PriorityQueue<>();      //Using Priority Queue
        newQueue.add(1);
        newQueue.add(2);
        newQueue.add(3);
        System.out.println(newQueue);

        Iterator itr3=newQueue.iterator();
        while (itr3.hasNext()){
            System.out.println(newQueue.poll());
        }
/*
        System.out.println(newQueue.peek());
        System.out.println(newQueue);
        System.out.println(newQueue.poll());
        System.out.println(newQueue);
        System.out.println(newQueue.peek());
*/

        Books b1=new Books("First",1);
        Books b2=new Books("Second",2);

        ArrayList<Books> newArray4=new ArrayList<Books>();          //To Add Books's objects in Arraylist, and Print its members using for condition
        newArray4.add(b1);
        newArray4.add(b2);

        for (Books b:newArray4){
            System.out.println(b.name+" "+b.id);
        }

        //SET uses
        HashSet<Integer> newhashSet=new HashSet<>();
        newhashSet.add(2);
        newhashSet.add(1);
        newhashSet.add(3);
        newhashSet.add(6);
        newhashSet.add(7);
        Iterator<Integer> itr4=newhashSet.iterator();       //Iterator returns the elements in Sorted order
        while (itr4.hasNext()){
            System.out.println(itr4.next());
        }
        System.out.println(newhashSet);                      //HashSet stores elements in sorted order

        LinkedHashSet<Integer> newlinkedSet=new LinkedHashSet<>();          //It maintains the insertion order, no sorting
        newlinkedSet.add(3);
        newlinkedSet.add(1);
        newlinkedSet.add(2);
        System.out.println(newlinkedSet);

        TreeSet<Integer> newtreeSet=new TreeSet<>();        //TreeSet stores elements in sorted order
        newtreeSet.add(3);
        newtreeSet.add(1);
        newtreeSet.add(2);
        System.out.println(newtreeSet);

        HashMap<Integer,String> newhashMap=new HashMap<>();    //HashMap is like dictionary in Python, it is maintaining ascending order on the keys
        newhashMap.put(2,"sec");
        newhashMap.put(4,"fourth");
        newhashMap.put(1,"first");
        newhashMap.put(3,"third");
        System.out.println(newhashMap.values());

        LinkedHashMap<Integer,String> newhashMap1=new LinkedHashMap<>();    //maintains the Insertion order
        newhashMap1.put(2,"sec");
        newhashMap1.put(4,"fourth");
        newhashMap1.put(1,"first");
        newhashMap1.put(3,"third");
        System.out.println(newhashMap1.values());

        TreeMap<Integer,String> newhashMap2=new TreeMap<>();        //stores in sorted order
        newhashMap2.put(2,"sec");
        newhashMap2.put(4,"fourth");
        newhashMap2.put(1,"first");
        newhashMap2.put(3,"third");
        System.out.println(newhashMap2.values());

    }
}
