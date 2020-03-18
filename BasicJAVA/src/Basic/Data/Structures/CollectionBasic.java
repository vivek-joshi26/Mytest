package Basic.Data.Structures;

import java.util.*;
import java.util.LinkedList;

public class CollectionBasic {

    public static void compareList(Collection<String> l1, Collection<String>  l2){
        Iterator it=l1.iterator();
        while (it.hasNext()){
            if(l2.contains(it.next())){
                it.remove();
            }

        }
    }

    public static void printme(List<String> list){
        for (String b:list
             ) {
            System.out.print(b+" ");

        }
        System.out.println();
    }

    public static void removeStuff(List<String> list, int from, int to){
        list.subList(from,to).clear();
    }

    public static void reverse(List<String> list){
        ListIterator<String> itr=list.listIterator(list.size());
        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String[] s1={"1","2","3","4"};
        String[] s2={"1","4","5"};

        List<String> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();

        for (String x:s1
             ) {
            l1.add(x);

        }

        for (String y:s2
             ) {
            l2.add(y);

        }

        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }

        System.out.println();

        for (int i=0;i<l2.size();i++){
            System.out.print(l2.get(i)+" ");
        }

        System.out.println();
        compareList(l1, l2);

        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }

        System.out.println("LinkedList");
        String[] things={"apples","noobs","poiu","bacon","goats"};
        List<String> list1=new LinkedList<String>();
        for (String z:things
             ) {
            list1.add(z);
        }

        String[] things2={"sausage","harrypotter","bacon","goats"};
        List<String> list2=new LinkedList<String>();
        for (String w:things2
        ) {
            list2.add(w);
        }

        list1.addAll(list2);    //list1 will have data of list2
        list2=null;

        printme(list1);
        removeStuff(list1,2,5);
        printme(list1);
        reverse(list1);
        printme(list1);

    }
}