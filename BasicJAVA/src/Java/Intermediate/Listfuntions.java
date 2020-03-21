package Java.Intermediate;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;


public class Listfuntions {

    public static void output(List<String> list){
        for (String x:list
             ) {
            System.out.print(x+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] st1 = {"bb", "dd", "cc", "aa"};        //Initial Array
        LinkedList<String> l1 = new LinkedList<>(Arrays.asList(st1));   //Copying Array elements into a linkedlist, now can use collection methods on it
        System.out.println(l1);
        l1.add("ee");
        System.out.println(l1);
        l1.addFirst("ZZ");
        System.out.println(l1);
        st1=l1.toArray( new String[l1.size()]);             //copying the list back to the initial array
        for (String z:st1
             ) {
            System.out.print(z+" ");

        }

        System.out.println();
        System.out.println("Starting st2");
        String[] st2={"bb", "dd", "cc", "aa"};
        List<String> l2= Arrays.asList(st2);            //If using List you can directly convert array to list
        System.out.println(l2);
        Collections.sort(l2);                           //To sort the list in ascending order
        System.out.println(l2);
        Collections.sort(l2, Collections.reverseOrder());   //To sort the list in descending order
        System.out.println(l2);
        st2=l2.toArray(new String[l2.size()]);          //copying the list back to the initial array
        for (String z:st2
        ) {
            System.out.print(z+" ");

        }

        System.out.println();

        String[] st3= new String[4];
        List<String> l3=Arrays.asList(st3);         //copying list2 to list3
        Collections.copy(l3,l2);
        System.out.println(l3);

        Collections.fill(l3,"X");           //this will replace each element in the list with X
        output(l3);                             // function to print the list

        ArrayList<String> al1=new ArrayList<>();
        al1.add("oo");
        al1.add("ii");
        Collections.addAll(al1,st2);        //Will add array elements from st2 into the arraylist al1
        output(al1);

        System.out.println(Collections.frequency(l3,"X"));  //tells the frequency of a particular object inside a list
        boolean tof=Collections.disjoint(l1,l3);                //returns true if no item is common, return false if some items are common
        System.out.println(tof);


    }
}
